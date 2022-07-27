package io.vishal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.vishal.model.LeaveDate;

public interface LeaveDateRepository extends JpaRepository<LeaveDate,Long> {

}
