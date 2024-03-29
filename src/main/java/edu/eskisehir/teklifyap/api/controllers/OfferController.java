package edu.eskisehir.teklifyap.api.controllers;

import edu.eskisehir.teklifyap.business.abstracts.OfferService;
import edu.eskisehir.teklifyap.core.utilities.results.Result;
import edu.eskisehir.teklifyap.entities.concretes.Offer;
import edu.eskisehir.teklifyap.entities.concretes.User;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/offer")
@CrossOrigin
public class OfferController {
    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        super();
        this.offerService = offerService;
    }

    @GetMapping("/getAll")
    public Result getAll() {
        return this.offerService.getAll();
    }

    @PostMapping("/getOffers")
    public Result getOffersByUser(@RequestBody String id) {
        try {
            return this.offerService.getOffersByUser(id);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Result(false,"Başarısız!");
        }
    }

    @PostMapping("/updateStatus/{id}/{status}")
    public Result updateStatus(@PathVariable int id, @PathVariable String status) {
        System.out.println(id + " " + status);
        return this.offerService.updateStatus(id, status);
    }

    @PostMapping("/make")
    public Result makeOffer(@RequestBody Offer offer){
        return offerService.makeOffer(offer);
    }


}
