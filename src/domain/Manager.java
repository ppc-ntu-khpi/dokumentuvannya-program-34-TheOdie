package domain;
/** Містить реалізацію методів 
 * 
 * @author User
 */
public class Manager extends Employee {
/** Ініціалізує
 * 
 * @param employees
 * @param name
 * @param jobTitle
 * @param level
 * @param dept 
 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
/** Виводить значення
 * 
 * @return 
 */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
/** Ініціалізує
 * 
 * @param employees 
 */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**Ініціалізує 
     * 
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }
/** Ініціалізує
 * 
 */
    private Employee[] employees;

    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
/** Встановити змінну
 * 
 * @param employees 
 */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
/** Повернути змінну
 * 
 * @return empolyees
 */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
