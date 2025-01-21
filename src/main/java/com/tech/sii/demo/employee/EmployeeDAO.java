package com.tech.sii.demo.employee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tech.sii.demo.DL.DataLayer;
import com.tech.sii.demo.DL.DataLayerSingle;

public class EmployeeDAO {
    private HttpClient client = HttpClient.newHttpClient();
    String uri = "http://dummy.restapiexample.com/api/v1";
    ObjectMapper mapper = new ObjectMapper();
    private static final Logger log = LoggerFactory.getLogger(EmployeeDAO.class);

    public Employee[] getEmployees() throws IOException, InterruptedException {
        HttpRequest req = HttpRequest.newBuilder(
            URI.create(uri + "/employees")
        ).header("accept", "application/json")
        .build();
        String res = client.send(req, BodyHandlers.ofString()).body();
        log.error(res);
        return mapper.readValue(res, DataLayer.class).getData();
    }
    public Employee getEmployeeById(int id) throws StreamReadException, DatabindException, IOException, InterruptedException {
        HttpRequest req = HttpRequest.newBuilder(
            URI.create(uri+"/employee/"+id)
        ).header("accept", "application/json")
        .build();
        InputStream res = client.send(req, BodyHandlers.ofInputStream()).body();
        return mapper.readValue(res, DataLayerSingle.class).getData();
    }
}
