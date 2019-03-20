package com.dynamodb.springboot.profile.rest.repository;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.dynamodb.springboot.profile.rest.model.Hotel;

@EnableScan
public interface HotelRepository extends CrudRepository<Hotel, String>, CustomHotelRepository {
	List<Hotel> findAllByName(String name);
}
