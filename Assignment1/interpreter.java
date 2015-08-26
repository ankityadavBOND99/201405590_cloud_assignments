//package hello_d5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
//PROGRAM FOR converting IA-32 DAT DOES A-(2*B),,TO ITS IA-64 CODE
public class hello_cloud 
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br;
		PrintWriter p=new PrintWriter(args[1],"UTF-8");
		br = new BufferedReader(new FileReader(args[0]));
		String currline;
		String[] temp=new String[2];
		String[] temp1=new String[2];
		int ct=0;
		p.print(".Ltext0:\n\t.globl	main\n\tmain:\n\t.LFB0:\n");
		while((currline=br.readLine())!=null)
		{
			if(ct<4)
			{
				ct=ct+1;
				continue;
			
			}
			temp=currline.split(" ");
			if(temp[0].equals("mov")||temp[0].equals("add")||temp[0].equals("add"))
			{	
				if(temp[0].equals("mov"))
				p.print(temp[0]+"q ");
				else if(temp[0].equals("add"))
				p.print(temp[0]+"q ");
				else if(temp[0].equals("mul"))
				p.print(temp[0]+"q ");
				
				temp[1]=temp[1].replace("eax", "%rax");
				temp[1]=temp[1].replace("ebx", "%rcx");
				temp[1]=temp[1].replace("ecx", "%rbx");

				p.print(temp[1]+"\n");
	
			}
			else
			{
				currline=currline.replace("eax", "%rax");
				currline=currline.replace("push", "pushq");
				currline=currline.replace("ebx", "%rcx");
				p.println(currline);
			}
			
			
		}
		br.close();
		p.close();
	}	

}
