package com.shobha.repository;

import com.shobha.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers= new ArrayList<Speaker>();
        Speaker spk= new Speaker();
        spk.setFirstName("Shobha");
        spk.setLastName("Basavan");
        speakers.add(spk);
        return speakers;
    }
}
