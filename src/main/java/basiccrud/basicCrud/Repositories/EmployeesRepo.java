package basiccrud.basicCrud.Repositories;

import basiccrud.basicCrud.Beans.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepo extends JpaRepository<Employees, Integer> {
}
