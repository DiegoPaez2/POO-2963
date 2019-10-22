package ec.edu.espe.demo.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//etiquetas deja que comoprtarse cmo deberia comportarse y se comporta como otra cosa

import ec.edu.espe.demo.util.Person;

@RestController
@RequestMapping("api/demo")
public class DemoRestController {

    @GetMapping
    public String hello(){
        return "Hola mundo,  soy el servicio rest";
    }
    @GetMapping("/goodbye")
    public String goodBye(){
        return "Adios";
    }

    // pude traer un valor el "pathvaruable"        
    @GetMapping(value = "/callme/{name}/{age}/{id}")
    public Person name(@PathVariable String name, @PathVariable int age, @PathVariable String id){
        return new Person(name, age, id);
    }

}