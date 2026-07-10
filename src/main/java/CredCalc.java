import java.math.*;
import java.util.Scanner;

public class CredCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите необходимую клиенту сумму кредита (в рублях): ");
        BigDecimal summ = scanner.nextBigDecimal(); //вводим сумму кредита

        System.out.print("Укажите годовую ставку по кредиту (%): ");
        BigDecimal keyRate = scanner.nextBigDecimal(); //вводим годовую (ключеву)стаку по кредиту

        System.out.print("Укажите срок кредита (в МЕСЯЦАХ): ");
        //scanner.nextLine();
        int months = scanner.nextInt(); //вводим количество месяцев
        scanner.nextLine();

        //System.out.println(summ);
        //System.out.println(keyRate);
        //System.out.println(months);

        BigDecimal monthRate = keyRate.divide(new BigDecimal("1200"), 10, RoundingMode.HALF_UP); //считаем ежемесячную ставку по кредиту
        //System.out.println(monthRate);

        BigDecimal growth = BigDecimal.ONE.add(monthRate);
        BigDecimal growthMult = growth.pow(months); //расчет множителя приращения
        //System.out.println(growthMult);

        BigDecimal Coef1 = monthRate.multiply(growthMult);
        BigDecimal Coef2 = growthMult.subtract(BigDecimal.ONE);
        BigDecimal annuityCoef = Coef1.divide(Coef2,10, RoundingMode.HALF_UP); //Коэффициент аннуитета
        //System.out.println(annuityCoef);

        BigDecimal monthlyPayment = summ.multiply(annuityCoef); //ежемесячный платеж

        System.out.println("Ежемесячный платеж составит (в рублях):" + monthlyPayment); //выводим пользователю итоговую сумму платежа в месяц

        scanner.close();

    }
}
