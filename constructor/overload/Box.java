class Box {

    double length, breath, height;

    Box(double length, double breath, double height) {
        this.length = length;
        this.breath = breath;
        this.height = height;
    }

    Box(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public void display() {
        System.out.println("Dimensions : " + this.length + "x" + this.breath + "x" + this.height);
    }


}
