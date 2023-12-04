package androidx.compose.ui.text.style;

import com.ifriend.keychain.KeychainModule;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextMotion.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u001a\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J)\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001f\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "linearity", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "subpixelTextPositioning", "", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLinearity-4e0Vf04$ui_text_release", "()I", "I", "getSubpixelTextPositioning$ui_text_release", "()Z", "copy", "copy-JdDtMQo$ui_text_release", "(IZ)Landroidx/compose/ui/text/style/TextMotion;", "equals", "other", "hashCode", "", "toString", "", "Companion", "Linearity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextMotion {
    public static final int $stable = 0;
    private final int linearity;
    private final boolean subpixelTextPositioning;
    public static final Companion Companion = new Companion(null);
    private static final TextMotion Static = new TextMotion(Linearity.Companion.m5503getFontHinting4e0Vf04(), false, null);
    private static final TextMotion Animated = new TextMotion(Linearity.Companion.m5504getLinear4e0Vf04(), true, null);

    public /* synthetic */ TextMotion(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    private TextMotion(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text_release  reason: not valid java name */
    public final int m5495getLinearity4e0Vf04$ui_text_release() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.subpixelTextPositioning;
    }

    /* compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "()V", "Animated", "Landroidx/compose/ui/text/style/TextMotion;", "getAnimated", "()Landroidx/compose/ui/text/style/TextMotion;", "Static", "getStatic", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextMotion getStatic() {
            return TextMotion.Static;
        }

        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }
    }

    /* renamed from: copy-JdDtMQo$ui_text_release$default  reason: not valid java name */
    public static /* synthetic */ TextMotion m5493copyJdDtMQo$ui_text_release$default(TextMotion textMotion, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textMotion.linearity;
        }
        if ((i2 & 2) != 0) {
            z = textMotion.subpixelTextPositioning;
        }
        return textMotion.m5494copyJdDtMQo$ui_text_release(i, z);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release  reason: not valid java name */
    public final TextMotion m5494copyJdDtMQo$ui_text_release(int i, boolean z) {
        return new TextMotion(i, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextMotion) {
            TextMotion textMotion = (TextMotion) obj;
            return Linearity.m5499equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
        }
        return false;
    }

    public int hashCode() {
        return (Linearity.m5500hashCodeimpl(this.linearity) * 31) + UByte$$ExternalSyntheticBackport0.m(this.subpixelTextPositioning);
    }

    public String toString() {
        return Intrinsics.areEqual(this, Static) ? "TextMotion.Static" : Intrinsics.areEqual(this, Animated) ? "TextMotion.Animated" : "Invalid";
    }

    /* compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    /* loaded from: classes3.dex */
    public static final class Linearity {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Linear = m5497constructorimpl(1);
        private static final int FontHinting = m5497constructorimpl(2);
        private static final int None = m5497constructorimpl(3);

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Linearity m5496boximpl(int i) {
            return new Linearity(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        private static int m5497constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m5498equalsimpl(int i, Object obj) {
            return (obj instanceof Linearity) && i == ((Linearity) obj).m5502unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m5499equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m5500hashCodeimpl(int i) {
            return i;
        }

        public boolean equals(Object obj) {
            return m5498equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5500hashCodeimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m5502unboximpl() {
            return this.value;
        }

        /* compiled from: TextMotion.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "()V", "FontHinting", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "getFontHinting-4e0Vf04", "()I", "I", "Linear", "getLinear-4e0Vf04", KeychainModule.AccessControl.NONE, "getNone-4e0Vf04", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getLinear-4e0Vf04  reason: not valid java name */
            public final int m5504getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getFontHinting-4e0Vf04  reason: not valid java name */
            public final int m5503getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getNone-4e0Vf04  reason: not valid java name */
            public final int m5505getNone4e0Vf04() {
                return Linearity.None;
            }
        }

        private /* synthetic */ Linearity(int i) {
            this.value = i;
        }

        public String toString() {
            return m5501toStringimpl(this.value);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m5501toStringimpl(int i) {
            return m5499equalsimpl0(i, Linear) ? "Linearity.Linear" : m5499equalsimpl0(i, FontHinting) ? "Linearity.FontHinting" : m5499equalsimpl0(i, None) ? "Linearity.None" : "Invalid";
        }
    }
}
