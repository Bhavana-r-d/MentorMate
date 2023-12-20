package com.mentormate.mentormate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mentormate.mentormate.entities.KeyResults;
import com.mentormate.mentormate.entities.Objectives;
import com.mentormate.mentormate.entities.Users;
import com.mentormate.mentormate.models.KeyResultsModel;
import com.mentormate.mentormate.models.ObjectivesModel;
import com.mentormate.mentormate.repositories.KeyResultsRepository;
import com.mentormate.mentormate.repositories.ObjectivesRepository;

import jakarta.annotation.PostConstruct;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class OKRServiceImpl implements OKRService{
	
	@Autowired
	private ObjectivesRepository objectivesRepository;
	
	@Autowired
	private KeyResultsRepository keyResultsRepository;
	

	//Add a new objective
	@Override
	public Objectives createObjective(ObjectivesModel objectivesModel) {
		return objectivesRepository.save(new Objectives(objectivesModel.getUser(),objectivesModel.getObjective()));
	}

	//update existing objective
	public Objectives updateObjective(ObjectivesModel objectiveModel) {
		return objectivesRepository.save(new Objectives(objectiveModel.getUser(),objectiveModel.getObjective()));
	}
	
	// Fetch objective based on id
	public Objectives getObjective(long id) {
		return objectivesRepository.getReferenceById(id);
	}
	
	// Fetch all objectives assigned to a mentee
	public List<Objectives> getAllObjectiveForMentee(Users mentee) {
		return objectivesRepository.findAllByUserId(mentee);
	}
	
	//Add a new KeyResult
	public KeyResults createKeyResults(KeyResultsModel keyResultModel) {
		return keyResultsRepository.save(new KeyResults(keyResultModel.getObjective(), keyResultModel.getKeyResult()));
	}
	
	//Update existing KeyResult
	public KeyResults updateKeyResults(KeyResultsModel keyResultModel) {
		return keyResultsRepository.save(new KeyResults(keyResultModel.getObjective(), keyResultModel.getKeyResult()));
	}
	
	//Fetch KeyResult based on id
	public KeyResults getKeyResults(long id) {
		return keyResultsRepository.getReferenceById(id);
	}
	
	//Fetch all key-results for an objective
	public List<KeyResults> getAllKeyResultsForObjective(Objectives objective) {
		return keyResultsRepository.findAllByObjective(objective);
	}

	@Override
	public Objectives saveObjective(Users user,String objective) {
		Objectives objectives = new Objectives();
		objectives.setUser(user);
		objectives.setObjective(objective);
	    return objectivesRepository.save(objectives);
		
	}

	@Override
	public KeyResults saveKeyResult(Objectives objective,String keyResult) {
		KeyResults keyResults = new KeyResults();
		keyResults.setObjective(objective);
		keyResults.setKeyResult(keyResult);
		return keyResultsRepository.save(keyResults);
		
	}

	@Override
	public List<Objectives> getAllObjectives() {
		return objectivesRepository.findAll();
	}

	@Override
	public List<KeyResults> getAllKeyResults() {
		return keyResultsRepository.findAll();
	}



//	@PostConstruct
//    public void populateOkrs() {
//		Users mentee1 = new Users("user1@gmail.com", "Rosa","Diaz", "pass1", "Software Developer");
//		Objectives objectives1 = new Objectives(mentee1,"Saving objectives");
//		objectivesRepository.save(objectives1);
//		KeyResults keyResults1 = new KeyResults(objectives1,"adding key-result 1");
//		KeyResults keyResults2 = new KeyResults(objectives1,"adding key-result 2");
//		keyResultsRepository.save(keyResults1);
//		keyResultsRepository.save(keyResults2);
		}

