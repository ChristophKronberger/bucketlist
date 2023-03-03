package at.kronberger.bucketlist.todo;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class DBinitializer implements CommandLineRunner {

    @Autowired
    TodoItemRepository todoRepo;
    @Override
    public void run(String... args) throws Exception {
        List<TodoItem> todos = List.of(
      new TodoItem(null, "Wäsche waschen", new Date()),
      new TodoItem(null, "Hund Füttern", new Date()),
      new TodoItem(null, "Staubsaugen", new Date())
        );
        todoRepo.saveAll(todos);
    }
}
