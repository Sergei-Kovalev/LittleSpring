package ru.ngs.summerjob.spring_entrance;


import org.springframework.context.annotation.*;
import ru.ngs.summerjob.spring_entrance.entity.Cat;
import ru.ngs.summerjob.spring_entrance.entity.Person;
import ru.ngs.summerjob.spring_entrance.entity.Pet;

@Configuration
//@ComponentScan("ru.ngs.summerjob.LittleSpring.entity")
@PropertySource({"classpath:myApp.properies"})
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
//    @Scope("singleton")                           //default
    public Person personBean() {
        return new Person(catBean());
    }
}
