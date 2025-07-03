package Singleton;

 class Store {
    private static Store instance;

    private Store() {
    }

    public static Store getInstance() {
        if (Store.instance == null) {
            Store instance = new Store();
            Store.instance = instance;
            return instance;
        }
        return Store.instance;
    }
}

