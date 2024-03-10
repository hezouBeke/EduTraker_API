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

        @GetMapping("/{parent_id}")
        public Parent getParent(@PathVariable Long parent_id) {
            return parentService.getParent(parent_id);
        }

        @GetMapping
        public List<Parent> getAllParents() {
            return parentService.getAllParents();
        }

        @PutMapping("/{parent_id}")
        public Parent updateParent(@PathVariable Long parent_id, @RequestBody Parent parent) {
            return parentService.updateParent(parent_id, parent);
        }

        @DeleteMapping("/{id}")
        public void deleteParent(@PathVariable Long parent_id) {
            parentService.deleteParent(parent_id);
        }
}
