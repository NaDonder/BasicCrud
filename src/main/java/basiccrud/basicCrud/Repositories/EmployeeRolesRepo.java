package basiccrud.basicCrud.Repositories;

import basiccrud.basicCrud.Beans.EmployeeRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRolesRepo extends JpaRepository<EmployeeRoles, Integer> {
}
