package ee.taltech.a_theory2.question2contribution;

import ee.taltech.a_theory2.question2contribution.classes.Cake;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Optional;

public class API2_Cakes {

    @GetMapping(value="/")
    public List<Cake> allCakes (@RequestParam Optional<String> weight, Optional<String> name) {
        return null;
    }
    @GetMapping(value="/{id}")
    public Cake singleCake(@PathVariable Long id) {
        return null;
    }

    // todo this is contribution question
    //  this assignment is only for one team member (if this code is not committed by that team member how do I know this code was theirs?)

    // todo
    //  this assignment consists of 2 parts
    //  practical assignment A, B, C, D, E
    //          All classes are available in classes package
    //          If you want to test these practical assignments add these to your project.
    //          Example: If you Application.java is in the package ee.taltech, make sure theory is in package ee.taltech as well (ee.taltech.theory)
    //  theoretical assignment F, G, H

    //todo practical assignment
    // Management wants to define an API endpoint so frontend can display data about cakes (think cake e-shop)
    // A Add necessary annotations to this class so this class can serve data
    // B Add a method to query all the cakes (method content is not important - I am grading urls, annotations, names, and parameters)
    // C Add a method to query a single cake by it's unique identifier (method content is not important - I am grading urls, annotations, names, and parameters)
    // D Modify an existing method to query/filter cakes by weight while keeping existing functionality
    // E Modify an existing method to query/filter cakes by name while keeping existing functionality

    //todo theoretical assignment
    // F write pseudocode for saving a new cake (add annotations or http method names, urls, necessary parameters)
    // Method: POST
    // URL = "/addCake"
    // public void addCake(Long id, String name, String sweetness, String size, String weight, String rating){
    // set each of these variables for the new Cake
    // }
    // G write pseudocode for updating existing cake (add annotations or http method names, urls, necessary parameters)
    // Method: POST
    // URL = "/updateCake"
    // public void updateCake(String sweetness){
    // set new sweetness for Cake
    // }
    // H write pseudocode for deleting a cake (add annotations or http method names, urls, necessary parameters)
    // Method: POST
    // URL = "/deleteCake"
    // public void deleteCake(Long id){
    // delete whole cake with a certain id
    // }
}
