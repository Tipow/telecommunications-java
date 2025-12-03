public class MobilePhone implements Telephone{
    private String myNumber;
    private Boolean isRinging;
    private Boolean isPowerOn;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone power on");
    }

    @Override
    public void dail(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on mobile phone");
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        } else {
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public Boolean callPhone(String phoneNumber) {
        if (phoneNumber.equals(myNumber) && isPowerOn){
            isRinging = true;
            System.out.println("Phone is ringing");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public Boolean isRinging() {
        return isRinging;
    }
}
