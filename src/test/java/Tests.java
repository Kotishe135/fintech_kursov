import org.junit.Test;

public class Tests extends BaseTest{
    private static String login = "potap";
    private static String password = "qwerty";

    @Test
    public void fillFiled(){
        homePage.toRegister();
        registrPage.fillRegisterPage("Ivan", "Potapov", "+7(910)666-77-77",
                "potapov@gmail.com", "Lenina str., 9", "", "Ryazan",
                "Ryazan obl.", "390021", "RUSSIA", login, password, password);
        successRegistrPage.toSignOn();
        sign_inPage.signUp(login, password);
        sign_inPage.toFlights();
        flightsPage.findFlights(1, "3", "Portland", "July",
                "25", "Frankfurt", "August", "14", 2,
                "Unified Airlines");
        checkFlightPage.checkFlight(1, 2);
        String[] firstNames = {"Ivan", "Elena", "Dmitry"};
        String[] lastNames = {"Potapov", "Potapova", "Potapov"};
        String[] meals = {"", "Vegetarian", ""};
        bookAFlight.buyFlights(firstNames, lastNames, meals, "Visa", "1234 1234 1234 4213",
                "10", "2009", "Ivan", "Alexanrovich", "Potapov",
                "Lenina str., 9", "", "Ryazan", "Ryazan obl.", "390021",
                "RUSSIA");
    }

}
