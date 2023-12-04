package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 c2\u00020\u0001:\u0001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010F\u001a\u00020GH\u0080@ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0015\u0010J\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0003H\u0000¢\u0006\u0002\bLJ%\u0010M\u001a\u00020G2\u0006\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u0013H\u0000¢\u0006\u0002\bQJ\u0010\u0010R\u001a\u00020\u00132\u0006\u0010S\u001a\u00020\u0013H\u0002J3\u0010T\u001a\u00020G2\u0006\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u0015\u0010X\u001a\u00020G2\u0006\u0010\u0017\u001a\u00020\u0003H\u0000¢\u0006\u0002\bYJ\u0015\u0010Z\u001a\u00020G2\u0006\u00100\u001a\u00020\u0003H\u0000¢\u0006\u0002\b[J\u0011\u0010\\\u001a\u00020GH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010IJ%\u0010]\u001a\u00020G2\u0006\u0010K\u001a\u00020\u00132\b\b\u0002\u0010^\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\f\u0010a\u001a\u00020\u0003*\u00020\u0013H\u0002J\f\u0010b\u001a\u00020\u0003*\u00020\u0013H\u0002R4\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010#R+\u0010'\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0010\u001a\u0004\b(\u0010#\"\u0004\b)\u0010*R+\u0010,\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0010\u001a\u0004\b-\u0010#\"\u0004\b.\u0010*R\u0011\u00100\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b1\u0010\u0019R+\u00102\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0010\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R4\u00109\u001a\u0002082\u0006\u0010\b\u001a\u0002088@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b=\u0010\u0010\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u0010<R$\u0010>\u001a\u00020?8@X\u0080\u0084\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010&\u001a\u0004\b@\u0010\fR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "", "initialHour", "", "initialMinute", "is24Hour", "", "(IIZ)V", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", TtmlNode.CENTER, "getCenter-nOcc-ac$material3_release", "()J", "setCenter--gyyYBs$material3_release", "(J)V", "center$delegate", "Landroidx/compose/runtime/MutableState;", "currentAngle", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "getCurrentAngle$material3_release", "()Landroidx/compose/animation/core/Animatable;", "hour", "getHour", "()I", "hourAngle", "getHourAngle$material3_release", "()F", "setHourAngle$material3_release", "(F)V", "hourAngle$delegate", "hourForDisplay", "getHourForDisplay$material3_release", "is24hour", "()Z", "isAfternoon", "isAfternoon$delegate", "Landroidx/compose/runtime/State;", "isAfternoonToggle", "isAfternoonToggle$material3_release", "setAfternoonToggle$material3_release", "(Z)V", "isAfternoonToggle$delegate", "isInnerCircle", "isInnerCircle$material3_release", "setInnerCircle$material3_release", "isInnerCircle$delegate", "minute", "getMinute", "minuteAngle", "getMinuteAngle$material3_release", "setMinuteAngle$material3_release", "minuteAngle$delegate", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/material3/Selection;", "selection", "getSelection-JiIwxys$material3_release", "setSelection-iHAOin8$material3_release", "(I)V", "selection$delegate", "selectorPos", "Landroidx/compose/ui/unit/DpOffset;", "getSelectorPos-RKDOV3M$material3_release", "selectorPos$delegate", "values", "", "getValues$material3_release", "()Ljava/util/List;", "animateToCurrent", "", "animateToCurrent$material3_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSelected", "value", "isSelected$material3_release", "moveSelector", "x", "y", "maxDist", "moveSelector$material3_release", "offsetHour", "angle", "onTap", "autoSwitchToMinute", "onTap$material3_release", "(FFFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setHour", "setHour$material3_release", "setMinute", "setMinute$material3_release", "settle", "update", "fromTap", "update$material3_release", "(FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toHour", "toMinute", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final MutableState center$delegate;
    private final Animatable<Float, AnimationVector1D> currentAngle;
    private final MutableState hourAngle$delegate;
    private final boolean is24hour;
    private final State isAfternoon$delegate;
    private final MutableState isAfternoonToggle$delegate;
    private final MutableState isInnerCircle$delegate;
    private final MutableState minuteAngle$delegate;
    private final MutatorMutex mutex;
    private final MutableState selection$delegate;
    private final State selectorPos$delegate;

    /* JADX INFO: Access modifiers changed from: private */
    public final float offsetHour(float f) {
        float f2 = f + 1.5707964f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    public TimePickerState(int i, int i2, boolean z) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        if (!(i >= 0 && i < 24)) {
            throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
        }
        if (!(i >= 0 && i < 60)) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        this.is24hour = z;
        this.selectorPos$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new TimePickerState$selectorPos$2(this, z));
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m5716boximpl(IntOffset.Companion.m5735getZeronOccac()), null, 2, null);
        this.center$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Selection.m1965boximpl(Selection.Companion.m1972getHourJiIwxys()), null, 2, null);
        this.selection$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i > 12 && !z), null, 2, null);
        this.isAfternoonToggle$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i >= 12), null, 2, null);
        this.isInnerCircle$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(((i * 0.5235988f) % 12) - 1.5707964f), null, 2, null);
        this.hourAngle$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf((i2 * 0.10471976f) - 1.5707964f), null, 2, null);
        this.minuteAngle$delegate = mutableStateOf$default6;
        this.mutex = new MutatorMutex();
        this.isAfternoon$delegate = SnapshotStateKt.derivedStateOf(new TimePickerState$isAfternoon$2(this));
        this.currentAngle = AnimatableKt.Animatable$default(getHourAngle$material3_release(), 0.0f, 2, null);
    }

    public final int getMinute() {
        return toMinute(getMinuteAngle$material3_release());
    }

    public final int getHour() {
        return toHour(getHourAngle$material3_release()) + (isAfternoon() ? 12 : 0);
    }

    public final boolean is24hour() {
        return this.is24hour;
    }

    public final int getHourForDisplay$material3_release() {
        return hourForDisplay(getHour());
    }

    /* renamed from: getSelectorPos-RKDOV3M$material3_release  reason: not valid java name */
    public final long m2186getSelectorPosRKDOV3M$material3_release() {
        return ((DpOffset) this.selectorPos$delegate.getValue()).m5676unboximpl();
    }

    /* renamed from: getCenter-nOcc-ac$material3_release  reason: not valid java name */
    public final long m2184getCenternOccac$material3_release() {
        return ((IntOffset) this.center$delegate.getValue()).m5734unboximpl();
    }

    /* renamed from: setCenter--gyyYBs$material3_release  reason: not valid java name */
    public final void m2187setCentergyyYBs$material3_release(long j) {
        this.center$delegate.setValue(IntOffset.m5716boximpl(j));
    }

    public final List<Integer> getValues$material3_release() {
        return Selection.m1968equalsimpl0(m2185getSelectionJiIwxys$material3_release(), Selection.Companion.m1973getMinuteJiIwxys()) ? TimePickerKt.Minutes : TimePickerKt.Hours;
    }

    /* renamed from: getSelection-JiIwxys$material3_release  reason: not valid java name */
    public final int m2185getSelectionJiIwxys$material3_release() {
        return ((Selection) this.selection$delegate.getValue()).m1971unboximpl();
    }

    /* renamed from: setSelection-iHAOin8$material3_release  reason: not valid java name */
    public final void m2188setSelectioniHAOin8$material3_release(int i) {
        this.selection$delegate.setValue(Selection.m1965boximpl(i));
    }

    public final boolean isAfternoonToggle$material3_release() {
        return ((Boolean) this.isAfternoonToggle$delegate.getValue()).booleanValue();
    }

    public final void setAfternoonToggle$material3_release(boolean z) {
        this.isAfternoonToggle$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean isInnerCircle$material3_release() {
        return ((Boolean) this.isInnerCircle$delegate.getValue()).booleanValue();
    }

    public final void setInnerCircle$material3_release(boolean z) {
        this.isInnerCircle$delegate.setValue(Boolean.valueOf(z));
    }

    public final float getHourAngle$material3_release() {
        return ((Number) this.hourAngle$delegate.getValue()).floatValue();
    }

    public final void setHourAngle$material3_release(float f) {
        this.hourAngle$delegate.setValue(Float.valueOf(f));
    }

    public final float getMinuteAngle$material3_release() {
        return ((Number) this.minuteAngle$delegate.getValue()).floatValue();
    }

    public final void setMinuteAngle$material3_release(float f) {
        this.minuteAngle$delegate.setValue(Float.valueOf(f));
    }

    private final boolean isAfternoon() {
        return ((Boolean) this.isAfternoon$delegate.getValue()).booleanValue();
    }

    public final Animatable<Float, AnimationVector1D> getCurrentAngle$material3_release() {
        return this.currentAngle;
    }

    public final void setMinute$material3_release(int i) {
        setMinuteAngle$material3_release((i * 0.10471976f) - 1.5707964f);
    }

    public final void setHour$material3_release(int i) {
        setInnerCircle$material3_release(i > 12 || i == 0);
        setHourAngle$material3_release(((i * 0.5235988f) % 12) - 1.5707964f);
    }

    public final void moveSelector$material3_release(float f, float f2, float f3) {
        if (Selection.m1968equalsimpl0(m2185getSelectionJiIwxys$material3_release(), Selection.Companion.m1972getHourJiIwxys()) && this.is24hour) {
            setInnerCircle$material3_release(TimePickerKt.dist(f, f2, IntOffset.m5725getXimpl(m2184getCenternOccac$material3_release()), IntOffset.m5726getYimpl(m2184getCenternOccac$material3_release())) < f3);
        }
    }

    public final boolean isSelected$material3_release(int i) {
        if (Selection.m1968equalsimpl0(m2185getSelectionJiIwxys$material3_release(), Selection.Companion.m1973getMinuteJiIwxys())) {
            if (i == getMinute()) {
                return true;
            }
        } else {
            if (getHour() == i + (isAfternoon() ? 12 : 0)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Object update$material3_release$default(TimePickerState timePickerState, float f, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return timePickerState.update$material3_release(f, z, continuation);
    }

    public final Object update$material3_release(float f, boolean z, Continuation<? super Unit> continuation) {
        Object mutate = this.mutex.mutate(MutatePriority.UserInput, new TimePickerState$update$2(this, f, z, null), continuation);
        return mutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateToCurrent$material3_release(Continuation<? super Unit> continuation) {
        TimePickerState$animateToCurrent$1 timePickerState$animateToCurrent$1;
        TimePickerState$animateToCurrent$1 timePickerState$animateToCurrent$12;
        Object coroutine_suspended;
        int i;
        TimePickerState timePickerState;
        float f;
        if (continuation instanceof TimePickerState$animateToCurrent$1) {
            timePickerState$animateToCurrent$1 = (TimePickerState$animateToCurrent$1) continuation;
            if ((timePickerState$animateToCurrent$1.label & Integer.MIN_VALUE) != 0) {
                timePickerState$animateToCurrent$1.label -= Integer.MIN_VALUE;
                timePickerState$animateToCurrent$12 = timePickerState$animateToCurrent$1;
                Object obj = timePickerState$animateToCurrent$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = timePickerState$animateToCurrent$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair valuesForAnimation = Selection.m1968equalsimpl0(m2185getSelectionJiIwxys$material3_release(), Selection.Companion.m1972getHourJiIwxys()) ? TimePickerKt.valuesForAnimation(getMinuteAngle$material3_release(), getHourAngle$material3_release()) : TimePickerKt.valuesForAnimation(getHourAngle$material3_release(), getMinuteAngle$material3_release());
                    float floatValue = ((Number) valuesForAnimation.component1()).floatValue();
                    float floatValue2 = ((Number) valuesForAnimation.component2()).floatValue();
                    Animatable<Float, AnimationVector1D> animatable = this.currentAngle;
                    Float boxFloat = Boxing.boxFloat(floatValue);
                    timePickerState$animateToCurrent$12.L$0 = this;
                    timePickerState$animateToCurrent$12.F$0 = floatValue2;
                    timePickerState$animateToCurrent$12.label = 1;
                    if (animatable.snapTo(boxFloat, timePickerState$animateToCurrent$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    timePickerState = this;
                    f = floatValue2;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    f = timePickerState$animateToCurrent$12.F$0;
                    timePickerState = (TimePickerState) timePickerState$animateToCurrent$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                timePickerState$animateToCurrent$12.L$0 = null;
                timePickerState$animateToCurrent$12.label = 2;
                if (Animatable.animateTo$default(timePickerState.currentAngle, Boxing.boxFloat(f), AnimationSpecKt.tween$default(200, 0, null, 6, null), null, null, timePickerState$animateToCurrent$12, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        timePickerState$animateToCurrent$1 = new TimePickerState$animateToCurrent$1(this, continuation);
        timePickerState$animateToCurrent$12 = timePickerState$animateToCurrent$1;
        Object obj2 = timePickerState$animateToCurrent$12.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = timePickerState$animateToCurrent$12.label;
        if (i != 0) {
        }
        timePickerState$animateToCurrent$12.L$0 = null;
        timePickerState$animateToCurrent$12.label = 2;
        if (Animatable.animateTo$default(timePickerState.currentAngle, Boxing.boxFloat(f), AnimationSpecKt.tween$default(200, 0, null, 6, null), null, null, timePickerState$animateToCurrent$12, 12, null) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    private final int hourForDisplay(int i) {
        if (!this.is24hour || !isInnerCircle$material3_release() || i != 0) {
            if (this.is24hour) {
                return i % 24;
            }
            if (i % 12 != 0) {
                return isAfternoon() ? i - 12 : i;
            }
        }
        return 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toHour(float f) {
        return ((int) ((f + (0.2617994f + 1.5707963267948966d)) / 0.5235988f)) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toMinute(float f) {
        return ((int) ((f + (0.05235988f + 1.5707963267948966d)) / 0.10471976f)) % 60;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object settle(Continuation<? super Unit> continuation) {
        TimePickerState$settle$1 timePickerState$settle$1;
        TimePickerState$settle$1 timePickerState$settle$12;
        Object coroutine_suspended;
        int i;
        Pair valuesForAnimation;
        TimePickerState timePickerState;
        if (continuation instanceof TimePickerState$settle$1) {
            timePickerState$settle$1 = (TimePickerState$settle$1) continuation;
            if ((timePickerState$settle$1.label & Integer.MIN_VALUE) != 0) {
                timePickerState$settle$1.label -= Integer.MIN_VALUE;
                timePickerState$settle$12 = timePickerState$settle$1;
                Object obj = timePickerState$settle$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = timePickerState$settle$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    valuesForAnimation = TimePickerKt.valuesForAnimation(this.currentAngle.getValue().floatValue(), getMinuteAngle$material3_release());
                    Animatable<Float, AnimationVector1D> animatable = this.currentAngle;
                    Object first = valuesForAnimation.getFirst();
                    timePickerState$settle$12.L$0 = this;
                    timePickerState$settle$12.L$1 = valuesForAnimation;
                    timePickerState$settle$12.label = 1;
                    if (animatable.snapTo(first, timePickerState$settle$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    timePickerState = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    valuesForAnimation = (Pair) timePickerState$settle$12.L$1;
                    timePickerState = (TimePickerState) timePickerState$settle$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                timePickerState$settle$12.L$0 = null;
                timePickerState$settle$12.L$1 = null;
                timePickerState$settle$12.label = 2;
                if (Animatable.animateTo$default(timePickerState.currentAngle, valuesForAnimation.getSecond(), AnimationSpecKt.tween$default(200, 0, null, 6, null), null, null, timePickerState$settle$12, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        timePickerState$settle$1 = new TimePickerState$settle$1(this, continuation);
        timePickerState$settle$12 = timePickerState$settle$1;
        Object obj2 = timePickerState$settle$12.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = timePickerState$settle$12.label;
        if (i != 0) {
        }
        timePickerState$settle$12.L$0 = null;
        timePickerState$settle$12.L$1 = null;
        timePickerState$settle$12.label = 2;
        if (Animatable.animateTo$default(timePickerState.currentAngle, valuesForAnimation.getSecond(), AnimationSpecKt.tween$default(200, 0, null, 6, null), null, null, timePickerState$settle$12, 12, null) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onTap$material3_release(float f, float f2, float f3, boolean z, Continuation<? super Unit> continuation) {
        TimePickerState$onTap$1 timePickerState$onTap$1;
        int i;
        boolean z2;
        float f4;
        float f5;
        TimePickerState timePickerState;
        Pair valuesForAnimation;
        if (continuation instanceof TimePickerState$onTap$1) {
            timePickerState$onTap$1 = (TimePickerState$onTap$1) continuation;
            if ((timePickerState$onTap$1.label & Integer.MIN_VALUE) != 0) {
                timePickerState$onTap$1.label -= Integer.MIN_VALUE;
                TimePickerState$onTap$1 timePickerState$onTap$12 = timePickerState$onTap$1;
                Object obj = timePickerState$onTap$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = timePickerState$onTap$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    float atan = TimePickerKt.atan(f2 - IntOffset.m5726getYimpl(m2184getCenternOccac$material3_release()), f - IntOffset.m5725getXimpl(m2184getCenternOccac$material3_release()));
                    timePickerState$onTap$12.L$0 = this;
                    timePickerState$onTap$12.F$0 = f;
                    timePickerState$onTap$12.F$1 = f2;
                    timePickerState$onTap$12.F$2 = f3;
                    timePickerState$onTap$12.Z$0 = z;
                    timePickerState$onTap$12.label = 1;
                    if (update$material3_release(atan, true, timePickerState$onTap$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z2 = z;
                    f4 = f3;
                    f5 = f2;
                    timePickerState = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        } else if (i == 4) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    valuesForAnimation = (Pair) timePickerState$onTap$12.L$1;
                    timePickerState = (TimePickerState) timePickerState$onTap$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    timePickerState$onTap$12.L$0 = null;
                    timePickerState$onTap$12.L$1 = null;
                    timePickerState$onTap$12.label = 3;
                    if (Animatable.animateTo$default(timePickerState.currentAngle, valuesForAnimation.getSecond(), AnimationSpecKt.tween$default(200, 0, null, 6, null), null, null, timePickerState$onTap$12, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else {
                    boolean z3 = timePickerState$onTap$12.Z$0;
                    float f6 = timePickerState$onTap$12.F$2;
                    float f7 = timePickerState$onTap$12.F$1;
                    f = timePickerState$onTap$12.F$0;
                    ResultKt.throwOnFailure(obj);
                    z2 = z3;
                    f4 = f6;
                    f5 = f7;
                    timePickerState = (TimePickerState) timePickerState$onTap$12.L$0;
                }
                timePickerState.moveSelector$material3_release(f, f5, f4);
                if (Selection.m1968equalsimpl0(timePickerState.m2185getSelectionJiIwxys$material3_release(), Selection.Companion.m1972getHourJiIwxys())) {
                    timePickerState$onTap$12.L$0 = null;
                    timePickerState$onTap$12.label = 4;
                    if (timePickerState.settle(timePickerState$onTap$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else if (!z2) {
                    valuesForAnimation = TimePickerKt.valuesForAnimation(timePickerState.currentAngle.getValue().floatValue(), timePickerState.getHourAngle$material3_release());
                    Animatable<Float, AnimationVector1D> animatable = timePickerState.currentAngle;
                    Object first = valuesForAnimation.getFirst();
                    timePickerState$onTap$12.L$0 = timePickerState;
                    timePickerState$onTap$12.L$1 = valuesForAnimation;
                    timePickerState$onTap$12.label = 2;
                    if (animatable.snapTo(first, timePickerState$onTap$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    timePickerState$onTap$12.L$0 = null;
                    timePickerState$onTap$12.L$1 = null;
                    timePickerState$onTap$12.label = 3;
                    if (Animatable.animateTo$default(timePickerState.currentAngle, valuesForAnimation.getSecond(), AnimationSpecKt.tween$default(200, 0, null, 6, null), null, null, timePickerState$onTap$12, 12, null) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                } else {
                    timePickerState.m2188setSelectioniHAOin8$material3_release(Selection.Companion.m1973getMinuteJiIwxys());
                    return Unit.INSTANCE;
                }
            }
        }
        timePickerState$onTap$1 = new TimePickerState$onTap$1(this, continuation);
        TimePickerState$onTap$1 timePickerState$onTap$122 = timePickerState$onTap$1;
        Object obj2 = timePickerState$onTap$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = timePickerState$onTap$122.label;
        if (i != 0) {
        }
        timePickerState.moveSelector$material3_release(f, f5, f4);
        if (Selection.m1968equalsimpl0(timePickerState.m2185getSelectionJiIwxys$material3_release(), Selection.Companion.m1972getHourJiIwxys())) {
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/TimePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TimePickerState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<TimePickerState, ?> Saver() {
            return SaverKt.Saver(TimePickerState$Companion$Saver$1.INSTANCE, TimePickerState$Companion$Saver$2.INSTANCE);
        }
    }
}
