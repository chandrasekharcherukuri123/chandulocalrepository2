package chandu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Soap
{
 public static void main(String[] args) throws IOException
 {

File f1=new File("D:\\soapdata.txt");
FileReader fr=new FileReader(f1);
BufferedReader br=new BufferedReader(fr);
//for results writing
File f2=new File("D:\\soapresults.txt");
FileWriter fw=new FileWriter(f2);
BufferedWriter bw=new BufferedWriter(fw);
 }
}
