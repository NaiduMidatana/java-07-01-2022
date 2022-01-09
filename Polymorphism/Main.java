package Polymorphism;

public class Main {



public Main() {
// TODO Auto-generated constructor stub
}



public static void main(String[] args) {
// TODO Auto-generated method stub
	System.out.println("Academic Details");
	System.out.println("=================================================");
Admin admin = new Admin("rama", 10000);
System.out.println("Admin Name = "+admin.name);
Academic academic = new Academic("srinu",1900);
System.out.println("Academic Name = "+academic.name);

System.out.println("Academic salary of "+academic.name +"  is  "+academic.adjustSalary());
System.out.println("given lecture is "+academic.giveLecture());

System.out.println("Admin salary is "+admin.adjustSalary());
System.out.println("admin work is "+admin.adminAdd());



}



}