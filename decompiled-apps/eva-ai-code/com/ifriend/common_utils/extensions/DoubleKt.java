package com.ifriend.common_utils.extensions;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: double.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toPrecision", "", "", "precision", "", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DoubleKt {
    public static /* synthetic */ String toPrecision$default(double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return toPrecision(d, i);
    }

    public static final String toPrecision(double d, int i) {
        String format = String.format("%." + i + "f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }
}
