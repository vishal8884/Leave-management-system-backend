package io.vishal.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "EmployeeLeave")
public class Leave {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long leaveId;
	
	private Integer numberOfLeaves;
	
	@OneToOne(mappedBy = "leave")
	private Employee employee;
	
	
	
}
