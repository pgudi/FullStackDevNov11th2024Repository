package com.gentech.relationship;

import com.gentech.relationship.entity.Books;
import com.gentech.relationship.entity.Library;
import com.gentech.relationship.repository.BooksRepository;
import com.gentech.relationship.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringOnetomanyApplication.class, args);
	}

	@Autowired
	private LibraryRepository libRepo;

	@Autowired
	private BooksRepository booksRepo;


	@Override
	public void run(String... args) throws Exception {

		//Create Library
		Library library1=new Library();
		library1.setLibraryName("Vijanagar Library");
		library1.setLibraryType("Public Govt Library");
		library1.setLocation("Vijanagar Bangalore");

		//Create Books
		Books book1=new Books();
		book1.setBookName("Core Java");
		book1.setBookType("Software Programming");

		Books book2=new Books();
		book2.setBookName("PlayWright");
		book2.setBookType("Software Automation");

		Books book3=new Books();
		book3.setBookName("JavaScript");
		book3.setBookType("Web Develpment");

		library1.getBooks().add(book1);
		library1.getBooks().add(book2);
		library1.getBooks().add(book3);

		libRepo.save(library1);
	}
}
