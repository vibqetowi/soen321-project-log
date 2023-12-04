package com.ifriend.ui.components.ext;

import android.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.client.config.CookieSpecs;
/* compiled from: string.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"hexToColor", "Landroidx/compose/ui/graphics/Color;", "", "(Ljava/lang/String;)J", "hexToColorSafe", CookieSpecs.DEFAULT, "hexToColorSafe-4WTKRHQ", "(Ljava/lang/String;J)J", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringKt {
    public static final long hexToColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return ColorKt.Color(Color.parseColor(str));
    }

    /* renamed from: hexToColorSafe-4WTKRHQ  reason: not valid java name */
    public static final long m7040hexToColorSafe4WTKRHQ(String hexToColorSafe, long j) {
        Intrinsics.checkNotNullParameter(hexToColorSafe, "$this$hexToColorSafe");
        try {
            return ColorKt.Color(Color.parseColor(hexToColorSafe));
        } catch (Throwable unused) {
            return j;
        }
    }
}
