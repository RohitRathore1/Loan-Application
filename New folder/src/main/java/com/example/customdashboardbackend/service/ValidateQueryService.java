package com.example.customdashboardbackend.service;

import com.example.customdashboardbackend.entity.Query;
import com.example.customdashboardbackend.repository.ShipmentRepository;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidateQueryService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    private static final String READ_ONLY_PATTERN = "(?i)\\bSELECT\\b|\\bSHOW\\b|\\bDESCRIBE\\b|\\bEXPLAIN\\b";
    //    @Autowired
    public boolean isReadOnlyQuery(Query sql) {
        // Use a regular expression to check if the SQL query is read-only.
        Pattern pattern = Pattern.compile(READ_ONLY_PATTERN);
        Matcher matcher = pattern.matcher(sql.getQuery());
        return matcher.find();
    }




}
