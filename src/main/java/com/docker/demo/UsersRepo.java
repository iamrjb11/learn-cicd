package com.docker.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<UsersModel, Integer> {
}
