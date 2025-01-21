package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}

class HtmlReport extends TextReport {
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}

class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() +
                "\t\"name\" : \"" + name + "\"," + System.lineSeparator()
                + "\t\"body\" : \"" + body + "\"" + System.lineSeparator()
                + "}";
    }

}

class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        JSONReport report2 = new JSONReport();
        String text1 = report2. generate("Meladze","Shit truck" );
        System.out.println(text1);
    }
}



