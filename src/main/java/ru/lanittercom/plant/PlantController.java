package ru.lanittercom.plant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/plant")
public class PlantController {
    @GetMapping("/{type}/{quantity}")
    public ResponseEntity productions(@PathVariable String type, @PathVariable String quantity) {
        // производство
        System.out.println("Производим: " + type + " в колличестве " + quantity);
        return ResponseEntity.ok("Произвели");
    }
}