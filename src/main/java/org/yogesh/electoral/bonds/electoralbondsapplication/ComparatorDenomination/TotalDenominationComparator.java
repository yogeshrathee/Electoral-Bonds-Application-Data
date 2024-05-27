package org.yogesh.electoral.bonds.electoralbondsapplication.ComparatorDenomination;

import org.yogesh.electoral.bonds.electoralbondsapplication.Models.PoliticalParty;

import java.util.Comparator;

public class TotalDenominationComparator implements Comparator<PoliticalParty> {
    @Override
    public int compare(PoliticalParty party1, PoliticalParty party2) {
        // Compare parties based on their total denomination
        Long totalDenomination1 = party1.getDENOMINATIONS();
        Long totalDenomination2 = party2.getDENOMINATIONS();

        // Sort in descending order
        return Integer.compare(Math.toIntExact(totalDenomination2), Math.toIntExact(totalDenomination1));
    }
}
