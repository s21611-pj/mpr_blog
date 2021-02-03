package pl.pjatk.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.pjatk.blog.model.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
//    count(a.idAuthor),
    @Query("select count(a.idAuthor), p.authorPost.nameAuthor, p.categoryPost from Post p join Author a on p.authorPost.idAuthor = a.idAuthor where a.idAuthor = :idAuthor  and p.categoryPost = :categoryPost")
    List<Object[]> getPostByAuthorPostAndCategoryPost(Long idAuthor, String categoryPost);



}
