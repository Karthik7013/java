package Builder;

public class Example {
    public static void main(String[] args) {
        PhoneBuilder myPhone = new PhoneBuilder();
        myPhone.brand("MOTOROLA");
        myPhone.os("ANDROID");
        myPhone.price(1000);
        myPhone.batteryCapacity("500mAh");
        System.out.println(myPhone);
    }
}

// OOPS DESIGN PATTERNS
/**
 * // ========= CREATIONAL PATTERNS ================>
 * 1. Singleton
 * 2. Factory Method
 * 3. Builder
 * // ========= STRUCTURAL PATTERNS ================>
 * 1. Adopter
 * 2. Decorator
 * 3. Facade
 * // ========= BEHAVIOURAL PATTERNS ================>
 * 1. Observer
 * 2. Strategy
 * 3. Command
 * 4. State
 */