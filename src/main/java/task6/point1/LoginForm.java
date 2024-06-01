package task6.point1;

class LoginForm {

    private static Boolean verifyLogin(String login) throws WrongLoginException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Incorrect login entered (Password length is more than 20 characters)");
        }
        if (login.contains(" ")) {
            throw new WrongLoginException("Incorrect login entered (Contains a space character)");
        }
        return true;
    }

    private static Boolean verifyPassword(
            String password,
            String confirmPassword
    ) throws WrongPasswordException {
        if (password.length() >= 20) {
            throw new WrongPasswordException("Incorrect password entered (Password length is more than 20 characters)");
        }
        if (password.contains(" ")) {
            throw new WrongPasswordException("Incorrect password entered (Contains a space character)");
        }
        if (!password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Incorrect password entered (Password must contain at least one number)");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("The entered passwords do not match");
        }
        return true;
    }

    public static Boolean loginToAccount(
            String login,
            String password,
            String confirmPassword
    ) {
        try {
            return verifyLogin(login) && verifyPassword(password, confirmPassword);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
