import org.joda.money.CurrencyUnit
import spock.lang.Specification
import org.joda.money.BigMoney

import java.math.RoundingMode

class JodaMoneySpec extends Specification {

    void 'ololo'() {
        given:
        // create a monetary value
        BigMoney money = BigMoney.parse('USD 23.87');

        // add another amount with safe double conversion
        CurrencyUnit usd = CurrencyUnit.of('USD');
        money = money.plus(BigMoney.of(usd, 12.43d));

        // subtracts an amount in dollars
        money = money.minusMajor(2);

        // multiplies by 3.5 with rounding
        money = money.multipliedBy(3.5d);

        // compare two amounts
        BigMoney dailyWage = BigMoney.parse("USD 2000")
        boolean bigAmount = money.isGreaterThan(dailyWage);

        // convert to GBP using a supplied rate
        BigDecimal conversionRate = 2;  // obtained from code outside Joda-Money
        BigMoney moneyGBP = money.convertedTo(CurrencyUnit.GBP, conversionRate);

        // use a BigMoney for more complex calculations where scale matters
        BigMoney moneyCalc = money.toBigMoney();
        expect:
        moneyCalc.amount == 120.0G
    }
}
