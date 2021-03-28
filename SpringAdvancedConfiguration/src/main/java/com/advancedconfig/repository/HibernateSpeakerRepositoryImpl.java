package com.advancedconfig.repository;

import com.advancedconfig.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers= new ArrayList<Speaker>();
        Speaker spk= new Speaker();
        spk.setFirstName("Java");
        spk.setLastName("Config");
        speakers.add(spk);
        return speakers;
    }
}
