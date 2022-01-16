package com.namdeo.training;

public class DiamondInterface {

	

	interface student{

			int total_stu=120;
			public default void display() {
				System.out.println("Total Student:");
			}
		}
		interface Teachar{
			int total_Tea=30;
			public default void display() {
				System.out.println("Total Teacher");
			}
		
		public	class College implements student , Teachar{
				public void display() {
					student.super.display();  
					Teachar.super.display();
				}
				public static void main(String[] args) {
					DiamondInterface obj =new DiamondInterface();
					obj.display();
				}
			}
			
		
			
		}
		public void display() {
			// TODO Auto-generated method stub
			
		}
		}
		
			
		
	


