package io.vishal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.vishal.model.Leave;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long> {

}
