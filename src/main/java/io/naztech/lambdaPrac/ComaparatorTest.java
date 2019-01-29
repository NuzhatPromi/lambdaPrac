package io.naztech.lambdaPrac;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComaparatorTest {
	public static void main(String[] args) {

		List<Person> personList = Person.createShortList();

		// Sort with Inner Class
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getSurName().compareTo(p2.getSurName());
			}
		});

		log.info("=== Sorted Asc SurName ===");
		for (Person p : personList) {
			p.printName();
		}

		// Use Lambda instead

		// Print Asc
		log.info("=== Sorted Asc SurName ===");
		Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));

		for (Person p : personList) {
			p.printName();
		}

		// Print Desc
		log.info("=== Sorted Desc SurName ===");
		Collections.sort(personList, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));

		for (Person p : personList) {
			p.printName();
		}
		
	}
}
