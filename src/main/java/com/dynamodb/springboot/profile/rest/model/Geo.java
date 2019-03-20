package com.dynamodb.springboot.profile.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Geo {

	private Double latitude;
	private Double longitude;
}
