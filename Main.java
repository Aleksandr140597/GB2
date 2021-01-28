public class Main {
    public static void main(String[] args) {
        JumpAndRun [] members = {
                new Human(3, 2, "Aleksandr"),
                new Human(1, 1, "Viktoria"),
                new Cat(3, 4, "Pushok"),
                new Cat(1, 1, "Murzik"),
                new Robot(0, 10, 1),
                new Robot(12,2,2)
        };

        AbstractToDo[] obstacles = {
                new RunningRoad(1),
                new RunningRoad(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpAndRun member : members) {
            System.out.println("Start " + member);
            boolean winner = true;
            for (AbstractToDo obstacle : obstacles) {
                System.out.println(member + "trying to get through " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("It's OK");
                } else {
                    winner = false;
                    System.out.println("It's false.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " WIN!");
            } else {
                System.out.println(member + " Lost.");
            }
            System.out.println("__________________________________________________________");
        }
    }
}
