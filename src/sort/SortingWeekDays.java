package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortingWeekDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> weekDayList = new ArrayList<>();
		while (n-- > 0)
			weekDayList.add(sc.next().toUpperCase());

		weekDayList.sort(new WeekDaysComparator());
		System.out.println(weekDayList);
		sc.close();
	}
}

class WeekDaysComparator implements Comparator<String> {

	private Map<String, Integer> map = new HashMap<>();

	public WeekDaysComparator() {
		map.put("SUNDAY", 1);
		map.put("MONDAY", 2);
		map.put("TUESDAY", 3);
		map.put("WEDNESDAY", 4);
		map.put("THURSDAY", 5);
		map.put("FRIDAY", 6);
		map.put("SATURDAY", 7);
	}

	@Override
	public int compare(String o1, String o2) {
		return map.get(o1).compareTo(map.get(o2));
	}

}
