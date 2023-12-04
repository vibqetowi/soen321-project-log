package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Colors.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bp\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0095\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020BH\u0016R4\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R4\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00108F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u000f\u0010\u001c\"\u0004\b\u001d\u0010\u001eR4\u0010\f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R4\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R4\u0010\n\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R4\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0018\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R4\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0018\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0018\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R4\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0018\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u0016R4\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0018\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u0016R4\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0018\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R4\u0010\b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b=\u0010\u0018\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/material/Colors;", "", "primary", "Landroidx/compose/ui/graphics/Color;", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "isLight", "", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "getBackground-0d7_KjU", "()J", "setBackground-8_81llA$material_release", "(J)V", "background$delegate", "Landroidx/compose/runtime/MutableState;", "getError-0d7_KjU", "setError-8_81llA$material_release", "error$delegate", "()Z", "setLight$material_release", "(Z)V", "isLight$delegate", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material_release", "onBackground$delegate", "getOnError-0d7_KjU", "setOnError-8_81llA$material_release", "onError$delegate", "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material_release", "onPrimary$delegate", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material_release", "onSecondary$delegate", "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material_release", "onSurface$delegate", "getPrimary-0d7_KjU", "setPrimary-8_81llA$material_release", "primary$delegate", "getPrimaryVariant-0d7_KjU", "setPrimaryVariant-8_81llA$material_release", "primaryVariant$delegate", "getSecondary-0d7_KjU", "setSecondary-8_81llA$material_release", "secondary$delegate", "getSecondaryVariant-0d7_KjU", "setSecondaryVariant-8_81llA$material_release", "secondaryVariant$delegate", "getSurface-0d7_KjU", "setSurface-8_81llA$material_release", "surface$delegate", "copy", "copy-pvPzIIM", "(JJJJJJJJJJJJZ)Landroidx/compose/material/Colors;", "toString", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Colors {
    public static final int $stable = 0;
    private final MutableState background$delegate;
    private final MutableState error$delegate;
    private final MutableState isLight$delegate;
    private final MutableState onBackground$delegate;
    private final MutableState onError$delegate;
    private final MutableState onPrimary$delegate;
    private final MutableState onSecondary$delegate;
    private final MutableState onSurface$delegate;
    private final MutableState primary$delegate;
    private final MutableState primaryVariant$delegate;
    private final MutableState secondary$delegate;
    private final MutableState secondaryVariant$delegate;
    private final MutableState surface$delegate;

    public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z);
    }

    private Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight$delegate = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z), SnapshotStateKt.structuralEqualityPolicy());
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m1309getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setPrimary-8_81llA$material_release  reason: not valid java name */
    public final void m1321setPrimary8_81llA$material_release(long j) {
        this.primary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getPrimaryVariant-0d7_KjU  reason: not valid java name */
    public final long m1310getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setPrimaryVariant-8_81llA$material_release  reason: not valid java name */
    public final void m1322setPrimaryVariant8_81llA$material_release(long j) {
        this.primaryVariant$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m1311getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setSecondary-8_81llA$material_release  reason: not valid java name */
    public final void m1323setSecondary8_81llA$material_release(long j) {
        this.secondary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getSecondaryVariant-0d7_KjU  reason: not valid java name */
    public final long m1312getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setSecondaryVariant-8_81llA$material_release  reason: not valid java name */
    public final void m1324setSecondaryVariant8_81llA$material_release(long j) {
        this.secondaryVariant$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m1302getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setBackground-8_81llA$material_release  reason: not valid java name */
    public final void m1314setBackground8_81llA$material_release(long j) {
        this.background$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m1313getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setSurface-8_81llA$material_release  reason: not valid java name */
    public final void m1325setSurface8_81llA$material_release(long j) {
        this.surface$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m1303getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setError-8_81llA$material_release  reason: not valid java name */
    public final void m1315setError8_81llA$material_release(long j) {
        this.error$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m1306getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnPrimary-8_81llA$material_release  reason: not valid java name */
    public final void m1318setOnPrimary8_81llA$material_release(long j) {
        this.onPrimary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m1307getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnSecondary-8_81llA$material_release  reason: not valid java name */
    public final void m1319setOnSecondary8_81llA$material_release(long j) {
        this.onSecondary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m1304getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnBackground-8_81llA$material_release  reason: not valid java name */
    public final void m1316setOnBackground8_81llA$material_release(long j) {
        this.onBackground$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m1308getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnSurface-8_81llA$material_release  reason: not valid java name */
    public final void m1320setOnSurface8_81llA$material_release(long j) {
        this.onSurface$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m1305getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnError-8_81llA$material_release  reason: not valid java name */
    public final void m1317setOnError8_81llA$material_release(long j) {
        this.onError$delegate.setValue(Color.m3281boximpl(j));
    }

    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }

    public final void setLight$material_release(boolean z) {
        this.isLight$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: copy-pvPzIIM  reason: not valid java name */
    public final Colors m1301copypvPzIIM(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z, null);
    }

    public String toString() {
        return "Colors(primary=" + ((Object) Color.m3299toStringimpl(m1309getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m3299toStringimpl(m1310getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m3299toStringimpl(m1311getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m3299toStringimpl(m1312getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m3299toStringimpl(m1302getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m3299toStringimpl(m1313getSurface0d7_KjU())) + ", error=" + ((Object) Color.m3299toStringimpl(m1303getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m3299toStringimpl(m1306getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m3299toStringimpl(m1307getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m3299toStringimpl(m1304getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m3299toStringimpl(m1308getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m3299toStringimpl(m1305getOnError0d7_KjU())) + ", isLight=" + isLight() + ')';
    }
}
