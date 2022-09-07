public class empoleyee {
    String name;
    double salary;
    double workHours;
    double hireYear;

    empoleyee(String name,double salary,double workHours,double hireYear){
        this.name= name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    double tax(){
        if(this.salary>1000){
            return this.salary*0.3;
        }else{
            return 0.0;
        }
    }
    double bonus(){
        if(this.workHours>40){
            return(this.workHours-40)*30;
        }else{
            return 0.0;
        }
    }
    double raiseSalary(){
        if(hireYear-2021 > 19){
            return this.salary*0.15;
        }else if(hireYear-2021 > 9 && hireYear-2021<19){
            return this.salary*0.10;
        }else{
            return this.salary*0.5;
        }
    }
    double totalSalary(){
        return this.salary + bonus() + raiseSalary() - tax();
    }
    double salaryWithoutTotal() {
        return this.salary + bonus() - tax();
    }

     void toPrint() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Start Year : " + this.hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Raise Salary : " + raiseSalary());
        System.out.println("Salary with Taxes and Bonuses : " + salaryWithoutTotal());
        System.out.println("Total Salary : " + totalSalary());
        System.out.println();
    }
}
