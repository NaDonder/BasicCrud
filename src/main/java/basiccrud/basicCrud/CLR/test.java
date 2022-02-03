package basiccrud.basicCrud.CLR;

import basiccrud.basicCrud.Beans.EmployeeRoles;
import basiccrud.basicCrud.Beans.Employees;
import basiccrud.basicCrud.Repositories.EmployeesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@RequiredArgsConstructor
public class test implements CommandLineRunner {

    private final EmployeesRepo employeesRepo;


    @Override
    public void run(String... args) throws Exception {

        EmployeeRoles manager = EmployeeRoles.builder()
                .roleId(1)
                .enabled(true)
                .build();

        EmployeeRoles waiter = EmployeeRoles.builder()
                .roleId(2)
                .enabled(true)
                .build();

        Employees employees = Employees.builder()
                .id(123)
                .name("jake")
                .employeeRole(manager)
                .build();

        Employees employees1 = Employees.builder()
                .id(124)
                .name("rani")
                .employeeRole(waiter)
                .build();

        employeesRepo.save(employees);

        employeesRepo.save(employees1);


    }
}
