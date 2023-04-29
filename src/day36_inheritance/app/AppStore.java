package day36_inheritance.app;

public class AppStore {
    public static void main(String[] args) {

        Instagram insta1 = new Instagram(3.4);
        Instagram insta2 = new Instagram(3.7);
        insta1.download();
        insta2.download();


        YouTube yt1 = new YouTube(5.7);
        YouTube yt2 = new YouTube(5.9);
        yt1.download();
        yt2.download();

    }
}