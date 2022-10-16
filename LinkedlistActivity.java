import java.util.LinkedList;

public class LinkedlistActivity {

    public static void main(String[] args) {
        
       LinkedList<String> songs= new LinkedList<>();
       LinkedList<String> artists= new LinkedList<>();
       LinkedList<String> playlist= new LinkedList<>();
         
         songs.add("We Belong Together");
         songs.add("Million Reasons");
         songs.add("The Climb");
         songs.add("Who You Are");
         songs.add("A Woman's Worth");
         
         artists.add("Mariah Carey");
         artists.add("Lady Gaga");
         artists.add("Miley Cyrus");
         artists.add("Jessie J");
         artists.add("Alicia Keys");
         
         for(int i=0;i<songs.size();i++)
             playlist.add(songs.get(i)+" - "+artists.get(i));
         
         System.out.println(songs);
         System.out.println(artists);
         for(int i=0;i<playlist.size();i++)
             System.out.println(playlist.get(i));
        
        
    }
    
}