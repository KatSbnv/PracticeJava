package for_all_packages.lock_support.streamsLambda;

import java.util.List;
import java.util.stream.Collectors;

public class Selector {
    private static List<Owner> owners;

    private static void initData() {
        final Owner owner1 = new Owner("Олег Малашков");
        owner1.getPets().addAll(List.of(
                new Cat("Барон", Color.BLACK, 3),
                new Cat("Султан", Color.DARK_GREY, 4),
                new Dog("Эльза", Color.WHITE, 0)
        ));

        final Owner owner2 = new Owner("Дмитрий Васильков");
        owner2.getPets().addAll(List.of(
                new Cat("Рыжик", Color.FOXY, 7),
                new Cat("Барсик", Color.FOXY, 5),
                new Parrot("Адмирал", Color.BLUE, 3)
        ));

        final Owner owner3 = new Owner("Наталия Криж");
        owner3.getPets().addAll(List.of(
                new Dog("Арнольд", Color.FOXY, 3),
                new Pig("Пылесос", Color.LIGHT_GREY, 8)
        ));

        final Owner owner4 = new Owner("Павел Мурахов");
        owner4.getPets().addAll(List.of(
                new Snake("Удав", Color.DARK_GREY, 2)
        ));

        final Owner owner5 = new Owner("Антон Федоренко");
        owner5.getPets().addAll(List.of(
                new Cat("Фишер", Color.BLACK, 16),
                new Cat("Зорро", Color.FOXY, 14),
                new Cat("Марго", Color.WHITE, 3),
                new Cat("Забияка", Color.DARK_GREY, 1)
        ));

        owners = List.of(owner1, owner2, owner3, owner4, owner5);
    }

    public static void main(String[] args) {
        initData();


        //new way with streams, intermediate & terminal methods

        final List<String> findNames = owners.stream()
                .flatMap(owner -> owner.getPets().stream())       //переход от Stream<Owner> к Stream<Pet>
                .filter(pet -> Cat.class.equals(pet.getClass()))  //в потоке данных оставляем только котов
                .filter(cat -> Color.FOXY == cat.getColor())      //в потоке данных оставляем только рыжих
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())    //сортируем по возрасту в убывающем порядке
                .map(Animal::getName)                             //берем имена
                .collect(Collectors.toList());                    //результат складываем в список

        findNames.forEach(System.out::println);

        //old way of sorting

//        List<String> findNames = new ArrayList<>();
//        List<Cat> findCats = new ArrayList<>();
//        for (Owner owner : owners) {
//            for (Animal pet : owner.getPets()) {
//                if (Cat.class.equals(pet.getClass()) && Color.FOXY == pet.getColor()) {
//                    findCats.add((Cat) pet);
//                }
//            }
//        }
//
//        Collections.sort(findCats, new Comparator<Cat>() {
//            public int compare(Cat o1, Cat o2) {
//                return o2.getAge() - o1.getAge();
//            }
//        });
//
//        for (Cat cat : findCats) {
//            findNames.add(cat.getName());
//        }
//
//        findNames.forEach(System.out::println);
    }
}
