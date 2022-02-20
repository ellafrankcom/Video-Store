
package videostoreproject;

import javax.swing.JOptionPane;

public class VideoTest {

    public static void main(String[] args) {
        
        VideoStore myVideostore = new VideoStore();
 

        //String[] options = {"L-List", "B-Borrow", "Q-Quit"};    
       
        //int menu = JOptionPane.showOptionDialog(frame, "Menu : ", "VideoStore",            
        // JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
        // options[0] );
        for(;;) {
        String menu = JOptionPane.showInputDialog(null, "Menu: L-list, B-borrow, Q-quit"); 
        if (menu.equals("L")){
            myVideostore.listallVideos();
        } else if(menu.equals("B")){
        String nameInput = JOptionPane.showInputDialog("Enter Name ");
      
        String videoInput = JOptionPane.showInputDialog("What is the title"
                + " of the video you want to borrow?");
        
        
        myVideostore.borrow(nameInput, videoInput);
        JOptionPane.showMessageDialog(null,nameInput + " has borrowed " + videoInput);
        
        }
        else if (menu.equalsIgnoreCase("Q")){
               System.exit(0);
        } 
        else 
         {
                    JOptionPane.showMessageDialog(null, "Invalid response.");
                    
        }
        
       }
    
    }  
    
    
}