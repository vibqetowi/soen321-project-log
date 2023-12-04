package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BoringLayoutFactory.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jf\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\nH\u0007J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0004¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/android/BoringLayoutFactory33;", "", "()V", "create", "Landroid/text/BoringLayout;", "text", "", "paint", "Landroid/text/TextPaint;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", "alignment", "Landroid/text/Layout$Alignment;", "lineSpacingMultiplier", "", "lineSpacingExtra", "metrics", "Landroid/text/BoringLayout$Metrics;", "includePadding", "", "useFallbackLineSpacing", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "isBoring", "textDir", "Landroid/text/TextDirectionHeuristic;", "isFallbackLineSpacingEnabled", TtmlNode.TAG_LAYOUT, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BoringLayoutFactory33 {
    public static final BoringLayoutFactory33 INSTANCE = new BoringLayoutFactory33();

    private BoringLayoutFactory33() {
    }

    @JvmStatic
    public static final BoringLayout.Metrics isBoring(CharSequence text, TextPaint paint, TextDirectionHeuristic textDir) {
        BoringLayout.Metrics isBoring;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        isBoring = BoringLayout.isBoring(text, paint, textDir, true, null);
        return isBoring;
    }

    @JvmStatic
    public static final BoringLayout create(CharSequence text, TextPaint paint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return Paint29$$ExternalSyntheticApiModelOutline0.m(text, paint, i, alignment, f, f2, metrics, z, truncateAt, i2, z2);
    }

    public final boolean isFallbackLineSpacingEnabled(BoringLayout layout) {
        boolean isFallbackLineSpacingEnabled;
        Intrinsics.checkNotNullParameter(layout, "layout");
        isFallbackLineSpacingEnabled = layout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }
}
