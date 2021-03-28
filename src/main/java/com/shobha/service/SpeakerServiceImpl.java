package com.shobha.service;

import com.shobha.model.Speaker;
import com.shobha.repository.HibernateSpeakerRepositoryImpl;
import com.shobha.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        repository=speakerRepository;
    }


    public List<Speaker>  findAll(){
        return repository.findAll();
    }

    // for setter injection

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
