import java.io.*;
class MyUtama
{
	public static void main(String [] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input file name: ");
		String namafail = br.readLine();
		FileApi fileapi = new FileApi(namafail);

		if(fileapi.fileExists())
			{
				System.out.println("File Exists!");
				System.out.println(fileapi.readFile());
			}
		else
			{
				System.out.println("File does not exist!\n");
			
				
				System.out.println(" "+namafail+ " has been created");

				System.out.println("\n Insert text to be saved into file:");
				String content = br.readLine();
				fileapi.writeFile(content);
				//System.out.println("\n The text above is save into file "+namafail+".txt");
		}
	}

}

