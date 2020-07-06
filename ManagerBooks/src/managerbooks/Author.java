/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerbooks;

/**
 *
 * @author choco
 */
public class Author {

    private String id;
    private String fullName;
    private Integer age;
    private String address_id;

    public Author(String id, String fullName, Integer age, String address_id) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address_id = address_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress_id() {
        return address_id;
    }

    public void setAddress_id(String address_id) {
        this.address_id = address_id;
    }

}
