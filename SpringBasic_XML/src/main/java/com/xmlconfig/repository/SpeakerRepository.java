package com.xmlconfig.repository;

import com.xmlconfig.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
