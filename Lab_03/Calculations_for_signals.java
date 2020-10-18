

public class Calculations_for_signals {
	public static int Dynamic_range(byte[] signals) {//Ds = smax - smin
		int min = signals[0];
		int max = signals[0];
		for(int i=0;i<signals.length;i++)
		 {
			 if (signals[i] < min)
				 min = signals[i];
			 if (signals[i] > max)
				 max = signals[i];
		 }
		return (max-min);
	}
	
	public static int Energy(byte[] signals) {//Es = sum(Si^2)
		int result=0;
		for(int i=0;i<signals.length;i++)
		 {
			result+=signals[i]*signals[i];
		 }
		 
		return result;
	}
	
	public static double Power( byte[] signals) {//P=Es/size
		double result = Energy(signals)/signals.length;
		return result;
	}
	
	public static double Mean(byte[] signals) {//m=sum/size
		double result=0;
		for(int i=0;i<signals.length;i++)
		 {
			result+=signals[i];
		 }
		return result/signals.length;
	}
	
	public static double Dispersion( byte[] signals) {//D = sum(Si-m)^2/size
		double m = Mean(signals);
		double result=0;
		for(int i=0;i<signals.length;i++)
		 {
			result+=(signals[i]-m)*(signals[i]-m);
		 }
		return result/signals.length;
	}
	
}
