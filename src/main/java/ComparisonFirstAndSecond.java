import java.util.*;

public class ComparisonFirstAndSecond {
    private final List<String> first;
    private final List<String> second;
    private List<String> out;

    public ComparisonFirstAndSecond(ArrayList<String> first, ArrayList<String> second) {
        out = new ArrayList<>();
        this.first = first;
        this.second = second;
        newList();
    }


    private void newList() {

        boolean b = true;
        for (int i = 0; i < first.size(); i++) {
            String s = first.get(i);
            out.add(i,s + ":?");
            String[] split = s.split("\\s");
            for (String s1 : second) {
                String[] split1 = s1.split("\\s");
                for (String s2 : split) {
                    for (String s3 : split1) {
                        if (s2.length() < s3.length()) {
                            String s4 = s3.substring(0, s2.length());
                            if (s2.equals(s4)) {
                                addItem(i, s, s1);
                            }
                        } else if (s2.length() > s3.length()) {
                            String s4 = s2.substring(0, s3.length());
                            if (s3.equals(s4)) {
                                addItem(i, s, s1);

                            }
                        } else {
                            if (s2.equals(s3)) {
                                addItem(i, s, s1);
                            }
                        }
                    }
                }
            }
        }

        new WriteOutputFile((ArrayList<String>) out);
    }

    private void addItem(int i, String s, String s1) {
        for (int j=0;j<=i;j++){
            String s2=out.get(j);
            for (String s3 : s2.split(":")) {
                if (!s3.equals(s) || !s3.equals(s1)) {
                    out.remove(i);
                    out.add(i, s + ":" + s1);
                }
            }

        }
    }

}
