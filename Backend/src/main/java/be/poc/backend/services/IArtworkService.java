package be.poc.backend.services;

import be.poc.backend.domain.Artwork;
import be.poc.backend.domain.ArtworkRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IArtworkService {
    List<Artwork> getAllArtWorks();
    Artwork AddArtwork(ArtworkRequest artworkRequest);
    Page<Artwork> getAllArtworksPaginated(int page, int size);


}
