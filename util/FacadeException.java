package util;


public class FacadeException extends Exception {
    private static final long serialVersionUID = 2375907122629391431L;
    
    public FacadeException(Throwable e) {
	super(e);
    }

    public FacadeException(String message) {
	super(message);
    }
    
    public FacadeException(String message, Throwable e) {
	super(message, e);
    }
}
