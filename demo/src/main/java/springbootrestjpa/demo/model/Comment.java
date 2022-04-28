package springbootrestjpa.demo.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Comment {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			
			private long id;
			@Column
			private String name;
			@Column
			private float salary;
			
			public Comment() {
				//TODO Auto-generated constructor stub
			}

			public Comment(String name, float salary) {
				super();
				this.name = name;
				this.salary = salary;
			}

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

			public float getSalary() {
				return salary;
			}

			public void setSalary(float salary) {
				this.salary = salary;
			}
			
			
			
			
			
}