package com.opps;


	class Animal {
		int legs = 4;
		String name;
	}

	class Dog extends Animal {
		public void showLegs() {
			name = "Rock";
			System.out.println(legs + " " + name);
		}

	}

	class Cat extends Animal {
		public void showCat() {
			name = "gressy";
			System.out.println(legs + " " + name);
		}
	}

	public class HierachicalDemo1 {
		public static void main(String[] args) {
			Dog d = new Dog();
			d.showLegs();
			Cat c = new Cat();
			c.showCat();

		}

	}

