
public class ContractSalaryCalculator implements SalaryCalculator {
    public double calculate(Employee employee) {
        return employee.baseSalary * 1.1;
    }
}
