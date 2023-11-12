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
import java.util.Scanner;
public class parser {
    public static void main(String[] args) throws Exception
    {
        // pass the path to the file as a parameter
        File file = new File(
            "C:/Users/prive/Documents/FolderMapping/rawOutput.txt");
        Scanner sc = new Scanner(file);
 
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        
        sc.close();
    }

    public static String eraseUnwantedChar(Scanner line) {
        String r = "";

        return r;
    }
}
