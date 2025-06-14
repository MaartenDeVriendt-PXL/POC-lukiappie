package be.poc.backend.services;

import be.poc.backend.domain.Artwork;
import be.poc.backend.domain.ArtworkRequest;
import be.poc.backend.repository.ArtworkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtworkService implements IArtworkService {

    private final ArtworkRepository artworkRepository;

    @Override
    public List<Artwork> getAllArtWorks() {
        return artworkRepository.findAll();
    }

    @Override
    public Artwork AddArtwork(ArtworkRequest artworkRequest) {
        Artwork artwork = Artwork.builder()
                .creator(artworkRequest.creator())
                .title(artworkRequest.title())
                .description(artworkRequest.description())
                .imagePath(artworkRequest.imagePath())
                .uploadDate(LocalDateTime.now())
                .build();
        artworkRepository.save(artwork);
        return artwork;
    }

    @Override
    public Page<Artwork> getAllArtworksPaginated(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return artworkRepository.findAll(pageable);
    }
}
