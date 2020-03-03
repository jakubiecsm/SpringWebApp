package jakubiecsm.SpringWebApp.SpringWebApp.repositories;

import jakubiecsm.SpringWebApp.SpringWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
