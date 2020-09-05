package com.zi;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 
 *使用DataOutputStream输出数据
 *  
 * @author  刘安宝
 * @version  [V1.00, 2020-9-5]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class Test
{
    public static void main(String[] args)
    {
        OutputStream os=null;
        DataOutputStream dos=null;
        try
        {
            os=new FileOutputStream("1.txt");
            dos=new DataOutputStream(os);
            dos.writeInt(255);
            dos.writeBoolean(true);
            dos.writeUTF("aqqq");
            
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
