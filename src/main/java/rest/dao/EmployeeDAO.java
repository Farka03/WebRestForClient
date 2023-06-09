package rest.dao;

import rest.entity.Employee;

import java.util.List;


public interface EmployeeDAO {
    public List<Employee> getAllEmployees(); //Будем получать всех работников
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
