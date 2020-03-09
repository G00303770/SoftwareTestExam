package ie.gmit;

/*
Author: Stephen Kilgannon
        Date: 09/03/20
        Employee Class stores employee data and verifys that each string is to length

        Unit Testing firstly I test the constructor as a whole followed by then testing each individual portion.
        For the purpose of ease i have added logs to display in the console on each test.
 */


import ie.gmit.gmit.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @BeforeAll
    static void BeginTest(){
        System.out.println("Begining Testing");
    }


    @AfterAll
    static void EndTest()
    {
        System.out.println("Testing concluded");
    }


    @Test
    void testConstructor()
    {
        Employee employee = new Employee("Mr","Stephen Kilgannon","012345","1234567","Full-time", 25);
        assertEquals("Mr",employee.getTitle(),"Title testeed");
        assertEquals("Stephen Kilgannon",employee.getName(), "Name Tested");
        assertEquals("012345",employee.getPPS(),"PPS Tested");
        assertEquals("Full-time",employee.getEmploymentType(), "Employeement type tested");
        assertEquals(25,employee.getAge(), "Age tested");

    }

    @Test
    void testTitle()
    {
       Exception exception = assertThrows(IllegalArgumentException.class, () -> new Employee("","Stephen Kilgannon","012345","1234567","Full-time", 25));
       assertEquals("Title Must be Mr, Ms or Miss", exception.getMessage());
        System.out.println("testTitle(): " + exception);
    }

    @Test
    void testName()
    {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","","012345","1234567","Full-time", 25));
       // assertEquals("Name invalid - must be 5-22 charaters", exception.getMessage())
        System.out.println("testName(): " + exception);
    }

    @Test
    void testPPS()
    {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Stephen Kilgannon","","1234567","Full-time", 25));
        assertEquals("PPS invalid - must be 6 charaters", exception.getMessage());
        System.out.println("testPPS(): " + exception);
    }

    @Test
    void testPhone()
    {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Stephen Kilgannon","012345","","Full-time", 25));
        assertEquals("Phone Must be 7 characters", exception.getMessage());
        System.out.println("testPhone(): " + exception);
    }

    @Test
    void testEmployeementType()
    {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Stephen Kilgannon","012345","1234567","", 25));
        assertEquals("Employemet type invalid please select Full-time or Part-time", exception.getMessage());
        System.out.println("testEmployeementType(): " + exception);
    }

    @Test
    void testAge()
    {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Stephen Kilgannon","012345","1234567","Full-time", 0));
        assertEquals("You must be over 18", exception.getMessage());
        System.out.println("testAge(): " + exception);
    }


}
