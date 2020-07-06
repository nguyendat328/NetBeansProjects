/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss2;

/**
 *
 * @author choco
 */
public class Students {

    private Integer id;
    private String fullName;
    private Integer age;
    private String Adress;
    private Integer class_Id;

    public Students(Integer id, String fullName, Integer age, String Adress, Integer class_Id) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.Adress = Adress;
        this.class_Id = class_Id;

    }

    public Integer getClass_Id() {
        return class_Id;
    }

    public void setClass_Id(Integer class_Id) {
        this.class_Id = class_Id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

}
