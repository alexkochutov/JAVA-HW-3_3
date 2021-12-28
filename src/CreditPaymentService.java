public class CreditPaymentService {
    public int calculate(int loan, int loanPeriod, float loanInterest) {

        // Расчитываем месячную процентную ставку
        float interestPerMonth = loanInterest / 12 / 100;

        // Расчитываем часть формулы коэффициента аннуитета, которая будет возводиться в степень
        float partOfFormula = 1 + interestPerMonth;

        /*
            Чтобы не подключать внешние библиотеки, которые еще не были освещены на лекциях,
            для реализации функции возведения в степень будем использовать цикл for, который
            так же не освещен на лекциях
        */
        float temp = partOfFormula;
        for(int i = 1; i < loanPeriod; i++){
            partOfFormula = partOfFormula * temp;
        }

        // Расчитываем коэффициент аннуитета
        float ratio = interestPerMonth * (partOfFormula / (partOfFormula - 1));

        // Расчитываем ежемесячный платеж
        int monthlyPayment = (int)(ratio * loan);
        return monthlyPayment;

    }
}
