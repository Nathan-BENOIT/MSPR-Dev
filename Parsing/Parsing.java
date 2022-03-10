//import java.io.*;
package Parsing;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Parsing
{

    public static class globals {
        public static String staffList;
        public static String agentSheet;
    }

    public static ArrayList<String> listEmployes = new ArrayList<String>();

    public static ArrayList<String> StaffParsing() throws Exception {
        File file = new File("txt/staff.txt");
        FileReader staff = new FileReader(file);  
        BufferedReader read = new BufferedReader(staff);

        String line;
        listEmployes.clear();
        while ((line = read.readLine()) != null){
            listEmployes.add(line);
        }
        read.close();
        return listEmployes;
    }

    public static ArrayList<String> stuffLabel = new ArrayList<>();
    public static ArrayList<String> stuffCode = new ArrayList<>();

    public static void listeParsing() throws Exception {
        File file = new File("txt/liste.txt");
        FileReader stuff = new FileReader(file);

        BufferedReader read = new BufferedReader(stuff);

        String line;
        stuffLabel.clear();
        stuffCode.clear();
        while ((line = read.readLine()) != null){
            String[] tabl = line.split("    ");
            stuffCode.add(tabl[0]);
            stuffLabel.add(tabl[1]);
        }
        read.close();

        /*} catch (FileNotFoundException ex) {
            System.out.println("Oups ! Erreur : " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Execption sur le ready" + ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());;
            }
        }
        return null;*/
    }

    public static ArrayList<String> personalParsing(String nom) throws Exception {

        ArrayList<String> listAgent = new ArrayList<String>();

        File file = new File("txt/" + nom  + "/" + nom + ".txt");
        FileReader agent = new FileReader(file);
        BufferedReader read = new BufferedReader(agent);

        /*try (Scanner obj = new Scanner(read)) {
            info = obj.nextLine() + "\n";
            while (obj.hasNextLine()) {
                info = info + obj.nextLine() + "\n";
            }
        }*/

        String line;
        listAgent.clear();
        while ((line = read.readLine()) != null){
            listAgent.add(line);
        }

        read.close();
        return listAgent;
        //return info;
    }

    public static ArrayList<String> getInfo(String nom) throws Exception {
        ArrayList<String> listeAgent = personalParsing(nom);

        int index = 0;
        for(int i = 0; i < 4; i++){
            listeAgent.remove(index);
        }
        return listeAgent;
    }

    public static ArrayList<String> isChecked = new ArrayList<>();

    public static ArrayList<String> compareMatos(String nom) throws Exception {
        ArrayList<String> matosAgent = getInfo(nom);
        ArrayList<String> allMatos = stuffCode;
        String isStringChecked = "checked";

        isChecked.clear();
        for(int i = 0; i < allMatos.size(); i++){
            //for(int y = 0; y < allMatos.size(); y++) {
                if(matosAgent.contains(allMatos.get(i))){
                    isChecked.add(isStringChecked);
                } else {
                    isChecked.add("");
                }
            //}
        }
        return isChecked;
    }

        
}

