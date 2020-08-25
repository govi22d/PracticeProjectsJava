package userexception;

public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;
	private String _message;
	
	public CustomException(String message)
	{
		this._message = message;
	}
	
	@Override
	public String toString()
	{
		var str = _message == null ? "unknown" : _message;
		return "CustomException [message=" + str +"]";
	}
}
