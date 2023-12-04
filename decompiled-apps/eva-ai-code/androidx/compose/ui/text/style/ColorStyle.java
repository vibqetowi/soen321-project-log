package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.style.TextForegroundStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0012\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ \u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0010\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/style/ColorStyle;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "value", "Landroidx/compose/ui/graphics/Color;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "alpha", "", "getAlpha", "()F", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "getColor-0d7_KjU", "()J", "getValue-0d7_KjU", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Landroidx/compose/ui/text/style/ColorStyle;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColorStyle implements TextForegroundStyle {
    private final long value;

    public /* synthetic */ ColorStyle(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: copy-8_81llA$default  reason: not valid java name */
    public static /* synthetic */ ColorStyle m5377copy8_81llA$default(ColorStyle colorStyle, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = colorStyle.value;
        }
        return colorStyle.m5379copy8_81llA(j);
    }

    /* renamed from: component1-0d7_KjU  reason: not valid java name */
    public final long m5378component10d7_KjU() {
        return this.value;
    }

    /* renamed from: copy-8_81llA  reason: not valid java name */
    public final ColorStyle m5379copy8_81llA(long j) {
        return new ColorStyle(j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.m3292equalsimpl0(this.value, ((ColorStyle) obj).value);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return null;
    }

    public int hashCode() {
        return Color.m3298hashCodeimpl(this.value);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        return TextForegroundStyle.CC.$default$merge(this, textForegroundStyle);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle takeOrElse(Function0 function0) {
        return TextForegroundStyle.CC.$default$takeOrElse(this, function0);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m3299toStringimpl(this.value)) + ')';
    }

    private ColorStyle(long j) {
        this.value = j;
        if (!(j != Color.Companion.m3327getUnspecified0d7_KjU())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    /* renamed from: getValue-0d7_KjU  reason: not valid java name */
    public final long m5380getValue0d7_KjU() {
        return this.value;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo5376getColor0d7_KjU() {
        return this.value;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m3293getAlphaimpl(mo5376getColor0d7_KjU());
    }
}
