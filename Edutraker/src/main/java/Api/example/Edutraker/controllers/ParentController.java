package Api.example.Edutraker.controllers;

import Api.example.Edutraker.entities.Parent;
import Api.example.Edutraker.services.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/parents")
public class ParentController {

        @Autowired
        private ParentService parentService;

        @PostMapping
        public Parent createParent(@RequestBody Parent parent) {
            return parentService.createParent(parent);
        }

        @GetMapping("/{id}")
        public Parent getParent(@PathVariable Long id) {
            return parentService.getParent(id);
        }

        @GetMapping
        public List<Parent> getAllParents() {
            return parentService.getAllParents();
        }

        @PutMapping("/{id}")
        public Parent updateParent(@PathVariable Long id, @RequestBody Parent parent) {
            return parentService.updateParent(id, parent);
        }

        @DeleteMapping("/{id}")
        public void deleteParent(@PathVariable Long id) {
            parentService.deleteParent(id);
        }
}
