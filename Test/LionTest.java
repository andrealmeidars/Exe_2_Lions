import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LionTest {
    private Lion lion;
    private Lion lionA;
    private Lion lionB;
    private  Lion lionAFalse;


    @Before
    public void setUp() throws Exception {
        this.lion = new Lion(true);
        this.lionA = new Lion(true);
        this.lionAFalse = new Lion(false);

        this.lionB = new Lion(true);
    }



    @Test
    public void showIfLionIsSmile(){
       assertThat(lion.getSmile(), is(true));
    }

    @Test
    public void showIfWeAreInDanger(){
        assertThat(lion.weAreInDanger(lionA, lionB), is(true));
    }


    @Test
    public void showIfWeAreNotInDanger(){
        assertThat(lion.weAreInDanger(lionAFalse, lionB), is(false));
    }











}
