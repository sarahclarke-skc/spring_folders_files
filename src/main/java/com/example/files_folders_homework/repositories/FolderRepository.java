package com.example.files_folders_homework.repositories;

import com.example.files_folders_homework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
