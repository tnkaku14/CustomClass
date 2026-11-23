public class BrawlStarsCharacterTester{
   public static void main(String[] args){
      BrawlStarsCharacter shelly = new BrawlStarsCharacter();
      BrawlStarsCharacter doug = new BrawlStarsCharacter("doug",8);
      BrawlStarsCharacter buzz = new BrawlStarsCharacter("Buzz", "Godzilla Buzz", "mythic", 9000, 0.9, false, "damage dealer", 11, true, 3);
      shelly.displayStats();
      doug.displayStats();
      buzz.displayStats();
      shelly.buyHypercharge();
      for (int i=0;i<10;i++){
         shelly.levelUp();
      }
      shelly.buyHypercharge();
      shelly.gameUpdate();
      shelly.displayStats();
   }
}