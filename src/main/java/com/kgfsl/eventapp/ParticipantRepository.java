package com.kgfsl.eventapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgfsl.eventapp.Participant;;

@Repository("participantRepository")
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    

}