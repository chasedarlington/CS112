public class Assignment9_Figure
{	

// Each of these methods, erase and draw, output a message telling the name of the class and what method has been called.
// Because these are just stubs, they do nothing more than output this message. 
	public void erase()
	{
		StackTraceElement[] stackTrace = new Throwable().getStackTrace();
		System.out.print(this.getClass());
		System.out.print("\t" + stackTrace[0].getMethodName() + "\n");
	}

	public void draw()
	{
		StackTraceElement[] stackTrace = new Throwable().getStackTrace();
		System.out.print(this.getClass());
		System.out.print("\t" + stackTrace[0].getMethodName() + "\n");
	}

// The method center calls the erase and draw methods to erase and redraw the figure at the center.
// Because you have only stubs for erase and draw, center will not do any “centering” but will call 
// the methods erase and draw, which will allow you to see which versions of draw and center it calls.
// Also, add an output message in the method center that announces that center is being called.
	public void center()
	{
		StackTraceElement[] stackTrace = new Throwable().getStackTrace();
		System.out.print(this.getClass());
		System.out.print("\t" + stackTrace[0].getMethodName() + "\n");
		erase();
		draw();
	}

}