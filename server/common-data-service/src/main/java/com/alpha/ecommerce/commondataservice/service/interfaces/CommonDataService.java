package com.alpha.ecommerce.commondataservice.service.interfaces;

import com.alpha.ecommerce.commondataservice.dto.ProductInfoDTO;
import com.alpha.ecommerce.commondataservice.entity.sql.info.ProductInfo;
import com.alpha.ecommerce.commondataservice.model.FilterAttributesResponse;
import com.alpha.ecommerce.commondataservice.model.HomeTabsDataResponse;
import com.alpha.ecommerce.commondataservice.model.MainScreenResponse;
import com.alpha.ecommerce.commondataservice.model.SearchSuggestionResponse;

import java.util.HashMap;
import java.util.List;

public interface CommonDataService {

    MainScreenResponse getHomeScreenData(String apiName);

    FilterAttributesResponse getFilterAttributesByProducts(String queryParams);

    ProductInfoDTO getProductsByCategories(String queryParams);

    HashMap<Integer, ProductInfo> getProductsById(String queryParams);

    HomeTabsDataResponse getBrandsAndApparelsByGender(String apiName);

    SearchSuggestionResponse getSearchSuggestionList();
}

