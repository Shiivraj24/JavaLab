package customexception;

@SuppressWarnings("serial")
public class ProductException extends Exception {
        public ProductException(String errmsg) {
        	super (errmsg);
        }
}
