package com.org.ItemService.repository;


import com.org.ItemService.model.ItemModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ItemRepository extends MongoRepository<ItemModel, String> {
        public void deleteAllByCategoryId(String categoryId);
        //public List<ItemModel> findAllByCategoryId(String categoryId);
}

