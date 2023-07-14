package com.example.demoMongoDB;

import java.util.List;
import java.util.UUID;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends MongoRepository<ExampleEntity, ObjectId> {

    List<ExampleEntity> findAllByOtherId(UUID id);

}