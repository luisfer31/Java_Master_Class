package javaamigos.a1.packagelearn.abstractanimal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport{

    private static final Pattern PATTERN = Pattern.compile("\\d+");

    @Override
    public String clean(String input) {
        return input;
    }

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Phone Numbers";
    }


}
