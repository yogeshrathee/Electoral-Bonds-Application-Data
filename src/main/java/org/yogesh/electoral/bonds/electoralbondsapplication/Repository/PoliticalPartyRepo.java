package org.yogesh.electoral.bonds.electoralbondsapplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.yogesh.electoral.bonds.electoralbondsapplication.Models.PoliticalParty;

import java.util.List;


public interface PoliticalPartyRepo extends JpaRepository<PoliticalParty, Integer> {
    @Query("SELECT u from PartyDetails u where u.NAME_OF_THE_POLITICAL_PARTY=:NAME_OF_THE_POLITICAL_PARTY")
     List<PoliticalParty> findByName(@Param("NAME_OF_THE_POLITICAL_PARTY") String NAME_OF_THE_POLITICAL_PARTY);

    @Query("SELECT SUM(p.DENOMINATIONS) FROM PartyDetails p")
     int findTotalDenominationByName(String NAME_OF_THE_POLITICAL_PARTY);

    @Query("SELECT u from PartyDetails u where u.DATE_OF_ENCASHMENT=:DATE_OF_ENCASHMENT")
     List<PoliticalParty> findByDate(@Param("DATE_OF_ENCASHMENT") String DATE_OF_ENCASHMENT);

    @Query("SELECT SUM(p.DENOMINATIONS) FROM PartyDetails p")
    int findTotalDenominationForAllParties();

    @Query("SELECT u FROM PartyDetails u WHERE u.DATE_OF_ENCASHMENT = :DATE_OF_ENCASHMENT AND u.NAME_OF_THE_POLITICAL_PARTY = :PARTY_NAME")
    List<PoliticalParty> findByDateAndParty(@Param("DATE_OF_ENCASHMENT") String DATE_OF_ENCASHMENT, @Param("PARTY_NAME") String PARTY_NAME);


}
