package defaultandstaticmethods;

public class AnonymousImplementation {
    public static void main(String[] args) {
        Employee employee=new Employee() {
            @Override
            public String getname() {
                // TODO Auto-generated method stub
                return "software employee";
            }

        };
        System.out.println(employee.getname());
    }
}
