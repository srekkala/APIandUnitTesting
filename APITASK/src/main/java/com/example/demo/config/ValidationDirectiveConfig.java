package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import graphql.validation.rules.OnValidationErrorStrategy;
import graphql.validation.rules.ValidationRules;
import graphql.validation.schemawiring.ValidationSchemaWiring;


@Configuration
public class ValidationDirectiveConfig {
	
	@Bean
	public ValidationSchemaWiring ValidationSchemaWiring() {

         ValidationRules validationRules = ValidationRules.newValidationRules()
                .onValidationErrorStrategy(OnValidationErrorStrategy.RETURN_NULL)
                .build();
 
        // This will rewrite your data fetchers when rules apply to them so that validation
        return new ValidationSchemaWiring(validationRules);
	}

}
