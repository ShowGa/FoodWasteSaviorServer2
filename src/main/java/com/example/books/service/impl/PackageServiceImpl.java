package com.example.books.service.impl;

import com.example.books.repository.PackageRepository;
import com.example.books.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageServiceImpl implements PackageService {

    private final PackageRepository packageRepository;

    // constructor injection
    @Autowired
    public PackageServiceImpl(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }
}
