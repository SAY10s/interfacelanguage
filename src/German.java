public class German implements Language{
    @Override
    public String sayGoodbye() {
        return("Tschuss!");
    }

    @Override
    public String sayGreetings() {
        return ("Morgen!");
    }

    @Override
    public String sayThanks() {
        return ("Danke!");
    }
}
