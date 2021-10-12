package com.example.files_folders_homework.repositories;

import com.example.files_folders_homework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
