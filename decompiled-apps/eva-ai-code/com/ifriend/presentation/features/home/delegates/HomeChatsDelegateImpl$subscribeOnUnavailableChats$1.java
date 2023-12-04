package com.ifriend.presentation.features.home.delegates;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.chats.GetUnavailableChatsUseCase;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.home.mappers.ChatUnlockLabelMapperUi;
import com.ifriend.presentation.features.home.mappers.HomeUnavailableChatMapper;
import com.ifriend.presentation.features.home.ui.models.HomeUnavailableChatUi;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeChatsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnUnavailableChats$1", f = "HomeChatsDelegate.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class HomeChatsDelegateImpl$subscribeOnUnavailableChats$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeViewModel $$context_receiver_0;
    int label;
    final /* synthetic */ HomeChatsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeChatsDelegateImpl$subscribeOnUnavailableChats$1(HomeChatsDelegateImpl homeChatsDelegateImpl, HomeViewModel homeViewModel, Continuation<? super HomeChatsDelegateImpl$subscribeOnUnavailableChats$1> continuation) {
        super(2, continuation);
        this.this$0 = homeChatsDelegateImpl;
        this.$$context_receiver_0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeChatsDelegateImpl$subscribeOnUnavailableChats$1(this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeChatsDelegateImpl$subscribeOnUnavailableChats$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetUnavailableChatsUseCase getUnavailableChatsUseCase;
        DispatcherProvider dispatcherProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getUnavailableChatsUseCase = this.this$0.getUnavailableChatsUseCase;
            this.label = 1;
            obj = getUnavailableChatsUseCase.execute(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        Flow mapLatest = FlowKt.mapLatest((Flow) obj, new AnonymousClass1(this.this$0, null));
        dispatcherProvider = this.this$0.dispatcherProvider;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.flowOn(mapLatest, dispatcherProvider.background()), new AnonymousClass2(this.this$0, this.$$context_receiver_0, null)), ViewModelKt.getViewModelScope(this.$$context_receiver_0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeChatsDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chats", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/ifriend/presentation/features/home/ui/models/HomeUnavailableChatUi;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnUnavailableChats$1$1", f = "HomeChatsDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnUnavailableChats$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends ChatInfo>, Continuation<? super PersistentList<? extends HomeUnavailableChatUi>>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HomeChatsDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HomeChatsDelegateImpl homeChatsDelegateImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = homeChatsDelegateImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatInfo> list, Continuation<? super PersistentList<? extends HomeUnavailableChatUi>> continuation) {
            return invoke2((List<ChatInfo>) list, (Continuation<? super PersistentList<HomeUnavailableChatUi>>) continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ChatInfo> list, Continuation<? super PersistentList<HomeUnavailableChatUi>> continuation) {
            return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HomeUnavailableChatMapper homeUnavailableChatMapper;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) this.L$0) {
                if (!((ChatInfo) obj2).isPromote()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList<ChatInfo> arrayList2 = arrayList;
            HomeChatsDelegateImpl homeChatsDelegateImpl = this.this$0;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (ChatInfo chatInfo : arrayList2) {
                homeUnavailableChatMapper = homeChatsDelegateImpl.unavailableChatMapper;
                arrayList3.add(homeUnavailableChatMapper.map(chatInfo));
            }
            return ExtensionsKt.toPersistentList(CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnUnavailableChats$1$1$invokeSuspend$$inlined$compareBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((HomeUnavailableChatUi) t).getSorting(), ((HomeUnavailableChatUi) t2).getSorting());
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeChatsDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/collections/immutable/PersistentList;", "Lcom/ifriend/presentation/features/home/ui/models/HomeUnavailableChatUi;", "chats", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnUnavailableChats$1$2", f = "HomeChatsDelegate.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnUnavailableChats$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<PersistentList<? extends HomeUnavailableChatUi>, Continuation<? super Unit>, Object> {
        final /* synthetic */ HomeViewModel $$context_receiver_0;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HomeChatsDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(HomeChatsDelegateImpl homeChatsDelegateImpl, HomeViewModel homeViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = homeChatsDelegateImpl;
            this.$$context_receiver_0 = homeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$context_receiver_0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PersistentList<? extends HomeUnavailableChatUi> persistentList, Continuation<? super Unit> continuation) {
            return invoke2((PersistentList<HomeUnavailableChatUi>) persistentList, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(PersistentList<HomeUnavailableChatUi> persistentList, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(persistentList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChatUnlockLabelMapperUi chatUnlockLabelMapperUi;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PersistentList persistentList = (PersistentList) this.L$0;
                chatUnlockLabelMapperUi = this.this$0.chatUnlockLabelMapper;
                String map = chatUnlockLabelMapperUi.map((HomeUnavailableChatUi) CollectionsKt.firstOrNull((List<? extends Object>) persistentList));
                UiStateDelegate<HomeViewModel.UiState, HomeViewModel.Event> uiStateDelegate = this.$$context_receiver_0;
                this.label = 1;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(persistentList, map), this) == coroutine_suspended) {
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
        /* compiled from: HomeChatsDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnUnavailableChats$1$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<HomeViewModel.UiState, HomeViewModel.UiState> {
            final /* synthetic */ String $chatUnlockLevelLabel;
            final /* synthetic */ PersistentList<HomeUnavailableChatUi> $chats;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PersistentList<HomeUnavailableChatUi> persistentList, String str) {
                super(1);
                this.$chats = persistentList;
                this.$chatUnlockLevelLabel = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public final HomeViewModel.UiState invoke(HomeViewModel.UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return HomeViewModel.UiState.copy$default(state, false, null, this.$chats, this.$chatUnlockLevelLabel, false, null, false, false, 243, null);
            }
        }
    }
}
