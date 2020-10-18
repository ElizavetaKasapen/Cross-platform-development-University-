import java.io.*;
import java.util.ArrayList;



public class Digital_signal_characteristics {
	 public static void main(String[] args) throws IOException
	 {
		// int i;
		 FileInputStream file_in;
		 FileOutputStream file_out;
		 try {
			 try {
				 file_in = new FileInputStream(args[0]);	//Input open
			 	} 
			 catch (FileNotFoundException e) {
				 System.out.println ("File not found");	//Warning
				 return;
			 	}
			 try {
				 file_out = new FileOutputStream(args[1]);	//Output open
			 	}
			 catch (FileNotFoundException e) {
				 System.out.println ("File not found"); //Warning
				 return;
			 	}
		 	}
		 catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println ("Using: CopyFile default");
			 return;								//Warning message
		 	}
	       try {
	    	   byte[] buffer = new byte[file_in.available()];
	    	   file_in.read(buffer, 0, buffer.length);
	    	   System.out.println("Dynamic range = "+Calculations_for_signals.Dynamic_range(buffer));
	    	   System.out.println("Energy = "+Calculations_for_signals.Energy(buffer));
	    	   System.out.println("Power = "+Calculations_for_signals.Power(buffer));
	    	   System.out.format("Mean = %.4f\n",Calculations_for_signals.Mean(buffer)); 
	    	   System.out.format("Dispersion = %.4f\n",Calculations_for_signals.Dispersion(buffer)); 
	    	   //for(i=0;i<buffer.length;i++)
	    		//   System.out.println (buffer[i]+"\n"); 
	    	   //file_out.write(buffer, 0, buffer.length);
	       }
	       catch(IOException ex){
	             
	            System.out.println(ex.getMessage());
	        } 
	       finally{
	    	   file_in.close();	//Input close
	    	   file_out.close();	//Output close
	       }
	 }
}
