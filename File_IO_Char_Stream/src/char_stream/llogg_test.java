package char_stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class llogg_test {
    public static final Logger LOGGER= LoggerFactory.getLogger("LogBackTest");

    public static void main(String []args){

        try {
            LOGGER.info("CHU is start!");
            CHU(10,0);
            LOGGER.info("CHU Success");
        } catch (Exception e) {
            LOGGER.error("CHU is wrong!");
        }

    }
        public static void CHU(int a,int b){
        LOGGER.debug("a: "+a);
        LOGGER.debug("b: "+b);
        LOGGER.info("result: "+a/b);
        }
}
