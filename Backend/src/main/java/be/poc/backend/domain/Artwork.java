package be.poc.backend.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "artwork")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Artwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String creator;
    private String description;
    private String imagePath;
    private LocalDateTime uploadDate;
}
