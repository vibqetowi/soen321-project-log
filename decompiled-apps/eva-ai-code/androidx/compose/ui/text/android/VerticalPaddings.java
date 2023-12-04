package androidx.compose.ui.text.android;

import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.JvmInline;
/* compiled from: TextLayout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/android/VerticalPaddings;", "", "packedValue", "", "constructor-impl", "(J)J", "bottomPadding", "", "getBottomPadding-impl", "(J)I", "topPadding", "getTopPadding-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class VerticalPaddings {
    private final long packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m5137boximpl(long j) {
        return new VerticalPaddings(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m5138constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m5139equalsimpl(long j, Object obj) {
        return (obj instanceof VerticalPaddings) && j == ((VerticalPaddings) obj).m5145unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m5140equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getBottomPadding-impl  reason: not valid java name */
    public static final int m5141getBottomPaddingimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getTopPadding-impl  reason: not valid java name */
    public static final int m5142getTopPaddingimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m5143hashCodeimpl(long j) {
        return UByte$$ExternalSyntheticBackport0.m(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m5144toStringimpl(long j) {
        return "VerticalPaddings(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m5139equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5143hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5144toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m5145unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ VerticalPaddings(long j) {
        this.packedValue = j;
    }
}
