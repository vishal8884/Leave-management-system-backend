package io.vishal.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class LeaveDate {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long leaveDatesId;
	
	private Date leaveDate;
}
