//2. Дана строка json:
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет]

package hWTwo.task;

public class HWTwoTask2 {
    public static void main(String[] array) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, " +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] records = json.replaceAll("[{}\\[\\]]", "")
                .replaceAll("\"", "")
                .split(",");

        StringBuilder sb = new StringBuilder();
        for (String record : records) {
            String[] fields = record.split(":");
            String key = fields[0].trim();
            String value = fields[1].trim();
            if (key.equals("фамилия")) {
                sb.append("Студент ").append(value).append(" получил ");
            } else if (key.equals("оценка")) {
                sb.append(value).append(" по предмету ");
            } else if (key.equals("предмет")) {
                sb.append(value).append(".").append(System.lineSeparator());
            }
        }
        System.out.print(sb.toString());
    }
}
