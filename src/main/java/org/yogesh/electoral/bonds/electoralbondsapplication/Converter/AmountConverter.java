package org.yogesh.electoral.bonds.electoralbondsapplication.Converter;

public class AmountConverter {
    public static double convertToCrores(Long amount) {
        return amount / 10000000.0; // Divide by 10 million to get amount in crores
    }
}
