package packageEscola;

import java.util.ArrayList;

public class Log {
    static ArrayList<String> logs = new ArrayList<>();

    static void setLog(String log) {
        logs.add(log); 
    }

    static void showLog() {
        for (String log : logs) {
            System.out.println(log); 
        }
    }
}
