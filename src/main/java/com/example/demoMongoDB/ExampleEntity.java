package com.example.demoMongoDB;

import java.time.Instant;
import java.util.UUID;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "example")
public class ExampleEntity {

    @Id
    private ObjectId id;
    private UUID otherId;
    @Indexed
    private UUID someAttr;
    private Instant someAttrTwo;
    
}
