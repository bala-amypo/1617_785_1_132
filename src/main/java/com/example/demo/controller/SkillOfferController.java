// package com.example.demo.controller;

// import com.example.demo.model.SkillOffer;
// import com.example.demo.service.SkillOfferService;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import jakarta.validation.Valid;


// @RestController
// @RequestMapping("/api/skill-offers")
// public class SkillOfferController {

//     private final SkillOfferService service;

//     public SkillOfferController(SkillOfferService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public SkillOffer createOffer(@Valid @RequestBody SkillOffer offer) {
//         return service.createOffer(offer);
//     }

//     @PutMapping("/{id}")
//     public SkillOffer updateOffer(@PathVariable Long id,@Valid  @RequestBody SkillOffer offer) throws Exception {
//         return service.updateOffer(id, offer);
//     }

//     @GetMapping("/{id}")
//     public SkillOffer getOfferById(@PathVariable Long id) throws Exception {
//         return service.getOfferById(id);
//     }

//     @GetMapping("/user/{userId}")
//     public List<SkillOffer> getOffersByUser(@PathVariable Long userId) {
//         return service.getOffersByUser(userId);
//     }

//     @PutMapping("/{id}/deactivate")
//     public void deactivateOffer(@PathVariable Long id) throws Exception {
//         service.deactivateOffer(id);
//     }
// }
package com.example.demo.controller;

import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/offers")
public class SkillOfferController {

    private final SkillOfferService skillOfferService;

    public SkillOfferController(SkillOfferService skillOfferService) {
        this.skillOfferService = skillOfferService;
    }

    @PostMapping
    public ResponseEntity<SkillOffer> create(@RequestBody SkillOffer offer) {
        return ResponseEntity.ok(skillOfferService.createOffer(offer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillOffer> get(@PathVariable Long id) {
        return ResponseEntity.ok(skillOfferService.getOfferById(id));
    }
}
