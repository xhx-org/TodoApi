package Hirsi.CS.whu.edu.todoapi;


import Hirsi.CS.whu.edu.todoapi.bean.Todo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class Service {

    private static List<Todo> todos;
    static {
        todos = new LinkedList<>();
        todos.add(new Todo(1, "Javascript"));
        todos.add(new Todo(2, "Java"));
        todos.add(new Todo(3, "C#"));
    }
    @RequestMapping("/all")
    @ResponseBody
    public List<Todo> getAll() {
        return todos;
    }


}
