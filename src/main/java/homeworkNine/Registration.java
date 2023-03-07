package homeworkNine;

import homeworkNine.exceptions.WrongLoginException;
import homeworkNine.exceptions.WrongPasswordException;
import org.apache.commons.lang3.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
������� �����, � ������� ����� ����������� �����.
���� ����� ��������� �� ���� ��� ���������:
Login,
Password,
confirmPassword.
��� ���� ����� ��� ������ String.
����� login ������ ���� ������ 20 �������� � �� ������ ���������
�������.
���� login �� ������������� ���� �����������, ���������� ���������
WrongLoginException.
����� password ������ ���� ������ 20 ��������, �� ������ ���������
������� � ������ ��������� ���� �� ���� �����.
����� password � confirmPassword ������ ���� �����.
���� password �� ������������� ���� �����������, ����������
��������� WrongPasswordException.
����� ���������� true, ���� �������� ����� ��� false � ������ ������.
 */
public class Registration {

    public static boolean check(String login, String password, String confirmPassword) {
        if (!checkLogin(login)) {
            try {
                throw new WrongLoginException("WrongLoginException!");
            } catch (WrongLoginException e) {
                e.printStackTrace();
                System.out.println(false);
                return false;
            }
        } else if (!checkPassword(password, confirmPassword)) {
            try {
                throw new WrongPasswordException("WrongPasswordException!");
            } catch (WrongPasswordException e) {
                e.printStackTrace();
                System.out.println(false);
                return false;
            }
        }
            System.out.println(true);
            return true;
    }

    private static boolean checkPassword(String password, String confirmPassword) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(password);
        if (!(password.equals(confirmPassword))) {
            return false;
        } else if (password.length() == 0 || password.length() >= 20) {
            return false;
        } else if (StringUtils.countMatches(password, " ") > 0) {
            return false;
        } else return matcher.find();
    }

    private static boolean checkLogin(String login) {
        if (login.length() == 0 || login.length() >= 20) {
            return false;
        } else if (StringUtils.countMatches(login, " ") > 0) {
            return false;
        } else return true;
    }
}
