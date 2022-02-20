
package videostoreproject;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.*;

public class VideoStore {
    
    private ArrayList<Customer> customers;
    private ArrayList<Video> videos; 

//  Create ArrayLists of objects Customer class & videos class

  public VideoStore() {
      
  this.videos = new ArrayList<Video>();
   
  Video jaws = new Video("Jaws", false, null);
  this.videos.add(jaws);
  Video gladiator = new Video("Gladiator", false, null);
  this.videos.add(gladiator);
  Video star_wars = new Video("Star Wars", false, null);
  this.videos.add(star_wars);
  Video the_joker = new Video("The Joker", false, null);
  this.videos.add(the_joker);
  Video queens_gambit = new Video("Queens Gambit", false, null);
  this.videos.add(queens_gambit);
  Video lost = new Video("Lost", false, null);
  this.videos.add(lost);
  Video power = new Video("Power", false, null);
  this.videos.add(power);
  Video stranger_things = new Video("Stranger Things", false, null);
  this.videos.add(stranger_things);
  Video sherlock = new Video("Sherlock", false, null);
  this.videos.add(sherlock);
  Video Shrek = new Video("Shrek", false, null);
  this.videos.add(Shrek);
  Video Elf = new Video("Elf", false, null);
  this.videos.add(Elf);
  Video BeautyandTheBeast = new Video("Beauty and The Beast", false, null);
  this.videos.add(BeautyandTheBeast);
  Video Rocky = new Video("Rocky", false, null);
  this.videos.add(Rocky);
  Video TheSocialNetwork = new Video("The Social Network", false, null);
  this.videos.add(TheSocialNetwork);
  Video MeanGirls = new Video("Mean Girls", false, null);
  this.videos.add(MeanGirls);
  Video ToyStory = new Video("Toy Story", false, null);
  this.videos.add(ToyStory);
  Video Frozen = new Video("Frozen", false, null);
  this.videos.add(Frozen);
  
  
 this.customers = new ArrayList<Customer>();
  Scanner input=new Scanner(System.in);
  Customer david = new Customer("David", 0);
  this.customers.add(david);
  Customer ella = new Customer("Ella", 0);
  this.customers.add(ella);
  Customer owen = new Customer("Owen", 0);
  this.customers.add(owen);
  Customer olivia = new Customer("Olivia", 0);
  this.customers.add(olivia);
  Customer daniel = new Customer("Daniel", 0);
  this.customers.add(daniel);
  Customer gemma = new Customer("Gemma", 0);
  this.customers.add(gemma);
  Customer bob = new Customer("Bob", 0);
  this.customers.add(bob);
  Customer karen = new Customer("Karen", 0);
  this.customers.add(karen);
  Customer sam = new Customer("Sam", 0);
  this.customers.add(sam);
  Customer liz = new Customer("Liz", 0);
  this.customers.add(liz);
  Customer tom = new Customer("Tom", 0);
  this.customers.add(tom);
  Customer jane = new Customer("Jane", 0);
  this.customers.add(jane);
  Customer harry = new Customer("Harry", 0);
  this.customers.add(harry);
  Customer lauren = new Customer("Lauren", 0);
  this.customers.add(lauren);
  Customer chris = new Customer("Chris", 0);
  this.customers.add(chris);
   
  } 
 
  //Method to display all videos, their status & due date
    public void listallVideos() {
       
       System.out.println(" Our complete catalogue of videos are : "); 

        // For loop to display videos one at a time
        for (int i = 0; i < this.videos.size(); i++) {
          System.out.println(this.videos.get(i).toString() + "\n");
        }
        
        JOptionPane.showMessageDialog(null, videos);
    }  
      
  public void borrow(String customerName, String videoTitle) {
     
		// find the customer begin with no customers
		Customer customer = null;
		
		 //For loop to search for customers 
		for(int i = 0; i < this.customers.size(); i++) {
                    
			// If statement to check if name is a customer & ignore the type case
	         if(this.customers.get(i).getName().equalsIgnoreCase(customerName))  
				
				customer = this.customers.get(i); 
               
                
	
                }
                             
                 
                                if (customer == null) {
            JOptionPane.showMessageDialog(null,  customerName + " is not a customer.");
           return;
       }
		Video video = null;
		
		// For loop to find the video that is going to be rented
		for(int j = 0; j < this.videos.size(); j++) {
			// If statement to compare videos 
	            if(this.videos.get(j).getVideoTitle().equalsIgnoreCase(videoTitle)) {
				
				video = videos.get(j);
                                break;
                    }
                }
                    
                      if (video == null) {
            JOptionPane.showMessageDialog(null,  videoTitle + " is an invalid video.");
           return;
       }

                
		// lets customer borrow
	customer.borrowVideo(video);
                }
  
}
 