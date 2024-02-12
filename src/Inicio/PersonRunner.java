package Inicio;

import java.math.BigDecimal;

public class PersonRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("David", "2227056964", "davcas@hotmail.com", "Palmarito",
                "Segov", 'S', new BigDecimal("12000"));

        System.out.println(employee);
    }
}
