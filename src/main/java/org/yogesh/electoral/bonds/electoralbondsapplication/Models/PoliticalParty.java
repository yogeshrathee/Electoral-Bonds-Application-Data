package org.yogesh.electoral.bonds.electoralbondsapplication.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "PartyDetails")
@Table(name = "partypol")
public class PoliticalParty {
    private int SR_NO;

    private String DATE_OF_ENCASHMENT;

    private String NAME_OF_THE_POLITICAL_PARTY;

    private String ACCOUNT_NO_OF_POLITICAL_PARTY;

    private String PREFIX;

    @Id
    private int BOND_NUMBER;
    private Long DENOMINATIONS;

    private Long PAY_BRANCH_CODE;
    private Long PAY_TELLER;


    public PoliticalParty() {

    }

    public PoliticalParty(int SR_NO, String DATE_OF_ENCASHMENT, String NAME_OF_THE_POLITICAL_PARTY, String ACCOUNT_NO_OF_POLITICAL_PARTY, String PREFIX, int BOND_NUMBER, Long DENOMINATIONS, Long PAY_BRANCH_CODE, Long PAY_TELLER) {
        this.SR_NO=SR_NO;
        this.DATE_OF_ENCASHMENT = DATE_OF_ENCASHMENT;
        this.NAME_OF_THE_POLITICAL_PARTY = NAME_OF_THE_POLITICAL_PARTY;
        this.ACCOUNT_NO_OF_POLITICAL_PARTY = ACCOUNT_NO_OF_POLITICAL_PARTY;
        this.PREFIX = PREFIX;
        this.BOND_NUMBER = BOND_NUMBER;
        this.DENOMINATIONS = DENOMINATIONS;
        this.PAY_BRANCH_CODE = PAY_BRANCH_CODE;
        this.PAY_TELLER = PAY_TELLER;
    }

    public int getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(int SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getDATE_OF_ENCASHMENT() {
        return DATE_OF_ENCASHMENT;
    }

    public void setDATE_OF_ENCASHMENT(String DATE_OF_ENCASHMENT) {
        this.DATE_OF_ENCASHMENT = DATE_OF_ENCASHMENT;
    }

    public String getNAME_OF_THE_POLITICAL_PARTY() {
        return NAME_OF_THE_POLITICAL_PARTY;
    }

    public void setNAME_OF_THE_POLITICAL_PARTY(String NAME_OF_THE_POLITICAL_PARTY) {
        this.NAME_OF_THE_POLITICAL_PARTY = NAME_OF_THE_POLITICAL_PARTY;
    }

    public String getACCOUNT_NO_OF_POLITICAL_PARTY() {
        return ACCOUNT_NO_OF_POLITICAL_PARTY;
    }

    public void setACCOUNT_NO_OF_POLITICAL_PARTY(String ACCOUNT_NO_OF_POLITICAL_PARTY) {
        this.ACCOUNT_NO_OF_POLITICAL_PARTY = ACCOUNT_NO_OF_POLITICAL_PARTY;
    }

    public String getPREFIX() {
        return PREFIX;
    }

    public void setPREFIX(String PREFIX) {
        this.PREFIX = PREFIX;
    }

    public int getBOND_NUMBER() {
        return BOND_NUMBER;
    }

    public void setBOND_NUMBER(int BOND_NUMBER) {
        this.BOND_NUMBER = BOND_NUMBER;
    }

    public Long getDENOMINATIONS() {
        return DENOMINATIONS;
    }

    public void setDENOMINATIONS(Long DENOMINATIONS) {
        this.DENOMINATIONS = DENOMINATIONS;
    }

    public Long getPAY_BRANCH_CODE() {
        return PAY_BRANCH_CODE;
    }

    public void setPAY_BRANCH_CODE(Long PAY_BRANCH_CODE) {
        this.PAY_BRANCH_CODE = PAY_BRANCH_CODE;
    }

    public Long getPAY_TELLER() {
        return PAY_TELLER;
    }

    public void setPAY_TELLER(Long PAY_TELLER) {
        this.PAY_TELLER = PAY_TELLER;
    }
}
