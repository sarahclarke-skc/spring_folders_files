package com.example.files_folders_homework.components;

import com.example.files_folders_homework.models.File;
import com.example.files_folders_homework.models.Folder;
import com.example.files_folders_homework.models.User;
import com.example.files_folders_homework.repositories.FileRepository;
import com.example.files_folders_homework.repositories.FolderRepository;
import com.example.files_folders_homework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User tom = new User("Tom");
        userRepository.save(tom);

        User emma = new User("Emma");
        userRepository.save(emma);

        Folder folder1 = new Folder("Photos", tom);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Work", emma);
        folderRepository.save(folder2);

        File file1 = new File("Holiday", ".jpg", 250, folder1);
        folder1.addFile(file1);
        fileRepository.save(file1);
        folderRepository.save(folder1);

        File file2 = new File("Time sheet", ".txt", 100, folder2);
        folder2.addFile(file2);
        fileRepository.save(file2);
        folderRepository.save(folder2);

    }

}
