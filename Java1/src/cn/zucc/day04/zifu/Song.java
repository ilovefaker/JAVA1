package cn.zucc.day04.zifu;
import java.util.Scanner;
public class Song {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] song=new String[1000];
		
		String songdemo="长亭外 古道边 芳草碧连天 晚风吹啊吹";
		song=songdemo.split(" ");
		
		
		for(int i=0;i<song.length;i++){
			
			System.out.println(song[i]);
			
		}
		
		
		
	}

}
