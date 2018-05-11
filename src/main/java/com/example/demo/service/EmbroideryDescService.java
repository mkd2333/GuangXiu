package com.example.demo.service;

import com.example.demo.model.EmbroideryDesc;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmbroideryDescService {

    EmbroideryDesc getDesc(Integer version);
}
