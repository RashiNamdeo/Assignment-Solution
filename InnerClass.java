package com.namdeo.training;

class InnerClass {

	private String msg = "Inner Classes";

	void display() {
		class Inner {
			void msg() {
				System.out.println(msg);
			}
		}

		Inner l = new Inner();
		l.msg();
	}

	public static void main(String[] args) {
		InnerClass ob = new InnerClass();
		ob.display();
	}
}
