package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.dto.Trainee;

@Repository("traineedao")
public class TraineeDaoImpl implements ITraineeDao{

	@PersistenceContext
	EntityManager entitymanager;
	@Override
	public int addTrainee(Trainee trn) {
		entitymanager.persist(trn);
		entitymanager.flush();
		return trn.getTraineeId();
		
	}
	@Override
	public void deleteTrainee(int trnId) {
		// TODO Auto-generated method stub
		Query queryone=entitymanager.createQuery("DELETE FROM Trainee where traineeId=:tid");
		queryone.setParameter("tid", trnId);
		queryone.executeUpdate();
		
	}
	/*@Override
	public void searchTrainee(int trnId) {
		// TODO Auto-generated method stub
		
		Query querytwo=entitymanager.createQuery("SELECT FROM Trainee where traineeId=:tid");
		queryone.setParameter("tid", trnId);
		queryone.executeUpdate();
		
	}*/
	@Override
	public List<Trainee> delTrainee(int trnId) {
		
		Query querytwo=entitymanager.createQuery("SELECT t FROM Trainee t where traineeId=:tid");
		querytwo.setParameter("tid", trnId);
		return querytwo.getResultList();
	}
	
	

}
