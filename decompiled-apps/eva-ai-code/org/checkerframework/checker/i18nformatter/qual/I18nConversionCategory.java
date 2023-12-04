package org.checkerframework.checker.i18nformatter.qual;

import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import retrofit2.Platform$$ExternalSyntheticApiModelOutline0;
/* loaded from: classes5.dex */
public enum I18nConversionCategory {
    UNUSED(null, null),
    GENERAL(null, null),
    DATE(new Class[]{Date.class, Number.class}, new String[]{"date", RtspHeaders.Values.TIME}),
    NUMBER(new Class[]{Number.class}, new String[]{"number", "choice"});
    
    public final String[] strings;
    public final Class<?>[] types;
    static I18nConversionCategory[] namedCategories = {DATE, NUMBER};

    I18nConversionCategory(Class[] clsArr, String[] strArr) {
        this.types = clsArr;
        this.strings = strArr;
    }

    public static I18nConversionCategory stringToI18nConversionCategory(String str) {
        I18nConversionCategory[] i18nConversionCategoryArr;
        String lowerCase = str.toLowerCase();
        for (I18nConversionCategory i18nConversionCategory : namedCategories) {
            for (String str2 : i18nConversionCategory.strings) {
                if (str2.equals(lowerCase)) {
                    return i18nConversionCategory;
                }
            }
        }
        throw new IllegalArgumentException("Invalid format type " + lowerCase);
    }

    private static <E> Set<E> arrayToSet(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static boolean isSubsetOf(I18nConversionCategory i18nConversionCategory, I18nConversionCategory i18nConversionCategory2) {
        return intersect(i18nConversionCategory, i18nConversionCategory2) == i18nConversionCategory;
    }

    public static I18nConversionCategory intersect(I18nConversionCategory i18nConversionCategory, I18nConversionCategory i18nConversionCategory2) {
        I18nConversionCategory i18nConversionCategory3 = UNUSED;
        if (i18nConversionCategory == i18nConversionCategory3) {
            return i18nConversionCategory2;
        }
        if (i18nConversionCategory2 == i18nConversionCategory3) {
            return i18nConversionCategory;
        }
        I18nConversionCategory i18nConversionCategory4 = GENERAL;
        if (i18nConversionCategory == i18nConversionCategory4) {
            return i18nConversionCategory2;
        }
        if (i18nConversionCategory2 == i18nConversionCategory4) {
            return i18nConversionCategory;
        }
        Set arrayToSet = arrayToSet(i18nConversionCategory.types);
        arrayToSet.retainAll(arrayToSet(i18nConversionCategory2.types));
        I18nConversionCategory[] i18nConversionCategoryArr = {DATE, NUMBER};
        for (int i = 0; i < 2; i++) {
            I18nConversionCategory i18nConversionCategory5 = i18nConversionCategoryArr[i];
            if (arrayToSet(i18nConversionCategory5.types).equals(arrayToSet)) {
                return i18nConversionCategory5;
            }
        }
        throw new RuntimeException();
    }

    public static I18nConversionCategory union(I18nConversionCategory i18nConversionCategory, I18nConversionCategory i18nConversionCategory2) {
        I18nConversionCategory i18nConversionCategory3 = UNUSED;
        return (i18nConversionCategory == i18nConversionCategory3 || i18nConversionCategory2 == i18nConversionCategory3 || i18nConversionCategory == (i18nConversionCategory3 = GENERAL) || i18nConversionCategory2 == i18nConversionCategory3 || i18nConversionCategory == (i18nConversionCategory3 = DATE) || i18nConversionCategory2 == i18nConversionCategory3) ? i18nConversionCategory3 : NUMBER;
    }

    public boolean isAssignableFrom(Class<?> cls) {
        if (this.types == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : this.types) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder(name());
        if (this.types == null) {
            sb.append(" conversion category (all types)");
        } else {
            StringJoiner m = Platform$$ExternalSyntheticApiModelOutline0.m(", ", " conversion category (one of: ", ")");
            for (Class<?> cls : this.types) {
                m.add(cls.getCanonicalName());
            }
            sb.append(m);
        }
        return sb.toString();
    }
}
