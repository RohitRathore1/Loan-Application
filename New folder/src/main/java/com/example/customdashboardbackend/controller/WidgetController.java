package com.example.customdashboardbackend.controller;
import com.example.customdashboardbackend.entity.Widget;
import com.example.customdashboardbackend.service.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/widget")
public class WidgetController {

    @Autowired
    private WidgetService widgetService;

    @GetMapping("/get-all")
    private Object getWidgets(){
        return widgetService.getWidgets();
    }

    @GetMapping("/getby-id")
    @ResponseBody
    private Object getWidgetsById(@RequestBody int id){
        return widgetService.getWidgetsById(id);
    }

    @PostMapping("/create")
    private Object createWidget(@RequestBody Widget widget) {
        return widgetService.createWidget(widget);
    }

}
