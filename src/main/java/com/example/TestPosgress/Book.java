package com.example.TestPosgress;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookid;
 
    @Column(name="bookname")
    private String bookname;
    
    @OneToOne(mappedBy= "book" )
    @JsonBackReference
    private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", student=" + student + "]";
	}
    
    
    
}
