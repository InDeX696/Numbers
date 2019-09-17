import javafx.beans.binding.BooleanExpression;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Numbers_ {
    @Test
    public void give_0_return_cero(){

        assertThat(Numbers.get(0)).isEqualTo("cero");
    }



}
