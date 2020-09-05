package com.zi;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * 
 *ObjectInputStream   读
 *  反序列化
 * @author  刘安宝
 * @version  [V1.00, 2020-9-5]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class Test4
{
   public static void main(String[] args)
{
      InputStream os=null;
       ObjectInputStream dos=null;
        try
        {
            os=new FileInputStream("1.txt");
            dos=new ObjectInputStream(os);
            Order order=(Order)dos.readObject();
            System.out.println(order);
            
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            try
            {
                dos.close();
            }
            catch (Exception e2) { }
            try
            {
             os.close();   
            }
            catch (Exception e2){ }
        }
    } 
} 

