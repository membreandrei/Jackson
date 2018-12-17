/*package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@RestController
@RequestMapping(path="/hello")
@Transactional
class DemoRestController {
	@Autowired
	private JdbcTemplate jdbc;
	
	public static class Greeting {
		public String msg;

		public Greeting(String msg) {
			this.msg = msg;
		}
		
	}
	@GetMapping(path="/greeting")
	public Greeting greeting() {
		jdbc.execute("select 1");
		return new Greeting("hello");
	}
	
	@Autowired
	EntityManager em;
	
	@PostMapping(path="/employee")
	public Employee createEmployee () {
		Employee res = new Employee();
		res.setName("moi");
		em.persist(res);
		return res; 
	}
	
	@Autowired
	EmployeeRepository repo;
	
	@GetMapping(path="/employee")
	public List<Employee> findAll() {
		return repo.findAll();
	}

}


@Entity
class Employee {

	@Id
	@GeneratedValue
	private int id;
	
	@Version
	private int version;
	
	private String name;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}


interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
*/