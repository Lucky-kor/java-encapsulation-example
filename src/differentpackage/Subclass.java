package differentpackage;

import accessmodifiers.AccessModifiersExample;

public class Subclass extends AccessModifiersExample {
    public Subclass() {
        // Protected, Public 접근 가능. Default, Private 접근 불가.
        // System.out.println("Private: " + privateVar); // 컴파일 에러
        // System.out.println("Default: " + defaultVar); // 컴파일 에러
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}