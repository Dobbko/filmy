package pl.zajecia.filmy.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.zajecia.filmy.dao.entity.VideoCassete;

@Repository
public interface VideoCassetteRepo extends CrudRepository<VideoCassete,Long> {
}
