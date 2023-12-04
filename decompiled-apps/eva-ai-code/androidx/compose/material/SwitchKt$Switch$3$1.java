package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$3$1", f = "Switch.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SwitchKt$Switch$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ State<Boolean> $currentChecked$delegate;
    final /* synthetic */ State<Function1<Boolean, Unit>> $currentOnCheckedChange$delegate;
    final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchKt$Switch$3$1(AnchoredDraggableState<Boolean> anchoredDraggableState, State<Boolean> state, State<? extends Function1<? super Boolean, Unit>> state2, MutableState<Boolean> mutableState, Continuation<? super SwitchKt$Switch$3$1> continuation) {
        super(2, continuation);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$currentChecked$delegate = state;
        this.$currentOnCheckedChange$delegate = state2;
        this.$forceAnimationCheck$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchKt$Switch$3$1(this.$anchoredDraggableState, this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwitchKt$Switch$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SwitchKt$Switch$3$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableState<Boolean> anchoredDraggableState) {
            super(0);
            this.$anchoredDraggableState = anchoredDraggableState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$anchoredDraggableState.getCurrentValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "newValue", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$3$1$2", f = "Switch.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SwitchKt$Switch$3$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ State<Boolean> $currentChecked$delegate;
        final /* synthetic */ State<Function1<Boolean, Unit>> $currentOnCheckedChange$delegate;
        final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(State<Boolean> state, State<? extends Function1<? super Boolean, Unit>> state2, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$currentChecked$delegate = state;
            this.$currentOnCheckedChange$delegate = state2;
            this.$forceAnimationCheck$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean Switch$lambda$8;
            Function1 Switch$lambda$7;
            boolean Switch$lambda$3;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.Z$0;
                Switch$lambda$8 = SwitchKt.Switch$lambda$8(this.$currentChecked$delegate);
                if (Switch$lambda$8 != z) {
                    Switch$lambda$7 = SwitchKt.Switch$lambda$7(this.$currentOnCheckedChange$delegate);
                    if (Switch$lambda$7 != null) {
                        Switch$lambda$7.invoke(Boxing.boxBoolean(z));
                    }
                    MutableState<Boolean> mutableState = this.$forceAnimationCheck$delegate;
                    Switch$lambda$3 = SwitchKt.Switch$lambda$3(mutableState);
                    SwitchKt.Switch$lambda$4(mutableState, !Switch$lambda$3);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.collectLatest(SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$anchoredDraggableState)), new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, null), this) == coroutine_suspended) {
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
