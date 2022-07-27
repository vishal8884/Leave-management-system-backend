package io.vishal.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Employee {

	@Id
	@SequenceGenerator(initialValue = 887454 , name = "employee_sequence_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence_generator")
	private Long employeeId;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String role;
	
	@ManyToOne(cascade = CascadeType.ALL)        //this seems correct as now
	@JoinColumn(name = "leave_taken_dates_id" , referencedColumnName = "leaveTakenDatesId")      
	private LeaveTakenDates leaveTakenDates;
	
	private Integer TotalnoOfLeavesTaken;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "leave_date_id" , referencedColumnName = "leaveDateId")
//	private LeaveDate leaveDate;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "leave_employee_mapping", joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "employeeId") ,
//	                                            inverseJoinColumns = @JoinColumn(name = "leave_dates_id", referencedColumnName = "leaveDate"))
//	private List<LeaveDate> leaveDates;
}
