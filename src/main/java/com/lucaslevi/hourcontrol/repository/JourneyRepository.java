package com.lucaslevi.hourcontrol.repository;

import com.lucaslevi.hourcontrol.model.WorkJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<WorkJourney, Long> {
}
