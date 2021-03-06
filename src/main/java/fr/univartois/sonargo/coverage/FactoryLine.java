package fr.univartois.sonargo.coverage;

public class FactoryLine {
    private static int line = 1;

    private FactoryLine() {
	throw new IllegalStateException("Utility class");
    }

    public static void init() {
	line = 1;
    }

    public static LineCoverage create(String l) {
	return new LineCoverage(line++, 0, l);
    }

}
