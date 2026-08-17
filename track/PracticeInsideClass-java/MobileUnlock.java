
class Mobile {

    void unlock(int pin) {
        System.out.println("Unlocked using pin");
    }

    void unlock(String password) {
        System.out.println("Unlocked using passowrd");
    }

    void unlock(Face f) {
        System.out.println("Unlocked using Face");
    }

    void unlock(FingerPrint g) {
        System.out.println("Unlocked using FingerPrint");
    }

    void unlock(Pattern p) {
        System.out.println("Unlocked using Pattern");
    }
}

class Face {

}

class FingerPrint {

}

class Pattern {

}

public class MobileUnlock {

    public static void main(String[] args) {

        Mobile m = new Mobile();
        Face f = new Face();
        FingerPrint g = new FingerPrint();
        Pattern p = new Pattern();

        m.unlock(2233);
        m.unlock("rajendra");
        m.unlock(f);
        m.unlock(g);
        m.unlock(p);
    }
}
