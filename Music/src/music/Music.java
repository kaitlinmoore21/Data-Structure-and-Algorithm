/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package music;

/**
 *
 * @author KaitlinMoore
 */
public class Music {
        private String songName;
         private String songGenre;
         private String myMusic;
    
  public Music(){
      songName = " ";
      songGenre = " ";
      myMusic = " ";
  }
       public Music(String songName, String songGenre, String myMusic){  
    this.songName = songName;
    this.songGenre = songGenre;
    this.myMusic = myMusic;
}
 
    public String getsongName(){
    return songName;
}
 
    public void setsongName(String songName) {
        this.songName = songName;
    }
 
    public String getsongGenre(){
    return songGenre;
}
    public void setsongGenre(String songGenre){
    this.songGenre = songGenre;
}
    public String getmyMusic(){
        return myMusic;
    }
    
    public void setmyMusic(String myMusic){
        this.myMusic = myMusic;
    }
    
}


    
    

