public class ProjectTest{  
    public static void main(String[] args){
        Project FailedTest= new Project("Shanky", "Test");
        System.out.println(FailedTest.getName());
        FailedTest.setInitialCost(250000.12);
        System.out.println(FailedTest.getInitialCost());
    }
}
