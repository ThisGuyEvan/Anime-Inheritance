public class Pokemon extends Anime{
  private String[][] party;
  private String[] pokeCategory;



  Pokemon(String[] genres, int seasons, int episodeNum, double episodeTime, String[][] party){
    super(genres, seasons, episodeNum, episodeTime);
    this.party = party;
    this.pokeCategory = {"Pokemon name: ", "Max Hp: ", "Level: ", "Type(s) [Add a & to differentiate: ", "Held items: "};
  }

  public void editPokemon(String pokeName){
    boolean canSwap = false;
    int position = 0; 

    for (int i = 0; i < party[0].length; i++){
      if (pokeName.equalsIgnoreCase(party[0][i])){
        canSwap = true;
        position = i;
        break;
      }
      else{
        return "Unfortunately you do not have the given pokemon currently in your party. Please select a valid pokemon to change.";
      }
    }

    Scanner console = new Scanner(System.in);
    for (int x = 0; x < party.length; x++){
      System.out.print(pokeCategory[i]);
      party[x][position] = console.next();
    }
    System.out.println("Successfully modifed your party!");
  }

  public String listParty(){
    String team = "";
    for (int i = 0; i < party.length; i++){
      for (int x = 0; x < pokeCategory.length; x++){
        team += pokeCategory[x] + party[i][x] + ".\n";
      }
      team += "_________________________________";
    }
    return team;
  }
}