public class Department {

    private int department_id;
    private String department_name;

    public Department(int department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }

    public void insertDepartment() {
        System.out.println("insertDepartment");
    }

    public void updateDepartment() {
        System.out.println("updateDepartment");
    }

    public void deleteDepartment() {
        System.out.println("deleteDepartment");
    }
}
