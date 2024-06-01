package task6.point1;

class Runner {

    public static void main(String[] args) {

        // Correct
        System.out.println(
                LoginForm.loginToAccount(
                        "Correct_Login123",
                        "c0rrectPassword",
                        "c0rrectPassword"
                )
        );

        // Incorrect login (space)
        System.out.println(
                LoginForm.loginToAccount(
                        "Incorrect Login123",
                        "c0rrectPassword",
                        "c0rrectPassword"
                )
        );

        // Incorrect login length
        System.out.println(
                LoginForm.loginToAccount(
                        "Incorrect_Login12345678901234567",
                        "c0rrectPassword",
                        "c0rrectPassword"
                )
        );

        // Incorrect password without numbers
        System.out.println(
                LoginForm.loginToAccount(
                        "Correct_Login123",
                        "IncorrectPassword",
                        "IncorrectPassword"
                )
        );

        // Incorrect password (space)
        System.out.println(
                LoginForm.loginToAccount(
                        "Correct_Login123",
                        "Inc0rrect Password",
                        "Inc0rrect Password"
                )
        );

        // Incorrect password length
        System.out.println(
                LoginForm.loginToAccount(
                        "Correct_Login123",
                        "IncorrectPassword12345678901234567",
                        "IncorrectPassword12345678901234567"
                )
        );

        // Incorrect confirmPassword
        System.out.println(
                LoginForm.loginToAccount(
                        "Correct_Login123",
                        "c0rrectPassword",
                        "Incorrect_Password"
                )
        );
    }
}
