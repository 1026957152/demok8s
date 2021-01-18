package com.example.dm.util;

import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.BitSet;

public class Scratch {
    public static void main(String[] args) throws MalformedURLException {
        BitSet bits1 = fromString("111111111111111111111000001");
        BitSet bits2 = fromString("1111111");

        System.out.println(toString(bits1)); // prints 1000001
        System.out.println(toString(bits2)); // prints 1111111

        bits2.and(bits1);

        System.out.println(toString(bits2)); // prints 1000001


/*
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.ASCIIDOC)
                .build();

        Swagger2MarkupConverter.from(new URL("http://localhost:8088/v2/api-docs?group=AWITV1.0"))
                .withConfig(config)
                .build()
                .toFolder(Paths.get("src/docs/asciidoc/generated"));

*/






            Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                    .withMarkupLanguage(MarkupLanguage.MARKDOWN)
                    .withOutputLanguage(Language.ZH)
                    .withPathsGroupedBy(GroupBy.TAGS)
                    .withoutInlineSchema()
                    .build();
            Swagger2MarkupConverter.from(new URL("http://localhost:8088/v2/api-docs?group=AWITV1.0"))
                    .withConfig(config)
                    .build()
//                .toFolder(Paths.get("./docs"));
                    .toFile(Paths.get("./docs/api"));

    }


    public static BitSet fromString(final String s) {
        return BitSet.valueOf(new long[] { Long.parseLong(s, 2) });
    }

    public static String toString(BitSet bs) {
        return Long.toString(bs.toLongArray()[0], 2);
    }
}