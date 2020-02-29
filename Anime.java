public class Anime{
  private String[] genres;
  private int seasons;
  private int episodeNum;
  private double episodeTime;

  Anime(String[] genres, int seasons, int episodeNum, double episodeTime){
    this.genres = genres;
    this.seasons = seasons;
    this.episodeNum = episodeNum;
    this.episodeTime = episodeTime;
  }


  public ArrayList<String> mainCharacter(String hair, String height, String powers, String traits){
    ArrayList<String> characteristics = new ArrayList<String>();
    characteristics.add("Hair: " + hair);
    characteristics.add("Height: " + height);
    characteristics.add("Powers: " + powers);
    characteristics.add("Traits: " + traits);
    
    Scanner console = new Scanner(System.in);
    System.out.print("Would you like to include anything else? ");
    String ask = console.next();
    if (ask.equalsIgnoreCase("yes")){
      System.out.print("\nHow many more characteristics? ");
      int num = console.nextInt();
      for (int i = 0; i < num; i++){
        String build = "";
        System.out.print("\nEnter the characteristic: ");
        build += console.next() + ": ";
        System.out.print("\nEnter the type of characteristic: ");
        build += console.next();
      }
      System.out.println("Finished Characterizing.");
    }
    else{
      System.out.println("Finished Characterizing.");
    }

    console.close();
    return characteristics;
  }

  public void setGenres(int genreNum){
    Scanner console = new Scanner(System.in);
    String[] newGenres = new String[genreNum];
    for (int i = 0; i < genreNum; i++){
      System.out.print("Enter genres: ");
      newGenres[i] = console.next();
      System.out.println();
    }
    
    console.close();
    this.genres = newGenres;
  }

  public String[] getGenres(){
    return this.genres;
  }

  public int getSeasons(){
    return this.seasons;
  }

  public void setSeasons(int num){
    this.seasons = num;
  }

  public int getEpisodeNum(){
    return this.episodeNum;
  }

  public void setEpisodeNum(int num){
    this.episodeNum = num;
  }

  public double getEpisodeTime(){
    return this.episodeTime;
  }

  public void setEpisodeTime(double num){
    this.episodeTime = num;
  }
}