package com.mentormate.mentormate.services;

import java.util.List;

import com.mentormate.mentormate.entities.KeyResults;
import com.mentormate.mentormate.entities.Objectives;
import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.models.KeyResultsModel;
import com.mentormate.mentormate.models.ObjectivesModel;

public interface OKRService {
	

	Objectives createObjective(ObjectivesModel objectivesModel);

	Objectives updateObjective(ObjectivesModel objectiveModel);

	Objectives getObjective(long id);
	
	List<Objectives> getAllObjectiveForMentee(Users mentees);

	KeyResults createKeyResults(KeyResultsModel keyResultsModel);

	KeyResults updateKeyResults(KeyResultsModel keyResultModel);

	KeyResults getKeyResults(long id);

	List<KeyResults> getAllKeyResultsForObjective(Objectives objective);
	
	Objectives saveObjective(Users users,String objective);
	
    KeyResults saveKeyResult(Objectives objectives,String keyResult);
    
    List<Objectives> getAllObjectives();
    
    List<KeyResults> getAllKeyResults();


}
