package com.zi;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class text1
{
    public static void main(String[] args)
    {
        OutputStream is=null;
        DataOutputStream dois=null;
        try
        {
            is=new FileOutputStream("1.txt");
            dois=new DataOutputStream(is);
            dois.writeInt(255);
            dois.writeBoolean(true);
            dois.writeUTF("qqqq");
            
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            try
            {
                dois.close();
            }
            catch (Exception e2) { }
            try
            {
             is.close();   
            }
            catch (Exception e2){ }
        }
     
    }
}

















