package videostoreproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Video {
    private String videoTitle;
    private Boolean onLoan = false;
    private Date dueDate = null;
    
 Video() {
      
 }        

    public  Video (String videoTitle, Boolean onLoan, Date dueDate) {
     
       this.videoTitle = videoTitle;
       this.onLoan = onLoan;
       this.dueDate  = dueDate;  
 }
    // Getters and setters to access video properties from another class
      public String getVideoTitle() {
        return   this.videoTitle;
    }

      public void setOnLoan(Boolean onLoan) {
        this.onLoan = onLoan;
    }

      public Boolean isOnloan() {
        return this.onLoan;
    } 
    
      public  void setDueDate(Date dueDate) {  
      this.dueDate = dueDate;
      
     }
          
     public Date getDueDate() {
         return this.dueDate;
     }
    // toString to print object as a string & print if video is on loan & due date 
     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
     
    @Override
      public String toString() {
	
    // Check if onloan is true then print video title and the date it will be due.
           if(this.isOnloan()) 
          return  " " + this.getVideoTitle() + " is loaned out and due on " + dateFormat.format(this.getDueDate());
      else  
           
         return ("The video " + this.getVideoTitle() + " is on the shelf \n");
                }
      }
