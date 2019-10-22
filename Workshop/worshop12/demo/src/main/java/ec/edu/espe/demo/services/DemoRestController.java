package ec.edu.espe.demo.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//etiquetas deja que comoprtarse cmo deberia comportarse y se comporta como otra cosa

import ec.edu.espe.demo.imp.Student;
import ec.edu.espe.demo.imp.Teacher;

@RestController
@RequestMapping("api/demo")
public class DemoRestController {

    Student student = new Student();
    Teacher teacher = new Teacher();

    @GetMapping("/student")
    public String getStudent(){
        return student.sayHello();
    }
     @GetMapping("/teacher")
    public String getTeacher(){
        return teacher.sayHello();
    }



    /*@GetMapping
    public String hello(){
        return "Hola mundo,  soy el servicio rest";
    }
    @GetMapping("/goodbye")
    public String goodBye(){
        return "Adios";
    }

    // pude traer un valor el "pathvaruable"        
    @GetMapping(value = "/callme/{name}/{age}")
    public Person name(@PathVariable String name, @PathVariable int age, @PathVariable int id ){
        return new Person(name, age ,id);
    }

    @PostMapping
    public Person person(@RequestBody Person per){
        per.setAge(52);
        return per;*/
    }
