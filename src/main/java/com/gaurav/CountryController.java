package com.gaurav;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CountryController {

    private CountryRepository repository;

    public CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/")
    public String showDropDown(Model model){
        model.addAttribute("country",repository.findAll());
        return "home";
    }

    @RequestMapping("/save")
    public String saveCountry(@RequestParam String selectList){
        //This can be saved as any person data.
        Country countryName = repository.findById(Long.valueOf(selectList)).orElse(null);
        System.out.println("***********"+countryName+"***********");
        repository.save(new Country(countryName.getCountryName()));
        return "redirect:/";
    }
}
