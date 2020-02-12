public class Project1   {
    public static void main(String[] args) {
        final int input = Integer.parseInt(args[0]);
        
        String name = "";
        char code = '\0';
        String dept = "";
        int basic = 0;
        int hra = 0;
        int it = 0;
        int send = 0;

        switch (input)  {
            case 1001:
                name = "Anish";
                code = 'e';
                dept = "R&D";
                basic = 20000;
                hra = 8000;
                it = 3000;
                send = basic + hra - it;
                display(input,name,dept,code,send);
                break;

            case 1002:
                name = "Sushma";
                code = 'e';
                dept = "R&D";
                basic = 20000;
                hra = 8000;
                it = 3000;
                send = basic + hra - it;
                display(input,name,dept,code,send);
                break;
        
            default:
                System.out.println("There is no employee with empid : "+input);
        }
    }

    public static void display(int id, String nm, String dept, char code, int salary) {
        String desg = "";
        String out = "Emp No.\t Emp Name \t Department \t Designation \t Clerk\n";

        switch (code) {
            case 'e':
                desg = "Engineer";
                salary += 20000;
                out += id + " \t " + nm + " \t\t " + dept + " \t\t " + desg + " \t " + salary;
                break;
            
            case 'c':
                desg = "Consultant";
                salary += 32000;
                out += id + " \t " + nm + " \t\t " + dept + " \t\t " + desg + " \t " + salary;
                break;
            
            case 'k':
                desg = "Clerk";
                salary += 12000;
                out += id + " \t " + nm + " \t\t " + dept + " \t\t " + desg + " \t " + salary;
                break;
            
            case 'r':
                desg = "Receptionist";
                salary += 15000;
                out += id + " \t " + nm + " \t\t " + dept + " \t\t " + desg + " \t " + salary;
                break;
            
            case 'm':
                desg = "Manager";
                salary += 40000;
                out += id + " \t " + nm + " \t\t " + dept + " \t\t " + desg + " \t " + salary;
                break;
        }

        System.out.println(out);
    }
}