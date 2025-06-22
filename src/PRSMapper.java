import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.mapreduce.Mapper;

public class PRSMapper extends Mapper<Object, Text, Text, DoubleWritable>{
	@Override
	protected void map(Object key, Text value, Mapper<Object, Text, Text, DoubleWritable>.Context context)
		throws IOException, InterruptedException {
			String line = value.toString();
			if (line.startsWith("id,")) return;
			String data[] = line.split(",");
			String[] primaryCategories = data[3].split("\\|");
			int rewiewRating = Integer.valueOf(data[9]);
			for (String primCat : primaryCategories) {
				primCat = primCat.trim();
				context.write(new Text(primCat), new DoubleWritable(rewiewRating));
			}
	}
}