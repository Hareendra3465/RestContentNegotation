package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Student;

@RestController
public class Controller {
// @RequestMapping("/")
// public String welcome() {
// return "Welcome to New Students";
//}

@RequestMapping(value = "/student", method = RequestMethod.GET,
				produces = { "application/json", "application/xml" })
		public Student firstPage() {

			Student st = new Student();
			st.setAge(21);
			st.setFirstname("Hareendranath");
			st.setLastname("Mannava");
			st.setId("1");

			return st;
		}

	}
