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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SkillOfferController {
    
    @Autowired
    private SkillOfferService skillOfferService;
    
    @PostMapping("/offers")
    public ResponseEntity<SkillOffer> create(@RequestBody SkillOffer skillOffer) {
        SkillOffer created = skillOfferService.createOffer(skillOffer);
        return ResponseEntity.ok(created);
    }
    
    @GetMapping("/offers/{id}")
    public ResponseEntity<SkillOffer> get(@PathVariable Long id) {
        SkillOffer offer = skillOfferService.getOfferById(id);
        return ResponseEntity.ok(offer);
    }
}