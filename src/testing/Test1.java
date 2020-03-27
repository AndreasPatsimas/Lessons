package testing;

import sun.tools.jar.CommandLine;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Test1 {

    public static void main(String[] args) throws IOException {

        //int num = 456;
        //num  /= 10; // με 10 τρωει το τελευταιο ψηφιομ με 100μτα 2 τελευταια κ.ο.κ.
                /*means divide a by b and put the result in a.

                There are similar operators for addition, subtraction, and multiplication: +=, -= and *=.

                %= will do modulus.

                >>= and <<= will do bit shifting.*/

        //int res = num % 10; // % = υπολοιπο

        //System.out.println(res);
        //System.out.println(num);

        // https://paiza.io/en/projects/new?language=java

        //System.out.println(getType(LocalDate.parse("2018-01-01"), LocalDate.parse("2018-12-31")));

        //System.out.println(getNum("31ησςβνδωξκλ"));

//        LocalDate date = LocalDate.now();
//
//        String fordat = date.toString().replaceAll("-", "");
//        System.out.println(fordat);

//        File file = new File("//ICAP-FS-CL3FS1/Archiving/ABBY/Export/latest sample");
//        System.out.println(file.isDirectory() || file.isFile());
//        System.out.println(file.length());

        File file = makeDirectory();
        System.out.println(file.getName());

//        List<File> files = Arrays.asList(new File("//ICAP-FS-CL3FS1/Archiving/ABBY/Export/latest samples").listFiles());
//        //file.mkdir();
//        files.forEach(file -> System.out.println(file.getAbsolutePath()));

//        List<File> files = Arrays.asList(new File( "//" + "ICAP-FS-CL3FS1" + File.separator + "Archiving" +
//                File.separator + "ABBY" + File.separator + "Export" + File.separator + "latest samples").listFiles());

//        ProcessBuilder builder = new ProcessBuilder(
//                "cmd.exe", "/c", "Z: && cd \"\\ABBY\\Import\" && mkdir " + fordat);

//        ProcessBuilder builder = new ProcessBuilder(
//                "bash", "-c", "cd /ARCHIVING/ABBY/Import/ && mkdir " + fordat);
//        builder.redirectErrorStream(true);
//        Process p = builder.start();

//        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
//        String line;
//        while (true) {
//            line = r.readLine();
//            if (line == null) { break; }
//            System.out.println(line);
//        }
    }

    private static File makeDirectory(){

        File dir = new File("//ICAP-FS-CL3FS1/Archiving/ABBY/Export/" + getToday());

        if(dir.mkdir())
            System.out.println("Directory " + dir.getName());

        return dir;
    }

    private static String getToday(){

        LocalDate date = LocalDate.now();

        return date.toString().replaceAll("-", "");
    }

    private static Short getType(LocalDate from, LocalDate to){

        long diffInMonths = ChronoUnit.MONTHS.between(from,
                to.plusDays(1));

        if(diffInMonths == 12)
            return 0;

        else if(diffInMonths < 12)
            return 2;

        else
            return 1;
    }

    private static Integer getNum(String x){

        String num = x.replaceAll("[^0-9]", "");

        return num != null ? Integer.valueOf(num) : null;
    }

}
