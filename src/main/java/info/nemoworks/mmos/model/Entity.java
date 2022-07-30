package info.nemoworks.mmos.model;

import java.util.UUID;

public class Entity {
    private String id;

    public Entity(){
        this.id = UUID.randomUUID().toString();
    }

}
