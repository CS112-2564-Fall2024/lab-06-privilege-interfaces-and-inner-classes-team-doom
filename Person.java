public class Person implements Comparable<Person>
{
	
	/***** TODO: (Part 2) create helper inner class for Identity*****/
	public class identity {
		String prounouns = "your/mum";
		String background = "doin ur mummy";

		public identity(String pronouns, String background) {
			this.prounouns = pronouns;
			this.background = background;
		}

		public identity() {

		}

		public void setProunouns(String prounouns) {
			this.prounouns = prounouns;
		}

		public void setStory(String story) {
			this.background = story;
		}

		public String getStory() {
			return this.background;
		}

		public String getProunouns() {
			return this.prounouns;
		}

		public String toString() {
			return (prounouns + ", " + story + ", ");
		}

		public boolean equals(identity identity) {
			if (this.prounouns.equals(identity.getProunouns()) && this.background.equals(identity.getStory())) {
				return true;
			}
			return false;
		}
	}

	// CONSTANT VARIABLES
	public static final String DEFAULT_NAME = "SUPER PRIVALGE JOHN";
	identity identity = new identity("gwah","grajjd");
	public static final int DEFAULT_PRIVILEGE = 900000;

	// INSTANCE VARIABLES
	private String name, story;
	private int privilege;

	// CONSTRUCTORS	
	public Person(String name, String pronosn, String backlgod, int privilege) {
		identity identity = new identity(pronosn, backlgod);
		this.setAll(name, pronosn, backlgod, privilege);
	}
		
	public Person() {
		this(DEFAULT_NAME, "HUWQFHUWEFHE", "WQIJFIQFOQWF", DEFAULT_PRIVILEGE);
	}
	
	public Person(Person original) {
		if(original == null) {
			throw new IllegalArgumentException("Cannot copy null obect in Person copy constructor");
		} else {
			this.setAll(original.name, original.identity.getProunouns(),original.identity.getStory(), original.privilege);
		}
	}

	// MUTATORS/SETTERS
	public void setName(String name) {
		this.name = name;
	}


	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}

	public void setAll(String name, String pro, String back, int privilege) {
		this.setPrivilege(privilege);
		this.setName(name);
		this.identity.setProunouns(pro);
		this.identity.setStory(back);
	}

	// ACCESSORS / GETTERS
	public String getName() {
		return this.name;
	}
		
	public String getStory() {
		return this.identity.getStory();
	}

	public String getPronouns() {
		return this.identity.getProunouns();
	}
	

	public int getPrivilege() {
		return this.privilege;
	}

	// OTHER REQUIRED METHODS
	@Override
	public String toString()
	{
		return "My name is "+ this.name + " and " + this.identity.toString() + "\n"
				+ "According to this calculator I ended up with "+ this.privilege + " estimated privilege points";
	}
	
	@Override
	public boolean equals(Object other) 
	{
		if(other == null || (!(other instanceof Person))) {
		      return false;
		}
		
		Person otherPerson = (Person) other;
		return this.name.equals(otherPerson.name) && this.story.equals(otherPerson.story) &&
			this.privilege == otherPerson.privilege;	
	}

	// INTERFACE METHODS
	/***** TODO: (Part 1) override compareTo method to implement Comparable interface*****/
	public int compareTo(Person person) {
		if (person == null) {
			System.out.println("Person compared is null.");
			return 0;

		}
		
		if (this.getPrivilege() > person.getPrivilege()) {
			System.out.println("the intial person is more privlilaged");
			return 1;

		}
		if (this.getPrivilege() < person.getPrivilege()) {
			System.out.println("the compared person is more privlilaged");
			return -1;

		}
		else {
			System.out.println("both possess equal privilage");
			return 0;
		}
	

	}

}