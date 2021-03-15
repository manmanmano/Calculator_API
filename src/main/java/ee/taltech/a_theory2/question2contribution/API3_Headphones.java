package ee.taltech.a_theory2.question2contribution;

import ee.taltech.a_theory2.question2contribution.classes.Headphone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public class API3_Headphones {

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
    // Management wants to define an API endpoint so frontend can display data about headphones (think headphones e-shop)
    // A Add necessary annotations to this class so this class can serve data
    // B Add a method to query all the headphones (method content is not important - I am grading urls, annotations, names, and parameters)
    // C Add a method to query a single headphones by it's unique identifier (method content is not important - I am grading urls, annotations, names, and parameters)
    // D Modify an existing method to query/filter headphones by price while keeping existing functionality (price can be a string)
    // E Modify an existing method to query/filter anc (active noise cancellation) while keeping existing functionality (anc can be a string)

    @GetMapping(value="/")
    public List<Headphone> getAllHeadphones (@RequestParam Optional<String> price, Optional<String> anc) {
        return null;
    }

    @GetMapping(value="/{id}")
    public Headphone getSingleHeadphone(@PathVariable Long id) {

        return null;
    }

    //todo theoretical assignment
    // F write pseudocode for saving a new pair of headphones (add annotations or http method names, urls, necessary parameters)
    // Post method (hide activity from the public)
    // url = /addPair
    // public void addNewHeadphones (String releaseYear, String manufacturer, String price, Double rating, Long id, String anc) {
    // set releaseYear (given by manufacturer)
    // set manufacturer (where are bought)
    // set price (take from manufacturer)
    // set id (must be unique)
    // set rating (must be 0.0 since it has not been rated yet)
    // set anc (yes or no || true or false)
    // }
    // G write pseudocode for updating existing pair of headphones (add annotations or http method names, urls, necessary parameters)
    // Post method to hide from public
    // url = /updatePair
    // public void updateHeadphones (String price, Double rating, String inStock) {
    // set price (updated, maybe discount)
    // set rating (taken from customers)
    // set inStock (yes or no)
    // }
    // H write pseudocode for deleting a pair of headphones (add annotations or http method names, urls, necessary parameters)
    // Post method to hide from public
    // url = /deletePair
    // public void deleteHeadphones (String price, String manufacturer, Double rating, String anc, Long id, String releaseYear) {
    // delete price
    // delete manufacturer
    // delete rating
    // delete anc
    // delete id
    // delete releaseYear
    // }
}
