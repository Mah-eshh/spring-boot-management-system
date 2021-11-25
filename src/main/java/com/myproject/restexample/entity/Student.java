package com.myproject.restexample.entity;

import javax.persistence.*;



@Entity
@Table(name = "student_details")
//Implement a student class to create the student table

public class Student {
		

		    @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    private Long id;

		    @Column(name = "first_name")
		    private String firstName;

		    @Column(name = "last_name")
		    private String lastName;
		    
		    @Column(name = "address")
		    private String address;
		    
		    public Student() {
				super();
				// TODO Auto-generated constructor stub
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public Integer getAge() {
				return age;
			}

			public void setAge(Integer age) {
				this.age = age;
			}

			public Integer getContactNumber() {
				return contactNumber;
			}

			public void setContactNumber(Integer contactNumber) {
				this.contactNumber = contactNumber;
			}

			private Integer age;
		    
		    private Integer contactNumber;
		    
		 		
		
	

}
