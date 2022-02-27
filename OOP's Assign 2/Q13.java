//Question 13 | Amarjeet kumar singh | Roll no: 202002021073
import java.io.*;
class Q13 {
    int Emp_id;
    String Emp_name;
    int Emp_salary;

    Q13(int empid, String empname, int empsalary) {
        Emp_id = empid;
        Emp_name = empname;
        Emp_salary = empsalary;
    }

    void display() {
        System.out.println("ID: "+this.Emp_id + " Name: "+this.Emp_name + " Salary:" + this.Emp_salary);
    }

    public static void main(String args[]) throws IOException {
        Q13 e[] = new Q13[5];
        for(int i=0; i<3; i++){
            System.out.println("Enter the ID, Name and Salary of Employee("+ (i+1) +")");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int Emp_id = Integer.parseInt(br.readLine());
            String Emp_name = br.readLine();
            int Emp_salary = Integer.parseInt(br.readLine());
            e[i] = new Q13(Emp_id, Emp_name, Emp_salary);
        }
        System.out.println("Employee Details: \n-------------------");
        for(int i=0; i<3; i++){
            e[i].display();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the employee no to edit: ");
        int edit = Integer.parseInt(br.readLine());
        System.out.println("Enter the ID, Name and Salary of Employee("+ (edit) +")");
        int Emp_id = Integer.parseInt(br.readLine());
            String Emp_name = br.readLine();
            int Emp_salary = Integer.parseInt(br.readLine());
            e[edit] = new Q13(Emp_id, Emp_name, Emp_salary);

        System.out.println("Employee detail after modification is: \n-------------------");
             e[edit].display();
    }
}