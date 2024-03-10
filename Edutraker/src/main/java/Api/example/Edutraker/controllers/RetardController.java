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

        @GetMapping("/{ret_id}")
        public Retard getRetard(@PathVariable Long ret_id) {
            return retardService.getRetard(ret_id);
        }

        @GetMapping
        public List<Retard> getAllRetards() {
            return retardService.getAllRetards();
        }

        @PutMapping("/{ret_id}")
        public Retard updateRetard(@PathVariable Long ret_id, @RequestBody Retard retard) {
            return retardService.updateRetard(ret_id, retard);
        }

        @DeleteMapping("/{ret_id}")
        public void deleteRetard(@PathVariable Long ret_id) {
            retardService.deleteRetard(ret_id);
        }
}
