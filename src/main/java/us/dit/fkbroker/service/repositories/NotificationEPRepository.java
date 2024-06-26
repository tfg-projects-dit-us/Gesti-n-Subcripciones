package us.dit.fkbroker.service.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import us.dit.fkbroker.service.entities.NotificationEP;

public interface NotificationEPRepository extends JpaRepository<NotificationEP, Long> {
    Optional<NotificationEP> findByResourceAndInteraction(String resource, String interaction);
}
