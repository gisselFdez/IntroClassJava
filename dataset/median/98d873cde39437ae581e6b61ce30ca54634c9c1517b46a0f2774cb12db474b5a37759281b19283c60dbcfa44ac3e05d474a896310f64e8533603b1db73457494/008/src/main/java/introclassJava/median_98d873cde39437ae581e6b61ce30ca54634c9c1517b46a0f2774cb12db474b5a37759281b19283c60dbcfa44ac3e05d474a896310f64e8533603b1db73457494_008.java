package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_98d873cde39437ae581e6b61ce30ca54634c9c1517b46a0f2774cb12db474b5a37759281b19283c60dbcfa44ac3e05d474a896310f64e8533603b1db73457494_008 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_98d873cde39437ae581e6b61ce30ca54634c9c1517b46a0f2774cb12db474b5a37759281b19283c60dbcfa44ac3e05d474a896310f64e8533603b1db73457494_008 mainClass = new median_98d873cde39437ae581e6b61ce30ca54634c9c1517b46a0f2774cb12db474b5a37759281b19283c60dbcfa44ac3e05d474a896310f64e8533603b1db73457494_008();
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
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), z = new IntObj();
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if((b.value < a.value && a.value < c.value) || (c.value < a.value && a.value < b.value) || a.value == b.value){
            z.value = a.value;
        } else if((a.value < b.value && b.value < c.value) || (c.value < b.value && b.value < a.value) || b.value == c.value){
            z.value = b.value;
        }         else if((a.value < c.value && c.value < b.value) || (b.value < c.value && c.value < a.value) || a.value == c.value){
            z.value = c.value;
        }
        output += (String.format("%d is the median\n", z.value));
        if(true)return;;
    }
}