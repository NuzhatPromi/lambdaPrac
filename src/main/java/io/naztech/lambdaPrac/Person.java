package io.naztech.lambdaPrac;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.time.temporal.ChronoUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Person {
	public enum Sex {
		MALE, FEMALE
	}

	String givenName;
	String surName;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public int getAge() {
		LocalDate date = LocalDate.now();
		return (int) ChronoUnit.DAYS.between(birthday, date);
	}

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.toString();
			}
		}
	}

	public void printName() {
		log.info("First Name: {} Last Name: {}.", this.givenName, this.surName);
		//System.out.println("First Name: " + this.givenName + " Last Name: " + this.surName);
	}

	public static List<Person> createShortList() {
		// TODO Auto-generated method stub
		List<Person> myList = new ArrayList<Person>();
		Person p = new Person("Nuzhat", "Promi", LocalDate.of(2014, Calendar.JULY, 4), Sex.FEMALE,
				"nuzhat.mist@gmail.com");
		myList.add(p);

		Person e = new Person("Afroz", "Sumaiya", LocalDate.of(2015, Calendar.MAY, 4), Sex.FEMALE,
				"nuzhat.mist@gmail.com");
		myList.add(e);
		
		return myList;
	}
}
