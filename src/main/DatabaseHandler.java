package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;

import com.google.gson.Gson;

import business.Data;
import business.Trainer;

public class DatabaseHandler {
	
	public Data data;
	
	public void initialize() {
		this.data = new Data();
		if(new File("BattleTree.json").exists()) {
			System.out.println("Attempting to populate Database");
			this.data = (Data) loadjson("BattleTree.json", this.data.getClass());
			System.out.println("Database Populated");
		}
		else {
			System.out.println("Cannot find file");
		}
	}
	
	
	public static <T> Object loadjson(String filename, Class<T> typeof){
		try {
			File myFile = new File(filename);
			FileInputStream in = new FileInputStream(myFile);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			StringBuilder build = new StringBuilder();
			String row = "";
			while((row = reader.readLine()) != null){
				build.append(row);
			}
			reader.close();
			
			return new Gson().fromJson(build.toString(), typeof);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<String> getTrainerNames(){
		ArrayList<String> names = new ArrayList<>();
		for(Trainer t : this.data.trainers) {
			names.add(t.name);
		}
		return names;
	}
}
