package de.ostfalia.gdp.ws23.s2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.in;
	public class BuecherWurm {
			public static void main(String[] args) throws IOException {
				Scanner scanner = new Scanner(in);
				System.out.println("Welche Datei?");
				String fileName = scanner.next();
				
				System.out.println("Welches Wort?");
				int n = scanner.nextInt();
			
				FileReader reader = new FileReader(fileName);
				BufferedReader inBuffer = new BufferedReader(reader);
				StringBuilder builder = new StringBuilder();

				
				String line = inBuffer.readLine();
			

				int spaceCounter = 0;
				int lineCounter = 1;
				boolean spaceFound = false;
				
			
				


				while (line != null) {
					builder.append("L" + lineCounter + " = "); //Linien fuer Ausgabe werden gezaehlt
					
					for(int i = 0; i < line.length(); i++) {//
						if(line.charAt(i) == ' ' || line.charAt(i) == '\t') { 
							if(!spaceFound) { //Zaehlt Space und Tabulatoren
								spaceCounter++;
								spaceFound = true;
							}
							
						}else {
							spaceFound = false; //Wenn keine Leerzeichen
						}
						if(spaceCounter %n == n-1 && line.charAt(i) != ' ') { //Wenn spaceCounter vielfaches von n ist
								builder.append('#'); //und chatAt I kein Leerzeichen ist werden buchstaben ausgegraut
							
						}else {
							builder.append(line.charAt(i)); //ansonsten werden Buchstaben ganz normal angefuegt
						}
						
					}

					builder.append("\n"); // Neue Zeile 
					
					line = inBuffer.readLine(); //neue Zeile wird eingelesen
					
				
					lineCounter++;
					if(!spaceFound) {
						spaceCounter++;
					}
					
				}
						
				String ausgabe = builder.toString();
				System.out.println("Eingabe = " + fileName + " " +  n);
				System.out.println(ausgabe);
				
				
				scanner.close();
				inBuffer.close();
			}
	}
