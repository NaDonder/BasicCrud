package basiccrud.basicCrud.Beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class EmployeeRoles {

    @Id
    @Column(name = "employeeId")
    private int employeeId;
    private int roleId;
    private boolean enabled;

}
