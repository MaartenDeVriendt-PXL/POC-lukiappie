package be.poc.backend.configuration;

import be.poc.backend.domain.Artwork;
import be.poc.backend.repository.ArtworkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Configuration
@RequiredArgsConstructor
public class ArtworkSeeder {
    private final ArtworkRepository artworkRepository;
    List<String> images = List.of(
            "https://picsum.photos/id/0/600/400",
            "https://picsum.photos/id/1/600/400",
            "https://picsum.photos/id/2/600/400",
            "https://picsum.photos/id/3/600/400",
            "https://picsum.photos/id/4/600/400",
            "https://picsum.photos/id/5/600/400",
            "https://picsum.photos/id/6/600/400",
            "https://picsum.photos/id/7/600/400",
            "https://picsum.photos/id/8/600/400",
            "https://picsum.photos/id/9/600/400",
            "https://picsum.photos/id/10/600/400",
            "https://picsum.photos/id/11/600/400",
            "https://picsum.photos/id/12/600/400",
            "https://picsum.photos/id/13/600/400",
            "https://picsum.photos/id/14/600/400",
            "https://picsum.photos/id/15/600/400",
            "https://picsum.photos/id/16/600/400",
            "https://picsum.photos/id/17/600/400",
            "https://picsum.photos/id/18/600/400",
            "https://picsum.photos/id/19/600/400",
            "https://picsum.photos/id/20/600/400",
            "https://picsum.photos/id/21/600/400",
            "https://picsum.photos/id/22/600/400",
            "https://picsum.photos/id/23/600/400",
            "https://picsum.photos/id/24/600/400",
            "https://picsum.photos/id/25/600/400",
            "https://picsum.photos/id/26/600/400",
            "https://picsum.photos/id/27/600/400",
            "https://picsum.photos/id/28/600/400",
            "https://picsum.photos/id/29/600/400",
            "https://picsum.photos/id/30/600/400",
            "https://picsum.photos/id/31/600/400",
            "https://picsum.photos/id/32/600/400",
            "https://picsum.photos/id/33/600/400",
            "https://picsum.photos/id/34/600/400",
            "https://picsum.photos/id/35/600/400",
            "https://picsum.photos/id/36/600/400",
            "https://picsum.photos/id/37/600/400",
            "https://picsum.photos/id/38/600/400",
            "https://picsum.photos/id/39/600/400",
            "https://picsum.photos/id/40/600/400",
            "https://picsum.photos/id/41/600/400",
            "https://picsum.photos/id/42/600/400",
            "https://picsum.photos/id/43/600/400",
            "https://picsum.photos/id/44/600/400",
            "https://picsum.photos/id/45/600/400",
            "https://picsum.photos/id/46/600/400",
            "https://picsum.photos/id/47/600/400",
            "https://picsum.photos/id/48/600/400",
            "https://picsum.photos/id/49/600/400",
            "https://picsum.photos/id/50/600/400",
            "https://picsum.photos/id/51/600/400",
            "https://picsum.photos/id/52/600/400",
            "https://picsum.photos/id/53/600/400",
            "https://picsum.photos/id/54/600/400",
            "https://picsum.photos/id/55/600/400",
            "https://picsum.photos/id/56/600/400",
            "https://picsum.photos/id/57/600/400",
            "https://picsum.photos/id/58/600/400",
            "https://picsum.photos/id/59/600/400",
            "https://picsum.photos/id/60/600/400",
            "https://picsum.photos/id/61/600/400",
            "https://picsum.photos/id/62/600/400",
            "https://picsum.photos/id/63/600/400",
            "https://picsum.photos/id/64/600/400",
            "https://picsum.photos/id/65/600/400",
            "https://picsum.photos/id/66/600/400",
            "https://picsum.photos/id/67/600/400",
            "https://picsum.photos/id/68/600/400",
            "https://picsum.photos/id/69/600/400",
            "https://picsum.photos/id/70/600/400",
            "https://picsum.photos/id/71/600/400",
            "https://picsum.photos/id/72/600/400",
            "https://picsum.photos/id/73/600/400",
            "https://picsum.photos/id/74/600/400",
            "https://picsum.photos/id/75/600/400",
            "https://picsum.photos/id/76/600/400",
            "https://picsum.photos/id/77/600/400",
            "https://picsum.photos/id/78/600/400",
            "https://picsum.photos/id/79/600/400",
            "https://picsum.photos/id/80/600/400",
            "https://picsum.photos/id/81/600/400",
            "https://picsum.photos/id/82/600/400",
            "https://picsum.photos/id/83/600/400",
            "https://picsum.photos/id/84/600/400",
            "https://picsum.photos/id/85/600/400",
            "https://picsum.photos/id/86/600/400",
            "https://picsum.photos/id/87/600/400",
            "https://picsum.photos/id/88/600/400",
            "https://picsum.photos/id/89/600/400",
            "https://picsum.photos/id/90/600/400",
            "https://picsum.photos/id/91/600/400",
            "https://picsum.photos/id/92/600/400",
            "https://picsum.photos/id/93/600/400",
            "https://picsum.photos/id/94/600/400",
            "https://picsum.photos/id/95/600/400",
            "https://picsum.photos/id/96/600/400",
            "https://picsum.photos/id/97/600/400",
            "https://picsum.photos/id/98/600/400",
            "https://picsum.photos/id/99/600/400"
    );

    @Bean
    public CommandLineRunner seedArtworks() {
        return args -> {
            if (artworkRepository.count() == 0) {
                IntStream.rangeClosed(1, 100).forEach(i -> {
                    Artwork artwork = Artwork.builder()
                            .title("Artwork Title " + i)
                            .creator("Artist " + (i % 10 + 1))
                            .description("Description for artwork number " + i)
                            .imagePath(images.get(i - 1))
                            .uploadDate(LocalDateTime.now())
                            .build();
                    artworkRepository.save(artwork);
                });
                System.out.println("Seeded 100 artworks.");
            }
        };
    }
}
