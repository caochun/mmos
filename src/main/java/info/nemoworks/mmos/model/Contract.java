package info.nemoworks.mmos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contract extends Entity {

    protected LocalDateTime date;

    protected Customer customer;

    protected List<Contract> subContracts;

    protected JSONObject contents;

}
