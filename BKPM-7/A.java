public class A {
    void callthis() {
        System.out.println("inside Class A's method!");
        
    }
}
class B extends A {
    void callthis() {
        System.out.println("inside Class B's method!");
        
    }
}
class C extends A {
    void callthis() {
        System.out.println("inside Class C's method!");
        
    }

}
class DynamicDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        
        ref = b;
        ref.callthis();
        
        ref = c;
        ref.callthis();
        
        ref = a;
        ref.callthis();
        
    }
}
