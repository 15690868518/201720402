package wang1;



public class Count {
	public static void main(String[] args) {
		int[]num1=new int[50];
		int[]num2=new int[50];
		int[]num3=new int[50];
		int[]num4=new int[50];
		for(int i=0;i<50;i++) {
			num1[i]=(int)(Math.random()*100+1);
			num2[i]=(int)(Math.random()*100+1);
			num3[i]=(int)(Math.random()*2);
			switch(num3[i])
			{
			case 0:
				num4[i]=num1[i]+num2[i];
				break;
			case 1:
				num4[i]=num1[i]-num2[i];
				break;
			}
		}
		for(int i=0;i<50;i++) {
			System.out.print(num1[i]);
			if(num3[i]==0)
				System.out.print("+");
			if(num3[i]==1)
				System.out.print("-");
			System.out.print(num2[i]);
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<50;i++) {
			System.out.print(num1[i]);
			if(num3[i]==0)
				System.out.print("+");
			if(num3[i]==1)
				System.out.print("-");
			System.out.print(num2[i]+"="+num4[i]);
			System.out.println();
	}
		return;
}
}
