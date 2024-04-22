package javaprograms;

class Employee {
 protected String name;
 protected String address;
 protected double salary;
 protected String jobTitle;


 public Employee(String name, String address, double salary, String jobTitle) {
     this.name = name;
     this.address = address;
     this.salary = salary;
     this.jobTitle = jobTitle;
 }

 
 public double calculateBonus() {
     return 0; 
 }
 

 public void generatePerformanceReport() {
     System.out.println("Performance report for " + name + ":");
     System.out.println("No specific performance report generated for this role.");
 }

 
 public void manageProjects() {
     System.out.println("Project management for " + name + ":");
     System.out.println("No specific project management tasks defined for this role.");
 }
}

class Manager extends Employee {
 private int teamSize;

 public Manager(String name, String address, double salary, String jobTitle, int teamSize) {
     super(name, address, salary, jobTitle);
     this.teamSize = teamSize;
 }


 public double calculateBonus() {
   
     return salary * 0.1; 
 }

 
 public void generatePerformanceReport() {
     System.out.println("Performance report for Manager " + name + ":");
    
     System.out.println("Performance report generated based on team performance.");
 }

 public void manageProjects() {
     System.out.println("Project management for Manager " + name + ":");
    
     System.out.println("Managing project timelines, resources, and deliverables.");
 }
}

class Developer extends Employee {
 private String programmingLanguage;

 public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
     super(name, address, salary, jobTitle);
     this.programmingLanguage = programmingLanguage;
 }

 
 
 public double calculateBonus() {
     
     return salary * 0.05; 
 }

 
 public void generatePerformanceReport() {
     System.out.println("Performance report for Developer " + name + ":");
     
     System.out.println("Performance report generated based on code quality and project contributions.");
 }

 

 public void manageProjects() {
     System.out.println("Project management for Developer " + name + ":");
     
     System.out.println("Developing software features and meeting project deadlines.");
 }
}


class Programmer extends Developer {
 private boolean knowsJava;

 
 public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, boolean knowsJava) {
     super(name, address, salary, jobTitle, programmingLanguage);
     this.knowsJava = knowsJava;
 }

 
 public double calculateBonus() {
     
     return salary * 0.03; 
 }
}

public class Employee {
 public static void main(String[] args) {
     
     Manager manager = new Manager("John ", "123 Main St", 80000, "Manager", 10);
     Developer developer = new Developer("Smith", "456 Elm St", 60000, "Developer", "Java", true);
     Programmer programmer = new Programmer("Bob", "789 Oak St", 50000, "Programmer", "C++", false);

   
     System.out.println(manager.name + "'s bonus: $" + manager.calculateBonus());
     System.out.println(developer.name + "'s bonus: $" + developer.calculateBonus());
     System.out.println(programmer.name + "'s bonus: $" + programmer.calculateBonus());

     manager.generatePerformanceReport();
     developer.generatePerformanceReport();
     programmer.generatePerformanceReport();

     manager.manageProjects();
     developer.manageProjects();
     programmer.manageProjects();
 }
}
