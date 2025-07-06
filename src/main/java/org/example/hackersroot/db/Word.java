package org.example.hackersroot.db;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint", nullable = false)
    private Long id;

    @Column(name = "eng", columnDefinition = "varchar(50)", nullable = false)
    private String eng;

    @Column(name = "kor", columnDefinition = "varchar(50)", nullable = false)
    private String kor;

    @Column(name = "day", columnDefinition = "varchar(20)", nullable = false)
    private int day;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "root_id", columnDefinition = "bigint", nullable = false)
    private Root root;

    @Builder
    public Word(Long id, String eng, String kor, int day, Root root) {
        this.id = id;
        this.eng = eng;
        this.kor = kor;
        this.day = day;
        this.root = root;
    }
}
