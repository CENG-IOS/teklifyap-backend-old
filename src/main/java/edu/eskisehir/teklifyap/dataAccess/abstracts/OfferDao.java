package edu.eskisehir.teklifyap.dataAccess.abstracts;

import edu.eskisehir.teklifyap.entities.concretes.Offer;
import edu.eskisehir.teklifyap.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfferDao extends JpaRepository<Offer,Integer> {
    @Query(value = "select * from offer where user_id = :id",nativeQuery = true)
    List<Offer> custommethod(int id);
}
