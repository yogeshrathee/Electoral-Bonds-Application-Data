package org.yogesh.electoral.bonds.electoralbondsapplication.ElectoralBondsControllers;

import org.springframework.web.bind.annotation.*;
import org.yogesh.electoral.bonds.electoralbondsapplication.Models.PoliticalParty;
import org.yogesh.electoral.bonds.electoralbondsapplication.Services.PoliticalPartyService;

import java.util.List;

@RestController
@RequestMapping("/bond")
public class BondController {

    PoliticalPartyService politicalPartyService;

    public BondController(PoliticalPartyService politicalPartyService) {
        this.politicalPartyService = politicalPartyService;
    }



    @GetMapping("/Fetch The All Records")
    public List<PoliticalParty> getAll() {
        return politicalPartyService.getAll();
    }
    @GetMapping("/Fetch/ {BOND_NUMBER}")
    public PoliticalParty getById(@PathVariable("BOND_NUMBER") int BOND_NUMBER) {
        return politicalPartyService.getById(BOND_NUMBER);
    }
    @GetMapping("/{NAME_OF_THE_POLITICAL_PARTY}")
    public List<PoliticalParty> getByName(@PathVariable("NAME_OF_THE_POLITICAL_PARTY") String NAME_OF_THE_POLITICAL_PARTY) {
        return politicalPartyService.getByName(NAME_OF_THE_POLITICAL_PARTY);
    }
    @GetMapping("/Fetch/{DATE_OF_ENCASHMENT}")
    public List<PoliticalParty> getByDate(@PathVariable("DATE_OF_ENCASHMENT") String DATE_OF_ENCASHMENT) {
        return politicalPartyService.getByDate(DATE_OF_ENCASHMENT);
    }

    @GetMapping("/denomination/{NAME_OF_THE_POLITICAL_PARTY}")
    public String getTotalDenominationByPartyName(@PathVariable("NAME_OF_THE_POLITICAL_PARTY") String NAME_OF_THE_POLITICAL_PARTY) {
        return politicalPartyService.getTotalDenominationByPartyName(NAME_OF_THE_POLITICAL_PARTY);
    }

    @GetMapping("/total-denomination")
    public String getTotalDenominationForAllParties() {
        return politicalPartyService.getTotalDenominationByAllParties();
    }
    @GetMapping("/denomination/{DATE}/{PARTY_NAME}")
    public String getDenominationByDateAndParty(@PathVariable("DATE") String DATE_OF_ENCASHMENT,
                                                @PathVariable("PARTY_NAME") String PARTY_NAME) {
        return politicalPartyService.getDenominationByDateAndParty(DATE_OF_ENCASHMENT, PARTY_NAME);
    }


}
