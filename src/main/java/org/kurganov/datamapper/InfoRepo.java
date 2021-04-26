package org.kurganov.datamapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoRepo extends JpaRepository<Info, Integer> {
    List<Info> findAll();
}
