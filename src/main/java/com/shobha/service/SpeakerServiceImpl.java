package com.shobha.service;

import com.shobha.model.Speaker;
import com.shobha.repository.HibernateSpeakerRepositoryImpl;
import com.shobha.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository= new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker>  findAll(){
        return repository.findAll();
    }
}
