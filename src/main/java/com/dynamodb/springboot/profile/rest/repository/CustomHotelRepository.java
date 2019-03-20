package com.dynamodb.springboot.profile.rest.repository;

import java.io.IOException;

public interface CustomHotelRepository {

	void createTable();
	void loadData() throws IOException;
}
