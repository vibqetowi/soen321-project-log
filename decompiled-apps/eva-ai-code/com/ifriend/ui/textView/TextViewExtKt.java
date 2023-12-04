package com.ifriend.ui.textView;

import android.widget.TextView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextViewExt.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a-\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"setQuantityTextResource", "", "Landroid/widget/TextView;", "id", "", "count", "setTextResource", "formatArgs", "", "", "(Landroid/widget/TextView;I[Ljava/lang/Object;)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextViewExtKt {
    public static final void setTextResource(TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setText(textView.getResources().getString(i));
    }

    public static final void setTextResource(TextView textView, int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        textView.setText(textView.getResources().getString(i, Arrays.copyOf(formatArgs, formatArgs.length)));
    }

    public static final void setQuantityTextResource(TextView textView, int i, int i2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setText(textView.getResources().getQuantityString(i, i2, Integer.valueOf(i2)));
    }
}
