package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotStateKt;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsStoreScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatstore.ui.ChatsStoreScreenKt$SelectChatStorePager$2$1", f = "ChatsStoreScreen.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatsStoreScreenKt$SelectChatStorePager$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Integer, Unit> $onPageChanged;
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatsStoreScreenKt$SelectChatStorePager$2$1(PagerState pagerState, Function1<? super Integer, Unit> function1, Continuation<? super ChatsStoreScreenKt$SelectChatStorePager$2$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$onPageChanged = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatsStoreScreenKt$SelectChatStorePager$2$1(this.$pagerState, this.$onPageChanged, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatsStoreScreenKt$SelectChatStorePager$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatsStoreScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatstore.ui.ChatsStoreScreenKt$SelectChatStorePager$2$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Integer> {
        final /* synthetic */ PagerState $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PagerState pagerState) {
            super(0);
            this.$pagerState = pagerState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.$pagerState.getCurrentPage());
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$pagerState));
            final Function1<Integer, Unit> function1 = this.$onPageChanged;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector<Integer>() { // from class: com.ifriend.presentation.features.chatstore.ui.ChatsStoreScreenKt$SelectChatStorePager$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Integer num, Continuation continuation) {
                    return emit(num.intValue(), continuation);
                }

                public final Object emit(int i2, Continuation<? super Unit> continuation) {
                    function1.invoke(Boxing.boxInt(i2));
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
