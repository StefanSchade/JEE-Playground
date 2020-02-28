package de.stefanschade.Chad_Darby_002_ManagedBean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
@NoArgsConstructor
@Getter
@Setter
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private List<String> countryOptions;
    private String[] favoriteLanguages;
    private List<String> languageOptions;

    @PostConstruct
    public void initalize() {

        firstName = "Vorname";
        lastName = "Nachname";
        countryOptions = new ArrayList<>();
        countryOptions.add("India");
        countryOptions.add("China");
        countryOptions.add("Japan");
        countryOptions.add("Korea");
        countryOptions.add("Vietnam");
        countryOptions.add("Indonesia");

        languageOptions = new ArrayList<>();
        languageOptions.add("Java");
        languageOptions.add("JavaScript");
        languageOptions.add("C++");
        languageOptions.add("Scala");
    }

}
