public class BrawlStarsCharacterTester{
   public static void main(String[] args){
      BrawlStarsCharacter shelly = new BrawlStarsCharacter();
      shelly.displayStats();
      shelly.buyHypercharge();
      for (int i=0;i<10;i++){
         shelly.levelUp();
      }
      shelly.buyHypercharge();
      shelly.gameUpdate();
      shelly.displayStats();
   }
}