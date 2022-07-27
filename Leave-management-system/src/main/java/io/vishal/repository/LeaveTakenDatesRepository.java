package io.vishal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.vishal.model.LeaveTakenDates;

public interface LeaveTakenDatesRepository extends JpaRepository<LeaveTakenDates, Long> {

}
