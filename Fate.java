
public class Fate extends Anime{

  private String servantName;
  private int commandUsages;
  Fate(String[] genres, int seasons, int episodeNum, double episodeTime, int tiers, String servantClass, String servantName, int commandUsages){
    super(genres, seasons, episodeNum, episodeTime);

    this.servantName = servantName;
    this.commandUsages = commandUsages;
  }

  public boolean summonServant(){
    boolean success = false;
    if (Math.random < 0.3){
      String servantClass;
      int category = (int) (Math.random() * 14) + 1;
      switch (category){
        case 1: servantClass = "Saber"; break;
        case 2: servantClass = "Shielder"; break;
        case 3: servantClass = "Rider"; break;
        case 4: servantClass = "Archer"; break;
        case 5: servantClass = "Lancer"; break;
        case 6: servantClass = "Caster"; break;
        case 7: servantClass = "Assassin"; break;
        case 8: servantClass = "Berserker"; break;
        case 9: servantClass = "Ruler"; break;
        case 10: servantClass = "Avenger"; break;
        case 11: servantClass = "Moon Cancer"; break;
        case 12: servantClass = "Alter Ego"; break;
        case 13: servantClass = "Beast"; break;
        case 14: servantClass = "Foreigner"; break;
      }

      System.out.println("Your servant " + servantName + " is classifed as a + " + servantClass + "!!!");

      success = true;
      return success;

    }
    else{
      System.out.println("Summoning servant: error!!!");
    }
    return success;
  }

  public void commandSeals(){
    Scanner console = new Scanner(System.in);
    System.out.print("What is your command? ");
    String prompt = console.next();

    if (this.commandUsages = 3){
      System.out.println("Your servant is unable to follow anymore command seals!");
    }
    else{
      System.out.println("Success! Your servant is now under your command of performing: \n" + prompt);
      commandUsages++;
    }
    console.close();
  }

  public int getCommandUsages(){
    return this.commandUsages;
  }

  public void setCommandUsages(int num){
    this.commandUsages = num;
  }
}