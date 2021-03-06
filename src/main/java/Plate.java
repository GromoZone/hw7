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

    public class Plate {

    private int food;
    private int maxFood;

        public Plate (int food,int maxFood) {
            this.food = food;
            this.maxFood = maxFood;
    }

    public void info() {
        System.out.println("В тарелке " + food + " грамм еды");
    }

    public void decreaseFood(int n, String name, boolean satiety) {
        if (n > food) {
            System.out.println ("В тарелке меньше еды, чем хочет съесть " + name + "!");
        } else {
            food -= n;
            System.out.println (name + " благополучно поел. В тарелке осталось " + food + " грамм еды");
        }
    }

    public void setFood (int food){
        this.food = food;
    }

    public int getFood() {
        return food;
        }
    }
