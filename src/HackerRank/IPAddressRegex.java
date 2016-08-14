package HackerRank;

import java.util.*;

public class IPAddressRegex {

	public static void main(String []args)
    {
       /* Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern ));
        }*/
		String IP = "252.154.100.10";
		System.out.println(IP.matches(new myRegex().pattern ));
    }

}

class myRegex{

	public String singlePattern = "[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]";
	//public String pattern = "[0-2][0-5][0-5]{1,3}\\.[0-2][0-5][0-5]{1,3}\\.[0-2][0-5][0-5]{1,3}\\.[0-2][0-5][0-5]{1,3}";
	//public String pattern = singlePattern+"\\."+singlePattern+"\\."+singlePattern+"\\."+singlePattern;
	public String pattern = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
}
