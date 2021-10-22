package com.lucaslevi.hourcontrol.controller;

import com.lucaslevi.hourcontrol.model.WorkJourney;
import com.lucaslevi.hourcontrol.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journey")
public class WorkJourneyController {

    @Autowired
    JourneyService journeyService;

    @PostMapping
    public WorkJourney createWorkJourney(@RequestBody WorkJourney workJourney){
        return journeyService.save(workJourney);
    }
}
