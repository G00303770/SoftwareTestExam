package ie.gmit.gmit;

/*

Author: Stephen Kilgannon
Date: 09/03/20
Employee Class stores employee data and verifys that each string is to length

In the constructor I will verify the information been provided as per the guidlines. On invalid or illegal data I
 genertate a suitablr exception that will clearly explain the issue.
 */

public class Employee {


    private final String name;
    private String title;
    private String PPS;
    private String phone;
    private String employmentType;
    private int age;

    // Constructor
    public Employee(String title, String name, String PPS, String phone, String employmentType, int age) {
        if (title == "Mr" || title == "Mrs" || title == "Miss" )
        {
            this.title = title;
        }
            else
            {
            throw new IllegalArgumentException("Title Must be Mr, Ms or Miss");
            }

        if (name.length() >= 5  && name.length() <= 22)
        {
            this.name = name;
        }
            else
                {
            throw new IllegalArgumentException("Name invalid - must be 5-22 charaters");
            }

        if (PPS.length() == 6)
        {
            this.PPS = PPS;
        }
        else
            {
            throw new IllegalArgumentException("PPS invalid - must be 6 charaters");
            }
        if (phone.length() >=7 )
        {
            this.phone = phone;
        }
        else
            {
            throw new IllegalArgumentException("Phone Must be 7 characters");
            }
        if (employmentType == "Full-time" || employmentType == "Part-time")
        {
            this.employmentType = employmentType;
        }
        else
            {
            throw new IllegalArgumentException("Employemet type invalid please select Full-time or Part-time");
            }
        if (age > 18 )
        {
           this.age = age;
        }
        else
            {
            throw new IllegalArgumentException("You must be over 18");
            }

    }
    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getPPS() {
        return PPS;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public int getAge() {
        return age;
    }





}
