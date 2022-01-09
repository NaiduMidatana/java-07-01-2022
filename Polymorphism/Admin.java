package Polymorphism;
import java.util.*;
public class Admin extends PayRoll{
Scanner sc = new Scanner(System.in);
int salary;

@Override
public int adjustSalary() {

int salary = 10000;
	
return salary;
}

public String adminAdd() {
return "Admin  can add some employee academic details";
}



public Admin(String name, int salary) {
super(name);

this.salary = salary;
}



}

