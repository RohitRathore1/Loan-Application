package com.example.customdashboardbackend.controller;

import com.example.customdashboardbackend.entity.Query;
import com.example.customdashboardbackend.entity.Shipment;
import com.example.customdashboardbackend.repository.ShipmentRepository;
import com.example.customdashboardbackend.service.ShipmentService;
import com.example.customdashboardbackend.service.ValidateQueryService;
import net.sf.jsqlparser.JSQLParserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/shipment")
@CrossOrigin("http://localhost:3000")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;
    @Autowired
    private ValidateQueryService validateQueryService;
    private ShipmentRepository shipmentRepository;


    @GetMapping("/get-all")
    public List<Shipment> getAll(){
        return shipmentService.getAll();
    }

    @PostMapping("/custom-query")
    public Object customQuery(@RequestBody Query query) throws JSQLParserException {

        if(!validateQueryService.isReadOnlyQuery(query)){
            return "read-only queries allowed only";
        }

        return shipmentService.customQuery(query.getQuery());
    }
}
