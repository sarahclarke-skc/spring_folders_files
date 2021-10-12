package com.example.files_folders_homework.repositories;

import com.example.files_folders_homework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
