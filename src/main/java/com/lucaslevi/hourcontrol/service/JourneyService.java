package com.lucaslevi.hourcontrol.service;

import com.lucaslevi.hourcontrol.model.WorkJourney;
import com.lucaslevi.hourcontrol.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {

    private JourneyRepository repository;

    public JourneyService(JourneyRepository repository) {
        this.repository = repository;
    }

    public WorkJourney save(WorkJourney journey){
        return repository.save(journey);
    }

    public List<WorkJourney> findAll() {
        return repository.findAll();
    }

    public Optional<WorkJourney> findById(Long id) {
        return repository.findById(id);
    }

    public WorkJourney update(WorkJourney journey){
        return repository.save(journey);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
