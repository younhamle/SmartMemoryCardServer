package io.younhamle.memorycard.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Word {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String word;
	private String mean;
	private boolean memorized;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="smartcard_id")
    private SmartCard smartCard;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public boolean isMemorized() {
		return memorized;
	}

	public void setMemorized(boolean memorized) {
		this.memorized = memorized;
	}

	public SmartCard getSmartCard() {
		return smartCard;
	}

	public void setSmartCard(SmartCard smartCard) {
		this.smartCard = smartCard;
	}
    
}
