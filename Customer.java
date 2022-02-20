package videostoreproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Customer {
    static void add(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String name;
    private int borrowedVideos;
    
    Customer(){
      
    }
    public Customer(String name, int borrowedVideos) {
        this.name = name;
        this.borrowedVideos = borrowedVideos;  
        
    }
    
    //Getters & setters for Customer properties 
    public String getName() {
        return this.name;
    }
    
    public void setBorrowedVideos(int borrowedVideos) {
        this.borrowedVideos = borrowedVideos; 
    }
    
    public int getBorrowedVideos() {
        return this.borrowedVideos;
    }
//if statement to check if video is loaned then set due date & record the amount of videos borrowed
    public void borrowVideo(Video v) {
		
		if(v.isOnloan()) {
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
               
                System.out.println("The video " + v.getVideoTitle() + " " + "is loaned out and is due on " + dateFormat.format(v.getDueDate()) + "\n");
		JOptionPane.showMessageDialog(null, "The video " + v.getVideoTitle() + " " + "is loaned out and is due on " + dateFormat.format(v.getDueDate()) + "\n");	
		}
                
		// If statement to check if the customer has borrowed more than 2 videos
                else if(this.getBorrowedVideos() >= 2) {
	        System.out.println(this.getName() + " has reached their borrowing limit.");
                JOptionPane.showMessageDialog(null, this.getName() + " has reached their borrowing limit.");
                } else {
		// Set the due date to in 3 days using Calendar class
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DATE, 3);
                
		v.setOnLoan(true);
		v.setDueDate(c.getTime());
		
		// display the due date
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("The due date of the video is  " + dateFormat.format(v.getDueDate()));
		JOptionPane.showMessageDialog(null, "The due date of the video is  " + dateFormat.format(v.getDueDate()));
                
		//  Add +1 to signify the video was borrowed
		this.setBorrowedVideos(this.getBorrowedVideos() + 1);
		
		System.out.println(this.getName() + " has borrowed video " + v.getVideoTitle());
                /**
                JOptionPane.showMessageDialog(null, this.getName() + " has borrowed " + v.getVideoTitle());
                */
                }
            }
	}
