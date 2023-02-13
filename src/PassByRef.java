import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassByRef {
    public static void main(String[] args) {

        Employee one = new Employee(10,"someone");

        int two = 9;
        Integer three= 10;

        Employee.incrementAge(one);

        System.out.println("the age of employee is " + one.getAge());
        Employee.incrementMe(one.getAge());

        Employee.incrementMe(two);
        Employee.incrementMe(three);
        System.out.println(one.getAge());
        System.out.println(two);
        System.out.println(three);


    }



}