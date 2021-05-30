package org.csystem.samples.lottery;

import java.util.Random;

public class NumericLottery {
    public Random random;

    public boolean [] getFlags()
    {
        boolean [] flags = new boolean[50];
        int val;

        for (int i = 0; i < 6; ++i) {
            for (;;) {
                val = random.nextInt(49) + 1;
                if (!flags[val])
                    break;
            }
            flags[val] = true;
        }

        return flags;
    }

    public int[] getNumbers(boolean [] flags)
    {
        int [] numbers = new int[6];
        int index = 0;

        for (int i = 1; i < 50; ++i)
            if (flags[i])
                numbers[index++] = i;

        return numbers;
    }

    public NumericLottery()
    {
        random = new Random();
    }

    public NumericLottery(Random r)
    {
        random = r;
    }

    public int [] getNumbers()
    {
        return getNumbers(getFlags());
    }
}
