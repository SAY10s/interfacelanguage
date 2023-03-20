public class Main {
    static public void greetings(Language arg1, Language ...args){
        arg1.sayGreetings();
        for (int i = 0; i<args.length; i++){
            System.out.println(args[i].sayGreetings());

        }
    }



    public static void main(String[] args) {
        Polish polski = new Polish();
        English angielski = new English();
        German niemiecki = new German();
        Lolcat lolcat = new Lolcat();

        greetings(polski, angielski, niemiecki, lolcat);
    }
}