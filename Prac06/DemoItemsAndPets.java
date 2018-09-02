/**
 * Created by geraldoswald on 28/8/18.
 */
public class DemoItemsAndPets
{
    public static void main(String[] args)
    {
        ItemSold newItem = new ItemSold();
        PetSold newPet = new PetSold();
        newPet.SetNewDescription("New Dog");
        newPet.SetNewInvoice(100);
        newPet.SetNewPrice(300);
        newPet.PetStateChange(true, true, true);
        System.out.println("\nNEW PET");
        newPet.GetAttribute();
        System.out.println("\nNEW ITEM");
        newItem.GetInvoice();
    }

}
