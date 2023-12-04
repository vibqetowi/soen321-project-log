package com.ifriend.presentation.features.chatstore.viewmodel;

import com.ifriend.domain.logic.chat.buy.BuyChatInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chatstore.models.ChatStoreUi;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(c = "com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$buyChat$2", f = "ChatsStoreViewModel.kt", i = {}, l = {169, 170, 176}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatsStoreViewModel$buyChat$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatStoreUi $chat;
    int label;
    final /* synthetic */ ChatsStoreViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsStoreViewModel$buyChat$2(ChatsStoreViewModel chatsStoreViewModel, ChatStoreUi chatStoreUi, Continuation<? super ChatsStoreViewModel$buyChat$2> continuation) {
        super(2, continuation);
        this.this$0 = chatsStoreViewModel;
        this.$chat = chatStoreUi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatsStoreViewModel$buyChat$2(this.this$0, this.$chat, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatsStoreViewModel$buyChat$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatsStoreViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$buyChat$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatsStoreViewModel.UiState, ChatsStoreViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatsStoreViewModel.UiState invoke(ChatsStoreViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return ChatsStoreViewModel.UiState.copy$default(state, true, null, null, 0, 0, null, 0, false, 254, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BuyChatInteractor buyChatInteractor;
        AppEventsEmitter appEventsEmitter;
        ResourceProvider resourceProvider;
        UiStateDelegate<ChatsStoreViewModel.UiState, ChatsStoreViewModel.Event> uiStateDelegate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatsStoreViewModel.UiState, ChatsStoreViewModel.Event> uiStateDelegate2 = this.this$0;
            this.label = 1;
            if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            appEventsEmitter = this.this$0.appEventsEmitter;
            resourceProvider = this.this$0.resourceProvider;
            appEventsEmitter.emit(new AppEvents.ShowInAppNotification(resourceProvider.getString(R.string.common__chat_activated, this.$chat.getName())));
            uiStateDelegate = this.this$0;
            this.label = 3;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (ChatsStoreViewModel.Event) new ChatsStoreViewModel.Event.GoToChat(this.$chat.getChatId()), (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        buyChatInteractor = this.this$0.buyChatInteractor;
        this.label = 2;
        if (buyChatInteractor.buyChat(this.$chat.getChatId(), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        appEventsEmitter = this.this$0.appEventsEmitter;
        resourceProvider = this.this$0.resourceProvider;
        appEventsEmitter.emit(new AppEvents.ShowInAppNotification(resourceProvider.getString(R.string.common__chat_activated, this.$chat.getName())));
        uiStateDelegate = this.this$0;
        this.label = 3;
        if (uiStateDelegate.sendEvent2(uiStateDelegate, (ChatsStoreViewModel.Event) new ChatsStoreViewModel.Event.GoToChat(this.$chat.getChatId()), (Continuation<? super Unit>) this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
