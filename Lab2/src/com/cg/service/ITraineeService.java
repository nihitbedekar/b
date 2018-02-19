package com.cg.service;

import java.util.List;

import com.cg.dto.Trainee;

public interface ITraineeService {
	
	public int addTrainee(Trainee trn);
	
	public void deleteTrainee(int trnId);

	public List<Trainee> delTrainee(int trnId);

}
