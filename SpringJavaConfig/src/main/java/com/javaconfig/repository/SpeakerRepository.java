package com.javaconfig.repository;

import com.javaconfig.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
