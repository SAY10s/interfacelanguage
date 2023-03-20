public class Polish implements Language{
    @Override
    public String sayGoodbye() {
        return("Cześć!");
    }

    @Override
    public String sayGreetings() {
        return ("Dzień dobry!");
    }

    @Override
    public String sayThanks() {
        return ("Dziękuję!");
    }
}
