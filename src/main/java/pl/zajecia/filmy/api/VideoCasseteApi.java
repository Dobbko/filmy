package pl.zajecia.filmy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.zajecia.filmy.dao.entity.VideoCassete;
import pl.zajecia.filmy.manager.VideoCassetteManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCasseteApi {
    private VideoCassetteManager videoCassetes;

    @Autowired
    public VideoCasseteApi(VideoCassetteManager videoCassetes) {
        this.videoCassetes = videoCassetes;
    }

    @GetMapping("/all")
    public Iterable<VideoCassete> getAll() {
        return videoCassetes.findAll();
    }

    @GetMapping
    public Optional<VideoCassete> getById(@RequestParam long index) {
        return videoCassetes.finfAllById(index);
    }

    @PostMapping
    public VideoCassete addVideo(@RequestBody VideoCassete videoCassete) {
        return videoCassetes.save(videoCassete);
    }

    @PutMapping
    public VideoCassete updateVideo(@RequestBody VideoCassete videoCassete) {
        return videoCassetes.save(videoCassete);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam long index) {
        videoCassetes.delete(index);
    }
}
