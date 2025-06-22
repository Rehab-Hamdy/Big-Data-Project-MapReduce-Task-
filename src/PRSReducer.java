import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class PRSReducer extends Reducer <Text, DoubleWritable, Text, DoubleWritable>{
	protected void reduce(Text key, Iterable<DoubleWritable> values, Reducer<Text, DoubleWritable, Text, DoubleWritable>.Context context)
			throws IOException, InterruptedException {
				double sum = 0;
				int count = 0;
				for(DoubleWritable value : values) {
					sum += value.get();
					count++;
				}
				if(count > 0) {
					double avg = sum / count;
					context.write(key, new DoubleWritable(avg));
				}
			}
}
