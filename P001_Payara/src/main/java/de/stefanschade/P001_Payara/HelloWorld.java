package de.stefanschade.P001_Payara;


import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorld {
    private String text = "Hello World!";

    @PostConstruct
    public void initialize() {
        System.out.println(HelloWorld.class.getSimpleName() + " was constructed");
    }

    public String getText() {
        return text;
    }
}