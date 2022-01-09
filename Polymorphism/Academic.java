package Polymorphism;

import java.util.Scanner;

public class Academic extends PayRoll {

      Scanner sc =new Scanner(System.in);

		int salary;

		@Override
		public int adjustSalary() {

			System.out.println("please enter salary to adjust acadamic salary");
			 int salary = sc.nextInt();
			return salary;
		}



		public String giveLecture() {

		return name+" giving lecture";
		}




		public Academic(String name, int salary) {
		super(name);
		this.salary = salary;
				}


		}

