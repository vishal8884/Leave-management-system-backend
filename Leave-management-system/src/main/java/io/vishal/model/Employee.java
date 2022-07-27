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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String role;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER , optional = false)   //this says that already mapped by employee attribute in Leave.class
	@JoinColumn(name = "leave_id", referencedColumnName = "leaveId")
	private Leave leave;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "leave_employee_mapping", joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "employeeId") ,
	                                            inverseJoinColumns = @JoinColumn(name = "leave_dates_id", referencedColumnName = "leaveDate"))
	private List<LeaveDate> leaveDates;
}
