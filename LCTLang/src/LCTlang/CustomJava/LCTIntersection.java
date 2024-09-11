package LCTlang.CustomJava;

public class LCTIntersection {
    String first;
    String second;

    public LCTIntersection (Value First, Value Second){
        this.first = First.asString();
        this.second = Second.asString();
    }

    public String IntersectionPoint () {
        double x, y, a, b, c, d;

        a = Double.parseDouble(first.split("=")[1].split("\\*")[0]);
        if (first.contains("+"))
            b = Double.parseDouble(first.split("\\+")[1]);
        else
            b = -Double.parseDouble(first.split("-")[1]);

        c = Double.parseDouble(second.split("=")[1].split("\\*")[0]);
        if (second.contains("+"))
            d = Double.parseDouble(second.split("\\+")[1]);
        else
            d = -Double.parseDouble(second.split("-")[1]);


        if (a == c)
            return "The lines are parallel and therefore do not intersect";

        x = (d - b) / (a - c);
        y = a * ((d - b) / (a - c)) + b;

        return "(" + x + ", " + y + ")";
    }
}
