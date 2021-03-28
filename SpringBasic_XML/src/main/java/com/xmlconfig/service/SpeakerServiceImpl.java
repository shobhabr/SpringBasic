package com.xmlconfig.service;

import com.xmlconfig.model.Speaker;
import com.xmlconfig.repository.HibernateSpeakerRepositoryImpl;
import com.xmlconfig.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository ;
    public List<Speaker>  findAll(){
        return repository.findAll();
    }
    public SpeakerServiceImpl(){

    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        this.repository=speakerRepository;
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
