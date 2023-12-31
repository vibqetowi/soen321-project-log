package io.opencensus.tags;

import io.opencensus.internal.StringUtils;
import io.opencensus.internal.Utils;
/* loaded from: classes4.dex */
public abstract class TagValue {
    public static final int MAX_LENGTH = 255;

    public abstract String asString();

    public static TagValue create(String str) {
        Utils.checkArgument(isValid(str), "Invalid TagValue: %s", str);
        return new AutoValue_TagValue(str);
    }

    private static boolean isValid(String str) {
        return str.length() <= 255 && StringUtils.isPrintableString(str);
    }
}
