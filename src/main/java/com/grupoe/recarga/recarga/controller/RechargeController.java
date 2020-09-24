package com.grupoe.recarga.recarga.controller;


import com.grupoe.recarga.recarga.domain.Recharge;
import com.grupoe.recarga.recarga.service.MovementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recarga/")
public class RechargeController {

    private final MovementService movementService;

    RechargeController(MovementService movementService) {
        this.movementService = movementService;
    }

    @PostMapping
    Recharge saveRecarga(@RequestBody Recharge recharge){
        return movementService.add(recharge);

    }

    @GetMapping
    List<Recharge> findAll(){
        return movementService.findAll();
    }

}
