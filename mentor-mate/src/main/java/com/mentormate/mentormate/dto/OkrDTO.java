package com.mentormate.mentormate.dto;

import java.util.List;

import com.mentormate.mentormate.models.KeyResultsModel;

import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

public class OkrDTO {

	
	private String objective;
	
    private List<KeyResultsModel> keyResults;

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public List<KeyResultsModel> getKeyResults() {
		return keyResults;
	}

	public void setKeyResults(List<KeyResultsModel> keyResults) {
		this.keyResults = keyResults;
	}
    
    
	
    
    

}
