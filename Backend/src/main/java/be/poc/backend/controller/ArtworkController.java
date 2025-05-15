package be.poc.backend.controller;

import be.poc.backend.domain.Artwork;
import be.poc.backend.domain.ArtworkRequest;
import be.poc.backend.services.IArtworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artwork")
@RequiredArgsConstructor
public class ArtworkController {
    private final IArtworkService artWorkService;

    @GetMapping
    public ResponseEntity<List<Artwork>> getArtWorks(){
        return new ResponseEntity<>(artWorkService.getAllArtWorks(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Artwork> addArtwork(@RequestBody ArtworkRequest artworkRequest){
        return new ResponseEntity<>(artWorkService.AddArtwork(artworkRequest), HttpStatus.CREATED);
    }
}
