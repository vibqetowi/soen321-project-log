package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DatePickerKt$DatePickerContent$1$4$2$2$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ LazyListState $monthsListState;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ MutableState<Boolean> $yearPickerVisible$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$4$2$2$1(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, StateData stateData, LazyListState lazyListState) {
        super(1);
        this.$coroutineScope = coroutineScope;
        this.$yearPickerVisible$delegate = mutableState;
        this.$stateData = stateData;
        this.$monthsListState = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        boolean DatePickerContent$lambda$5;
        MutableState<Boolean> mutableState = this.$yearPickerVisible$delegate;
        DatePickerContent$lambda$5 = DatePickerKt.DatePickerContent$lambda$5(mutableState);
        DatePickerKt.DatePickerContent$lambda$6(mutableState, !DatePickerContent$lambda$5);
        BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass1(this.$stateData, this.$monthsListState, i, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1", f = "DatePicker.kt", i = {}, l = {1212}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LazyListState $monthsListState;
        final /* synthetic */ StateData $stateData;
        final /* synthetic */ int $year;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StateData stateData, LazyListState lazyListState, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$stateData = stateData;
            this.$monthsListState = lazyListState;
            this.$year = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$stateData, this.$monthsListState, this.$year, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateData stateData = this.$stateData;
                this.label = 1;
                if (LazyListState.scrollToItem$default(this.$monthsListState, (((this.$year - stateData.getYearRange().getFirst()) * 12) + stateData.getDisplayedMonth().getMonth()) - 1, 0, this, 2, null) == coroutine_suspended) {
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
