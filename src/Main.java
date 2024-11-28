import entities.Champion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        int initialLife, attack, armor, turnAmount;
        Champion firstChampion = null, secondChampion = null;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.printf("Digite os dados do º%d campeão\n", i);
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Vida inicial: ");
            initialLife = sc.nextInt();
            sc.nextLine();
            System.out.print("Ataque: ");
            attack = sc.nextInt();
            sc.nextLine();
            System.out.print("Armadura: ");
            armor = sc.nextInt();
            sc.nextLine();

            if (i == 1) {
                 firstChampion = new Champion(name, initialLife, attack, armor);
            } else {
                 secondChampion = new Champion(name, initialLife, attack, armor);
            }

        }

        System.out.println("\nQuantos turnos você deseja executar? ");
        turnAmount = sc.nextInt();

        for (int i = 1; i <= turnAmount; i++) {
            firstChampion.takeDamage(secondChampion);
            secondChampion.takeDamage(firstChampion);

            System.out.printf("\nResultado do turno %d:\n", i);

            System.out.println(firstChampion.status());
            System.out.println(secondChampion.status());

            if (firstChampion.getLife() == 0 || secondChampion.getLife() == 0) {
                break;
            }
        }

        System.out.print("\nFIM DO COMBATE");

        sc.close();
    }
}