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
    public void give_a_simple_ten(){
        assertThat(Numbers.get(10)).isEqualTo("ten");
        assertThat(Numbers.get(11)).isEqualTo("eleven");
        assertThat(Numbers.get(12)).isEqualTo("twelve");
        assertThat(Numbers.get(20)).isEqualTo("twenty");
        assertThat(Numbers.get(30)).isEqualTo("thirty");
        assertThat(Numbers.get(40)).isEqualTo("forty");
        assertThat(Numbers.get(50)).isEqualTo("fifty");
        assertThat(Numbers.get(60)).isEqualTo("sixty");
        assertThat(Numbers.get(70)).isEqualTo("seventy");
        assertThat(Numbers.get(80)).isEqualTo("eighty");
        assertThat(Numbers.get(90)).isEqualTo("ninety");

    }
    @Test
    public void give_a_compound_number_tens(){
        assertThat(Numbers.get(21)).isEqualTo("twenty-one");
        assertThat(Numbers.get(22)).isEqualTo("twenty-two");
        assertThat(Numbers.get(23)).isEqualTo("twenty-three");
        assertThat(Numbers.get(24)).isEqualTo("twenty-four");
        assertThat(Numbers.get(32)).isEqualTo("thirty-two");
        assertThat(Numbers.get(35)).isEqualTo("thirty-five");
        assertThat(Numbers.get(95)).isEqualTo("ninety-five");
        assertThat(Numbers.get(99)).isEqualTo("ninety-nine");
        assertThat(Numbers.get(35)).isEqualTo("thirty-five");

    }
    @Test
    public void give_a_compound_number_hundred(){
        assertThat(Numbers.get(145)).isEqualTo("one-hundred-forty-five");
        assertThat(Numbers.get(100)).isEqualTo("one-hundred");
        assertThat(Numbers.get(102)).isEqualTo("one-hundred-two");
        assertThat(Numbers.get(111)).isEqualTo("one-hundred-eleven");
    }


}
