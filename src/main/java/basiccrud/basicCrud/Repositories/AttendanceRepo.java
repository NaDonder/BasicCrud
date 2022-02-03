package basiccrud.basicCrud.Repositories;

import basiccrud.basicCrud.Beans.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepo extends JpaRepository<Attendance, Integer> {
}
