class Singleton {

    // Step 1: static variable
    private static Singleton instance;

    // Step 2: private constructor
    private Singleton() {}

    // Step 3: public method
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}