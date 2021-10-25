package com.lucaslevi.hourcontrol.controller;

import com.lucaslevi.hourcontrol.model.WorkJourney;
import com.lucaslevi.hourcontrol.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journey")
public class WorkJourneyController {

    @Autowired
    JourneyService journeyService;

    @PostMapping
    public WorkJourney createWorkJourney(@RequestBody WorkJourney workJourney){
        return journeyService.save(workJourney);
    }

    @GetMapping
    public List<WorkJourney> getJourneyList(){
        return journeyService.findAll();
    }

    @GetMapping("/{journeyid}")
    public ResponseEntity getJourneyById(@PathVariable("journeyid") Long id){
        return ResponseEntity.ok().body(journeyService.findById(id));
    }


}
