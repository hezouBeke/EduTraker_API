package Api.example.Edutraker.controllers;

import Api.example.Edutraker.entities.Retard;
import Api.example.Edutraker.services.RetardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/retards")

public class RetardController {
        @Autowired
        private RetardService retardService;

        @PostMapping
        public Retard createRetard(@RequestBody Retard retard) {
            return retardService.createRetard(retard);
        }

        @GetMapping("/{id}")
        public Retard getRetard(@PathVariable Long id) {
            return retardService.getRetard(id);
        }

        @GetMapping
        public List<Retard> getAllRetards() {
            return retardService.getAllRetards();
        }

        @PutMapping("/{id}")
        public Retard updateRetard(@PathVariable Long id, @RequestBody Retard retard) {
            return retardService.updateRetard(id, retard);
        }

        @DeleteMapping("/{id}")
        public void deleteRetard(@PathVariable Long id) {
            retardService.deleteRetard(id);
        }
}
