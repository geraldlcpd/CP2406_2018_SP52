/**
 * Created by geraldoswald on 8/9/18.
 */
public class DemoPhoneCalls
{
    public static void main(String[] args)
    {
        PhoneCall call1 = new IncomingPhoneCall("1234 5678");
        PhoneCall call2 = new OutgoingPhoneCall("3412 3245", 10);
        System.out.println(call1 + "\n");
        System.out.println(call2);


    }
}
