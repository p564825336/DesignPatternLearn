package pattern.learn16.state02;

public class NoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 13) {
			System.out.println("当前时间: " + w.getHour() + "点, 饿了, 午饭: 犯困, 午休");
		}else {
			w.setState(new AfternoonState());
			w.WriteProgram();
		}
	}

}
