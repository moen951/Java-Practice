import java.io.*;
class FileApi extends File
{
	//String path = "E:/Window Document/github/Java-Practice/Eclipse/src/";
	FileWriter fw;
	FileReader fr;
	
	File file;
	FileApi(String s)
	{
		super(s);
		file = new File(s+".txt");
	}

	boolean fileExists()
	{
				
			if(file.exists())
				return true;
			else
				return false;
		
	}
	/**
	This method is used to create a new file in the 
      current directory

*/
void createFile() throws IOException
{
		fw = new FileWriter(file);
		fw.close();
}

/**
	This method is used to write text into file
	
*/
void writeFile(String s)
{
	try
	{
		fw = new FileWriter(file);
		fw.write(s);
		fw.close();
		
		
	}catch(IOException asdf){
		asdf.printStackTrace();
	}
}
/**
	This method is used to read text from file
		
*/
String readFile() throws Exception
{
	fr= new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	String data;
	while((data = br.readLine()) == null)
	{
		System.out.println(data);
	
	}
	fr.close();
	return data;
	
	/*
	This method should be able to read the content of  existing text file and return all the text as string
	*/		

}
}

