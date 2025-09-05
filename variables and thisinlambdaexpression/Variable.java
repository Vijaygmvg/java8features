import defaultandstaticmethods.Employee;

public class Variable {

           int x=20;
    public static void main(String[] args) {
 
        Employee emp=new Employee(){

            @Override
            public String getname() {
               return "softwre employee";
            }

        };

        Employee sde1=()->"softwareDevloper 1";

        Employee sde2=()->{
            int x=20;   //here this is the local variable for the getname method implementation 
            return "Software Emloyee with age "+x;
        };

        Employee Manager=new Employee() {

            int manager=79;  //this is the  class varaible instancd varuale of a anaonyous class 
            @Override
            public String getname() {
              return "im manager of age "+manager;
            }
            
        };
    
    }
}