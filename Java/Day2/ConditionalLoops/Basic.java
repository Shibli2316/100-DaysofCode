package ConditionalLoops;

public class Basic {
    public static void main(String[] args) {
    int salary = 2345;
//    if (salary>1000){
//        salary = salary +10000;
//    }else {
//        salary = salary+234;
//    }
//        System.out.println(salary);
        if (salary >1000){
            salary += 2000;
        }else if(salary>10000){
            salary+=100;
        }else{
            salary=salary-salary;
        }
        System.out.println(salary);
    }
}
