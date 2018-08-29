package io.younhamle.memorycard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.younhamle.memorycard.entities.Word;
import io.younhamle.memorycard.service.WordService;

@RestController
public class WordController {
	@Autowired
	private WordService wordService;
	
	@CrossOrigin(origins = "*")
	@GetMapping(value="/words")
	public List<Word> words() {
		return wordService.getAllWords();
	}
	
	@PostMapping(value="/word")
	public void insertWord(@RequestBody Word word) {
		wordService.insert(word);
	}
}
