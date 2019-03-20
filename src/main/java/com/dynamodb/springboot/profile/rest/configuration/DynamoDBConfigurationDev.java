package com.dynamodb.springboot.profile.rest.configuration;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
@EnableDynamoDBRepositories(basePackages="com.dynamodb.springboot.profile.rest.repository")
public class DynamoDBConfigurationDev {

}
