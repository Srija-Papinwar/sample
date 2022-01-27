import java.util.*;
class Ceaser 
{
	public static void main(String[] args) 
	{
		
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Plain Text:");
		String in = sc.nextLine();
		System.out.println("Enter Key:");
		int key =sc.nextInt();
		System.out.println("What You want to Do??\n1.Encryption\t2.Decryption\t3.Exit");
		
		boolean p=true;
		while(p)
		{
			int op=sc.nextInt();
		    switch(op)
		    {
			case 1:System.out.println("Cipher Text is:"+Ceaser.encrypt(in,key));break;
			case 2:System.out.println("Plain Text is:"+Ceaser.decrypt(Ceaser.encrypt(in,key),key));break;
			case 3:System.exit(0);
		    }
		}
	}
	public static String encrypt(String in,int key)
	{
		String alphaU="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphaL="abcdefghijklmnopqrstuvwxyz";
		String op="";
       for(int i=0;i<in.length();i++)
			if(in.charAt(i)>=65 &&in.charAt(i)<=90)
			 op+=alphaU.charAt((alphaU.indexOf(in.charAt(i))+key)%26);
		   else
             op+=alphaL.charAt((alphaL.indexOf(in.charAt(i))+key)%26);
		return (op);

	}
	public static String decrypt(String op,int key)
	{
		String alphaU="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphaL="abcdefghijklmnopqrstuvwxyz";
		String op1="";
		for(int i=0;i<op.length();i++)
		{
			if(op.charAt(i)>=65 &&op.charAt(i)<=90)
			{
			  if(alphaU.indexOf(op.charAt(i))-key<0)
			   op1+=alphaU.charAt(((alphaU.indexOf(op.charAt(i))-key)+26)%26);
			  else
                op1+=alphaU.charAt((alphaU.indexOf(op.charAt(i))-key)%26);
		   }
		   else
		   {
			   if(alphaU.indexOf(op.charAt(i))-key<0)
                op1+=alphaL.charAt(((alphaL.indexOf(op.charAt(i))-key)+26)%26);
			   else{
                 op1+=alphaL.charAt((alphaL.indexOf(op.charAt(i))-key)%26);}
		  }
		}
		return op1;


	}
}