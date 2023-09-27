package com.mangoodev.bootcamp2023.service.mapper;

import com.mangoodev.bootcamp2023.domain.Product;
import com.mangoodev.bootcamp2023.domain.Transaction;
import com.mangoodev.bootcamp2023.service.dto.ProductDTO;
import com.mangoodev.bootcamp2023.service.dto.TransactionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {
    @Mapping(target = "transaction", source = "transaction", qualifiedByName = "transactionId")
    ProductDTO toDto(Product s);

    @Named("transactionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TransactionDTO toDtoTransactionId(Transaction transaction);
}
