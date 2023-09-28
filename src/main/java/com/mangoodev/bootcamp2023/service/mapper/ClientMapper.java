package com.mangoodev.bootcamp2023.service.mapper;

import com.mangoodev.bootcamp2023.domain.Client;
import com.mangoodev.bootcamp2023.service.dto.ClientDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Client} and its DTO {@link ClientDTO}.
 */
@Mapper(componentModel = "spring")
public interface ClientMapper extends EntityMapper<ClientDTO, Client> {}
