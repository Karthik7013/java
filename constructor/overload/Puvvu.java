class Puvvu {
    String name, color;
    int noPetals;

    Puvvu() {
        this.name = "califlour";
        this.color = "white";
        this.noPetals = 144;
    }

    Puvvu(String name, String color, int noPetals) {
        this.name = name;
        this.color = color;
        this.noPetals = noPetals;
    }

    Puvvu(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void fragrance() {
        System.out.println("smells good");
    }

    public void garland() {
        System.out.println("Security watching");
    }
}
