package io.younhamle.memorycard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.younhamle.memorycard.entities.Word;
import io.younhamle.memorycard.repositories.WordRepository;

@Service
public class WordService {

	@Autowired
	private WordRepository wordRepository;
	
	public List<Word> getAllWords() {
		return wordRepository.findAll();
	}
	
	public void insert(Word word) {
		wordRepository.save(word);
	}
	/*
	public List<Word> getAllWordsBySmartCard() {
		return wordRepository.
	}*/
}
