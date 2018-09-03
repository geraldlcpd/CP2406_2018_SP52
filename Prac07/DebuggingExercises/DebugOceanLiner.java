package DebuggingExercises;

public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("ocean liner ");
      setPassengers();
      setPower();
   }

   @Override
   public void setPower() {

   }

   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void power()
   {
      super.power = "four engines";
   }
}
