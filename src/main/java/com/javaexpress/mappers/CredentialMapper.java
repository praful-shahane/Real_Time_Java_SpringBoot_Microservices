package com.javaexpress.mappers;

import org.mapstruct.Mapper;

import com.javaexpress.dto.CredentialDto;
import com.javaexpress.models.Credential;

@Mapper(componentModel = "spring")
public interface CredentialMapper {

	
CredentialDto toDto(Credential  credential);
	
	
Credential	toEntity(CredentialDto  credentialDto);
	
}
