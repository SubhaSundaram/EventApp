package com.kgfsl.eventapp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("participantService")
public class ParticipantServiceImp implements ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    @Override
    public List<Participant> getAll() {

        return participantRepository.findAll();
    }

    @Override
    public Participant save(Participant participant) {
      
        return participantRepository.saveAndFlush(participant);

    }

    @Override
    public Participant find(long id) {
      
        return participantRepository.findOne(id);
    }

    @Override
    public void delete(Long id) {
       
        participantRepository.delete(id);
    }
    @Override
    public List<Participant> listtop(){
        return participantRepository.findAll().stream().limit(5).collect(Collectors.toList());
    }
}