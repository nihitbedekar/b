package com.cg.dao;

import java.util.List;

import com.cg.dto.Trainee;




public interface ITraineeDao {
	
	public int addTrainee(Trainee trn);
	
	public void deleteTrainee(int trnId);
	
	public List<Trainee> delTrainee(int trnId);

}
