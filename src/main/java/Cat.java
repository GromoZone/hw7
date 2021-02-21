    /*1. Расширить задачу про котов и тарелки с едой.

      2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды,
      а кот пытается покушать 15-20).

      3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать
      (хватило еды), сытость = true.

      4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
      (это сделано для упрощения логики программы).

      5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию
      о сытости котов в консоль.

      6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.*/

    public class Cat {

        private String name;
        private int appetite;       // поле аппетита
        private int hunger;         // поле голода
        private boolean satiety;    // поле сытости


        public Cat(String name, int appetite, int hunger, boolean satiety) {
            this.name = name;
            this.appetite = appetite;
            this.hunger = hunger;
            this.satiety = satiety;
        }

        public void catCondition () {
            if (satiety) {
                System.out.println(name + " сыт и есть не хочет.");
            } else {
                System.out.println(name + " ест " + appetite + " грамм еды и его голод составляет " + hunger + ". Скорее, ему нужно поесть!");
            }
        }

        public void eat(Plate plate) {
            plate.decreaseFood(appetite, name, satiety);
        }

        public int getAppetite() {
            return appetite;
        }
    }

