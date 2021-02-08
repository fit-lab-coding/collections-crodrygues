package fit.core;

import java.util.*;

public class AttendanceHelper {
        public static Map<String, Boolean> random(int qtde, int percent) {

                Map<String, Boolean> attendanceList = new HashMap<>() {{
                        put("Tiago", true);
                        put("Gabriela", false);
                }};

                List<Map.Entry<String, Boolean>> keys =
                        new ArrayList<Map.Entry<String, Boolean>>(attendanceList.entrySet());

                Random random = new Random();
                attendanceList.get(random.nextInt(keys.size()));

                for (Map.Entry<String, Boolean> entry : keys) {
                        System.out.println(keys.get(random.nextInt(keys.size())));
                }

                return attendanceList;

        }
}