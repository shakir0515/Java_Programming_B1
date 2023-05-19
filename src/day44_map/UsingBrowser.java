package day44_map;

public class UsingBrowser {
    public static void main(String[] args) {

        Browser browser = Browser.CHROME;


        switch (browser) {
            case EDGE:
                System.out.println("Opening Edge browser");
                break;

            case CHROME:
                System.out.println("Opening Chrome browser");
                break;

            case SAFARI:
                System.out.println("Opening Safari browser");
                break;

            case FIREFOX:
                System.out.println("Opening Firefox browser");
                break;
        }


    }
    }
