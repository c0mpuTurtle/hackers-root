package org.example.hackersroot.controller;

import org.example.hackersroot.db.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
    List<Word> findByDayBetween(int startDay, int endDay);
}

