package net.unesc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

public class Utils {

    public static boolean validateRegex(String number) {
        Pattern compile = Pattern.compile("^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$");
        return compile.matcher(number).find();
    }

    public static String deformatNumero(String numero) {
        return numero.substring(1, 3).concat(numero.substring(5,10)).concat(numero.substring(11,15));
    }

    public static String formatNumero(String numero) {
        return "(" + numero.substring(0, 2) + ") " + numero.substring(2, 7) + "-" + numero.substring(7);
    }

    public static String montaRetorno(ResultSet resultSet) throws SQLException {
        StringBuilder sb = new StringBuilder();
        while (resultSet.next()) {
            sb.append(new Contato((String) resultSet.getObject(2), formatNumero((String) resultSet.getObject(3)))).append(",");
        }
        return sb.toString();
    }

}
