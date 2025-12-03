public class Main {
    public static void main(String[] args) {
        DeskPhone myPhone = new DeskPhone("123456");
        myPhone.callPhone("123456");
        myPhone.answer();

        MobilePhone mySecondPhone = new MobilePhone("12345");
        mySecondPhone.powerOn();
        mySecondPhone.callPhone("12345");
        mySecondPhone.answer();
    }
}