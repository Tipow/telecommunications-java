public interface Telephone {
    void powerOn();
    void dail(String phoneNumber);
    void answer();
    Boolean callPhone(String phoneNumber);
    Boolean isRinging();
}
