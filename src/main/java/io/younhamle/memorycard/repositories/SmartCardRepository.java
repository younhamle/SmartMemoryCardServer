package io.younhamle.memorycard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.younhamle.memorycard.entities.SmartCard;

@Repository
public interface SmartCardRepository extends JpaRepository<SmartCard, Integer> {

}
