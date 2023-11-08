package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoView {

    public int price;
    public int number;
    public String winNumber;
    public int bonusNumber;

    public void inputPrice(){
        System.out.println("구입금액을 입력해 주세요.");
        price = Integer.parseInt(Console.readLine());
    }

    public void inputValidate(){
        double tempNumber = 0;
        while(true){
            try {
                tempNumber = price/1000;
                break;
            } catch (IllegalArgumentException e){
                System.out.println("[ERROR] 가격은 1000단위여야 합니다.");
                System.out.println("구입금액을 다시 입력해 주세요.");
                price = Integer.parseInt(Console.readLine());
            }
        }
        number = (int) tempNumber;
    }

    public void printNumber(){
        System.out.println();
        System.out.println(number + "개를 구매했습니다.");
    }

    public void printLottoList(List<Integer> randomNumbers){
        System.out.println(randomNumbers);
    }

    public void inputWinNumber(){
        System.out.println("당첨 번호를 입력해 주세요.");
        winNumber = Console.readLine();
    }

    public void inputBonusNumber(){
        System.out.println("보너스 번호를 입력해 주세요.");
        while(true){
            try {
                bonusNumber = Integer.parseInt(Console.readLine());
                break;
            } catch (IllegalArgumentException e){
                System.out.println("[ERROR] 보너스 번호가 잘못된 값을 가집니다.");
                System.out.println("보너스 번호를 다시 입력해 주세요.");
                bonusNumber = Integer.parseInt(Console.readLine());
            }
        }
    }

    public void printWin(){
        System.out.println("당첨 통계");
        System.out.println("---");
    }


}
