package com.mangoodev.bootcamp2023.service.mapper;

import com.mangoodev.bootcamp2023.domain.Client;
import com.mangoodev.bootcamp2023.domain.Transaction;
import com.mangoodev.bootcamp2023.service.dto.ClientDTO;
import com.mangoodev.bootcamp2023.service.dto.TransactionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Transaction} and its DTO {@link TransactionDTO}.
 */
@Mapper(componentModel = "spring")
public interface TransactionMapper extends EntityMapper<TransactionDTO, Transaction> {
    @Mapping(target = "client", source = "client", qualifiedByName = "clientId")
    TransactionDTO toDto(Transaction s);

    @Named("clientId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ClientDTO toDtoClientId(Client client);
}
