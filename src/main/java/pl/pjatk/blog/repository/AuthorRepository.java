package pl.pjatk.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.blog.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
