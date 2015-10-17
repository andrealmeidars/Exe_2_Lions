import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LionTest {
    private Lion lion;


    @Before
    public void setUp() throws Exception {
        this.lion = new Lion(true);
    }



    @Test
    public void showIfLionIsSmile(){
       assertThat(lion.getSmile(), is(true));
    }






}
