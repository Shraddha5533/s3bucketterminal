package com.S3bucketterminalexample.service;

import org.springframework.web.multipart.MultipartFile;

public interface StorageServiceInterface 
{
    String uploadFile(MultipartFile file);
    byte[] downloadFile(String fileName);
    String deleteFile(String fileName);
}
