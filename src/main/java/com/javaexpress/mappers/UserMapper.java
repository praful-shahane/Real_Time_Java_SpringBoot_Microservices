package com.javaexpress.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.javaexpress.dto.UserDto;
import com.javaexpress.models.User;

@Mapper(componentModel = "spring")
public  interface UserMapper {
	
	/*
	 * if variable of entity & dto are not same then we use @Mapping annotation.
	 */
	@Mapping(source = "email", target = "emailAddress")
	@Mapping(source = "phone", target = "contact")
	 UserDto toDto (User user);
	 
	@Mapping(source = "emailAddress", target = "email")
	@Mapping(source = "contact", target = "phone")
	User  toEntity(UserDto userDto);

	
}
