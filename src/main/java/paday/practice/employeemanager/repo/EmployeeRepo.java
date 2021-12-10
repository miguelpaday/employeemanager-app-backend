package paday.practice.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import paday.practice.employeemanager.model.Employee;

import javax.transaction.Transactional;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    @Transactional
    void deleteEmployeeById(Long id);

    @Transactional
    Optional<Employee> findEmployeeById(Long id);
}
