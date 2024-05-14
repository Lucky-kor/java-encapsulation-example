package accessmodifiers;

public class SamePackage extends AccessModifiersExample{
    public SamePackage() {
        AccessModifiersExample example = new AccessModifiersExample();

        // Default, Protected, Public 접근 가능. Private 접근 불가.
//         System.out.println("Private: " + example.privateVar); // 컴파일 에러
        System.out.println("Default: " + example.defaultVar);
        System.out.println("Protected: " + example.protectedVar);
        System.out.println("Public: " + example.publicVar);
    }
}
