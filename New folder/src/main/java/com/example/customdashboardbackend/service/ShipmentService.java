package com.example.customdashboardbackend.service;

import com.example.customdashboardbackend.entity.Shipment;
import com.example.customdashboardbackend.repository.ShipmentRepository;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParser;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.plaf.nimbus.State;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ShipmentService {
    @Autowired
    private ShipmentRepository shipmentRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PersistenceContext
    private EntityManager entityManager;
    public List<Shipment> getAll(){
        return shipmentRepository.findAll();
    }


    public Object customQuery( String query) throws JSQLParserException {

        try {
            System.out.println(query);
            CCJSqlParserUtil.parse(query);
//            return entityManager.createNativeQuery(query).getResultList();
            return jdbcTemplate.queryForList(query);

        } catch (JSQLParserException e) {
            return "wrong syntax";
        }
    }

}
