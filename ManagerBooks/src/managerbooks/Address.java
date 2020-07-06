/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerbooks;

import java.util.Objects;

/**
 *
 * @author choco
 */
public class Address {

    private String id;

    private Double lat;
    private Double log;
    private String name;

    public Address(String id, Double lat, Double log, String name) {
        this.id = id;
        this.lat = lat;
        this.log = log;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLog() {
        return log;
    }

    public void setLog(Double log) {
        this.log = log;
    }

}
