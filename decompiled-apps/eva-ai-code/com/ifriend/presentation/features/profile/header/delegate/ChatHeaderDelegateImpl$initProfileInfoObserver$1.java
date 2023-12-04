package com.ifriend.presentation.features.profile.header.delegate;

import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.models.levels.LevelInfo;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatHeaderDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initProfileInfoObserver$1", f = "ChatHeaderDelegate.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatHeaderDelegateImpl$initProfileInfoObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatHeaderDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHeaderDelegateImpl$initProfileInfoObserver$1(ChatHeaderDelegateImpl chatHeaderDelegateImpl, Continuation<? super ChatHeaderDelegateImpl$initProfileInfoObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = chatHeaderDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHeaderDelegateImpl$initProfileInfoObserver$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatHeaderDelegateImpl$initProfileInfoObserver$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetLevelInfoUseCase getLevelInfoUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getLevelInfoUseCase = this.this$0.getLevelInfoUseCase;
            this.label = 1;
            obj = getLevelInfoUseCase.flow(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        final ChatHeaderDelegateImpl chatHeaderDelegateImpl = this.this$0;
        this.label = 2;
        if (((Flow) obj).collect(new FlowCollector<Resource<LevelInfo>>() { // from class: com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initProfileInfoObserver$1.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Resource<LevelInfo> resource, Continuation continuation) {
                return emit2(resource, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: emit  reason: avoid collision after fix types in other method */
            public final Object emit2(Resource<LevelInfo> resource, Continuation<? super Unit> continuation) {
                LevelInfo data = resource.getData();
                if (data != null) {
                    float coerceIn = RangesKt.coerceIn(data.getCurrentPoints() / data.getNextLevelPoints(), 0.0f, 1.0f);
                    String valueOf = String.valueOf(data.getLevel());
                    UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate = ChatHeaderDelegateImpl.this;
                    Object updateUiState = uiStateDelegate.updateUiState(uiStateDelegate, new ChatHeaderDelegateImpl$initProfileInfoObserver$1$1$emit$2(ChatHeaderDelegateImpl.this, valueOf, coerceIn), continuation);
                    return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
                }
                UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate2 = ChatHeaderDelegateImpl.this;
                Object updateUiState2 = uiStateDelegate2.updateUiState(uiStateDelegate2, new ChatHeaderDelegateImpl$initProfileInfoObserver$1$1$emit$3(ChatHeaderDelegateImpl.this), continuation);
                return updateUiState2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState2 : Unit.INSTANCE;
            }
        }, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
