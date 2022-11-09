import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //task2
        System.out.println(fullName.toUpperCase());

        //task 3
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName.replace(" ", "; "));

        //task 4
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName1.replace('ё', 'е'));

        //task 5
        String fullName2 = "Ivanov Ivan Ivanovich";
        String firstName1 = "";
        String middleName1 = "";
        String lastName1 = "";
        lastName1 = fullName2.substring(0, fullName2.indexOf(' '));
        firstName1 = fullName2.substring(fullName2.indexOf(' ') + 1, fullName2.lastIndexOf(' '));
        middleName1 = fullName2.substring(fullName2.lastIndexOf(' ') + 1);
        System.out.println("Имя сотрудника — " + firstName1);
        System.out.println("Фамилия сотрудника —  " + lastName1);
        System.out.println("Отчество сотрудника — " + middleName1);

        //task 6
        String fullName3 = "ivanov ivan ivanovich";
        char[] arrayCharFullName = fullName3.toCharArray();
        String lastName2 = fullName2.substring(0, fullName2.indexOf(' '));
        String firstName2 = fullName2.substring(fullName2.indexOf(' ') + 1, fullName2.lastIndexOf(' '));
        String middleName2 = fullName2.substring(fullName2.lastIndexOf(' ') + 1);
        String result = "Верное написание Ф. И. О. сотрудника с заглавных букв — " +
                replaceFirstLetterCase(lastName2.toCharArray()) + " " +
                replaceFirstLetterCase(firstName2.toCharArray()) + " " +
                replaceFirstLetterCase(middleName2.toCharArray());
        System.out.println(result);

        //task 7
        String str1 = "135";
        String str2 = "246";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        System.out.println("Данные строки — " + sb);

        //task 8
        String str = "aabccddefgghiijjkk";
        char[] arrayChars = str.toCharArray();
        String resultStr = "";
        for (int i = 0; ; i++) {
            if (i == arrayChars.length - 1) break;
            if (arrayChars[i] == arrayChars[i + 1]) {
                resultStr = resultStr + arrayChars[i];
            }
        }
        System.out.println(resultStr);
    }

    //task 6
    public static String replaceFirstLetterCase(char[] c) {
        char[] modifiedArray = c;
        modifiedArray[0] = Character.toUpperCase(c[0]);
        String modifiedStr = "";
        for (char s : modifiedArray) {
            modifiedStr = modifiedStr + s;
        }
        return modifiedStr;
    }


}