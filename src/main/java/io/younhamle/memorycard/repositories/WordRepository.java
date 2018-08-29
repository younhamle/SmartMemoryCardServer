package io.younhamle.memorycard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.younhamle.memorycard.entities.Word;

@Repository
public interface WordRepository extends JpaRepository<Word, Integer> {

}
