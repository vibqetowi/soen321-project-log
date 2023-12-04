package com.ifriend.presentation.features.chatstore.viewmodel;

import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chatstore.models.ChatStoreUi;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsStoreViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$onPageChanged$1", f = "ChatsStoreViewModel.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatsStoreViewModel$onPageChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentPage;
    int label;
    final /* synthetic */ ChatsStoreViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsStoreViewModel$onPageChanged$1(ChatsStoreViewModel chatsStoreViewModel, int i, Continuation<? super ChatsStoreViewModel$onPageChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = chatsStoreViewModel;
        this.$currentPage = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatsStoreViewModel$onPageChanged$1(this.this$0, this.$currentPage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatsStoreViewModel$onPageChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatsStoreViewModel.UiState, ChatsStoreViewModel.Event> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(this.$currentPage), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatsStoreViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$onPageChanged$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatsStoreViewModel.UiState, ChatsStoreViewModel.UiState> {
        final /* synthetic */ int $currentPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i) {
            super(1);
            this.$currentPage = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatsStoreViewModel.UiState invoke(ChatsStoreViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return ChatsStoreViewModel.UiState.copy$default(state, false, null, (ChatStoreUi) CollectionsKt.getOrNull(state.getChatStores(), this.$currentPage), 0, this.$currentPage, null, 0, false, 235, null);
        }
    }
}
