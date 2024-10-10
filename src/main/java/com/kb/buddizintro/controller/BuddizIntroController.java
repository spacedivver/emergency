    package com.kb.buddizintro.controller;

    import com.kb.buddizintro.dto.BuddizIntroDTO;
    import com.kb.buddizintro.service.BuddizIntroService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/api/buddiz")
    @CrossOrigin(origins = "http://localhost:5173") // Enable CORS for this controller
    public class BuddizIntroController {

        private final BuddizIntroService buddizService;

        @Autowired
        public BuddizIntroController(BuddizIntroService buddizService) {
            this.buddizService = buddizService;
        }

        @GetMapping("/intro") // Endpoint to get all Buddiz introductions
        public List<BuddizIntroDTO> getAllBuddizIntro() {
            return buddizService.getAllBuddizIntro();
        }

        @GetMapping("/intro/{uno}") // Get Buddiz intro by unique number
        public BuddizIntroDTO getBuddizIntro(@PathVariable Integer uno) {
            return buddizService.getBuddizIntro(uno);
        }

        @PutMapping("/intro/update")
        public String updateBuddizIntro(@RequestBody BuddizIntroDTO buddizDTO) {
            buddizService.updateBuddizIntro(buddizDTO);
            return "Buddiz Introduction updated successfully";
        }
    }
