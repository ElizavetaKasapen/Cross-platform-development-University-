import java.io.*;

public class Digital_signal_characteristics {
	 public static void main(String[] args) throws IOException
	 {
		 FileInputStream file_in;
		 try {
			 file_in = new FileInputStream(args[0]);	//Input open
		 	} 
		 catch (FileNotFoundException e) {
			 System.out.println ("File not found");	//Warning
			 return;
		 	} 								
	       try {
	    	   byte[] buffer = new byte[file_in.available()];//Create an array for data
	    	   file_in.read(buffer, 0, buffer.length);//Reading from file
	    	   System.out.println("Dynamic range = "+Calculations_for_signals.Dynamic_range(buffer));
	    	   System.out.println("Energy = "+Calculations_for_signals.Energy(buffer));
	    	   System.out.println("Power = "+Calculations_for_signals.Power(buffer));
	    	   System.out.format("Mean = %.4f\n",Calculations_for_signals.Mean(buffer)); 
	    	   System.out.format("Dispersion = %.4f\n",Calculations_for_signals.Dispersion(buffer)); 
	       }
	       catch(IOException ex){
	             
	            System.out.println("Error!");//Warning
	        } 
	       finally{
	    	   file_in.close();	//Input close
	       }
	 }
}
