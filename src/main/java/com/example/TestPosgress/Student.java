package com.example.TestPosgress;

import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer studentid;
	 
	    @Column(name="name")
	    private String name;
	    
	    @OneToOne(cascade = jakarta.persistence.CascadeType.ALL,fetch=FetchType.EAGER)
	    @JsonManagedReference
	    @JoinColumn(name="bookid")
	    private Book book;

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Integer getStudentid() {
			return studentid;
		}

		public void setStudentid(Integer studentid) {
			this.studentid = studentid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}

		@Override
		public String toString() {
			return "Student [studentid=" + studentid + ", name=" + name + ", book=" + book + "]";
		}

		
	    
}
