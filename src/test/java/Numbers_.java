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



}
