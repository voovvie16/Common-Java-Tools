package com.thinking.machines.util;

import java.io.*;
import java.lang.reflect.*;

public class SetterGetterGenerator
{
    public static void main(String[] args)
    {
        if (args.length != 1 && args.length != 2)
        {
            System.out.println("Usage : java -classpath path_to_jar_file.file;. com.thinking.machines.util.SetterGetterGenerator class_name constructor=true/false");
            return;
        }

        if (args.length == 2)
        {
            if (args[1].equalsIgnoreCase("constructor=false") == false && args[1].equalsIgnoreCase("constructor=true") == false)
            {
                System.out.println("Usage : java -classpath path_to_jar_file.file;. com.thinking.machines.util.SetterGetterGenerator class_name constructor=true/false");
                return;
            }
        }

        String className = args[0];
        
        try
        {
            Class c = Class.forName(className);
            Field fields[] = c.getDeclaredFields();
            Field f;

            TMList<String> list = new TMArrayList<String>();

            String line;
            String fieldName;
            Class fieldType;

            line = "public " + c.getSimpleName() + "()";
            list.add(line);
            list.add("{");
            for (int e = 0; e < fields.length; e++)
            {
                f = fields[e];
                fieldName = f.getName();
                fieldType = f.getType();
                line = "this." + f.getName() + " = "+ getDefaultValue(fieldType.getName()) + ";";
                list.add(line);                
            }
            list.add("}");
            

            String setterName, getterName;

            for (int i = 0; i < fields.length; i++)
            {
                f = fields[i];

                fieldName = f.getName();
                fieldType = f.getType();

                String tmp;
                if (fieldName.charAt(0) >= 97 && fieldName.charAt(0) <= 122)
                {
                    tmp = fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
                }
                else tmp = fieldName;

                setterName = "set" + tmp;
                getterName = "get" + tmp;

                line = "public void " + setterName + "(" + fieldType.getName() + " " + fieldName + ")";
                list.add(line);
                list.add("{");
                line = "\t" + "this." + fieldName + " = " + fieldName + ";";
                list.add(line);
                list.add("}");

                line = "public " + fieldType.getName() + " " + getterName + "()";
                list.add(line);
                list.add("{");
                line = "\t" + "return this." + fieldName + ";"; 
                list.add(line);
                list.add("}");

                File file = new File("tmp.tmp");
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                TMIterator<String> iterator = list.iterator();
                
                while (iterator.hasNext())
                {
                    line = iterator.next();
                    raf.writeBytes(line + "\r\n");
                }
                raf.close();
            }

            System.out.println("Setter/Getter generated for given fields in file named as tmp.tmp"); 
        }
        catch(ClassNotFoundException c)
        {
            System.out.println("Class : " + c.getMessage() + " Not Found");
        }
        catch(IOException i)
        {
            System.out.println(i.getMessage());
        }
    }

    private static String getDefaultValue(String className)
    {
        if (className.equals("java.lang.Long") || className.equals("long"))
            return "0";
        if (className.equals("java.lang.Short") || className.equals("short"))
            return "0";
        if (className.equals("java.lang.Integer") || className.equals("int"))
            return "0";
        if (className.equals("java.lang.Byte") || className.equals("byte"))
            return "0";
        if (className.equals("java.lang.Double") || className.equals("double"))
            return "0.0";
        if (className.equals("java.lang.Float") || className.equals("float"))
            return "0.0f";
        if (className.equals("java.lang.Character") || className.equals("char"))
            return "' '";
        if (className.equals("java.lang.String"))
            return "\"\"";
        if (className.equals("java.lang.Boolean") || className.equals("boolean"))
            return "false";

        return null;
    }
}