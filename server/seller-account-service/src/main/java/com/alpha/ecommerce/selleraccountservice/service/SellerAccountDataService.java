package com.alpha.ecommerce.selleraccountservice.service;


import com.alpha.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;
import com.alpha.ecommerce.selleraccountservice.entity.sql.SellerInfo;

public interface SellerAccountDataService {

    public SellerInfo findSellerById(Integer sellerId);

    public void save();

    public void saveInMongo();

    public SellerBulkInfo findMongoAddressById();
}

