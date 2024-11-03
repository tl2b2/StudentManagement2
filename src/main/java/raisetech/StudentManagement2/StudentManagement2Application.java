package raisetech.StudentManagement2;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class StudentManagement2Application {

	private String name = "Enami Kouji";
	private String age = "37";

	private Map<String, String> student;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagement2Application.class, args);
	}

	@GetMapping("/studentinfo")
	public String getStudentinfo(){
		Student2 student2 =new Student2();
		student2.setName("EnamiKouji");
		student2.getName();
		String name = student2.getName();
		return name + " " + age + "歳";
	}

	@PostMapping("/studentinfo")
	public void setStudnetinfo(String name, String age){
		this.name=name;
		this.age=age;
	}

	@PostMapping("/studnetName")
	public void updateStudentName(String name){
		this.name = name;
	}
}
