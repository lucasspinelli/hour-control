package com.lucaslevi.hourcontrol.service;

import com.lucaslevi.hourcontrol.model.WorkJourney;
import com.lucaslevi.hourcontrol.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JourneyService {

    private JourneyRepository repository;

    public JourneyService(JourneyRepository repository) {
        this.repository = repository;
    }

    public WorkJourney save(WorkJourney journey){
        return repository.save(journey);
    }
}
