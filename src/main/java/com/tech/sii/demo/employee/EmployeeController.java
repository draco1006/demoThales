package com.tech.sii.demo.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tech.sii.demo.ejb.EmployeeSessionBean;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployeeController {
    private static final Logger log = LoggerFactory.getLogger(EmployeeDAO.class);

    @Autowired
    private EmployeeSessionBean ejb;    

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<EmployeeSalary[]> getEmployeeList() {
        EmployeeDAO xd = new EmployeeDAO();
        try {
            Employee[]emp = xd.getEmployees();
            EmployeeSalary[] xs = new EmployeeSalary[emp.length];
            for(int i = 0; i< emp.length;i++) {
                EmployeeSalary x = new EmployeeSalary(emp[i]);
                x.setAnual_salary( ejb.anualSalary( x.getEmployee_salary() ) );
                xs[i] = x;
            }
            log.error(xs.toString());
            return new ResponseEntity<>(xs, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/id")
    public ResponseEntity<EmployeeSalary> getEmployeeById(@RequestParam int id) {
        EmployeeDAO xd = new EmployeeDAO();
        try {
            Employee emp = xd.getEmployeeById(id);
            EmployeeSalary xs = new EmployeeSalary(emp);

            xs.setAnual_salary( ejb.anualSalary( xs.getEmployee_salary() ) );
            log.error(xs.toString());
            return new ResponseEntity<>(xs, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
