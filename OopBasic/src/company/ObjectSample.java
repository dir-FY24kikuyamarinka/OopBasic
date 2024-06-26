package company;


public class ObjectSample {

    public static void main(String[] args) {
      
        var employee = new Employee("鈴木", "営業部", "課長", 100);
        
        
        employee.report();
        employee.report(2);
        employee.joinMeeting();
        
        
        System.out.println("");
        
        
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Employee("田中", "開発部", "一般社員",　88);
        
        
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        
        System.out.println("");
        
        
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
        
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
           
            ((Engineer) projectManager).developSoftware();
        }
        
        System.out.println("");
        
        
        var parttimeWorker = new ParttimeWorker("太田", department);
        
        
        ((Workable) employee).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
        
        
   }

}
