package com.company.ice_creame_shop;

import com.company.ice_creame_shop.exception.ExceptionInput;
import com.company.ice_creame_shop.select_type.BoxIceCreameType;
import com.company.ice_creame_shop.select_type.IceCreameType;
import com.company.ice_creame_shop.select_type.ToppingType;

import java.util.Random;
import java.util.Scanner;

public class IceCreamShop {
    private Scanner scn = new Scanner(System.in);
    private Random rnd = new Random();


    public void shopIceCreame() throws ExceptionInput {
        boolean startMenu = true;
        while (startMenu) {
            try {
                System.out.println("Для покупки мороженного выберите из списка раздел\n" +
                        "1. Стандарное мороженное\n" +
                        "2. Мороженное сюрприз\n" +
                        "3. Мороженное Экстра\n" +
                        "4. Выход\n");
                int input = scn.nextInt();

                switch (input) {
                    case 1:
                        standartIceCreame();
                        startMenu = false;
                        break;
                    case 2:
                        surpriseIceCream();
                        startMenu = false;
                        break;
                    case 3:
                        extraIceCreame();
                        startMenu = false;
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

    private void selectBoxIceCreame(IceCreameAbstract iceCreameAbstract) {
        boolean loop = true;
        while (loop) {
            System.out.println("Выберите из списка стаканчик\n" +
                    "1. Стаканчик\n" +
                    "2. Рожок\n" +
                    "3. Выход");
            int input = scn.nextInt();
            switch (input) {
                case 1:
                    iceCreameAbstract.addBoxIceCreamType(BoxIceCreameType.CUP);
                    iceCreameAbstract.fullPrice();
                    System.out.println(iceCreameAbstract.fullPrice());
                    loop = false;
                    break;
                case 2:
                    iceCreameAbstract.addBoxIceCreamType(BoxIceCreameType.HORN);
                    loop = false;
                    break;
                default:
                    System.out.println("Выбран вариант не из списка");
                    break;
            }
        }
    }

    private void selectIceCreameType(IceCreameAbstract iceCreameAbstract) {
        boolean loop = true;
        while (loop) {
            System.out.println("Выберите из списка мороженное\n" +
                    "1. Шоколодное\n" +
                    "2. Клубничное\n" +
                    "3. Банановое\n" +
                    "4. Вишневое\n" +
                    "5. Выход");
            int input = scn.nextInt();
            switch (input) {
                case 1:
                    iceCreameAbstract.addIceCreameType(IceCreameType.CHOCOLATE);

                    loop = false;
                    break;
                case 2:
                    iceCreameAbstract.addIceCreameType(IceCreameType.STRAWBERRY);
                    loop = false;
                    break;
                case 3:
                    iceCreameAbstract.addIceCreameType(IceCreameType.BANANA);
                    loop = false;
                    break;
                case 4:
                    iceCreameAbstract.addIceCreameType(IceCreameType.CHERRY);
                    loop = false;
                    break;
                case 5:
                    loop = false;

                default:
                    System.out.println("Выбран вариант не из списка");
                    break;
            }
        }
    }
    private  void selectToppintType(IceCreameAbstract iceCreameAbstract){
        boolean loop = true;
        while (loop) {

            if (iceCreameAbstract.getTopping() < 4) {
                int input;
                System.out.println("Выберите из списка топпинг, не более 4-х\n" +
                        "1. Шоколадный\n" +
                        "2. Ореховый\n" +
                        "3. Фруктовый\n" +
                        "4. Сироп\n" +
                        "5. Выход\n");
                input = scn.nextInt();
                switch (input) {
                    case 1:
                        iceCreameAbstract.addTopping(ToppingType.CHOKOLATE);
                        break;
                    case 2:
                        iceCreameAbstract.addTopping(ToppingType.NUT);
                        break;
                    case 3:
                        iceCreameAbstract.addTopping(ToppingType.FRUIT);
                        break;
                    case 4:
                        iceCreameAbstract.addTopping(ToppingType.SYRUP);
                        break;
                    case 5:
                        loop = false;
                        break;
                    default:
                        System.out.println("Выбран вариант не из списка");
                        break;
                }

            } else {
                System.out.println("Уже больше 4-х топпингов");
                loop = false;
            }
        }
    }

    private void standartIceCreame() {
        StandartIceCreame standartIceCreame = new StandartIceCreame();
        standartIceCreame.addBoxIceCreamType(BoxIceCreameType.values()[rnd.nextInt(2)]);
        selectIceCreameType(standartIceCreame);
        iceCreameInfo(standartIceCreame);


    }

    private void surpriseIceCream() {
        SurpriseIceCreame surpriseIceCreame = new SurpriseIceCreame();
        surpriseIceCreame.addBoxIceCreamType(BoxIceCreameType.values()[rnd.nextInt(2)]);
        surpriseIceCreame.addIceCreameType(IceCreameType.values()[rnd.nextInt(4)]);
        for (int i = 0; i < 2; i++) {
            surpriseIceCreame.addTopping(ToppingType.values()[rnd.nextInt(4)]);
        }
        iceCreameInfo(surpriseIceCreame);
    }
    private void extraIceCreame(){
        ExtraIceCreame extraIceCreame = new ExtraIceCreame();
        selectBoxIceCreame(extraIceCreame);
        selectIceCreameType(extraIceCreame);
        selectToppintType(extraIceCreame);
        iceCreameInfo(extraIceCreame);
    }

    private void iceCreameInfo(IceCreameAbstract iceCreameAbstract) {
        String box = iceCreameAbstract.getBoxIceCreameType();
        String creameType = iceCreameAbstract.getIceCreameType();
        String topping = iceCreameAbstract.toString();
        System.out.println("Информация о мороженном\n");
        if (box != null) {
            System.out.println("Стаканчик " + box);
        }
        if (creameType != null) {
            System.out.println("Тип мороженного " + creameType);
        }
        if (iceCreameAbstract.getTopping() != 0) {
            System.out.println(topping);
        }
        System.out.println("Стоимость мороженного " + iceCreameAbstract.fullPrice() + " руб.");
    }
}

