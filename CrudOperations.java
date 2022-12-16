package JavaCrudOperation;

import java.util.*;

public class CrudOperations {

    public static void main(String args []){

        Collection<Employee> details= new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Insert ");
            System.out.println("2. Display / Read ");
            System.out.println("3. Search ");
            System.out.println("4. Delete ");
            System.out.println("5. Update ");
            System.out.print("Enter the Choice: ");
            choice=s.nextInt();

            //Switch case:
            switch (choice){
                case 1:
                    System.out.print("Enter the Empno: ");
                    int eno=s.nextInt();
                    System.out.print("Enter the Ename: ");
                    String ename=str.nextLine();
                    System.out.print("Enter the Salary: ");
                    int salary=s.nextInt();
                    details.add(new Employee(eno,ename,salary));
                    break;
                case 2:
                    System.out.println("-------------------------");
                    Iterator<Employee> i = details.iterator();
                    while (i.hasNext()){
                        Employee e =i.next();
                        System.out.println(e);
                    }
                    System.out.println("-------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.print("Enter the Employee Num to Search: ");
                    int empNo=s.nextInt();
                    System.out.println("-------------------------");
                    i = details.iterator();
                    while (i.hasNext()){
                        Employee e =i.next();
                        if (e.getEmpno() ==empNo){
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found){
                            System.out.println("Record not found");
                        }
                    System.out.println("-------------------------");
                    break;
                case 4:
                     found = false;
                    System.out.print("Enter the Employee Num to Delete: ");
                    empNo=s.nextInt();
                    System.out.println("-------------------------");
                    i = details.iterator();
                    while (i.hasNext()){
                        Employee e =i.next();
                        if (e.getEmpno() == empNo){
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Record Successfully Deleted!");
                    }
                    System.out.println("-------------------------");
                    break;
                case 5:
                    found = false;
                    System.out.print("Enter the Employee Num to Update: ");
                    empNo=s.nextInt();
                    System.out.println("-------------------------");
                    ListIterator<Employee> iterator = ((ArrayList<Employee>) details).listIterator();
                        Employee e =iterator.next();
                        if (e.getEmpno() == empNo){
                            System.out.println("Enter the new Name: ");
                            ename =str.nextLine();
                            System.out.println("Enter the new Salary: ");
                            salary= s.nextInt();
                            iterator.set(new Employee(empNo,ename,salary));
                            found = true;
                        }
                    if (!found){
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Record Updated Successfully!");
                    }
                    System.out.println("-------------------------");
                    break;

            }
        }while (choice!=0);


    }
}
