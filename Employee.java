package JavaCrudOperation;

public class Employee {
    private int empno;
    private String ename;
    private int salary;


    // Constructor - to initialize the variables.
    Employee(int empno, String ename, int salary){
        this.empno=empno;
        this.ename=ename;
        this.salary=salary;

    }

    // getter methods of empno, ename and salary;
    public int getEmpno(){
        return empno;
    }
    public String getEname(){
        return ename;
    }
    public int getSalary(){
        return salary;
    }

    public String toString(){
        return empno+" "+ename+" "+salary;
    }



}

