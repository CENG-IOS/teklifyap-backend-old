package edu.eskisehir.teklifyap.dataAccess.abstracts;

import edu.eskisehir.teklifyap.entities.concretes.OfferMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfferMaterialDao extends JpaRepository<OfferMaterial,Integer> {
    @Query(value = "select * from offer_material where offer_id = :id" , nativeQuery = true)
    List<OfferMaterial> getMaterialsByOffer(int id);
}
