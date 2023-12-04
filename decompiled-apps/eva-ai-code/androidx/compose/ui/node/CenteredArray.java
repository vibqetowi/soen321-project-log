package androidx.compose.ui.node;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tJ \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/CenteredArray;", "", "data", "", "constructor-impl", "([I)[I", "mid", "", "getMid-impl", "([I)I", "equals", "", "other", "equals-impl", "([ILjava/lang/Object;)Z", "get", FirebaseAnalytics.Param.INDEX, "get-impl", "([II)I", "hashCode", "hashCode-impl", "set", "", "value", "set-impl", "([III)V", "toString", "", "toString-impl", "([I)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes3.dex */
final class CenteredArray {
    private final int[] data;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ CenteredArray m4645boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int[] m4646constructorimpl(int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m4647equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && Intrinsics.areEqual(iArr, ((CenteredArray) obj).m4654unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m4648equalsimpl0(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m4651hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m4653toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m4647equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m4651hashCodeimpl(this.data);
    }

    public String toString() {
        return m4653toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int[] m4654unboximpl() {
        return this.data;
    }

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: getMid-impl  reason: not valid java name */
    private static final int m4650getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: get-impl  reason: not valid java name */
    public static final int m4649getimpl(int[] iArr, int i) {
        return iArr[i + m4650getMidimpl(iArr)];
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m4652setimpl(int[] iArr, int i, int i2) {
        iArr[i + m4650getMidimpl(iArr)] = i2;
    }
}
