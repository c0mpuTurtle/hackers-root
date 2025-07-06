package org.example.hackersroot.db;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "root")
public class Root {
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
}
