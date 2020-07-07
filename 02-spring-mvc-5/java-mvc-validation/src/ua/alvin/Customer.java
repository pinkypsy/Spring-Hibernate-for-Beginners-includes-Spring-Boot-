package ua.alvin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

public class Customer {

//    @NotNull(message = "is required")
//    @Size(min = 1)
    private String firstName;
    @NotNull(message = "is required")
    @Size(min=1, message="min 1 is required")
    private String lastName;


    public Customer() { }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   }
