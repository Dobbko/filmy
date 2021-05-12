package pl.zajecia.filmy.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.zajecia.filmy.dao.VideoCassetteRepo;
import pl.zajecia.filmy.dao.entity.VideoCassete;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCassetteManager {
    private VideoCassetteRepo videoCassetteRepo;

    @Autowired
    public VideoCassetteManager(VideoCassetteRepo videoCassetteRepo) {
        this.videoCassetteRepo = videoCassetteRepo;
    }

    public Optional<VideoCassete> finfAllById(Long id) {
        return videoCassetteRepo.findById(id);
    }

    public Iterable<VideoCassete> findAll() {
        return videoCassetteRepo.findAll();
    }

    public VideoCassete save(VideoCassete videoCassete) {
        return videoCassetteRepo.save(videoCassete);
    }

    public void delete(Long id) {
        videoCassetteRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDb() {
        save(new VideoCassete(1L,"Tytuł1", LocalDate.of(1999,1,1)));
        save(new VideoCassete(2L,"Tytuł2", LocalDate.of(1998,2,3)));
    }
}
