package com.coalvalue.employee.util;

import org.springframework.beans.BeanUtils;

/**
 * Created by Peter Xu on 01/30/2015.
 */
public class DomainPropertyCopyer {

    private static String[] defaultIgnoredProperties =
            {"id", "createBy", "createDate", "modifyBy", "modifyDate", "version"};

    public static void copyProperty(Object source, Object target, String... customIgnoredProperties) {
        int defaultProLen = defaultIgnoredProperties.length;
        int customProLen = customIgnoredProperties.length;
        String[] ignoredProperties = new String[defaultProLen + customProLen];
        System.arraycopy(defaultIgnoredProperties, 0, ignoredProperties, 0, defaultProLen);
        System.arraycopy(customIgnoredProperties, 0, ignoredProperties, defaultProLen, customProLen);
        BeanUtils.copyProperties(source, target, ignoredProperties);
    }
}
