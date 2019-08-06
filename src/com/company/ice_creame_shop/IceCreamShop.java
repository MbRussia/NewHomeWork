package com.company.ice_creame_shop;

import com.company.ice_creame_shop.exception.ExceptionInput;
import com.company.ice_creame_shop.select_type.BoxIceCreameType;

import java.util.Scanner;

public class IceCreamShop {
    private Scanner scn = new Scanner(System.in);
    private boolean startMenu = true;

    public void shopIceCreame() throws ExceptionInput {

        while (startMenu) {
            try {
                System.out.println("Для покупки мороженного выберите из списка раздел\n" +
                        "1. Ствндарное мороженное\n" +
                        "2. Мороженное сюрприз\n" +
                        "3. Мороженное Экстра\n" +
                        "4. Выход\n");
                int input = scn.nextInt();

                switch (input) {
                    case 1:
                       shopIceCreame();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        startMenu = false;
                        break;

                    default:
                        System.out.println("Выбран варинт не из списка");
                        break;
                }
            } catch (Throwable e) {
                throw new ExceptionInput();
            }

        }

    }
    private void standartIceCreame(){
        StandartIceCreame standartIceCreame = new StandartIceCreame();
        System.out.println();
        for (int i = 0; i < standartIceCreame ; i++) {

        }

    }
}
