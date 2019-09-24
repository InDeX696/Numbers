import javafx.beans.binding.BooleanExpression;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Numbers_ {
    @Test
    public void give_a_unit(){
        assertThat(Numbers.get(0)).isEqualTo("cero");
        assertThat(Numbers.get(1)).isEqualTo("one");
        assertThat(Numbers.get(2)).isEqualTo("two");
        assertThat(Numbers.get(3)).isEqualTo("three");
        assertThat(Numbers.get(4)).isEqualTo("four");
        assertThat(Numbers.get(5)).isEqualTo("five");
        assertThat(Numbers.get(6)).isEqualTo("six");
        assertThat(Numbers.get(7)).isEqualTo("seven");
        assertThat(Numbers.get(8)).isEqualTo("eight");
        assertThat(Numbers.get(9)).isEqualTo("nine");
    }
    @Test
    public void give_a__ten(){
        assertThat(Numbers.get(10)).isEqualTo("ten");
        assertThat(Numbers.get(20)).isEqualTo("twenty");
        assertThat(Numbers.get(30)).isEqualTo("thirty");
        assertThat(Numbers.get(40)).isEqualTo("forty");
        assertThat(Numbers.get(50)).isEqualTo("fifty");
        assertThat(Numbers.get(60)).isEqualTo("sixty");
        assertThat(Numbers.get(70)).isEqualTo("seventy");
        assertThat(Numbers.get(80)).isEqualTo("eighty");
        assertThat(Numbers.get(90)).isEqualTo("ninety");

    }



}
