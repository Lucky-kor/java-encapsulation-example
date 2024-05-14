package differentpackage;

import accessmodifiers.AccessModifiersExample;

public class NonSubclass {
    public NonSubclass() {
        AccessModifiersExample example = new AccessModifiersExample();

        // Public 접근 가능. Default, Protected, Private 접근 불가.
        // System.out.println("Private: " + example.privateVar); // 컴파일 에러
//         System.out.println("Default: " + example.defaultVar); // 컴파일 에러
//         System.out.println("Protected: " + example.protectedVar); // 컴파일 에러
        System.out.println("Public: " + example.publicVar);
    }
}