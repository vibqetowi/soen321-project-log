package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: StaticLayoutFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory33;", "", "()V", "isFallbackLineSpacingEnabled", "", TtmlNode.TAG_LAYOUT, "Landroid/text/StaticLayout;", "setLineBreakConfig", "", "builder", "Landroid/text/StaticLayout$Builder;", "lineBreakStyle", "", "lineBreakWordStyle", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class StaticLayoutFactory33 {
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    @JvmStatic
    public static final boolean isFallbackLineSpacingEnabled(StaticLayout layout) {
        boolean isFallbackLineSpacingEnabled;
        Intrinsics.checkNotNullParameter(layout, "layout");
        isFallbackLineSpacingEnabled = layout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    @JvmStatic
    public static final void setLineBreakConfig(StaticLayout.Builder builder, int i, int i2) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        Intrinsics.checkNotNullParameter(builder, "builder");
        lineBreakStyle = Paint29$$ExternalSyntheticApiModelOutline0.m5119m().setLineBreakStyle(i);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i2);
        build = lineBreakWordStyle.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(build);
    }
}
