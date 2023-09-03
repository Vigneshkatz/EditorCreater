package com.katziio.codewithkatz.entity.editor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "editor_sample_video")
public class EditorSampleVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String videoName;
    private String videoLink;
}
