package com.dojo.customers.services;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerBlobService {

//    ResponseEntity<byte[]> getBytesBlob(String name);
    List<String> listBlobNames();
    Optional<String> findFileBlob(String name);
}
