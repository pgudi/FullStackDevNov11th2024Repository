package com.gentech.relationship;

import com.gentech.relationship.entity.Places;
import com.gentech.relationship.entity.Tourists;
import com.gentech.relationship.repository.PlacesRepository;
import com.gentech.relationship.repository.TouristsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringManytomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringManytomanyApplication.class, args);
	}

	@Autowired
	private TouristsRepository touristsRepo;

	@Autowired
	private PlacesRepository placesRepo;

	@Override
	public void run(String... args) throws Exception {
		//Create Tourists
		Tourists toursit1=new Tourists("Vasudev","vasu@gmail.com","India");
		Tourists toursit2=new Tourists("Ajay","ajay@gmail.com","India");

		//Create Palces
		Places place1=new Places("Hampi","Historical Place","Karnataka");
		Places place2=new Places("Talakadu","Historical Place","Karnataka");

		toursit1.getPlaces().add(place1);
		toursit1.getPlaces().add(place2);

		toursit2.getPlaces().add(place1);
		toursit2.getPlaces().add(place2);

		place1.getTourists().add(toursit1);
		place1.getTourists().add(toursit2);

		place2.getTourists().add(toursit1);
		place2.getTourists().add(toursit2);

		//Save details
		touristsRepo.saveAll(List.of(toursit1,toursit2));
		placesRepo.saveAll(List.of(place1,place2));
	}
}
