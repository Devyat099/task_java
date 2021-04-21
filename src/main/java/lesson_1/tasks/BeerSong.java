package lesson_1.tasks;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 9;
        String word = "бутылок (бутылки)";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка";
            }
            System.out.println(beerNum + " " + word + " пива на стене1");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу");
            beerNum -= 1;
            if (beerNum == 1) {
            System.out.println(beerNum + " " + word + " пива на стене2");
            }
            }
        }
    }
