package com.cg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="trainee")
public class Trainee {
	
	@Id
	@Column(name="trn_id")
	public int traineeId;
	
	@Column(name="trn_name")
	public String traineeName;
	
	@Column(name="trn_domain")
	public String traineeDomain;
	
	@Column(name="trn_location")
	public String traineeLocation;
	
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainee(int traineeId, String traineeName, String traineeDomain,
			String traineeLocation) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	
	
	

}
