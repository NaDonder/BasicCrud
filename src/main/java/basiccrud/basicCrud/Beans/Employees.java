package basiccrud.basicCrud.Beans;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Employees {

    @Id
    private int id;
    private String name;

    @Singular
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "employeeId")
    private List<EmployeeRoles> employeeRoles;

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
