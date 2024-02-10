public class Student {
    String name;
    int regNum;
    String degree;
    String branch;
    String college;
    int year;

    Student(String college, int year) {
        this.college = college;
        this.year = year;
    }

    Student(String degree, String branch, String college, int year) {
        this(college, year);
        this.degree = degree;
        this.branch = branch;
    }

    Student(String name, int regNum, String degree, String branch, String college, int year) {
        this(degree, branch, college, year);
        this.name = name;
        this.regNum = regNum;
    }

    public void display() {
        System.out.println("name : " + this.name);
        System.out.println("regNum : " + this.regNum);
        System.out.println("degree : " + this.degree);
        System.out.println("branch : " + this.branch);
        System.out.println("college : " + this.college);
        System.out.println("year : " + this.year);
    }


}
