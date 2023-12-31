package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/FabPosition;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class FabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Center = m1373constructorimpl(0);
    private static final int End = m1373constructorimpl(1);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FabPosition m1372boximpl(int i) {
        return new FabPosition(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1373constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1374equalsimpl(int i, Object obj) {
        return (obj instanceof FabPosition) && i == ((FabPosition) obj).m1378unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1375equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1376hashCodeimpl(int i) {
        return i;
    }

    public boolean equals(Object obj) {
        return m1374equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1376hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1378unboximpl() {
        return this.value;
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material/FabPosition$Companion;", "", "()V", "Center", "Landroidx/compose/material/FabPosition;", "getCenter-5ygKITE", "()I", "I", "End", "getEnd-5ygKITE", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getCenter-5ygKITE  reason: not valid java name */
        public final int m1379getCenter5ygKITE() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-5ygKITE  reason: not valid java name */
        public final int m1380getEnd5ygKITE() {
            return FabPosition.End;
        }
    }

    private /* synthetic */ FabPosition(int i) {
        this.value = i;
    }

    public String toString() {
        return m1377toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1377toStringimpl(int i) {
        return m1375equalsimpl0(i, Center) ? "FabPosition.Center" : "FabPosition.End";
    }
}
