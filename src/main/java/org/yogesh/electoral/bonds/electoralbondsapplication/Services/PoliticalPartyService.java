package org.yogesh.electoral.bonds.electoralbondsapplication.Services;

import org.springframework.stereotype.Service;
import org.yogesh.electoral.bonds.electoralbondsapplication.Models.PoliticalParty;

import java.util.List;


@Service
public interface PoliticalPartyService {
     List<PoliticalParty> getAll();

     PoliticalParty getById(int BOND_NUMBER);

     List<PoliticalParty> getByName(String NAME_OF_THE_POLITICAL_PARTY);

     List<PoliticalParty> getByDate(String DATE_OF_ENCASHMENT);

    //    String getTotalDenominationByPoliticalParty(PoliticalParty politicalParty);
    String getTotalDenominationByPartyName(String partyName);

    String getTotalDenominationByAllParties();
    String getDenominationByDateAndParty(String DATE_OF_ENCASHMENT, String PARTY_NAME);

}
