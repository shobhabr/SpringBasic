package com.xmlconfig.service;

import com.xmlconfig.model.Speaker;
import com.xmlconfig.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerService No arg Constructor ");
    }
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakerRepository Constructor ");
        repository=speakerRepository;
    }


    public List<Speaker>  findAll(){
        return repository.findAll();
    }

    // for setter injection

    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerService Setter ");
        this.repository = repository;
    }
}
