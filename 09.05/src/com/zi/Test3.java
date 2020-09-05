package com.zi;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
/**
 * 
 * ObjectOutputStream
 *  对象的写入  序列化
 * @author  刘安宝
 * @version  [V1.00, 2020-9-5]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class Test3
{
    public static void main(String[] args)
    {
        Order order=new Order(22, "lll");
       OutputStream os=null;
       ObjectOutputStream dos=null;
        try
        {
            os=new FileOutputStream("1.txt");
            dos=new ObjectOutputStream(os);
           dos.writeObject(order);
            
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
