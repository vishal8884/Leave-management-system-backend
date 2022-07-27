package io.vishal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class LeaveTakenDates {
	
	@Id
	private long leaveTakenDatesId;
	private Date leaveTakenDates;

}
