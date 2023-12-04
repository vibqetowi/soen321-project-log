package com.ifriend.chat.new_chat.list.viewModel;

import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToUiModelMapper;
import com.ifriend.chat.new_chat.list.ui.model.TagHolder;
import com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel;
import com.ifriend.common_entities_engine.ComponentsHolderKt;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.user.Subscription;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$collectChatState$1", f = "ChatListViewModel.kt", i = {}, l = {95, 96, 98, 99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatListViewModel$collectChatState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ChatListViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListViewModel$collectChatState$1(ChatListViewModel chatListViewModel, Continuation<? super ChatListViewModel$collectChatState$1> continuation) {
        super(2, continuation);
        this.this$0 = chatListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatListViewModel$collectChatState$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatListViewModel$collectChatState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GetBotUseCase getBotUseCase;
        Flow flow;
        ChatClientInteractor chatClientInteractor;
        String str;
        ChatsInfoInteractor chatsInfoInteractor;
        String str2;
        FeatureToggleRepository featureToggleRepository;
        Object isFeatureEnabledFlow;
        Flow flow2;
        Flow flow3;
        Flow<ChatInfo> flow4;
        Object userSubscription;
        Flow flow5;
        Flow flow6;
        Flow<ChatInfo> flow7;
        Flow flow8;
        DispatcherProvider dispatcherProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getBotUseCase = this.this$0.getBotUseCase;
            this.label = 1;
            obj = getBotUseCase.flow(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    Flow flow9 = (Flow) this.L$1;
                    Flow flow10 = (Flow) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flow6 = (Flow) this.L$3;
                    flow5 = flow10;
                    flow7 = (Flow) this.L$2;
                    flow8 = flow9;
                    Flow onEach = FlowKt.onEach(FlowKt.combine(flow5, flow8, flow7, flow6, (Flow) obj, new AnonymousClass1(this.this$0, null)), new AnonymousClass2(this.this$0, null));
                    dispatcherProvider = this.this$0.dispatcherProvider;
                    FlowKt.launchIn(FlowKt.flowOn(onEach, dispatcherProvider.background()), ViewModelKt.getViewModelScope(this.this$0));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flow4 = (Flow) this.L$2;
            flow2 = (Flow) this.L$1;
            flow3 = (Flow) this.L$0;
            ResultKt.throwOnFailure(obj);
            Flow flow11 = (Flow) obj;
            this.L$0 = flow3;
            this.L$1 = flow2;
            this.L$2 = flow4;
            this.L$3 = flow11;
            this.label = 4;
            userSubscription = this.this$0.getUserSubscription(this);
            if (userSubscription != coroutine_suspended) {
                return coroutine_suspended;
            }
            flow5 = flow3;
            Flow flow12 = flow2;
            flow6 = flow11;
            obj = userSubscription;
            flow7 = flow4;
            flow8 = flow12;
            Flow onEach2 = FlowKt.onEach(FlowKt.combine(flow5, flow8, flow7, flow6, (Flow) obj, new AnonymousClass1(this.this$0, null)), new AnonymousClass2(this.this$0, null));
            dispatcherProvider = this.this$0.dispatcherProvider;
            FlowKt.launchIn(FlowKt.flowOn(onEach2, dispatcherProvider.background()), ViewModelKt.getViewModelScope(this.this$0));
            return Unit.INSTANCE;
        } else {
            flow = (Flow) this.L$0;
            ResultKt.throwOnFailure(obj);
            Flow flow13 = (Flow) obj;
            chatsInfoInteractor = this.this$0.chatsInfoInteractor;
            str2 = this.this$0.chatId;
            Flow<ChatInfo> chatsInfoFlow = chatsInfoInteractor.getChatsInfoFlow(str2);
            featureToggleRepository = this.this$0.featureToggleRepository;
            this.L$0 = flow;
            this.L$1 = flow13;
            this.L$2 = chatsInfoFlow;
            this.label = 3;
            isFeatureEnabledFlow = featureToggleRepository.isFeatureEnabledFlow(FeatureToggleKey.MESSAGE_REGENERATION, this);
            if (isFeatureEnabledFlow != coroutine_suspended) {
                return coroutine_suspended;
            }
            flow2 = flow13;
            obj = isFeatureEnabledFlow;
            flow3 = flow;
            flow4 = chatsInfoFlow;
            Flow flow112 = (Flow) obj;
            this.L$0 = flow3;
            this.L$1 = flow2;
            this.L$2 = flow4;
            this.L$3 = flow112;
            this.label = 4;
            userSubscription = this.this$0.getUserSubscription(this);
            if (userSubscription != coroutine_suspended) {
            }
        }
        flow = (Flow) obj;
        chatClientInteractor = this.this$0.chatClientInteractor;
        str = this.this$0.chatId;
        this.L$0 = flow;
        this.label = 2;
        obj = chatClientInteractor.getState(str, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        Flow flow132 = (Flow) obj;
        chatsInfoInteractor = this.this$0.chatsInfoInteractor;
        str2 = this.this$0.chatId;
        Flow<ChatInfo> chatsInfoFlow2 = chatsInfoInteractor.getChatsInfoFlow(str2);
        featureToggleRepository = this.this$0.featureToggleRepository;
        this.L$0 = flow;
        this.L$1 = flow132;
        this.L$2 = chatsInfoFlow2;
        this.label = 3;
        isFeatureEnabledFlow = featureToggleRepository.isFeatureEnabledFlow(FeatureToggleKey.MESSAGE_REGENERATION, this);
        if (isFeatureEnabledFlow != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatListViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/bot/Bot;", "bot", "Lcom/ifriend/common_entities_engine/EntitiesState;", "state", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chatInfo", "", "isMessageRegenerationEnabled", "Lcom/ifriend/domain/models/profile/user/Subscription;", "<anonymous parameter 4>", "", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$collectChatState$1$1", f = "ChatListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$collectChatState$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function6<Bot, EntitiesState, ChatInfo, Boolean, Subscription, Continuation<? super List<? extends TagHolder>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ ChatListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatListViewModel chatListViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(6, continuation);
            this.this$0 = chatListViewModel;
        }

        public final Object invoke(Bot bot, EntitiesState entitiesState, ChatInfo chatInfo, boolean z, Subscription subscription, Continuation<? super List<? extends TagHolder>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = bot;
            anonymousClass1.L$1 = entitiesState;
            anonymousClass1.L$2 = chatInfo;
            anonymousClass1.Z$0 = z;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Object invoke(Bot bot, EntitiesState entitiesState, ChatInfo chatInfo, Boolean bool, Subscription subscription, Continuation<? super List<? extends TagHolder>> continuation) {
            return invoke(bot, entitiesState, chatInfo, bool.booleanValue(), subscription, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChatEntityToUiModelMapper chatEntityToUiModelMapper;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EntitiesState entitiesState = (EntitiesState) this.L$1;
                boolean z = this.Z$0;
                this.this$0.handleEvents(ComponentsHolderKt.consumableComponents(entitiesState));
                chatEntityToUiModelMapper = this.this$0.mapper;
                return chatEntityToUiModelMapper.map(entitiesState.getEntities(), (Bot) this.L$0, (ChatInfo) this.L$2, z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", FirebaseAnalytics.Param.ITEMS, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$collectChatState$1$2", f = "ChatListViewModel.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$collectChatState$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends TagHolder>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChatListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ChatListViewModel chatListViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chatListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends TagHolder> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatListViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/new_chat/list/viewModel/ChatListViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$collectChatState$1$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<ChatListViewModel.UiState, ChatListViewModel.UiState> {
            final /* synthetic */ List<TagHolder> $items;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(List<? extends TagHolder> list) {
                super(1);
                this.$items = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatListViewModel.UiState invoke(ChatListViewModel.UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.copy(this.$items);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiStateDelegate<ChatListViewModel.UiState, Object> uiStateDelegate = this.this$0;
                this.label = 1;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1((List) this.L$0), this) == coroutine_suspended) {
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
