package pattern.learn19.composite02;

public abstract class Company {
	private String name;
	public Company(String name){
		this.name = name;
	}
	
	public abstract void Add(Company c);
	public abstract void Remove(Company c);
	public abstract void Display(int depth);
	public abstract void LineOfDuty();
}
