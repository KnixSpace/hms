package com.hms.backend.services;

import com.hms.backend.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Long getCount(){

        return doctorRepository.count();
    }
}
