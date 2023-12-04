package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Color;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextSelectionColors.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001c\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "handleColor", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getHandleColor-0d7_KjU", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextSelectionColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long handleColor;

    public /* synthetic */ TextSelectionColors(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private TextSelectionColors(long j, long j2) {
        this.handleColor = j;
        this.backgroundColor = j2;
    }

    /* renamed from: getHandleColor-0d7_KjU  reason: not valid java name */
    public final long m1229getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    /* renamed from: getBackgroundColor-0d7_KjU  reason: not valid java name */
    public final long m1228getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextSelectionColors) {
            TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
            return Color.m3292equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m3292equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
        }
        return false;
    }

    public int hashCode() {
        return (Color.m3298hashCodeimpl(this.handleColor) * 31) + Color.m3298hashCodeimpl(this.backgroundColor);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m3299toStringimpl(this.handleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m3299toStringimpl(this.backgroundColor)) + ')';
    }
}
