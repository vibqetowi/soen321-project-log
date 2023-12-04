package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LineHeightSpan.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J8\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "lineHeight", "", "(F)V", "getLineHeight", "()F", "chooseHeight", "", "text", "", TtmlNode.START, "", TtmlNode.END, "spanstartVertical", "fontMetricsInt", "Landroid/graphics/Paint$FontMetricsInt;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    private final float lineHeight;

    public LineHeightSpan(float f) {
        this.lineHeight = f;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        int lineHeight = LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        if (lineHeight <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(this.lineHeight);
        fontMetricsInt.descent = (int) Math.ceil(fontMetricsInt.descent * ((ceil * 1.0f) / lineHeight));
        fontMetricsInt.ascent = fontMetricsInt.descent - ceil;
    }
}
