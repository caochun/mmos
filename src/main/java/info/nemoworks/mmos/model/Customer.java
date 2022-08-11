package info.nemoworks.mmos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends Entity {

    protected String name;

//    protected Contract contract;

}
