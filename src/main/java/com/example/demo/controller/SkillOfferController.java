package com.example.demo.controller;

import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/skill-offers")
public class SkillOfferController {

    private final SkillOfferService service;

    public SkillOfferController(SkillOfferService service) {
        this.service = service;
    }

    @PostMapping
    public SkillOffer createOffer(@RequestBody SkillOffer offer) {
        return service.createOffer(offer);
    }

    @PutMapping("/{id}")
    public SkillOffer updateOffer(@PathVariable Long id, @RequestBody SkillOffer offer) throws Exception {
        return service.updateOffer(id, offer);
    }

    @GetMapping("/{id}")
    public SkillOffer getOfferById(@PathVariable Long id) throws Exception {
        return service.getOfferById(id);
    }

    @GetMapping("/user/{userId}")
    public List<SkillOffer> getOffersByUser(@PathVariable Long userId) {
        return service.getOffersByUser(userId);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivateOffer(@PathVariable Long id) throws Exception {
        service.deactivateOffer(id);
    }
}
// package com.example.demo.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
// import java.util.List;
// import com.example.demo.model.SkillOffer;
// import com.example.demo.service.SkillOfferService;

// @RestController
// public class SkillOfferController{
//     private final SkillOfferService sos;
//     public SkillOfferController(SkillOfferService sos){
//         this.sos=sos;
//     };
//     @PostMapping("/api/skill-offers/POST")
//     public SkillOffer create(@RequestBody SkillOffer offer){
//         return sos.createOffer(offer);
//     }
//     @PutMapping("/api/skill-offers/PUT/{id}")
//     public SkillOffer update(@PathVariable Long id,@RequestBody SkillOffer offer){
//         return sos.updateOffer(id,offer);
//     }
//     @GetMapping("/api/skill-offers/GET/{id}")
//     public SkillOffer get(@PathVariable Long id){
//         return sos.getOfferById(id);
//     }
//     @GetMapping("/api/skill-offers/GET/user/{userId}")
//     public List<SkillOffer> getByUser(@PathVariable Long userId){
//         return sos.getOffersByUser(userId);
//     }
//     @PutMapping("/api/skill-offers/PUT/{id}/deactivate")
//     public void deactivate(@PathVariable Long id){
//         sos.deactivateOffer(id);
//     }
// }
