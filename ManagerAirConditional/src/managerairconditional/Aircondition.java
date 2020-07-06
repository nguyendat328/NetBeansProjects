/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerairconditional;

/**
 *
 * @author choco
 */
public class Aircondition {

    private Integer id;
    private String name;
    private String typeId;
    private Double price;
    private String created;
    private String status;

    public Aircondition(Integer id, String name, String typeId, Double price, String created, String status) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.price = price;
        this.created = created;
        this.status = status;
    }

    public Aircondition() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
