public class BrawlStarsCharacter{

   //instance variables
   private String name;
   private String skin;
   private String rarity;
   private int health;
   private double speed;
   private boolean isMeta;
   private String brawlerClass;
   private int level;
   private boolean hasHypercharge;
   private int ammo;
   
   //constructors
   public BrawlStarsCharacter(){
      name = "Shelly";
      skin = "default";
      rarity = "common";
      health = 7500;
      speed = 1.0;
      isMeta = false;
      brawlerClass = "damage dealer";
      level = 1;
      hasHypercharge = false;
      ammo = 3;
   }
   public BrawlStarsCharacter(String name, String skin, String rarity, int health, double speed, boolean isMeta, String brawlerClass, int level, boolean hasHypercharge, int ammo){
      this.name = name;
      this.skin = skin;
      this.rarity = rarity;
      this.health = health;
      this.speed = speed;
      this.isMeta = isMeta;
      this.brawlerClass = brawlerClass;
      this.level = level;
      this.hasHypercharge = hasHypercharge;
      this.ammo = ammo;
   }
   public BrawlStarsCharacter(String name, int level){
      this.name = name;
      this.level = level;
   }
   
   //methods
   public void levelUp(){
      //levels up brawler and increase health;
      level++;
      health += 200;
      System.out.println("LEVELED UP!\nYour brawler is now level " + level);
   }
   public void takeDamage(int damage){
      //decrease health by damage
      health -= damage;
      System.out.println("You took " + damage + ". You now have " + health + " health.");
   }
   public int useAttack(){
      //subtracts ammo from character
      if (ammo > 0){
         ammo--;
      }
      return ammo;
   }
   public void displayStats(){
      //prints the instance variables
      System.out.println("Brawler name: " + name);
      System.out.println("Skin: " + skin);
      System.out.println("Rarity: " + rarity);
      System.out.println("Health: " + health);
      System.out.println("Speed: " + speed);
      System.out.println("Brawler is Meta: " + isMeta);
      System.out.println("Class: " + brawlerClass);
      System.out.println("Level: " + level);
      System.out.println("Has Hypercharge: " + hasHypercharge);
      System.out.println();
   }
   public void gameUpdate(){
      //randomly picks to make brawler meta or not
      if ((int)(Math.random()*2) == 1){
         isMeta = true;
      }
      else{
         isMeta = false;
      }
   }
   public void buyHypercharge(){
      //if brawler is 11 or greater makes hasHypercharge = true
      if(level >= 11){
         hasHypercharge = true;
         System.out.println(name + " now has a Hypercharge!");
      }
      else{
         System.out.println(name + " is not level 11! You cannot buy a Hypercharge!");
      }
   }
}