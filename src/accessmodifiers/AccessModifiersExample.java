package accessmodifiers;

public class AccessModifiersExample {
    // private 접근 제어자: 이 변수는 AccessModifiersExample 클래스 내에서만 접근 가능합니다.
    private int privateVar = 1;

    // default 접근 제어자: 이 변수는 동일 패키지 내의 모든 클래스에서 접근 가능합니다.
    int defaultVar = 2;

    // protected 접근 제어자: 이 변수는 동일 패키지 내의 모든 클래스 및 다른 패키지의 하위 클래스에서 접근 가능합니다.
    protected int protectedVar = 3;

    // public 접근 제어자: 이 변수는 어디에서나 접근 가능합니다.
    public int publicVar = 4;

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // 동일 클래스 내부에서 모든 변수에 접근 가능
        System.out.println("Private: " + example.privateVar);
        System.out.println("Default: " + example.defaultVar);
        System.out.println("Protected: " + example.protectedVar);
        System.out.println("Public: " + example.publicVar);
    }
}
