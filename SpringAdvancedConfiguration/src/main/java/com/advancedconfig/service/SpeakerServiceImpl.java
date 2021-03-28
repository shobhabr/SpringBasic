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
@Scope(value= BeanDefinition.SCOPE_PROTOTYPE)
public class SpeakerServiceImpl implements SpeakerService {
    @Autowired
    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerService No arg Constructor ");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakerRepository Constructor ");
        repository=speakerRepository;
    }
  @PostConstruct
    private void initialize(){
        System.out.println("called after no arg constructor");
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
