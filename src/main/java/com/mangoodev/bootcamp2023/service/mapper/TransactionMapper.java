package com.mangoodev.bootcamp2023.service.mapper;

import com.mangoodev.bootcamp2023.domain.Transaction;
import com.mangoodev.bootcamp2023.service.dto.TransactionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Transaction} and its DTO {@link TransactionDTO}.
 */
@Mapper(componentModel = "spring")
public interface TransactionMapper extends EntityMapper<TransactionDTO, Transaction> {}
