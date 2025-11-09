public class Collatz {
    public static void main(String[] args) {
        int countNum = Integer.parseInt(args[0]);
        char mode = args[1].charAt(0);

        if (mode == 'v') {
            for (int i = 1; i <= countNum; i++) {
                int current = i;
                int steps = 0;

                // לולאת הריצה
                while (true) {
                    System.out.print(current + " ");
                    steps++;

                    // תנאי מיוחד: אם זה seed=1 והגענו רק פעם אחת (steps==1) → נמשיך
                    if (current == 1 && !(i == 1 && steps == 1)) {
                        break; // עוצרים רק אם זה לא המקרה של 1 ההתחלתי
                    }

                    // חוקי קולץ
                    if (current % 2 == 0) {
                        current = current / 2;
                    } else {
                        current = 3 * current + 1;
                    }
                }

                System.out.println("(" + steps + ")");
            }

            System.out.println("Every one of the first " + countNum + " hailstone sequences reached 1.");
        }

        else if (mode == 'c') {
            for (int i = 1; i <= countNum; i++) {
                int current = i;
                while (current != 1) {
                    if (current % 2 == 0)
                        current = current / 2;
                    else
                        current = 3 * current + 1;
                }
            }
            System.out.println("Every one of the first " + countNum + " hailstone sequences reached 1.");
        }
    }
}
