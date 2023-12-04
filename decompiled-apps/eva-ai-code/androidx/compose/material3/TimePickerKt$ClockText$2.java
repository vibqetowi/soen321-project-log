package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$ClockText$2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ MutableState<Offset> $center$delegate;
    final /* synthetic */ float $maxDist;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$2(boolean z, CoroutineScope coroutineScope, TimePickerState timePickerState, float f, boolean z2, MutableState<Offset> mutableState) {
        super(1);
        this.$selected = z;
        this.$scope = coroutineScope;
        this.$state = timePickerState;
        this.$maxDist = f;
        this.$autoSwitchToMinute = z2;
        this.$center$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ MutableState<Offset> $center$delegate;
        final /* synthetic */ float $maxDist;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ TimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CoroutineScope coroutineScope, TimePickerState timePickerState, float f, boolean z, MutableState<Offset> mutableState) {
            super(0);
            this.$scope = coroutineScope;
            this.$state = timePickerState;
            this.$maxDist = f;
            this.$autoSwitchToMinute = z;
            this.$center$delegate = mutableState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C00631(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, null), 3, null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TimePicker.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1", f = "TimePicker.kt", i = {}, l = {1318}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ MutableState<Offset> $center$delegate;
            final /* synthetic */ float $maxDist;
            final /* synthetic */ TimePickerState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00631(TimePickerState timePickerState, float f, boolean z, MutableState<Offset> mutableState, Continuation<? super C00631> continuation) {
                super(2, continuation);
                this.$state = timePickerState;
                this.$maxDist = f;
                this.$autoSwitchToMinute = z;
                this.$center$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00631(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                long ClockText$lambda$29;
                long ClockText$lambda$292;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TimePickerState timePickerState = this.$state;
                    ClockText$lambda$29 = TimePickerKt.ClockText$lambda$29(this.$center$delegate);
                    float m3018getXimpl = Offset.m3018getXimpl(ClockText$lambda$29);
                    ClockText$lambda$292 = TimePickerKt.ClockText$lambda$29(this.$center$delegate);
                    this.label = 1;
                    if (timePickerState.onTap$material3_release(m3018getXimpl, Offset.m3019getYimpl(ClockText$lambda$292), this.$maxDist, this.$autoSwitchToMinute, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.onClick$default(semantics, null, new AnonymousClass1(this.$scope, this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate), 1, null);
        SemanticsPropertiesKt.setSelected(semantics, this.$selected);
    }
}
