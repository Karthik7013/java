public class Gun {
    int bullets;
    String name;

    Gun(int bullets, String name) {
        this.bullets = bullets;
        this.name = name;
    }

    public void shoot() {
        --this.bullets;
        System.out.println("bullet" + this.bullets);
    }

    public void load() {
        if (this.bullets >= 1) {
            System.out.println("reload");
        } else {
            System.out.println("no ammo!");
        }
    }
}
