package com.douglasjose.tech;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Example {

    public Example() {
        List<Object> list = ListUtils.emptyIfNull(null);
        StringUtils.contains("foo", "bar");
    }
    
}