package io.younhamle.memorycard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.younhamle.memorycard.entities.SmartCard;
import io.younhamle.memorycard.repositories.SmartCardRepository;

@Service
public class SmartCardService {

	@Autowired
	private SmartCardRepository smartCardRepository;
	
	public List<SmartCard> getAllSmartCards() {
		return smartCardRepository.findAll();
	}
	
	public void insert(SmartCard smartCard) {
		smartCardRepository.save(smartCard);
	}
}
