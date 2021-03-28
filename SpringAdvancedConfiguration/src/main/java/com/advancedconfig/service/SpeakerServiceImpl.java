package com.advancedconfig.service;

import com.advancedconfig.model.Speaker;
import com.advancedconfig.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    @Autowired
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakServiceImpl no args constructor");
    }

    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        System.out.println("SpeakServiceImpl repository constructor");
        repository = speakerRepository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("We're called after the constructors");
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakServiceImpl setter");
        this.repository = repository;
    }
}
