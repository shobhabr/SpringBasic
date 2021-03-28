package com.advancedconfig.repository;

import com.advancedconfig.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
