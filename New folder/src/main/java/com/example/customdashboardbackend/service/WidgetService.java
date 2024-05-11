package com.example.customdashboardbackend.service;

import com.example.customdashboardbackend.entity.Widget;
import com.example.customdashboardbackend.repository.WidgetRepository;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class WidgetService {


    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private WidgetRepository widgetRepository;

    public Object getWidgets(){
        return widgetRepository.findAll();
    }

    public Object getWidgetsById(int id){
        return jdbcTemplate.queryForList("select * from widget where dashboard_id = " +"1");
    }

    public Object createWidget(Widget widget){

        return widgetRepository.save(widget);
//        return "success";

    }
}
