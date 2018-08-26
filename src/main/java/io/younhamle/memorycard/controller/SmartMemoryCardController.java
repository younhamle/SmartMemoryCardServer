package io.younhamle.memorycard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.younhamle.memorycard.entities.SmartCard;
import io.younhamle.memorycard.service.SmartCardService;

@RestController
public class SmartMemoryCardController {
	@Autowired
	private SmartCardService smartCardService;
	
	@GetMapping(value="/smartcards")
	public List<SmartCard> smartcards() {
		return smartCardService.getAllSmartCards();
	}
	
	@PostMapping(value="/smartcard")
	public void insertSmartCard(@RequestBody SmartCard smartCard) {
		smartCardService.insert(smartCard);
	}
}
