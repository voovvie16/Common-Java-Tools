package com.thinking.machines.util;

import java.io.*;

public class Keyboard
{
    private BufferedReader bufferedReader;

    public Keyboard()
    {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getString()
    {
        String str;
        
        try
        {
            str = bufferedReader.readLine();
        }
        catch(IOException ioe)
        {
            str = "";
        }
        return str;
    }
    public String getString(String message)
    {
        System.out.print(message);
        return getString();
    }

    public char getCharacter()
    {
        return this.getString().charAt(0);
    }
    public char getCharacter(String message)
    {
        System.out.print(message);
        return getCharacter();
    }

    public long getLong()
    {
        long num;
        
        try
        {
            num = Long.parseLong(getString());
        }
        catch (NumberFormatException ne)
        {
            num = 0;
        }
        return num;
    }
    public long getLong(String message)
    {
        System.out.print(message);
        return this.getLong();
    }

    public double getDouble()
    {
        double num;
        
        try
        {
            num = Double.parseDouble(getString());
        }
        catch (NumberFormatException ne)
        {
            num = 0.0;
        }
        return num;
    }
    public double getDouble(String message)
    {
        System.out.print(message);
        return this.getDouble();
    }    

    public int getInt()
    {
        int x;
        try
        {
            x = Integer.parseInt(getString());        
        }
        catch (NumberFormatException nm)
        {
            x = 0;
        }
        return x;
    }
    public int getInt(String message)
    {
        System.out.print(message);
        return this.getInt();
    }

    public short getShort()
    {
        short x;
        try
        {
            x = Short.parseShort(getString());        
        }
        catch (NumberFormatException nm)
        {
            x = 0;
        }
        return x;
    }
    public short getShort(String message)
    {
        System.out.print(message);
        return this.getShort();
    }

    public byte getByte()
    {
        byte x;
        try
        {
            x = Byte.parseByte(getString());        
        }
        catch (NumberFormatException nm)
        {
            x = 0;
        }
        return x;
    }
    public byte getByte(String message)
    {
        System.out.print(message);
        return this.getByte();
    }

    public float getFloat()
    {
        float x;
        try
        {
            x = Float.parseFloat(getString());        
        }
        catch (NumberFormatException nm)
        {
            x = 0;
        }
        return x;
    }
    public float getFloat(String message)
    {
        System.out.print(message);
        return this.getFloat();
    }

    public boolean getBoolean()
    {
        boolean x;
        try
        {
            x = Boolean.parseBoolean(getString());        
        }
        catch (NumberFormatException nm)
        {
            x = false;
        }
        return x;
    }
    public boolean getBoolean(String message)
    {
        System.out.print(message);
        return this.getBoolean();
    }
}