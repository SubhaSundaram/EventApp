package com.kgfsl.eventapp;

import java.util.List;



public interface ParticipantService {

    public List<Participant> getAll();

    public Participant save(Participant p);

    public Participant find(long id);

    public void delete(Long id);

    public List<Participant> listtop();

}