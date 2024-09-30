package com.thinking.machines.util;

import java.io.*;

public class PWPrintln
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("Invalid Usage");
            System.out.println("Usage : java PWPrintln Class Name");
        }
        try 
        {
            File file = new File(args[0]);
            if (file.exists() == false)
            {
                System.out.println("File : " + args[0] + " Not Exists");
                return;
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            File tfile = new File("temp.txt");
            if (tfile.exists()) tfile.delete();
            RandomAccessFile traf = new RandomAccessFile(tfile, "rw");

            while (raf.getFilePointer() < raf.length())
            {
                traf.writeBytes("pw.println(\"" + raf.readLine() + "\");");
            }

            traf.close();
            raf.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}