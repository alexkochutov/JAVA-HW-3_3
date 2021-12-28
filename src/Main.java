public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        System.out.println(service.calculate(1000000, 12, 9.99F));  // выводим значение ежемесячного платежа при заёме 1000000 на 12 месяцев под 9.99%
        System.out.println(service.calculate(1000000, 24, 9.99F));  // выводим значение ежемесячного платежа при заёме 1000000 на 24 месяцев под 9.99%
        System.out.println(service.calculate(1000000, 36, 9.99F));  // выводим значение ежемесячного платежа при заёме 1000000 на 36 месяцев под 9.99%

    }
}
