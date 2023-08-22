package example.stringClass.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class StringInbuiltClasses {

	public static void main(String[] args) {
		String value="Mysore palace-Mysore";

		System.out.println("value at 13: +value,charAt13");
		System.out.println("------------------------------");
		
		String[] array=value.split("a");
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("-------------------");

		String[] array2 = value.split("n", 2);

		for (int i = 0; i < array2.length; i++) {
			System.out.println("" + array2[i]);
		}

		System.out.println("-------------------");

		String value1 = value.concat("-X-Workz");
		System.out.println(value1);

		System.out.println("-------------------");

		int value2 = value.compareTo("Banglore");
		System.out.println(value2);

		System.out.println("-------------------");

		System.out.println(value.substring(12));

		System.out.println("-------------------");

		System.out.println(value.substring(6, 11));

		System.out.println("-------------------");

		System.out.println(value.isEmpty());

		System.out.println("-------------------");

		System.out.println(value.length());

		System.out.println("-------------------");

		System.out.println(value.startsWith("R"));

		System.out.println("-------------------");

		System.out.println(value.endsWith("a"));

		System.out.println("-------------------");

		System.out.println(value.equalsIgnoreCase("Mysore palace-Mysore"));

		System.out.println("-------------------");

		System.out.println(value.equals("Mysore palace-Mysore"));

		System.out.println("-------------------");

		System.out.println(value.toUpperCase());

		System.out.println("-------------------");

		System.out.println(value.toCharArray());

		System.out.println("-------------------");

		System.out.println(value.isEmpty());

		System.out.println("-------------------");

		System.out.println(value.indexOf(66));

		System.out.println("-------------------");

		String val = "  Google ";

		System.out.println(val.trim());

		System.out.println("****************JAVA.UTIL.DATE METHODS*****************");

		Date date = new Date(2001, 22, 10);
		Date date2 = new Date(2001, 22, 20);

		System.out.println(date2.after(date));

		Date date3 = new Date(2005, 22, 10);

		System.out.println(date.before(date3));

		System.out.println(date.clone());

		System.out.println(date2.compareTo(date));

		System.out.println(date.getTime());

		System.out.println("****************JAVA.TIME.LOCALDATE METHODS*****************");

		System.out.println(LocalDate.now());

		System.out.println(LocalDate.of(2002, 12, 23));

		System.out.println(LocalDate.parse("2008-10-04"));

		System.out.println(LocalDate.ofYearDay(2023, 19));

		System.out.println(LocalDate.ofEpochDay(10));

		System.out.println("****************JAVA.TIME.LOCALDATETIME METHODS*****************");

		System.out.println(LocalDateTime.now());

		System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));

		System.out.println(LocalDateTime.of(2023, 10, 22, 10, 20));

		System.out.println(LocalDateTime.ofInstant(Instant.ofEpochMilli(100), ZoneId.systemDefault()));

		System.out.println(LocalDateTime.of(2023, 10, 22, 12, 0, 0));

		System.out.println("****************JAVA.LANG.THREAD METHODS*****************");
		
		System.out.println(System.lineSeparator());
		System.out.println(System.nanoTime());
		System.out.println(System.console());
		System.out.println(System.getenv(value));
		System.out.println(System.clearProperty(value));
		System.out.println(System.identityHashCode(value));
	}

}
