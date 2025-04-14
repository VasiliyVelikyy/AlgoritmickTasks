package easy.binary;

//67. Add Binary
/*Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/
public class AddBinary {


    //Other solution
    //Runtime 1 ms Beats 99.64%
    //Memory 42.14 MB Beats 81.55%
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int remainder = 0;
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;

        while (indexA >= 0 || indexB >= 0 || remainder == 1) {
            if (indexA >= 0) {
                remainder += a.charAt(indexA--) - '0';
            }
            if (indexB >= 0) {
                remainder += b.charAt(indexB--) - '0';
            }
            sb.append(remainder % 2);
            remainder /= 2;
        }
        return sb.reverse().toString();

    }


    //my Solution
    //Runtime 3 мс Beats 29,56%
    //Memory 44.96MB Beats 5.77%
//    public String addBinary(String a, String b) {
//        int maxLenght = a.length() > b.length() ? a.length() : b.length();
//
//        String temp = "0";
//        int size1 = maxLenght - a.length();
//        for (int i = 0; i < size1; i++) {
//            a = temp.concat(a);
//
//        }
//        int size2 = maxLenght - b.length();
//        for (int i = 0; i < size2; i++) {
//            b = temp.concat(b);
//
//        }
//
//        String sb = "";
//        int remember = 0;
//        for (int i = maxLenght - 1; i >= 0; i--) {
//            char first = a.charAt(i);
//            int second = b.charAt(i);
//
//            if ((first == '0' && second == '1' || first == '1' && second == '0') && remember > 0) {
//                sb = "0".concat(sb);
//            } else if ((first == '0' || second == '0') && remember > 0) {
//                remember = 0;
//                sb = "1".concat(sb);
//            } else if ((first == '0' && second == '1' || first == '1' && second == '0')) {
//                sb = "1".concat(sb);
//            } else if ((first == '1' && second == '1') && remember > 0) {
//                sb = "1".concat(sb);
//                remember++;
//            } else if ((first == '1' && second == '1') || remember > 0) {
//                sb = "0".concat(sb);
//                remember++;
//            } else if ((first == '0' || second == '0') && remember == 0) {
//                remember = 0;
//                sb = "0".concat(sb);
//            }
//        }
//        if (remember != 0) return "1".concat(sb);
//
//        return sb;
//    }
    //Runtime 1 мс Beats 100,00%
    //Memory 41,25 МБ Beats 58,94%
//    public String addBinary(String a, String b) {
//        StringBuilder res = new StringBuilder();
//        int i = a.length() - 1; // we crete i pointer for string a and we have to start adding from right to left
//        int j = b.length() - 1; // similar pointer j for string b
//        int carry = 0;
//        while (i >= 0 || j >= 0) {
//            int sum = carry;
//
//            /// Теперь мы вычитаем «0», чтобы преобразовать числа из типа char в int, чтобы мы могли выполнять операции с числами
//            if (i >= 0) sum += a.charAt(i--) - '0';
//            if (j >= 0) sum += b.charAt(j--) - '0';
//
//            carry = sum > 1 ? 1 : 0;
//            //получение переноса зависит от частного, которое мы получим при делении суммы / 2, которое будет нашим переносом. Керри может быть либо 1, либо 0.
//            // если сумма равна 0, res равна 1, и тогда перенос будет равен 0;
//            //            // если сумма равна 1, разрешение равно 1, а перенос будет равен 0
//            //            // если сумма равна 2, разрешение равно 0, а перенос будет равен 1
//            //            // если сумма равна 3, разрешение равно 1, а перенос будет равен 1
//            res.append(sum % 2);
//            // просто модулируем сумму, чтобы мы могли получить остаток и добавить его в наш результат
//        }
//        if (carry != 0) res.append(carry); // мы будем добавлять его в res, пока значение переноса не станет равным 0
//        return res.reverse().toString();
//    }
}

