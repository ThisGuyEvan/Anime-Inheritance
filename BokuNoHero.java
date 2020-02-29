public class BokuNohero extends Anime{

  private String quirk;
  private int age;
  private String occupation;

  BokuNohero(String[] genres, int seasons, int episodeNum, double episodeTime, String quirk, int age, String occupation){
    super(genres, seasons, episodeNum, episodeTime);
    
    this.quirk = quirk;
    this.age = age;
    this.occupation = occupation;
  }

  //public void midoriyasNotes

  public void setQuirk(String powers){
    this.quirk = powers;
  }

  public String getQuirk(){
    return quirk;
  }

  public void setAge(int num){
    this.age = num;
  }

  public int getAge(){
    return age;
  }

  public void setOccupation(String job){
    this.occupation = job;
  }

  public String getOccupation(){
    return occupation;
  }


}