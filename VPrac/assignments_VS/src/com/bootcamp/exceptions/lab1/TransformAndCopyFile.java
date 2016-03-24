package com.bootcamp.exceptions.lab1;

/**
 * This program transform the file by delimiting some character's and placing them in another file
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TransformAndCopyFile {
	public static void main(String[] args) {

		String fileName = "D:\\MyProg.txt";
		String dirName = "D:\\Prog\\MyProg.txt";

		TransformAndCopyFile tacf = new TransformAndCopyFile();

		tacf.transformAndCopy(fileName, dirName);

	}

	public void transformAndCopy(String fileName, String dirName) {

		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader(fileName);

			BufferedReader br = new BufferedReader(in);
			String line = br.readLine();
			String[] output = line.split("/| ");

			out = new FileWriter(dirName);

			for (int i = 0; i < output.length; i++) {
				out.write(output[i]);
			}
			System.out.println("The file has been Transformed");
			System.out.println("please check the location and file" + dirName);
		}

		catch (FileNotFoundException e) {
			System.out.println("File not found please provide proper location");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oops!!! some thing seems to be wrong with the code");
			e.printStackTrace();
		}

		finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
