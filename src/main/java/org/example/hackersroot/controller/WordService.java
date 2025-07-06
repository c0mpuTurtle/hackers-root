package org.example.hackersroot.controller;

import lombok.RequiredArgsConstructor;
import org.example.hackersroot.db.Word;
import org.example.hackersroot.controller.WordRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WordService {

    private final WordRepository wordRepository;

    public List<WordDto> getRandomWords(int startWeek, int endWeek, int count) {
        List<Word> words = wordRepository.findByDayBetween(startWeek, endWeek);
        Collections.shuffle(words);
        return words.stream()
                .limit(count)
                .map(w -> new WordDto(w.getEng(), w.getKor(), w.getDay()))
                .collect(Collectors.toList());
    }
}
