package org.csystem.samples.lottery;

import org.csystem.util.ArrayUtil;

import java.util.Scanner;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLottery lottery = new NumericLottery();

        for (;;) {
            System.out.print("Kaç kupon oynamak istersiniz?");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            for (int i = 0; i < n; ++i)
                ArrayUtil.display(2, lottery.getNumbers());
        }
    }
}
