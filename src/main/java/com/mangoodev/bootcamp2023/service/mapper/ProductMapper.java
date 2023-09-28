package com.mangoodev.bootcamp2023.service.mapper;

import com.mangoodev.bootcamp2023.domain.Product;
import com.mangoodev.bootcamp2023.service.dto.ProductDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {}
