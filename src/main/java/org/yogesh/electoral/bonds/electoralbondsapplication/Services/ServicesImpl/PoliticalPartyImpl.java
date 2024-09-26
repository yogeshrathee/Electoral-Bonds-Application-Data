package org.yogesh.electoral.bonds.electoralbondsapplication.Services.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yogesh.electoral.bonds.electoralbondsapplication.Converter.AmountConverter;
import org.yogesh.electoral.bonds.electoralbondsapplication.Models.PoliticalParty;
import org.yogesh.electoral.bonds.electoralbondsapplication.Repository.PoliticalPartyRepo;
import org.yogesh.electoral.bonds.electoralbondsapplication.Services.PoliticalPartyService;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PoliticalPartyImpl implements PoliticalPartyService {


    @Autowired
    PoliticalPartyRepo politicalPartyRepo;

    public PoliticalPartyImpl(PoliticalPartyRepo politicalPartyRepo) {
        this.politicalPartyRepo = politicalPartyRepo;
    }

    @Override
    public List<PoliticalParty> getAll() {
        return politicalPartyRepo.findAll();
    }

    @Override
    public PoliticalParty getById(int BOND_NUMBER) {
        return politicalPartyRepo.findById(BOND_NUMBER).get();
    }

    @Override
    public List<PoliticalParty> getByName(String NAME_OF_THE_POLITICAL_PARTY) {
        return politicalPartyRepo.findByName(NAME_OF_THE_POLITICAL_PARTY);
    }

    @Override
    public List<PoliticalParty> getByDate(String DATE_OF_ENCASHMENT) {
        return politicalPartyRepo.findByDate(DATE_OF_ENCASHMENT);
    }

    @Override
    public String getTotalDenominationByPartyName(String partyName) {
        List<PoliticalParty> allParties = politicalPartyRepo.findAll();
        Map<String, Long> partyTotals = new HashMap<>();

        for (PoliticalParty party : allParties) {
            String name = party.getNAME_OF_THE_POLITICAL_PARTY();
            long denomination = party.getDENOMINATIONS();
            partyTotals.put(name, partyTotals.getOrDefault(name, 0L) + denomination);
        }

        StringBuilder partyDetails = new StringBuilder();
        double totalDenominationInCrores = 0;

        if (partyName != null && !partyName.isEmpty()) {
            Long totalDenomination = partyTotals.get(partyName);
            if (totalDenomination != null) {
                partyDetails.append("Party Name: ").append(partyName)
                        .append("\nTotal Amount: ")
                        .append(AmountConverter.convertToCrores(totalDenomination))
                        .append(" Crores (Approximately)\nReceived By the party Successfully!!!!");
                return partyDetails.toString();
            }
        }
        return "Party Not Found";

    }


    @Override
    public String getTotalDenominationByAllParties() {
        List<PoliticalParty> allParties = politicalPartyRepo.findAll();
        Map<String, Long> partyTotals = new HashMap<>();

        for (PoliticalParty party : allParties) {
            String partyName = party.getNAME_OF_THE_POLITICAL_PARTY();
            long denomination = party.getDENOMINATIONS();
            partyTotals.put(partyName, partyTotals.getOrDefault(partyName, 0L) + denomination);
        }

        // Calculate total denomination for all parties
        double totalDenominationInCrores = partyTotals.values().stream()
                .mapToDouble(AmountConverter::convertToCrores)
                .sum();

        // Sort parties by total denomination
        List<Map.Entry<String, Long>> sortedParties = partyTotals.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        StringBuilder partyDetails = new StringBuilder();

        for (Map.Entry<String, Long> entry : sortedParties) {
            String partyName = entry.getKey();
            long totalDenomination = entry.getValue();
            partyDetails.append(partyName)
                    .append(": ")
                    .append(AmountConverter.convertToCrores(totalDenomination))
                    .append(" Crores (Approximately)\n");
        }

        return "Total Denomination for All Parties: " + totalDenominationInCrores + " Crores (Approximately)\n\nParty-wise Details:\n" + partyDetails.toString();
    }


    @Override
    public String getDenominationByDateAndParty(String DATE_OF_ENCASHMENT, String PARTY_NAME) {
        List<PoliticalParty> parties = politicalPartyRepo.findByDateAndParty(DATE_OF_ENCASHMENT, PARTY_NAME);
        if (parties.isEmpty()) {
            return "No records found for the specified date and party name.";
        } else {
            long totalDenomination = parties.stream().mapToLong(PoliticalParty::getDENOMINATIONS).sum();
            double totalDenominationInCrores = AmountConverter.convertToCrores(totalDenomination);
            return "Total Denomination Encashment by the ( "+PARTY_NAME+" ) !!!"+
                    "\n\nDATE_OF_ENCASHMENT :: " + DATE_OF_ENCASHMENT +
                    "\nParty Name :: " + PARTY_NAME +
                    "\ntotal Denomination In Crores ::  " + totalDenominationInCrores + " Crores (Approximately)";
        }
    }
}
