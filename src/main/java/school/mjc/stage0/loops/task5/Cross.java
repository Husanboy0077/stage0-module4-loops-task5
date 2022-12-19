package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int s = sideLength / 2, i;
        for (i = 0; i < sideLength; i++) {
            String w = "";
            for (int j = 0; j < sideLength; j++) {
                if (i != s) {
                    w+= j != s ? " " : "8";
                } else {
                    w+="8";
                }
            }
            System.out.println(w);
        }

    }
}

