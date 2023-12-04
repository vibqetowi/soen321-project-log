package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: AndroidOverscroll.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010-\u001a\u00020!H\u0002JE\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\"\u00101\u001a\u001e\b\u0001\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020003\u0012\u0006\u0012\u0004\u0018\u00010402H\u0096@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b5\u00106J9\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\u001fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\b\u0010>\u001a\u00020!H\u0002J%\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ%\u0010E\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010DJ%\u0010G\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010DJ%\u0010I\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010DJ\u001d\u0010K\u001a\u00020\u00142\u0006\u00108\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\b\u0010N\u001a\u00020\u0014H\u0002J \u0010O\u001a\u00020\u0014*\u00020P2\u0006\u0010Q\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J \u0010U\u001a\u00020\u0014*\u00020P2\u0006\u0010V\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J\n\u0010W\u001a\u00020!*\u00020PJ \u0010X\u001a\u00020\u0014*\u00020P2\u0006\u0010Y\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J \u0010Z\u001a\u00020\u0014*\u00020P2\u0006\u0010[\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\u00020\rX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fX\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0019\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020!0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "context", "Landroid/content/Context;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "allEffects", "", "Landroid/widget/EdgeEffect;", "bottomEffect", "bottomEffectNegation", "containerSize", "Landroidx/compose/ui/geometry/Size;", "J", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "invalidationEnabled", "", "getInvalidationEnabled$foundation_release$annotations", "()V", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "isInProgress", "leftEffect", "leftEffectNegation", "onNewSize", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "rightEffect", "rightEffectNegation", "scrollCycleInProgress", "topEffect", "topEffectNegation", "animateToRelease", "applyToFling", "velocity", "Landroidx/compose/ui/unit/Velocity;", "performFling", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToScroll", "delta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "performScroll", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "invalidateOverscroll", "pullBottom", "", "scroll", "displacement", "pullBottom-0a9Yr6o", "(JJ)F", "pullLeft", "pullLeft-0a9Yr6o", "pullRight", "pullRight-0a9Yr6o", "pullTop", "pullTop-0a9Yr6o", "releaseOppositeOverscroll", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "stopOverscrollAnimation", "drawBottom", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "bottom", "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawLeft", "left", "drawOverscroll", "drawRight", TtmlNode.RIGHT, "drawTop", ViewHierarchyConstants.DIMENSION_TOP_KEY, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    private final List<EdgeEffect> allEffects;
    private final EdgeEffect bottomEffect;
    private final EdgeEffect bottomEffectNegation;
    private long containerSize;
    private final Modifier effectModifier;
    private boolean invalidationEnabled;
    private final EdgeEffect leftEffect;
    private final EdgeEffect leftEffectNegation;
    private final Function1<IntSize, Unit> onNewSize;
    private final OverscrollConfiguration overscrollConfig;
    private PointerId pointerId;
    private Offset pointerPosition;
    private final MutableState<Unit> redrawSignal;
    private final EdgeEffect rightEffect;
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;
    private final EdgeEffect topEffect;
    private final EdgeEffect topEffectNegation;

    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfig) {
        Modifier modifier;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overscrollConfig, "overscrollConfig");
        this.overscrollConfig = overscrollConfig;
        EdgeEffect create = EdgeEffectCompat.INSTANCE.create(context, null);
        this.topEffect = create;
        EdgeEffect create2 = EdgeEffectCompat.INSTANCE.create(context, null);
        this.bottomEffect = create2;
        EdgeEffect create3 = EdgeEffectCompat.INSTANCE.create(context, null);
        this.leftEffect = create3;
        EdgeEffect create4 = EdgeEffectCompat.INSTANCE.create(context, null);
        this.rightEffect = create4;
        List<EdgeEffect> listOf = CollectionsKt.listOf((Object[]) new EdgeEffect[]{create3, create, create4, create2});
        this.allEffects = listOf;
        this.topEffectNegation = EdgeEffectCompat.INSTANCE.create(context, null);
        this.bottomEffectNegation = EdgeEffectCompat.INSTANCE.create(context, null);
        this.leftEffectNegation = EdgeEffectCompat.INSTANCE.create(context, null);
        this.rightEffectNegation = EdgeEffectCompat.INSTANCE.create(context, null);
        int size = listOf.size();
        for (int i = 0; i < size; i++) {
            listOf.get(i).setColor(ColorKt.m3345toArgb8_81llA(this.overscrollConfig.m503getGlowColor0d7_KjU()));
        }
        this.redrawSignal = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m3096getZeroNHjbRc();
        AndroidEdgeEffectOverscrollEffect$onNewSize$1 androidEdgeEffectOverscrollEffect$onNewSize$1 = new AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        this.onNewSize = androidEdgeEffectOverscrollEffect$onNewSize$1;
        Modifier.Companion companion = Modifier.Companion;
        modifier = AndroidOverscrollKt.StretchOverscrollNonClippingLayer;
        this.effectModifier = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(companion.then(modifier), Unit.INSTANCE, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), androidEdgeEffectOverscrollEffect$onNewSize$1).then(new DrawOverscrollModifier(this, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1(this) : InspectableValueKt.getNoInspectorInfo()));
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.invalidationEnabled;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.invalidationEnabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0188 A[ADDED_TO_REGION] */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo416applyToScrollRhakbz0(long j, int i, Function1<? super Offset, Offset> performScroll) {
        float m410pullBottom0a9Yr6o;
        long Offset;
        boolean z;
        boolean z2;
        boolean z3;
        float m412pullRight0a9Yr6o;
        Intrinsics.checkNotNullParameter(performScroll, "performScroll");
        if (Size.m3089isEmptyimpl(this.containerSize)) {
            return performScroll.invoke(Offset.m3007boximpl(j)).m3028unboximpl();
        }
        boolean z4 = true;
        if (!this.scrollCycleInProgress) {
            stopOverscrollAnimation();
            this.scrollCycleInProgress = true;
        }
        Offset offset = this.pointerPosition;
        long m3028unboximpl = offset != null ? offset.m3028unboximpl() : SizeKt.m3097getCenteruvyYCjk(this.containerSize);
        float f = 0.0f;
        if (!(Offset.m3019getYimpl(j) == 0.0f)) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) == 0.0f)) {
                m410pullBottom0a9Yr6o = m413pullTop0a9Yr6o(j, m3028unboximpl);
                if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) == 0.0f) {
                    this.topEffect.onRelease();
                }
            } else {
                if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f)) {
                    m410pullBottom0a9Yr6o = m410pullBottom0a9Yr6o(j, m3028unboximpl);
                    if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f) {
                        this.bottomEffect.onRelease();
                    }
                }
            }
            if (!(Offset.m3018getXimpl(j) != 0.0f)) {
                if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) == 0.0f)) {
                    m412pullRight0a9Yr6o = m411pullLeft0a9Yr6o(j, m3028unboximpl);
                    if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) == 0.0f) {
                        this.leftEffect.onRelease();
                    }
                } else {
                    if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) == 0.0f)) {
                        m412pullRight0a9Yr6o = m412pullRight0a9Yr6o(j, m3028unboximpl);
                        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) == 0.0f) {
                            this.rightEffect.onRelease();
                        }
                    }
                }
                f = m412pullRight0a9Yr6o;
            }
            Offset = OffsetKt.Offset(f, m410pullBottom0a9Yr6o);
            if (!Offset.m3015equalsimpl0(Offset, Offset.Companion.m3034getZeroF1C5BW0())) {
                invalidateOverscroll();
            }
            long m3022minusMKHz9U = Offset.m3022minusMKHz9U(j, Offset);
            long m3028unboximpl2 = performScroll.invoke(Offset.m3007boximpl(m3022minusMKHz9U)).m3028unboximpl();
            long m3022minusMKHz9U2 = Offset.m3022minusMKHz9U(m3022minusMKHz9U, m3028unboximpl2);
            if (NestedScrollSource.m4317equalsimpl0(i, NestedScrollSource.Companion.m4322getDragWNlRxjI())) {
                if (Offset.m3018getXimpl(m3022minusMKHz9U2) > 0.5f) {
                    m411pullLeft0a9Yr6o(m3022minusMKHz9U2, m3028unboximpl);
                } else if (Offset.m3018getXimpl(m3022minusMKHz9U2) < -0.5f) {
                    m412pullRight0a9Yr6o(m3022minusMKHz9U2, m3028unboximpl);
                } else {
                    z2 = false;
                    if (Offset.m3019getYimpl(m3022minusMKHz9U2) <= 0.5f) {
                        m413pullTop0a9Yr6o(m3022minusMKHz9U2, m3028unboximpl);
                    } else if (Offset.m3019getYimpl(m3022minusMKHz9U2) < -0.5f) {
                        m410pullBottom0a9Yr6o(m3022minusMKHz9U2, m3028unboximpl);
                    } else {
                        z3 = false;
                        if (!z2 || z3) {
                            z = true;
                            if (!m414releaseOppositeOverscrollk4lQ0M(j) && !z) {
                                z4 = false;
                            }
                            if (z4) {
                                invalidateOverscroll();
                            }
                            return Offset.m3023plusMKHz9U(Offset, m3028unboximpl2);
                        }
                    }
                    z3 = true;
                    if (!z2) {
                    }
                    z = true;
                    if (!m414releaseOppositeOverscrollk4lQ0M(j)) {
                        z4 = false;
                    }
                    if (z4) {
                    }
                    return Offset.m3023plusMKHz9U(Offset, m3028unboximpl2);
                }
                z2 = true;
                if (Offset.m3019getYimpl(m3022minusMKHz9U2) <= 0.5f) {
                }
                z3 = true;
                if (!z2) {
                }
                z = true;
                if (!m414releaseOppositeOverscrollk4lQ0M(j)) {
                }
                if (z4) {
                }
                return Offset.m3023plusMKHz9U(Offset, m3028unboximpl2);
            }
            z = false;
            if (!m414releaseOppositeOverscrollk4lQ0M(j)) {
            }
            if (z4) {
            }
            return Offset.m3023plusMKHz9U(Offset, m3028unboximpl2);
        }
        m410pullBottom0a9Yr6o = 0.0f;
        if (!(Offset.m3018getXimpl(j) != 0.0f)) {
        }
        Offset = OffsetKt.Offset(f, m410pullBottom0a9Yr6o);
        if (!Offset.m3015equalsimpl0(Offset, Offset.Companion.m3034getZeroF1C5BW0())) {
        }
        long m3022minusMKHz9U3 = Offset.m3022minusMKHz9U(j, Offset);
        long m3028unboximpl22 = performScroll.invoke(Offset.m3007boximpl(m3022minusMKHz9U3)).m3028unboximpl();
        long m3022minusMKHz9U22 = Offset.m3022minusMKHz9U(m3022minusMKHz9U3, m3028unboximpl22);
        if (NestedScrollSource.m4317equalsimpl0(i, NestedScrollSource.Companion.m4322getDragWNlRxjI())) {
        }
        z = false;
        if (!m414releaseOppositeOverscrollk4lQ0M(j)) {
        }
        if (z4) {
        }
        return Offset.m3023plusMKHz9U(Offset, m3028unboximpl22);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo415applyToFlingBMRW4eQ(long j, Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        int i;
        float f;
        float f2;
        long Velocity;
        long m5835minusAH228Gc;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long m5835minusAH228Gc2;
        if (continuation instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuation;
            if ((androidEdgeEffectOverscrollEffect$applyToFling$1.label & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label -= Integer.MIN_VALUE;
                Object obj = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    } else if (i == 2) {
                        m5835minusAH228Gc = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
                        androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) androidEdgeEffectOverscrollEffect$applyToFling$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        m5835minusAH228Gc2 = Velocity.m5835minusAH228Gc(m5835minusAH228Gc, ((Velocity) obj).m5841unboximpl());
                        androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
                        if (Velocity.m5832getXimpl(m5835minusAH228Gc2) <= 0.0f) {
                            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.leftEffect, MathKt.roundToInt(Velocity.m5832getXimpl(m5835minusAH228Gc2)));
                        } else if (Velocity.m5832getXimpl(m5835minusAH228Gc2) < 0.0f) {
                            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.rightEffect, -MathKt.roundToInt(Velocity.m5832getXimpl(m5835minusAH228Gc2)));
                        }
                        if (Velocity.m5833getYimpl(m5835minusAH228Gc2) <= 0.0f) {
                            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.topEffect, MathKt.roundToInt(Velocity.m5833getYimpl(m5835minusAH228Gc2)));
                        } else if (Velocity.m5833getYimpl(m5835minusAH228Gc2) < 0.0f) {
                            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.bottomEffect, -MathKt.roundToInt(Velocity.m5833getYimpl(m5835minusAH228Gc2)));
                        }
                        if (!Velocity.m5831equalsimpl0(m5835minusAH228Gc2, Velocity.Companion.m5843getZero9UxMQ8M())) {
                            androidEdgeEffectOverscrollEffect.invalidateOverscroll();
                        }
                        androidEdgeEffectOverscrollEffect.animateToRelease();
                        return Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
                if (Size.m3089isEmptyimpl(this.containerSize)) {
                    Velocity m5823boximpl = Velocity.m5823boximpl(j);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
                    if (function2.invoke(m5823boximpl, androidEdgeEffectOverscrollEffect$applyToFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (Velocity.m5832getXimpl(j) > 0.0f) {
                    if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) == 0.0f)) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.leftEffect, MathKt.roundToInt(Velocity.m5832getXimpl(j)));
                        f = Velocity.m5832getXimpl(j);
                        if (Velocity.m5833getYimpl(j) > 0.0f) {
                            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) == 0.0f)) {
                                EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.topEffect, MathKt.roundToInt(Velocity.m5833getYimpl(j)));
                                f2 = Velocity.m5833getYimpl(j);
                                Velocity = VelocityKt.Velocity(f, f2);
                                if (!Velocity.m5831equalsimpl0(Velocity, Velocity.Companion.m5843getZero9UxMQ8M())) {
                                    invalidateOverscroll();
                                }
                                m5835minusAH228Gc = Velocity.m5835minusAH228Gc(j, Velocity);
                                Velocity m5823boximpl2 = Velocity.m5823boximpl(m5835minusAH228Gc);
                                androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
                                androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = m5835minusAH228Gc;
                                androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                                obj = function2.invoke(m5823boximpl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                androidEdgeEffectOverscrollEffect = this;
                                m5835minusAH228Gc2 = Velocity.m5835minusAH228Gc(m5835minusAH228Gc, ((Velocity) obj).m5841unboximpl());
                                androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
                                if (Velocity.m5832getXimpl(m5835minusAH228Gc2) <= 0.0f) {
                                }
                                if (Velocity.m5833getYimpl(m5835minusAH228Gc2) <= 0.0f) {
                                }
                                if (!Velocity.m5831equalsimpl0(m5835minusAH228Gc2, Velocity.Companion.m5843getZero9UxMQ8M())) {
                                }
                                androidEdgeEffectOverscrollEffect.animateToRelease();
                                return Unit.INSTANCE;
                            }
                        }
                        if (Velocity.m5833getYimpl(j) < 0.0f) {
                            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f)) {
                                EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.bottomEffect, -MathKt.roundToInt(Velocity.m5833getYimpl(j)));
                                f2 = Velocity.m5833getYimpl(j);
                                Velocity = VelocityKt.Velocity(f, f2);
                                if (!Velocity.m5831equalsimpl0(Velocity, Velocity.Companion.m5843getZero9UxMQ8M())) {
                                }
                                m5835minusAH228Gc = Velocity.m5835minusAH228Gc(j, Velocity);
                                Velocity m5823boximpl22 = Velocity.m5823boximpl(m5835minusAH228Gc);
                                androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
                                androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = m5835minusAH228Gc;
                                androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                                obj = function2.invoke(m5823boximpl22, androidEdgeEffectOverscrollEffect$applyToFling$1);
                                if (obj == coroutine_suspended) {
                                }
                            }
                        }
                        f2 = 0.0f;
                        Velocity = VelocityKt.Velocity(f, f2);
                        if (!Velocity.m5831equalsimpl0(Velocity, Velocity.Companion.m5843getZero9UxMQ8M())) {
                        }
                        m5835minusAH228Gc = Velocity.m5835minusAH228Gc(j, Velocity);
                        Velocity m5823boximpl222 = Velocity.m5823boximpl(m5835minusAH228Gc);
                        androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
                        androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = m5835minusAH228Gc;
                        androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                        obj = function2.invoke(m5823boximpl222, androidEdgeEffectOverscrollEffect$applyToFling$1);
                        if (obj == coroutine_suspended) {
                        }
                    }
                }
                if (Velocity.m5832getXimpl(j) < 0.0f) {
                    if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) == 0.0f)) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.rightEffect, -MathKt.roundToInt(Velocity.m5832getXimpl(j)));
                        f = Velocity.m5832getXimpl(j);
                        if (Velocity.m5833getYimpl(j) > 0.0f) {
                        }
                        if (Velocity.m5833getYimpl(j) < 0.0f) {
                        }
                        f2 = 0.0f;
                        Velocity = VelocityKt.Velocity(f, f2);
                        if (!Velocity.m5831equalsimpl0(Velocity, Velocity.Companion.m5843getZero9UxMQ8M())) {
                        }
                        m5835minusAH228Gc = Velocity.m5835minusAH228Gc(j, Velocity);
                        Velocity m5823boximpl2222 = Velocity.m5823boximpl(m5835minusAH228Gc);
                        androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
                        androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = m5835minusAH228Gc;
                        androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                        obj = function2.invoke(m5823boximpl2222, androidEdgeEffectOverscrollEffect$applyToFling$1);
                        if (obj == coroutine_suspended) {
                        }
                    }
                }
                f = 0.0f;
                if (Velocity.m5833getYimpl(j) > 0.0f) {
                }
                if (Velocity.m5833getYimpl(j) < 0.0f) {
                }
                f2 = 0.0f;
                Velocity = VelocityKt.Velocity(f, f2);
                if (!Velocity.m5831equalsimpl0(Velocity, Velocity.Companion.m5843getZero9UxMQ8M())) {
                }
                m5835minusAH228Gc = Velocity.m5835minusAH228Gc(j, Velocity);
                Velocity m5823boximpl22222 = Velocity.m5823boximpl(m5835minusAH228Gc);
                androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
                androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = m5835minusAH228Gc;
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                obj = function2.invoke(m5823boximpl22222, androidEdgeEffectOverscrollEffect$applyToFling$1);
                if (obj == coroutine_suspended) {
                }
            }
        }
        androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuation);
        Object obj2 = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        if (i == 0) {
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        long m3097getCenteruvyYCjk = SizeKt.m3097getCenteruvyYCjk(this.containerSize);
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = false;
        } else {
            m411pullLeft0a9Yr6o(Offset.Companion.m3034getZeroF1C5BW0(), m3097getCenteruvyYCjk);
            z = true;
        }
        if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) == 0.0f)) {
            m412pullRight0a9Yr6o(Offset.Companion.m3034getZeroF1C5BW0(), m3097getCenteruvyYCjk);
            z = true;
        }
        if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) == 0.0f)) {
            m413pullTop0a9Yr6o(Offset.Companion.m3034getZeroF1C5BW0(), m3097getCenteruvyYCjk);
            z = true;
        }
        if (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z;
        }
        m410pullBottom0a9Yr6o(Offset.Companion.m3034getZeroF1C5BW0(), m3097getCenteruvyYCjk);
        return true;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    public final void drawOverscroll(DrawScope drawScope) {
        boolean z;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (Size.m3089isEmptyimpl(this.containerSize)) {
            return;
        }
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.redrawSignal.getValue();
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean z2 = true;
        if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffectNegation) == 0.0f)) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            z = false;
        } else {
            z = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.leftEffectNegation, EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffectNegation) == 0.0f)) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            z = drawTop(drawScope, this.topEffect, nativeCanvas) || z;
            EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.topEffectNegation, EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffectNegation) == 0.0f)) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            z = drawRight(drawScope, this.rightEffect, nativeCanvas) || z;
            EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.rightEffectNegation, EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffectNegation) == 0.0f)) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            if (!drawBottom(drawScope, this.bottomEffect, nativeCanvas) && !z) {
                z2 = false;
            }
            EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.bottomEffectNegation, EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect), 0.0f);
            z = z2;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m3084getHeightimpl(this.containerSize), drawScope.mo588toPx0680j_4(this.overscrollConfig.getDrawPadding().mo698calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.mo588toPx0680j_4(this.overscrollConfig.getDrawPadding().mo700calculateTopPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        int roundToInt = MathKt.roundToInt(Size.m3087getWidthimpl(this.containerSize));
        float mo699calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo699calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-roundToInt) + drawScope.mo588toPx0680j_4(mo699calculateRightPaddingu2uoSUM));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m3087getWidthimpl(this.containerSize), (-Size.m3084getHeightimpl(this.containerSize)) + drawScope.mo588toPx0680j_4(this.overscrollConfig.getDrawPadding().mo697calculateBottomPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M  reason: not valid java name */
    private final boolean m414releaseOppositeOverscrollk4lQ0M(long j) {
        boolean z;
        boolean z2 = false;
        if (this.leftEffect.isFinished() || Offset.m3018getXimpl(j) >= 0.0f) {
            z = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.leftEffect, Offset.m3018getXimpl(j));
            z = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m3018getXimpl(j) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.rightEffect, Offset.m3018getXimpl(j));
            z = z || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && Offset.m3019getYimpl(j) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.topEffect, Offset.m3019getYimpl(j));
            z = z || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || Offset.m3019getYimpl(j) <= 0.0f) {
            return z;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.bottomEffect, Offset.m3019getYimpl(j));
        if (z || this.bottomEffect.isFinished()) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: pullTop-0a9Yr6o  reason: not valid java name */
    private final float m413pullTop0a9Yr6o(long j, long j2) {
        return !((EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) > 0.0f ? 1 : (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.topEffect) == 0.0f ? 0 : -1)) == 0) ? Offset.m3019getYimpl(j) : EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.topEffect, Offset.m3019getYimpl(j) / Size.m3084getHeightimpl(this.containerSize), Offset.m3018getXimpl(j2) / Size.m3087getWidthimpl(this.containerSize)) * Size.m3084getHeightimpl(this.containerSize);
    }

    /* renamed from: pullBottom-0a9Yr6o  reason: not valid java name */
    private final float m410pullBottom0a9Yr6o(long j, long j2) {
        return !(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.bottomEffect) == 0.0f) ? Offset.m3019getYimpl(j) : (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.bottomEffect, -(Offset.m3019getYimpl(j) / Size.m3084getHeightimpl(this.containerSize)), 1 - (Offset.m3018getXimpl(j2) / Size.m3087getWidthimpl(this.containerSize)))) * Size.m3084getHeightimpl(this.containerSize);
    }

    /* renamed from: pullLeft-0a9Yr6o  reason: not valid java name */
    private final float m411pullLeft0a9Yr6o(long j, long j2) {
        return !(EdgeEffectCompat.INSTANCE.getDistanceCompat(this.leftEffect) == 0.0f) ? Offset.m3018getXimpl(j) : EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.leftEffect, Offset.m3018getXimpl(j) / Size.m3087getWidthimpl(this.containerSize), 1 - (Offset.m3019getYimpl(j2) / Size.m3084getHeightimpl(this.containerSize))) * Size.m3087getWidthimpl(this.containerSize);
    }

    /* renamed from: pullRight-0a9Yr6o  reason: not valid java name */
    private final float m412pullRight0a9Yr6o(long j, long j2) {
        return !((EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) > 0.0f ? 1 : (EdgeEffectCompat.INSTANCE.getDistanceCompat(this.rightEffect) == 0.0f ? 0 : -1)) == 0) ? Offset.m3018getXimpl(j) : (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.rightEffect, -(Offset.m3018getXimpl(j) / Size.m3087getWidthimpl(this.containerSize)), Offset.m3019getYimpl(j2) / Size.m3084getHeightimpl(this.containerSize))) * Size.m3087getWidthimpl(this.containerSize);
    }
}
