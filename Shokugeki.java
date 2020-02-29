public class Shokugeki extends Anime{

  private String studentName;
  private int studentYear;
  private int ranking;

  Shokugeki(String[] genres, int seasons, int episodeNum, double episodeTime, String studentName, int studentYear, int ranking){
    super(genres, seasons, episodeNum, episodeTime);

    this.studentName = studentName;
    this.studentYear = studentYear;
    this.ranking = ranking;

  }

  public void foodWar(String challenger, boolean challenge){
    Scanner console = new Scanner(System.in);
    if (challenged){
      System.out.print("How many rounds? ");
      int rounds = console.nextInt();
      int results = 0, challengerCount = 0, studentCount = 0;
      for (int i = 0; i < rounds; i++){
        if (results <= 2){
          if (studentCount > challengerCount){
            System.out.println(studentName + " has won!");
          }
          else{
            System.out.println(challenger + " is victorious!");
          }
          System.out.println("Score: \t " + studentCount + " - " + challengerCount);
        }
        if (Math.random() < 0.5){
          studentCount++;
        }
        else{
          challengerCount++;
        }
      }
    }
    else{
      System.out.println(studentName + " has denied your request!");
    }

  }

  public void setStudentYear(int num){
    this.studentYear = num;
  }

  public int getStudentYear(){
    return studentYear;
  }

  public void setRanking(int num){
    this.ranking = num;
  }

  public int getRanking(){
    return ranking;
  }
}
