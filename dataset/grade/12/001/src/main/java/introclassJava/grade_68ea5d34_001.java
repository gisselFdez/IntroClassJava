package introclassJava;

class IntObj {
    public int value;
    public IntObj () {
    } public IntObj (int i) {
        value = i;
    }
}

class FloatObj {
    public float value;
    public FloatObj () {
    } public FloatObj (float i) {
        value = i;
    }
}

class LongObj {
    public long value;
    public LongObj () {
    } public LongObj (long i) {
        value = i;
    }
}

class DoubleObj {
    public double value;
    public DoubleObj () {
    } public DoubleObj (double i) {
        value = i;
    }
}

class CharObj {
    public char value;
    public CharObj () {
    } public CharObj (char i) {
        value = i;
    }
}

public class grade_68ea5d34_001 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_68ea5d34_001 mainClass = new grade_68ea5d34_001 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public void exec () throws Exception {
        DoubleObj a = new DoubleObj (), b = new DoubleObj (), c =
            new DoubleObj (), d = new DoubleObj (), in = new DoubleObj ();
        CharObj g = new CharObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextDouble ();
        b.value = scanner.nextDouble ();
        c.value = scanner.nextDouble ();
        d.value = scanner.nextDouble ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        in.value = scanner.nextDouble ();
        if (in.value >= a.value) {
            g.value = 'A';
        } else if (in.value >= b.value) {
            g.value = 'B';
        } else if (in.value >= c.value) {
            g.value = 'C';
        } else if (in.value >= d.value) {
            g.value = 'D';
        } else {
            g.value = 'F';
        }
        if (g.value == 'A' || g.value == 'B' || g.value == 'C' || g.value == 'D') {
            output += (String.format ("Student has an %c grade\n", g.value));
        } else {
            output += (String.format ("Student has failed the course\n"));
        }
        if (true)
            return;;
    }
}
