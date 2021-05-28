package pl.tebSpring.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public List<Todo> listAllTodos() {
		List<Todo> users = service.retrieveTodos("TEB");
		return users;
	}
	
	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	public Todo listTodo(@PathVariable int id) {
		return service.retrieveTodo(id);
	}

}
