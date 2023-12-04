package com.ifriend.common_utils.extensions;

import com.facebook.share.internal.ShareInternalUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
/* compiled from: string.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"EMPTY_AMOUNT", "", "EMPTY_BLANK_STRING", "EMPTY_STRING", "NEW_LINE", "isNumeric", "", "(Ljava/lang/String;)Z", "isLocalUrl", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringKt {
    public static final String EMPTY_AMOUNT = "0";
    public static final String EMPTY_BLANK_STRING = " ";
    public static final String EMPTY_STRING = "";
    public static final String NEW_LINE = "\n";

    public static final boolean isLocalUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.startsWith(str, ShareInternalUtility.STAGING_PARAM, true);
    }

    public static final boolean isNumeric(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("-?[0-9]+(\\.[0-9]+)?").matches(str);
    }
}
