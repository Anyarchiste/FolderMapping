/* Takes the rawOutput file and creates a .csv file usable in excel
    Copyright (C) 2023  Anyarchiste

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>. */


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class parser {
    public static void main(String[] args) throws Exception
    {
        File file = new File("C:\\Users\\prive\\Documents\\FolderMapping\\test\\rawOutput.txt");
        Scanner sc = new Scanner(file);
        String clean = "";
        
        while (sc.hasNextLine()){
            String urgh = sc.nextLine();
            String ret = eraseUnwantedChar(urgh);
            if (ret != "Wrong") {
                clean += ret + "\n";
            }
        }

        FileWriter finalCSV = new FileWriter("C:\\Users\\prive\\Documents\\FolderMapping\\test\\finalOutput.txt");
        finalCSV.write(clean);
        finalCSV.close();
        sc.close();
    }

    public static String eraseUnwantedChar(String line) {
        String toParse = String.valueOf(line);
        String r = "";

        if (toParse.contains(".mkv") || toParse.contains(".mov") || toParse.contains(".mpg") || toParse.contains(".mp4") || toParse.contains(".iso") || toParse.contains(".avi")) {
            String almost = toParse.substring(50, toParse.length());
            String f = almost.replace(" ", "");
            r = f.substring(0, f.length() - 4);
        } else {
            r = "Wrong";
        }
        return r;
    }
}
