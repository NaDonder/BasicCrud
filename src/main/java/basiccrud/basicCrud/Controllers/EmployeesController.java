package basiccrud.basicCrud.Controllers;

import basiccrud.basicCrud.Beans.Attendance;
import basiccrud.basicCrud.Repositories.AttendanceRepo;
import basiccrud.basicCrud.Repositories.EmployeeRolesRepo;
import basiccrud.basicCrud.Repositories.EmployeesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Calendar;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class EmployeesController {

    private final EmployeesRepo employeeRepo;
    private final EmployeeRolesRepo employeeRolesRepo;
    private final AttendanceRepo attendanceRepo;

    @GetMapping("getEmployeeList")
    private ResponseEntity<?> getEmployeeList (){
        return ResponseEntity.ok().body(employeeRepo.findAll());
    }

    @GetMapping("getEmployeeRoles/{employeeId}")
    private ResponseEntity<?> getEmployeesRoles (@PathVariable int employeeId) {
        return ResponseEntity.ok().body(employeeRolesRepo.findById(employeeId));
    }

    @PostMapping("clockIn")
    private ResponseEntity<?> saveEmployeeRoleTime(int employeeId, int roleId) {

        java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());

        Attendance newAtten = new Attendance(employeeId, roleId, date);

        return ResponseEntity.ok().body(attendanceRepo.save(newAtten));
    }
}
