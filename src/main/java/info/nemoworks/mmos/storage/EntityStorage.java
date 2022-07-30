package info.nemoworks.mmos.storage;

import info.nemoworks.mmos.model.Entity;

public interface EntityStorage {

    Entity get(String id);

    void delete(Entity entity);

    Entity save(Entity entity);

}
