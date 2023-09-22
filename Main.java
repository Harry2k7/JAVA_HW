import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var laptops = GenerateSetLaptops();
        Menu(laptops);
    }

    public static void Menu(HashSet<Laptop> laptops) {
        try (Scanner scan = new Scanner(System.in, "cp866")) {
            int input = 0;
            while (input != 7) {
                System.out.print(
                        "Выберите параметр поиска ноутбука:\n [1] - по объему ОЗУ\n [2] - по объему SSD\n [3] - по операционной системе\n [4] - по цвету\n [5] - по диагонали\n [6] - по цене\n [7] - Выход\n ---> ");
                input = Integer.valueOf(scan.nextLine());
                switch (input) {
                    case 1:
                        SearchRAM(laptops);
                        break;
                    case 2:
                        SearchSSD(laptops);
                        break;
                    case 3:
                        SearchOS(laptops);
                        break;
                    case 4:
                        SearchColor(laptops);
                        break;
                    case 5:
                        SearchDiagonal(laptops);
                        break;
                    case 6:
                        SearchPrice(laptops);
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Выбирай правильные варианты.");
                        break;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static HashSet<Laptop> GenerateSetLaptops() {
        Laptop laptop1 = new Laptop("ASUS", "Vivobook Pro", "Windows 11");
        laptop1.setColor("серый");
        laptop1.setRAM(16);
        laptop1.setSSD(512);
        laptop1.setDiagonal(16);
        laptop1.setPrice(99900.99);
        
        Laptop laptop2 = new Laptop("Lenovo", "IdealPad", "Linux", "серый", 16, 512, 16, 99900.5);
        Laptop laptop3 = new Laptop("HONOR", "MagicBook", "Windows 11","черный", 8, 512, 14, 59999.99);
        Laptop laptop4 = new Laptop("IRBIS", "NB121", "Windows 11","белый", 4, 640,  11, 16999.99);
        Laptop laptop5 = new Laptop("Apple", "MacBook Air", "iOS", "белый", 16, 512, 15, 126900.5);
        Laptop laptop6 = new Laptop("HUAWEI", "MateBook", "Linux", "серебристый", 16, 512, 16, 86900.99);

        var laptops = new HashSet<Laptop>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6));
        return laptops;
    }

    public static void SearchRAM(HashSet<Laptop> laptops) {
        Scanner scan = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Введите минимальный объем ОЗУ: ");
        input = Integer.valueOf(scan.nextLine());
        int count = 0;
        System.out.println("По вашему запросу надено:");
        for (Laptop laptop : laptops) {
            if (laptop.getRAM() >= input) {
                System.out.print(laptop);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("По вашему запросу ничего не найдено.");
        }
    }

    public static void SearchSSD(HashSet<Laptop> laptops) {
        Scanner scan = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Введите минимальный объем SSD: ");
        input = Integer.valueOf(scan.nextLine());
        int count = 0;
        System.out.println("По вашему запросу надено:");
        for (Laptop laptop : laptops) {
            if (laptop.getSSD() >= input) {
                System.out.print(laptop);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("По вашему запросу ничего не найдено.");
        }
    }

    public static void SearchOS(HashSet<Laptop> laptops) {
        Scanner scan = new Scanner(System.in, "cp866");
        int input = 0;
        System.out
                .println("Выберите операционную систему\n [1] - Windows\n [2] - Linux\n [3] - iOS\n ---> ");
        input = Integer.valueOf(scan.nextLine());
        switch (input) {
            case 1:
                System.out.println("По вашему запросу надено:");
                for (Laptop laptop : laptops) {
                    if (laptop.getOs().equals("Windows 11")) {
                        System.out.print(laptop);
                    }
                }
                break;
            case 2:
                System.out.println("По вашему запросу надено:");
                for (Laptop laptop : laptops) {
                    if (laptop.getOs().equals("Linux")) {
                        System.out.print(laptop);
                    }
                }
                break;
            case 3:
                System.out.println("По вашему запросу надено:");
                for (Laptop laptop : laptops) {
                    if (laptop.getOs().equals("iOS")) {
                        System.out.print(laptop);
                    }
                }
                break;
            default:
                System.out.println("Неверный вариант.");
                break;
        }
    }

    public static void SearchColor(HashSet<Laptop> laptops) {
        Scanner scan = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println(
                        "Выберите желаемый цвет:\n [1] - Белый\n [2] - Черный\n [3] - Серебристый\n [4] - Серый\n ---> ");
        input = Integer.valueOf(scan.nextLine());
        switch (input) {
            case 1:
                System.out.println("По вашему запросу надено:");
                for (Laptop laptop : laptops) {
                    if (laptop.getColor().equals("белый")) {
                        System.out.print(laptop);
                    }
                }
                break;
            case 2:
                System.out.println("По вашему запросу надено:");
                for (Laptop laptop : laptops) {
                    if (laptop.getColor().equals("черный")) {
                        System.out.print(laptop);
                    }
                }
                break;
            case 3:
                System.out.println("По вашему запросу надено:");
                for (Laptop laptop : laptops) {
                    if (laptop.getColor().equals("серебристый")) {
                        System.out.print(laptop);
                    }
                }
                break;
            case 4:
                System.out.println("По вашему запросу надено:");
                for (Laptop laptop : laptops) {
                    if (laptop.getColor().equals("серый")) {
                        System.out.print(laptop);
                    }
                }
                break;
            default:
                System.out.println("Неверный вариант.");
                break;
        }
    }

    public static void SearchDiagonal(HashSet<Laptop> laptops) {
        Scanner scan = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Введите минимальный размер диагонали: ");
        input = Integer.valueOf(scan.nextLine());
        int count = 0;
        System.out.println("По вашему запросу надено:");
        for (Laptop laptop : laptops) {
            if (laptop.getDiagonal() >= input) {
                System.out.print(laptop);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("По вашему запросу ничего не найдено.");
        }
    }

    public static void SearchPrice(HashSet<Laptop> laptops) {
        Scanner scan = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Введите максимальную цену: ");
        input = Integer.valueOf(scan.nextLine());
        int count = 0;
        System.out.println("По вашему запросу надено:");
        for (Laptop laptop : laptops) {
            if (laptop.getPrice() <= input) {
                System.out.print(laptop);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("По вашему запросу ничего не найдено.");
        }
    }
}
