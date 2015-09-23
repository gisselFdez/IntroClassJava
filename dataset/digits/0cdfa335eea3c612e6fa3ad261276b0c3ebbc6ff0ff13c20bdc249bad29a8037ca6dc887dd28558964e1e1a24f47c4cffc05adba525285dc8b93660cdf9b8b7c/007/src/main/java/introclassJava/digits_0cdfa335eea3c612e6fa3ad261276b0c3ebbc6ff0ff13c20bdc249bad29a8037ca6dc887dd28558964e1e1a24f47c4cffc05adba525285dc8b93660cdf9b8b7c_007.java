package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_007 mainClass = new digits_0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_007();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public void exec () throws Exception {
        IntObj n = new IntObj(), temp = new IntObj(), digit = new IntObj();
        DoubleObj i = new DoubleObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        temp.value = Math.abs(n.value);
        i.value = Math.log10(temp.value);
        i.value = (int)Math.ceil(i.value);
        if(i.value / i.value == 1){
            i.value++;
        }
        while(n.value!=0){
            digit.value = n.value % 10;
            n.value = n.value / 10;
            if(n.value == 0){
                output += (String.format("%d\n", digit.value));
            } else {
                output += (String.format("%d\n", Math.abs(digit.value)));
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}