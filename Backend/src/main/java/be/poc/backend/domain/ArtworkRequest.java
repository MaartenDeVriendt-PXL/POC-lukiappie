package be.poc.backend.domain;

import java.time.LocalDateTime;

public record ArtworkRequest(String title, String creator, String description, String imagePath) {
}