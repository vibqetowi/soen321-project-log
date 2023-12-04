package com.ifriend.presentation.features.home.delegates;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.chats.GetUnavailableChatsUseCase;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeChatsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1", f = "HomeChatsDelegate.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class HomeChatsDelegateImpl$subscribeOnAvailableChats$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeViewModel $$context_receiver_0;
    Object L$0;
    int label;
    final /* synthetic */ HomeChatsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeChatsDelegateImpl$subscribeOnAvailableChats$1(HomeChatsDelegateImpl homeChatsDelegateImpl, HomeViewModel homeViewModel, Continuation<? super HomeChatsDelegateImpl$subscribeOnAvailableChats$1> continuation) {
        super(2, continuation);
        this.this$0 = homeChatsDelegateImpl;
        this.$$context_receiver_0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeChatsDelegateImpl$subscribeOnAvailableChats$1(this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeChatsDelegateImpl$subscribeOnAvailableChats$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatsInfoInteractor chatsInfoInteractor;
        GetUnavailableChatsUseCase getUnavailableChatsUseCase;
        Flow<List<ChatInfo>> flow;
        DispatcherProvider dispatcherProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsInfoInteractor = this.this$0.chatsInfoInteractor;
            Flow<List<ChatInfo>> availableChatsInfoFlow = chatsInfoInteractor.getAvailableChatsInfoFlow();
            getUnavailableChatsUseCase = this.this$0.getUnavailableChatsUseCase;
            this.L$0 = availableChatsInfoFlow;
            this.label = 1;
            Object execute = getUnavailableChatsUseCase.execute(this);
            if (execute == coroutine_suspended) {
                return coroutine_suspended;
            }
            flow = availableChatsInfoFlow;
            obj = execute;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            flow = (Flow) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Flow transformLatest = FlowKt.transformLatest(FlowKt.flowCombine(flow, (Flow) obj, new AnonymousClass1(null)), new HomeChatsDelegateImpl$subscribeOnAvailableChats$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
        dispatcherProvider = this.this$0.dispatcherProvider;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.flowOn(transformLatest, dispatcherProvider.background()), new AnonymousClass3(this.$$context_receiver_0, null)), ViewModelKt.getViewModelScope(this.$$context_receiver_0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeChatsDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "availableChats", "unavailableChats", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$1", f = "HomeChatsDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<List<? extends ChatInfo>, List<? extends ChatInfo>, Continuation<? super List<? extends ChatInfo>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatInfo> list, List<? extends ChatInfo> list2, Continuation<? super List<? extends ChatInfo>> continuation) {
            return invoke2((List<ChatInfo>) list, (List<ChatInfo>) list2, (Continuation<? super List<ChatInfo>>) continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ChatInfo> list, List<ChatInfo> list2, Continuation<? super List<ChatInfo>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = list2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.addAll((List) this.L$0);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) this.L$1) {
                if (((ChatInfo) obj2).isPromote()) {
                    arrayList.add(obj2);
                }
            }
            createListBuilder.addAll(arrayList);
            return CollectionsKt.build(createListBuilder);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeChatsDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/collections/immutable/PersistentList;", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;", "chats", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$3", f = "HomeChatsDelegate.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<PersistentList<? extends HomeChatUi>, Continuation<? super Unit>, Object> {
        final /* synthetic */ HomeViewModel $$context_receiver_0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(HomeViewModel homeViewModel, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$$context_receiver_0 = homeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$$context_receiver_0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PersistentList<? extends HomeChatUi> persistentList, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(persistentList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeChatsDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$3$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<HomeViewModel.UiState, HomeViewModel.UiState> {
            final /* synthetic */ PersistentList<HomeChatUi> $chats;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(PersistentList<? extends HomeChatUi> persistentList) {
                super(1);
                this.$chats = persistentList;
            }

            @Override // kotlin.jvm.functions.Function1
            public final HomeViewModel.UiState invoke(HomeViewModel.UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return HomeViewModel.UiState.copy$default(state, false, this.$chats, null, null, false, null, false, false, 253, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiStateDelegate<HomeViewModel.UiState, HomeViewModel.Event> uiStateDelegate = this.$$context_receiver_0;
                this.label = 1;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1((PersistentList) this.L$0), this) == coroutine_suspended) {
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
