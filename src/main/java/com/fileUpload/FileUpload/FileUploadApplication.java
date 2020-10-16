package com.fileUpload.FileUpload;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fileUpload.FileUpload.service.FileStorageService;

@SpringBootApplication
public class FileUploadApplication  implements CommandLineRunner{
    @Resource
    FileStorageService storageService;
    
	public static void main(String[] args) {
		SpringApplication.run(FileUploadApplication.class, args);
	}  
  
	@Override
	public void run(String...strings)throws Exception{
		storageService.deleteAll();
		storageService.init();
	} 

	

}
