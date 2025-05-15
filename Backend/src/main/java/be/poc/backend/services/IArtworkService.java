package be.poc.backend.services;

import be.poc.backend.domain.Artwork;
import be.poc.backend.domain.ArtworkRequest;

import java.util.List;

public interface IArtworkService {
    List<Artwork> getAllArtWorks();
    Artwork AddArtwork(ArtworkRequest artworkRequest);


}
