package com.devket.workout.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * tcTODO
 *
 * @author Tom Cross
 * @version $Revision: #1 $ submitted $DateTime: 2013/09/16 09:32:00 $ by $Author: CROSTA $
 */

@Entity
public class ExerciseTarget {

	@Id
	@GeneratedValue
	private long id;

    @Column(unique = true)
	private String targetCode;

	private String targetDescription;


	public long getId() {
		return id;
	}


	public String getTargetCode() {
		return targetCode;
	}


	public String getTargetDescription() {
		return targetDescription;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
	}


	public void setTargetDescription(String targetDescription) {
		this.targetDescription = targetDescription;
	}
}