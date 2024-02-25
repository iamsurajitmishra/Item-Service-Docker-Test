package com.org.ItemService.repository;

import com.org.ItemService.model.ItemCategoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCategoryRepository extends MongoRepository<ItemCategoryModel, String> {
}
