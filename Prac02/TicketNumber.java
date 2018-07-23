/**
 * Created by geraldoswald on 23/7/18.
 */
public class TicketNumber
{
    public static void main(String[] args)
    {
        String lotto = new String("154123");
        String lottoExtract = new String(lotto.substring(0, 5));
        String lottoEnd = new String(lotto.substring(5));
        int newLottoEnd = Integer.parseInt(lottoEnd);
        int newLotto = Integer.parseInt(lottoExtract);
        int lottoCheck = newLotto % 7;
        boolean lottoRes = (lottoCheck == newLottoEnd);
        System.out.println("New Lotto = " + newLottoEnd);
        System.out.print("LottoCheck = " + lottoCheck + " // LottoEnd = " + newLottoEnd);
        System.out.print("\nResult = " + lottoRes);


    }
}
