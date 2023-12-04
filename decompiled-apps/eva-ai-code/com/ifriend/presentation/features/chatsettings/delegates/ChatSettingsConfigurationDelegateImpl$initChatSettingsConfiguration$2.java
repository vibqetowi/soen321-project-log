package com.ifriend.presentation.features.chatsettings.delegates;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.models.common.ChatInterestsType;
import com.ifriend.presentation.common.mappers.ChatInterestsTypeMapperUi;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chatsettings.mappers.ChatSettingsActionTagsMapperUi;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatSettingsConfigurationDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$2", f = "ChatSettingsConfigurationDelegate.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatSettingsViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatSettingsConfigurationDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$2(ChatSettingsConfigurationDelegateImpl chatSettingsConfigurationDelegateImpl, String str, ChatSettingsViewModel chatSettingsViewModel, Continuation<? super ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$2> continuation) {
        super(2, continuation);
        this.this$0 = chatSettingsConfigurationDelegateImpl;
        this.$chatId = str;
        this.$$context_receiver_0 = chatSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$2(this.this$0, this.$chatId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatsConfigurationInteractor chatsConfigurationInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsConfigurationInteractor = this.this$0.chatsConfigurationInteractor;
            this.label = 1;
            obj = chatsConfigurationInteractor.getChatConfigurationFlow(this.$chatId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        FlowKt.launchIn(FlowKt.onEach((Flow) obj, new AnonymousClass1(this.this$0, this.$$context_receiver_0, null)), ViewModelKt.getViewModelScope(this.$$context_receiver_0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatSettingsConfigurationDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "configuration", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$2$1", f = "ChatSettingsConfigurationDelegate.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ChatsConfiguration, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatSettingsViewModel $$context_receiver_0;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChatSettingsConfigurationDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatSettingsConfigurationDelegateImpl chatSettingsConfigurationDelegateImpl, ChatSettingsViewModel chatSettingsViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatSettingsConfigurationDelegateImpl;
            this.$$context_receiver_0 = chatSettingsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$context_receiver_0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChatsConfiguration chatsConfiguration, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(chatsConfiguration, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChatSettingsActionTagsMapperUi chatSettingsActionTagsMapperUi;
            ChatInterestsTypeMapperUi chatInterestsTypeMapperUi;
            ChatConfig.Profile profile;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ChatsConfiguration chatsConfiguration = (ChatsConfiguration) this.L$0;
                ChatInfo chatInfo = chatsConfiguration.getChatInfo();
                ChatConfig chatConfig = chatsConfiguration.getChatConfig();
                chatSettingsActionTagsMapperUi = this.this$0.chatSettingsActionTagsMapperUi;
                PersistentList persistentList = ExtensionsKt.toPersistentList(chatSettingsActionTagsMapperUi.map(chatsConfiguration));
                List<ChatInterestsType> interests = (chatConfig == null || (profile = chatConfig.getProfile()) == null) ? null : profile.getInterests();
                if (interests == null) {
                    interests = CollectionsKt.emptyList();
                }
                List<ChatInterestsType> list = interests;
                chatInterestsTypeMapperUi = this.this$0.interestsMapperUi;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ChatInterestsType chatInterestsType : list) {
                    arrayList.add(chatInterestsTypeMapperUi.map(chatInterestsType));
                }
                PersistentList persistentList2 = ExtensionsKt.toPersistentList(arrayList);
                UiStateDelegate<ChatSettingsViewModel.UiState, Object> uiStateDelegate = this.$$context_receiver_0;
                this.label = 1;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new C01531(chatInfo, chatConfig, persistentList2, persistentList), this) == coroutine_suspended) {
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
        /* compiled from: ChatSettingsConfigurationDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01531 extends Lambda implements Function1<ChatSettingsViewModel.UiState, ChatSettingsViewModel.UiState> {
            final /* synthetic */ PersistentList<ChatSettingsViewModel.UiState.ActionTag> $actionTags;
            final /* synthetic */ ChatConfig $chatConfig;
            final /* synthetic */ ChatInfo $chatInfo;
            final /* synthetic */ PersistentList<String> $interests;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01531(ChatInfo chatInfo, ChatConfig chatConfig, PersistentList<String> persistentList, PersistentList<ChatSettingsViewModel.UiState.ActionTag> persistentList2) {
                super(1);
                this.$chatInfo = chatInfo;
                this.$chatConfig = chatConfig;
                this.$interests = persistentList;
                this.$actionTags = persistentList2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatSettingsViewModel.UiState invoke(ChatSettingsViewModel.UiState state) {
                ChatSettingsViewModel.UiState copy;
                ChatConfig.Images images;
                ChatConfig.Descriptions descriptions;
                Intrinsics.checkNotNullParameter(state, "state");
                String name = this.$chatInfo.getName();
                ChatConfig chatConfig = this.$chatConfig;
                String str = null;
                String profileDescription = (chatConfig == null || (descriptions = chatConfig.getDescriptions()) == null) ? null : descriptions.getProfileDescription();
                String str2 = profileDescription == null ? "" : profileDescription;
                ChatConfig chatConfig2 = this.$chatConfig;
                if (chatConfig2 != null && (images = chatConfig2.getImages()) != null) {
                    str = images.getProfileAvatarUrl();
                }
                copy = state.copy((r24 & 1) != 0 ? state.lvlProgress : 0.0f, (r24 & 2) != 0 ? state.lvlLabel : null, (r24 & 4) != 0 ? state.isVisibleLvlProgress : false, (r24 & 8) != 0 ? state.name : name, (r24 & 16) != 0 ? state.avatarUrl : str == null ? "" : str, (r24 & 32) != 0 ? state.description : str2, (r24 & 64) != 0 ? state.isVerified : this.$chatInfo.isVerified(), (r24 & 128) != 0 ? state.interests : this.$interests, (r24 & 256) != 0 ? state.actionTags : this.$actionTags, (r24 & 512) != 0 ? state.subscriptionStateLabel : null, (r24 & 1024) != 0 ? state.isShowSubscriptionState : false);
                return copy;
            }
        }
    }
}
