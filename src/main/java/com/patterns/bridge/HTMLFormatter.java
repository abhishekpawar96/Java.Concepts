package com.patterns.bridge;

import java.util.List;

public class HTMLFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        final String indent = "\t";
        StringBuilder builder = new StringBuilder();
        builder
                .append("<TABLE>")
                .append("\n")
                .append(indent)
                .append("<TH>")
                .append(indent)
                .append("Classification")
                .append(indent)
                .append("</TH>")
                .append(indent)
                .append("<TH>")
                .append(indent)
                .append(header)
                .append(indent)
                .append("</TH>\n");

        for (Detail detail : details) {
            builder
                    .append("\n")
                    .append(indent)
                    .append("<TR><TD>")
                    .append(indent)
                    .append(detail.getLabel())
                    .append(indent)
                    .append("</TR></TD>")
                    .append(indent)
                    .append("<TR><TD>")
                    .append(indent)
                    .append(detail.getValue())
                    .append(indent)
                    .append("</TR></TD>");
        }
        builder.append("\n</TABLE>");
        return builder.toString();
    }

}
