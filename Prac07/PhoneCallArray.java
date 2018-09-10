/**
 * Created by geraldoswald on 8/9/18.
 */
public class PhoneCallArray

{
    public static void main(String[] args)
    {
        PhoneCall[] calls = new PhoneCall[5];
        calls[0] = new IncomingPhoneCall("13451434");
        calls[1] = new OutgoingPhoneCall("11323515", 30);
        calls[2] = new IncomingPhoneCall("17456676");
        calls[3] = new OutgoingPhoneCall("73453565", 70);
        calls[4] = new IncomingPhoneCall("08765868");

        for(int i = 0 ; i < 5 ; i ++)
        {
            System.out.println(calls[i]);
            System.out.println();
        }
    }


}
