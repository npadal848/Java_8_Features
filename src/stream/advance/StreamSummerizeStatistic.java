package stream.advance;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSummerizeStatistic {

	public static void main(String[] args) {
		List<Double> bills = List.of(2500.34, 432.45, 3422.56, 3452.33);
		DoubleSummaryStatistics statistic = bills.stream().collect(Collectors.summarizingDouble(Double::doubleValue));
		
		System.out.println(statistic.getCount());
		System.out.println(statistic.getSum());
		System.out.println(statistic.getAverage());
		System.out.println(statistic.getMax());
		System.out.println(statistic.getMin());
	}
}
