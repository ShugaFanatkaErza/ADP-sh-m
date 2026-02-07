
public class PermanentSalaryCalculator implements SalaryCalculator {
    public double calculate(Employee employee) {
        return employee.baseSalary * 1.2;
    }
}
