package com.kgfsl.eventapp;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/Participant")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<List<Participant>> all() {
        
        return new ResponseEntity<>(participantService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody Participant participant) {
        
        
        participantService.save(participant);
       
       
        return new ResponseEntity<>(participant,HttpStatus.CREATED);

    }

    @GetMapping("/get/{participantid}")
    public @ResponseBody ResponseEntity<?> getById(@PathVariable Long participantId,UriComponentsBuilder ucBuilder) {
        Participant participant = participantService.find(participantId);

        
        return new ResponseEntity<>(participant, HttpStatus.OK);

    }

    @PutMapping("/put/{participantId}")
    public ResponseEntity<?> put(@PathVariable Long participantId, @RequestBody Participant participant ) {

        participantService.save(participant);
       
        return new ResponseEntity<>(participant,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{participantId}")
    public ResponseEntity<?> delete(@PathVariable Long participantId) {
   
        participantService.delete(participantId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
