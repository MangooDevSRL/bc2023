package com.mangoodev.bootcamp2023.service.dto;

import java.util.List;

public class CreateTransactionRequest {

    private Long clientId;
    private List<Long> productIds;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }
}
