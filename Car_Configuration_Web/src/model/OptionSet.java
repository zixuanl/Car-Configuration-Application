package model;

/*
 * Arrays of optionsets and arrays of options for each optionset 
 */

import java.io.Serializable;
import java.util.ArrayList;

public class OptionSet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public class Option implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String name;
		protected float price;

		/* Constructor */
		private Option() {
			super();
		}

		/* Getter of the field name */
		public String getName() {
			return name;
		}

		/* Setter of the field name */
		public void setName(String name) {
			this.name = name;
		}

		/* Getter of the field price */
		public float getPrice() {
			return price;
		}

		/* Setter of the field name */
		public void setPrice(float price) {
			this.price = price;
		}

		/* Print all the information of an option */
		private void print() {
			StringBuffer sb = new StringBuffer();
			sb.append("The name is: ");
			sb.append(name);
			sb.append("\nThe Price is: ");
			sb.append(price);
			System.out.println(sb);
		}

		@Override
		public String toString() {
			return "Option [name=" + name + ", price=" + price + "]";
		}
		
		
	}
	
	

	@Override
	public String toString() {
		return "OptionSet [choice=" + choice + ", opt=" + opt + ", name="
				+ name + "]";
	}

	protected Option choice;
	private ArrayList<Option> opt = new ArrayList<Option>();
	String name;

	/* Constructor */
	protected OptionSet() {
		super();
	}

	/* Getter of option */
	public ArrayList<Option> getOpt() {
		return opt;
	}

	/* Initialize an array of option with a given size */
	protected void setOption(int optionsize) {
		
		for (int i = 0; i < optionsize; i++) {
			Option option = new Option();
			this.opt.add(option);
		}
	}

	/* Getter of the field name */
	protected String getName() {
		return name;
	}

	/* Setter of the field name */
	protected void setName(String name) {
		this.name = name;
	}

	/* Print all the information of an option set */
	protected void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("The optionset name is: ");
		sb.append(name);
		System.out.println(sb);

		for (int i = 0; i < opt.size(); i++) {
			opt.get(i).print();
		}
	}

	/* Set the name of option with given index */
	protected void setOptionValue(int index, String value) {
		if (index < opt.size() ) {
			opt.get(index).setName(value);
		}
	}

	/* Set the price of option with given index */
	protected void setOptionPrice(int index, int value) {
		if (index < opt.size() ) {
			opt.get(index).setPrice(value);
		}
	}

	/* Find the option with a given name */
	public Option findOption(String name2) {
		for (int i = 0; i < opt.size(); i++) {
			if (opt.get(i).name.equals(name2)) {
				return opt.get(i);
			}
		}
		return null;
	}

	/* Delete an option from the opt array */
	protected void deleteOptionp(int indexopt) {
		opt.set(indexopt, null);
	}

	/* Update the array of option */
	protected void updateOption() {
		ArrayList<Option> newopt = new ArrayList<Option>();
		for (int i = 0; i < opt.size(); i++) {
			System.out.println("The i equals to        " + i);
			System.out.println("The opt got "+ opt.get(i).name);
			if (opt.get(i) != null) {
				System.out.println("Reached here");
				newopt.add(opt.get(i));
				System.out.println("Reached here as well");
			}
		}
		opt = newopt;
	}
}
