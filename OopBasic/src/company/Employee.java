package company;

public class Employee {

    String name;
    String department;
    String position;
    int employeeId;
    
    
    
    public Employee(String name, String department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
}

    
    
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "、名前：" + name);
    }
    
    
    
    public void report() {
        report(1);
    }



    public void joinMeeting() {
        // TODO 自動生成されたメソッド・スタブ
        
    }
    
    
    