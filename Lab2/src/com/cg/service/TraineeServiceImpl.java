package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITraineeDao;
import com.cg.dto.Trainee;



@Service("traineeservice")
@Transactional
public class TraineeServiceImpl implements ITraineeService {

	@Autowired
	ITraineeDao traineedao;
	@Override
	public int addTrainee(Trainee trn) {
		// TODO Auto-generated method stub
		return traineedao.addTrainee(trn);
	}
	@Override
	public void deleteTrainee(int trnId) {
		// TODO Auto-generated method stub
		traineedao.deleteTrainee(trnId);
		
	}
	@Override
	public List<Trainee> delTrainee(int trnId) {
		// TODO Auto-generated method stub
		return traineedao.delTrainee(trnId);
	}

}
