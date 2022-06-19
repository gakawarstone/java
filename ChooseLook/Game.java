package ChooseLook;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

import ChooseLook.types.Choose;

public class Game {
    private static Scanner console = new Scanner(System.in);

    private static Player player = new Player();

    public static void main(String[] args) {
        onStartUp();

        System.out.println("Легендарная программа почти на 70000 строчек");
        choosePlayerCharacteristics();
        System.out.println("\nПодведем итоги: ");
        printPlayerCharacteristics();

        onShutDown();
    }

    private static void onStartUp() {

    }

    private static void onShutDown() {
        console.close();
    }

    private static void choosePlayerCharacteristics() {
        for (Characteristics characteristic : Characteristics.values()) {
            Choose choose = new Choose(characteristic.name, characteristic.subjects);
            printChoosePossibleSubjects(choose);
            choose.setChosenSubject(getChosenSubjectFromConsole(choose));
            player.setCharacteristic(characteristic.name, choose.getChosenSubject());
        }
    }

    private static void printPlayerCharacteristics() {
        for (Characteristics characteristic : Characteristics.values()) {
            String playerCharacteristic = player.getCharacteristic(characteristic.name);
            System.out.printf("%s игрока - %s\n", characteristic.name, playerCharacteristic);
        }
    }

    private static String getChosenSubjectFromConsole(Choose choose) {
        System.out.print("Введите порядковый номер варианта: ");
        int chosenSerial = console.nextInt();
        try {
            return choose.subjects[chosenSerial - 1];
        } catch (Exception e) {
            return getChosenSubjectFromConsole(choose);
        }
    }

    private static void printChoosePossibleSubjects(Choose choose) {
        System.out.printf("\nВозможные варианты для %s: \n", choose.category);
        ListIterator<String> subjectsEnumerate = Arrays.asList(choose.subjects).listIterator();
        while (subjectsEnumerate.hasNext()) {
            System.out.println((subjectsEnumerate.nextIndex() + 1) + ". " + subjectsEnumerate.next());
        }
    }

}
