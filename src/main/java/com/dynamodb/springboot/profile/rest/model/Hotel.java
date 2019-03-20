package com.dynamodb.springboot.profile.rest.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGenerateStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBGeneratedUuid;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.dynamodb.springboot.profile.rest.converter.GeoTypeConverter;

import lombok.Data;

@Data
@DynamoDBTable(tableName="Hotel")
public class Hotel {

	@DynamoDBHashKey
	@DynamoDBGeneratedUuid(DynamoDBAutoGenerateStrategy.CREATE)
	private String id;
	
	@DynamoDBAttribute
	private String name;
	
	@DynamoDBAttribute
	@DynamoDBTypeConverted(converter = GeoTypeConverter.class)
	private Geo geo;
}
