package com.ifriend.analytics.impl.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: processedmessage.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\b\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a\f\u0010\n\u001a\u00020\u0006*\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"MAX_ERROR_MESSAGE_SIZE", "", "MAX_KEY_SIZE", "MAX_MESSAGE_SIZE", "MAX_NETWORK_MESSAGE_SIZE", "processedErrorMessage", "", "processedEventName", "processedMessage", "maxSize", "processedNetworkMessage", "impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProcessedmessageKt {
    public static final int MAX_ERROR_MESSAGE_SIZE = 255;
    public static final int MAX_KEY_SIZE = 40;
    public static final int MAX_MESSAGE_SIZE = 100;
    public static final int MAX_NETWORK_MESSAGE_SIZE = 255;

    public static final String processedEventName(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return processedMessage(str, 40);
    }

    public static final String processedMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return processedMessage(str, 100);
    }

    public static final String processedErrorMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return processedMessage(str, 255);
    }

    public static final String processedNetworkMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return processedMessage(str, 255);
    }

    private static final String processedMessage(String str, int i) {
        if (str.length() > i) {
            String substring = str.substring(0, i - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }
}
