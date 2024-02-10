class Student {

    String name;
    double tp, ip, dp;

    Student(String name, double tp, double ip, double dp) {
        this.name = name;
        this.tp = tp;
        this.ip = ip;
        this.dp = dp;
    }

    Student(String name, double tp, double ip) {
        this.name = name;
        this.tp = tp;
        this.ip = ip;
    }

    Student(String name, double tp) {
        this.name = name;
        this.tp = tp;
    }

    public void display() {
        System.out.println(this.name);
        if (this.dp != 0.0) {
            System.out.println(this.dp);
        }
        if (this.ip != 0.0) {
            System.out.println(this.ip);
        }
        if (this.tp != 0.0) {
            System.out.println(this.tp);
        }
    }

}
