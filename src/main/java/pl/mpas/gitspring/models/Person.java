package pl.mpas.gitspring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.tomcat.jni.Address;
@Data
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

public Person(){}


    public String getFirstName() {
        return firstName;
    }

  //  public void setFirstName(String firstName) {
   //     this.firstName = firstName;
    //}

    public String getLastName() {
        return lastName;
    }

    //public void setLastName(String lastName) {
      //  this.lastName = lastName;
    //}

    public int getAge() {
        return age;
    }

    //public void setAga(int age) {
     //   this.age = age;
    //}
}
