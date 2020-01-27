import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString



public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String hostname;
    private String ip;
    private Date lastUpdateDate;
    private String vulnerability;
}
