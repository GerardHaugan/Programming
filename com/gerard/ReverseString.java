package com.gerard;

public class ReverseString{

    private String str;

    public ReverseString()
    {
	this("hello world");
    }
	
    public ReverseString(String s)
    {
	str = new String(s);
    }
	
    public void revSubString(int from, int to)
    {
        //Convert String to char[]
	char c[] = str.toCharArray();
	//System.out.println("Method invoked!");
		
        while ( from < to )
	{
	    char chr = c[from];
	    c[from++] = c[to];
	    c[to--] = chr;
	}
        
        //String sReverse = new String(c);
        str = new String(c);
        //System.out.println("String sReverse " + str);
    }

    public void revString(int len, int revNum)
    {
	revSubString(0, revNum-1);
	revSubString(revNum, len-1);
	revSubString(0, len-1);
    }

    public void getString()
    {
        System.out.println("String after reverse is:\n" + str);
    }
}
