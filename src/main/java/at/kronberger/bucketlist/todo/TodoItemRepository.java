package at.kronberger.bucketlist.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;
import java.util.Optional;

@RepositoryRestController
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
    @Override
    <S extends TodoItem> S save(S entity);

    @Override
    List<TodoItem> findAll();

    @Override
    Optional<TodoItem> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}