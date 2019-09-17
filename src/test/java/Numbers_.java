import javafx.beans.binding.BooleanExpression;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Numbers_ {
    @Test
    public void give_0_return_cero(){

        assertThat(Numbers.get(0)).isEqualTo("cero");
    }
    @Test
    public void give_1_return_one(){

        assertThat(Numbers.get(1)).isEqualTo("one");
    }
    @Test
    public void give_2_return_two(){

        assertThat(Numbers.get(2)).isEqualTo("two");
    }
    @Test
    public void give_3_return_three(){

        assertThat(Numbers.get(3)).isEqualTo("three");
    }
    @Test
    public void give_4_return_four(){

        assertThat(Numbers.get(4)).isEqualTo("four");
    }
    @Test
    public void give_5_return_five(){

        assertThat(Numbers.get(5)).isEqualTo("five");
    }
    @Test
    public void give_6_return_six(){

        assertThat(Numbers.get(6)).isEqualTo("six");
    }
    @Test
    public void give_7_return_seven(){

        assertThat(Numbers.get(7)).isEqualTo("seven");
    }
    @Test
    public void give_8_return_eight(){

        assertThat(Numbers.get(8)).isEqualTo("eight");
    }
    @Test
    public void give_9_return_nine(){

        assertThat(Numbers.get(9)).isEqualTo("nine");
    }
    @Test
    public void give_10_return_ten(){

        assertThat(Numbers.get(10)).isEqualTo("ten");
    }




}
