package edu.eskisehir.teklifyap.business.abstracts;

import edu.eskisehir.teklifyap.core.utilities.results.Result;
import edu.eskisehir.teklifyap.entities.concretes.OfferMaterial;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OfferMaterialService {
    Result getAll();
    Result makeOffer(OfferMaterial offerMaterial);
    Result makeOffers(List<OfferMaterial> offerMaterials);
    Result getMaterialsByOffer(int id);
}
