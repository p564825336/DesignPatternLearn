package pattern.learn16.state;

public class ConcreteStateB extends State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateA());
	}

}
