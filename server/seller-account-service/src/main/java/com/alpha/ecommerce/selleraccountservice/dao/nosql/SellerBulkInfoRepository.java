package com.alpha.ecommerce.selleraccountservice.dao.nosql;

import com.alpha.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SellerBulkInfoRepository extends MongoRepository<SellerBulkInfo, Integer> {
}
