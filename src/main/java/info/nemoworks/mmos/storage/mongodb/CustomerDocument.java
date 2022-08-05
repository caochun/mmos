package info.nemoworks.mmos.storage.mongodb;

import info.nemoworks.mmos.model.Contract;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class CustomerDocument {

    @Id
    private String id;

    protected String name;

    @DBRef
    protected List<Contract> contracts;

}
