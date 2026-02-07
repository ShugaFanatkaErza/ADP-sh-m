
public class InternSalaryCalculator implements SalaryCalculator {
    public double calculate(Employee employee) {
        return employee.baseSalary * 0.8;
    }
}
