package be.poc.backend.configuration;

import be.poc.backend.domain.Artwork;
import be.poc.backend.repository.ArtworkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@Configuration
@RequiredArgsConstructor
public class ArtworkSeeder {
    private final ArtworkRepository artworkRepository;

    @Bean
    public CommandLineRunner seedArtworks() {
        return args -> {
            if (artworkRepository.count() == 0) {
                IntStream.rangeClosed(1, 100).forEach(i -> {
                    Artwork artwork = Artwork.builder()
                            .title("Artwork Title " + i)
                            .creator("Artist " + (i % 10 + 1))
                            .description("Description for artwork number " + i)
                            .imagePath("https://source.unsplash.com/random/600x400?sig=" + i)                            .uploadDate(LocalDateTime.now().minusDays(i))
                            .build();
                    artworkRepository.save(artwork);
                });
                System.out.println("Seeded 100 artworks.");
            }
        };
    }
}
