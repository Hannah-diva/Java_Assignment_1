import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        //Stage 1

          int employeeId =101;
          String employeeName ="Ahmed";
          String department ="IT";
          double baiscSalary =20000.0;
          double bonus =3;
          double textPercentage =55.55;
          boolean married =true;
        System.out.println("Employee ID"+":"+ employeeId);
        System.out.println("Employee Name"+":"+employeeName);
        System.out.println("Department"+":"+department);
        System.out.println("Basic Salary"+":"+baiscSalary);
        System.out.println("Bonus"+":"+bonus);
        System.out.println("Married"+":"+married);
        double GrossSalary=baiscSalary+bonus;
        System.out.println("Gross Salary"+":"+GrossSalary);
        double TextAmount=GrossSalary*textPercentage;
        System.out.println("Text Amount"+":"+TextAmount);
        double NetSalary=GrossSalary-TextAmount;
        System.out.println("Net Salary"+":"+NetSalary);

        //Stage 2
        if (NetSalary>=30000){
            System.out.println("Income Level:HighIncome");
        } else if (NetSalary>=15000&&NetSalary<30000) {
            System.out.println("Income Level:Medium Income");
        } else if (NetSalary<15000) {
            System.out.println("Income Level:Low Level");
            if (married = true) {
                System.out.println("Eligible");
            }else {
                System.out.println("Not Eligible");
            }
        }else {
            System.out.println("Error");
        }
        //Stage 3
      int code=1;
      String departmentCode;
      switch (code) {
          case 1:
              departmentCode = "IT";
              break;
          case 2:
              departmentCode = "HR";
              break;
          case 3:
              departmentCode = "Finance";
              break;
          case 4:
              departmentCode = "Sales";
              break;
          case 5:
              departmentCode = "Marketing";
              break;
          default:
              departmentCode = "Department:Unknown Department";
      }
        System.out.println(departmentCode+":"+code);

      //stage 4
        Scanner input=new Scanner(System.in);
        System.out.println("Enter employee ID");
        String EmployeeID=input.nextLine();
        System.out.println("Enter employee name");
        String EmployeeName=input.nextLine();
        System.out.println("Enter department code");
        int DepartmentCode=input.nextInt();
        System.out.println("Enter basic salary");
        double BasicSalary=input.nextDouble();
        System.out.println("Enter bonus");
        double Bonus=input.nextDouble();
        System.out.println("Enter Tex percentage");
        double TexPercentage=input.nextDouble();
        System.out.println("Enter true or false of married state");
        boolean Married=input.nextBoolean();
        double grossSalary=BasicSalary+Bonus;
        double textAmount=grossSalary*TexPercentage;
        double netSalary=grossSalary-textAmount;
        System.out.println("Gross Salary"+":"+grossSalary);
        System.out.println("Text Amount"+":"+textAmount);
        System.out.println("Net Salary"+":"+netSalary);

        //Stage 5

       int choice =0;
        while (choice!=2) {
            System.out.println("=======MENU======");
            Scanner inputt=new Scanner(System.in);
            System.out.println("Add employee-1");
            System.out.println("Exit-2");
            System.out.println("choice:");
            int employee = inputt.nextInt();

            if (employee == 1) {
                System.out.println("Employee ID" + ":" + employeeId);
                System.out.println("Employee Name" + ":" + employeeName);
                System.out.println("Department" + ":" + department);
                System.out.println("Basic Salary" + ":" + baiscSalary);
                System.out.println("Bonus" + ":" + bonus);
                System.out.println("Married" + ":" + married);
            } else if (employee == 2) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Invalid");
            }
        }
    //Stage 6
        Scanner inpu3t = new Scanner(System.in);
        System.out.println("How many employees?");
        int employees = inpu3t.nextInt();
        for (int i=1;i<=employees;i++) {
            Scanner input4=new Scanner(System.in);
           System.out.println("Enter department code");
            int DepartmentCode1=input4.nextInt();
            System.out.println("Enter basic salary");
            double BasicSalary1=input4.nextDouble();
            System.out.println("Enter bonus");
            double Bonus1=input4.nextDouble();
            System.out.println("Enter Tex percentage");
            double TexPercentage1=input4.nextDouble();
            System.out.println("Enter true or false of married state");
            boolean Married1=input4.nextBoolean();
            double grossSalary1=BasicSalary1+Bonus1;
            double textAmount1=grossSalary1*TexPercentage1;
            double netSalary1=grossSalary1-textAmount1;
            System.out.println("Gross Salary"+":"+grossSalary1);
            System.out.println("Text Amount"+":"+textAmount1);
            System.out.println("Net Salary"+":"+netSalary1);
            System.out.println("Enter employee ID");
            input4.nextLine();
            String EmployeeID1=input4.nextLine();
            System.out.println("Enter employee name");
            String EmployeeName1=input4.nextLine();

        }
        //Stage 7

        int[] employeeId0 ={4,9,8};
        String[] employeeName0 ={"kk","lll","kk"};
        String[] department0 ={"l","kk","hh"};
        double[] baiscSalary0 ={00,99,99};
        double[] bonus0 ={99,88,55};
        double[] textPercentage0 ={555,99,4};
        boolean[] married0 ={true,false,false};
        double[] GrossSalary0=new double[employeeId0.length];
        double[] TextAmount0=new double[employeeId0.length];
        double[] NetSalary0=new double[employeeId0.length];
        for (int i=0;i<employeeId0.length;i++){
             GrossSalary0[i]=baiscSalary0[i]+bonus0[i];
             TextAmount0[i]=GrossSalary0[i]*textPercentage0[i];
             NetSalary0[i]=GrossSalary0[i]-TextAmount0[i];
            System.out.println("===================================="+(i+1));
            System.out.println("Employee#"+(i+1));
            System.out.println("Employee ID"+(i+1)+":"+employeeId0[i]);
            System.out.println("Employee Name"+(i+1)+":"+employeeName0[i]);
            System.out.println("Department"+(i+1)+":"+department0[i]);
            System.out.println("Basic salary"+(i+1)+":"+baiscSalary0[i]);
            System.out.println("Tex percentage"+(i+1)+":"+textPercentage0[i]);
            System.out.println("Married"+(i+1)+":"+married0[i]);
            System.out.println("Gross salary"+(i+1)+":"+GrossSalary0[i]);
            System.out.println("Tex amount"+(i+1)+":"+TextAmount0[i]);
            System.out.println("Net salary"+(i+1)+":"+NetSalary0[i]);

        }
         //Stage 8
        showMenu();
        readEmployeeData();
        calculateGrossSalary();
        calculateTax();
        calculateNetSalary();
        getDepartmentName();
        printEmployee();
        printAllEmployees();
        forLoops();
        switchEmployee();
        ifCondition();
        exitProgram();
    }

    public static void showMenu() {
        int employeeId = 101;
        String employeeName = "Ahmed";
        String department = "IT";
        double baiscSalary = 20000.0;
        double bonus = 3000.0;
        double textPercentage = 55.55;
        boolean married = true;
        int choice = 0;
        while (choice != 2) {
            System.out.println("=======MENU======");
            Scanner inputt = new Scanner(System.in);
            System.out.println("Add employee-1");
            System.out.println("Exit-2");
            System.out.println("choice:");
            int employee = inputt.nextInt();
            if (employee == 1) {
                System.out.println("Employee ID" + ":" + employeeId);
                System.out.println("Employee Name" + ":" + employeeName);
                System.out.println("Department" + ":" + department);
                System.out.println("Basic Salary" + ":" + baiscSalary);
                System.out.println("Bonus" + ":" + bonus);
                System.out.println("Married" + ":" + married);
            } else if (employee == 2) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Invalid");
            }

        }

    }

    public static void readEmployeeData() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter employee ID");
        String EmployeeID=input.nextLine();
        System.out.println("Enter employee name");
        String EmployeeName=input.nextLine();
        System.out.println("Enter department code");
        int DepartmentCode=input.nextInt();
        System.out.println("Enter basic salary");
        double BasicSalary=input.nextDouble();
        System.out.println("Enter bonus");
        double Bonus=input.nextDouble();
        System.out.println("Enter Tex percentage");
        double TexPercentage=input.nextDouble();
        System.out.println("Enter true or false of married state");
        boolean Married=input.nextBoolean();
        double grossSalary=BasicSalary+Bonus;
        double textAmount=grossSalary*TexPercentage;
        double netSalary=grossSalary-textAmount;
        System.out.println("Gross Salary"+":"+grossSalary);
        System.out.println("Text Amount"+":"+textAmount);
        System.out.println("Net Salary"+":"+netSalary);

    }

    public static void calculateGrossSalary() {
        double baiscSalary = 20000.0;
        double bonus = 3000.0;
        double GrossSalary = baiscSalary + bonus;


    }

    public static void calculateTax() {
        double textPercentage = 55.55;
        double baiscSalary = 20000.0;
        double bonus = 3000.0;
        double GrossSalary = baiscSalary + bonus;
        double TextAmount = GrossSalary * textPercentage;

    }

    public static void calculateNetSalary() {
        double textPercentage = 55.55;
        double baiscSalary = 20000.0;
        double bonus = 3000.0;
        double GrossSalary = baiscSalary + bonus;
        double TextAmount = GrossSalary * textPercentage;
        double NetSalary = GrossSalary - TextAmount;

    }

    public static void getDepartmentName() {
        Scanner input = new Scanner(System.in);
        String EmployeeName = input.nextLine();

    }

    public static void printEmployee() {
        int employeeId = 101;
        String employeeName = "Ahmed";
        String department = "IT";
        double baiscSalary = 20000.0;
        double bonus = 3000.0;
        double textPercentage = 55.55;
        boolean married = true;
        double GrossSalary = baiscSalary + bonus;
        double TextAmount = GrossSalary * textPercentage;
        double NetSalary = GrossSalary - TextAmount;
        System.out.println("Employee ID" + ":" + employeeId);
        System.out.println("Employee Name" + ":" + employeeName);
        System.out.println("Department" + ":" + department);
        System.out.println("Basic Salary" + ":" + baiscSalary);
        System.out.println("Bonus" + ":" + bonus);
        System.out.println("Married" + ":" + married);
        System.out.println("Gross Salary" + ":" + GrossSalary);
        System.out.println("Text Amount" + ":" + TextAmount);
        System.out.println("Net Salary" + ":" + NetSalary);


    }

    public static void printAllEmployees() {
        int[] employeeId0 ={4,9,8};
        String[] employeeName0 ={"kk","lll","kk"};
        String[] department0 ={"l","kk","hh"};
        double[] baiscSalary0 ={00,99,99};
        double[] bonus0 ={99,88,55};
        double[] textPercentage0 ={555,99,4};
        boolean[] married0 ={true,false,false};
        double[] GrossSalary0=new double[employeeId0.length];
        double[] TextAmount0=new double[employeeId0.length];
        double[] NetSalary0=new double[employeeId0.length];
        for (int i=0;i<employeeId0.length;i++) {
            GrossSalary0[i] = baiscSalary0[i] + bonus0[i];
            TextAmount0[i] = GrossSalary0[i] * textPercentage0[i];
            NetSalary0[i] = GrossSalary0[i] - TextAmount0[i];
            System.out.println("====================================" + (i + 1));
            System.out.println("Employee#" + (i + 1));
            System.out.println("Employee ID" + (i + 1) + ":" + employeeId0[i]);
            System.out.println("Employee Name" + (i + 1) + ":" + employeeName0[i]);
            System.out.println("Department" + (i + 1) + ":" + department0[i]);
            System.out.println("Basic salary" + (i + 1) + ":" + baiscSalary0[i]);
            System.out.println("Tex percentage" + (i + 1) + ":" + textPercentage0[i]);
            System.out.println("Married" + (i + 1) + ":" + married0[i]);
            System.out.println("Gross salary" + (i + 1) + ":" + GrossSalary0[i]);
            System.out.println("Tex amount" + (i + 1) + ":" + TextAmount0[i]);
            System.out.println("Net salary" + (i + 1) + ":" + NetSalary0[i]);
        }
    }
    public static void forLoops() {
        Scanner inpu3t = new Scanner(System.in);
        System.out.println("How many employees?");
        int employees = inpu3t.nextInt();
        for (int i = 1; i <= employees; i++) {
            Scanner input4 = new Scanner(System.in);
            int DepartmentCode1 = input4.nextInt();
            double BasicSalary1 = input4.nextDouble();
            double Bonus1 = input4.nextDouble();
            double TexPercentage1 = input4.nextDouble();
            boolean Married1 = input4.nextBoolean();
            double grossSalary1 = BasicSalary1 + Bonus1;
            double textAmount1 = grossSalary1 * TexPercentage1;
            double netSalary1 = grossSalary1 - textAmount1;
            input4.nextLine();
            String EmployeeID1 = input4.nextLine();
            String EmployeeName1 = input4.nextLine();
        }
    }
    public static void switchEmployee(){
        int code=1;
        String departmentCode;
        switch (code) {
            case 1:
                departmentCode = "IT";
                break;
            case 2:
                departmentCode = "HR";
                break;
            case 3:
                departmentCode = "Finance";
                break;
            case 4:
                departmentCode = "Sales";
                break;
            case 5:
                departmentCode = "Marketing";
                break;
            default:
                departmentCode = "Department:Unknown Department";
        }
        System.out.println(departmentCode+":"+code);
    }
    public static void ifCondition(){
        double textPercentage = 55.55;
        double baiscSalary = 20000.0;
        double bonus = 3000.0;
        double GrossSalary = baiscSalary + bonus;
        double TextAmount = GrossSalary * textPercentage;
        double NetSalary = GrossSalary - TextAmount;
        boolean married =true;
        if (NetSalary>=30000){
            System.out.println("Income Level:HighIncome");
        } else if (NetSalary>=15000&&NetSalary<30000) {
            System.out.println("Income Level:Medium Income");
        } else if (NetSalary<15000) {
            System.out.println("Income Level:Low Level");
            if (married = true) {
                System.out.println("Eligible");
            }else {
                System.out.println("Not Eligible");
            }
        }else {
            System.out.println("Error");
        }
    }
    public static void exitProgram(){
        String Exit="2";
    }


}
