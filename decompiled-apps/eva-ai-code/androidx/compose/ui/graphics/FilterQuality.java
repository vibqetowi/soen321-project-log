package androidx.compose.ui.graphics;

import com.facebook.internal.AnalyticsEvents;
import com.ifriend.keychain.KeychainModule;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FilterQuality.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/FilterQuality;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class FilterQuality {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m3379constructorimpl(0);
    private static final int Low = m3379constructorimpl(1);
    private static final int Medium = m3379constructorimpl(2);
    private static final int High = m3379constructorimpl(3);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FilterQuality m3378boximpl(int i) {
        return new FilterQuality(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m3379constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m3380equalsimpl(int i, Object obj) {
        return (obj instanceof FilterQuality) && i == ((FilterQuality) obj).m3384unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m3381equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m3382hashCodeimpl(int i) {
        return i;
    }

    public boolean equals(Object obj) {
        return m3380equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3382hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m3384unboximpl() {
        return this.value;
    }

    private /* synthetic */ FilterQuality(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: FilterQuality.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/FilterQuality$Companion;", "", "()V", "High", "Landroidx/compose/ui/graphics/FilterQuality;", "getHigh-f-v9h1I", "()I", "I", "Low", "getLow-f-v9h1I", "Medium", "getMedium-f-v9h1I", KeychainModule.AccessControl.NONE, "getNone-f-v9h1I", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNone-f-v9h1I  reason: not valid java name */
        public final int m3388getNonefv9h1I() {
            return FilterQuality.None;
        }

        /* renamed from: getLow-f-v9h1I  reason: not valid java name */
        public final int m3386getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I  reason: not valid java name */
        public final int m3387getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* renamed from: getHigh-f-v9h1I  reason: not valid java name */
        public final int m3385getHighfv9h1I() {
            return FilterQuality.High;
        }
    }

    public String toString() {
        return m3383toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m3383toStringimpl(int i) {
        return m3381equalsimpl0(i, None) ? KeychainModule.AccessControl.NONE : m3381equalsimpl0(i, Low) ? "Low" : m3381equalsimpl0(i, Medium) ? "Medium" : m3381equalsimpl0(i, High) ? "High" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}