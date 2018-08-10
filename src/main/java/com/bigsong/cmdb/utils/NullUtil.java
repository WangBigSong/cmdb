package com.bigsong.cmdb.utils;

public class NullUtil {

    public static final boolean isNull(Object object) {
        if (null == object) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean isNotNull(Object object) {
        if (null != object) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean isEmpty(Object object) {
        if (null == object || "".equals(object) || "null".equals(object)) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean isNotEmpty(Object object) {
        if (null != object || !"".equals(object) || !"null".equals(object)) {
            return true;
        } else {
            return false;
        }
    }
}
