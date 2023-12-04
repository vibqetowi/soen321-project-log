package com.ifriend.presentation.features.chat.background.delegate;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.animatedBackground.AnimatedBackgroundView;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.logic.chat.ChatBackgroundUseCase;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatType;
import com.ifriend.domain.logic.chat.permissions.ChatPermissions;
import com.ifriend.domain.logic.chat.permissions.CheckChatPermissionsUseCase;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.ui.components.ext.StringKt;
import com.ifriend.ui.theme.AppColors;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* compiled from: ChatBackgroundDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$initChatBackground$1", f = "ChatBackgroundDelegate.kt", i = {0, 1, 2, 2, 2}, l = {LockFreeTaskQueueCore.FROZEN_SHIFT, LockFreeTaskQueueCore.FROZEN_SHIFT, 63, 76, 88, TsExtractor.TS_STREAM_TYPE_DVBSUBS, 101}, m = "invokeSuspend", n = {"$this$safeLaunch", "$this$safeLaunch", "$this$safeLaunch", "chat", "chatConfig"}, s = {"L$0", "L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class ChatBackgroundDelegateImpl$initChatBackground$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ChatBackgroundDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundDelegateImpl$initChatBackground$1(ChatBackgroundDelegateImpl chatBackgroundDelegateImpl, String str, ChatViewModel chatViewModel, Continuation<? super ChatBackgroundDelegateImpl$initChatBackground$1> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundDelegateImpl;
        this.$chatId = str;
        this.$$context_receiver_0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatBackgroundDelegateImpl$initChatBackground$1 chatBackgroundDelegateImpl$initChatBackground$1 = new ChatBackgroundDelegateImpl$initChatBackground$1(this.this$0, this.$chatId, this.$$context_receiver_0, continuation);
        chatBackgroundDelegateImpl$initChatBackground$1.L$0 = obj;
        return chatBackgroundDelegateImpl$initChatBackground$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatBackgroundDelegateImpl$initChatBackground$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate;
        ChatsConfigurationInteractor chatsConfigurationInteractor;
        CoroutineScope coroutineScope;
        ChatsConfiguration chatsConfiguration;
        ChatInfo component1;
        CheckChatPermissionsUseCase checkChatPermissionsUseCase;
        ChatConfig chatConfig;
        boolean booleanValue;
        ChatConfig.Images images;
        ChatBackgroundUseCase chatBackgroundUseCase;
        ChatConfig.SubscriptionInfo.Style style;
        ChatConfig.Images images2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            Result.m7271constructorimpl(ResultKt.createFailure(th));
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                chatsConfigurationInteractor = this.this$0.chatsConfigurationInteractor;
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object chatConfigurationFlow = chatsConfigurationInteractor.getChatConfigurationFlow(this.$chatId, this);
                if (chatConfigurationFlow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = chatConfigurationFlow;
                this.L$0 = coroutineScope;
                this.label = 2;
                obj = FlowKt.firstOrNull((Flow) obj, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                chatsConfiguration = (ChatsConfiguration) obj;
                if (chatsConfiguration != null) {
                    component1 = chatsConfiguration.component1();
                    ChatConfig component2 = chatsConfiguration.component2();
                    checkChatPermissionsUseCase = this.this$0.checkChatPermissionsUseCase;
                    this.L$0 = coroutineScope;
                    this.L$1 = component1;
                    this.L$2 = component2;
                    this.label = 3;
                    Object execute = checkChatPermissionsUseCase.execute(this.$chatId, ChatPermissions.CHAT_VIDEO_BACKGROUND, this);
                    if (execute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatConfig = component2;
                    obj = execute;
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue && component1.getChatType() == ChatType.INFLUENCER) {
                        if (!ommonKt.orFalse(chatConfig == null ? Boxing.boxBoolean(chatConfig.getHasAnimations()) : null)) {
                            String backgroundUrl = (chatConfig == null || (images2 = chatConfig.getImages()) == null) ? null : images2.getBackgroundUrl();
                            if (backgroundUrl == null) {
                                backgroundUrl = "";
                            }
                            ChatConfig.SubscriptionInfo subscriptionInfo = chatConfig != null ? chatConfig.getSubscriptionInfo() : null;
                            String hexBackgroundGradient = (subscriptionInfo == null || (style = subscriptionInfo.getStyle()) == null) ? null : style.getHexBackgroundGradient();
                            long m7040hexToColorSafe4WTKRHQ = StringKt.m7040hexToColorSafe4WTKRHQ(hexBackgroundGradient != null ? hexBackgroundGradient : "", AppColors.Companion.m7133getAppVioletGradient0d7_KjU());
                            UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate2 = this.$$context_receiver_0;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                            if (uiStateDelegate2.updateUiState(uiStateDelegate2, new AnonymousClass1(backgroundUrl, m7040hexToColorSafe4WTKRHQ), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    if (!booleanValue) {
                        ChatBackgroundDelegateImpl chatBackgroundDelegateImpl = this.this$0;
                        String str = this.$chatId;
                        Result.Companion companion2 = Result.Companion;
                        chatBackgroundUseCase = chatBackgroundDelegateImpl.chatBackgroundUseCase;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (chatBackgroundUseCase.preloadVideos(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result.m7271constructorimpl(Unit.INSTANCE);
                        uiStateDelegate = this.$$context_receiver_0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 6;
                        if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass3.INSTANCE, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.this$0.subscribeOnVideoTrigger(this.$$context_receiver_0, this.$chatId);
                    } else {
                        String backgroundUrl2 = (chatConfig == null || (images = chatConfig.getImages()) == null) ? null : images.getBackgroundUrl();
                        String str2 = backgroundUrl2 != null ? backgroundUrl2 : "";
                        UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate3 = this.$$context_receiver_0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 7;
                        if (uiStateDelegate3.updateUiState(uiStateDelegate3, new AnonymousClass4(str2), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope;
                this.label = 2;
                obj = FlowKt.firstOrNull((Flow) obj, this);
                if (obj == coroutine_suspended) {
                }
                chatsConfiguration = (ChatsConfiguration) obj;
                if (chatsConfiguration != null) {
                }
                return Unit.INSTANCE;
            case 2:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                chatsConfiguration = (ChatsConfiguration) obj;
                if (chatsConfiguration != null) {
                }
                return Unit.INSTANCE;
            case 3:
                chatConfig = (ChatConfig) this.L$2;
                component1 = (ChatInfo) this.L$1;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    if (!ommonKt.orFalse(chatConfig == null ? Boxing.boxBoolean(chatConfig.getHasAnimations()) : null)) {
                    }
                    break;
                }
                if (!booleanValue) {
                }
                break;
            case 4:
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                Result.m7271constructorimpl(Unit.INSTANCE);
                uiStateDelegate = this.$$context_receiver_0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass3.INSTANCE, this) == coroutine_suspended) {
                }
                this.this$0.subscribeOnVideoTrigger(this.$$context_receiver_0, this.$chatId);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                this.this$0.subscribeOnVideoTrigger(this.$$context_receiver_0, this.$chatId);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBackgroundDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$initChatBackground$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatViewModel.UiState, ChatViewModel.UiState> {
        final /* synthetic */ String $backgroundUrl;
        final /* synthetic */ long $gradientColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, long j) {
            super(1);
            this.$backgroundUrl = str;
            this.$gradientColor = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatViewModel.UiState invoke(ChatViewModel.UiState state) {
            ChatViewModel.UiState m6924copyfWhpE4E;
            Intrinsics.checkNotNullParameter(state, "state");
            m6924copyfWhpE4E = state.m6924copyfWhpE4E((r22 & 1) != 0 ? state.isLoading : false, (r22 & 2) != 0 ? state.animatedBgState : new AnimatedBackgroundView.State.Droplet(this.$backgroundUrl.length() == 0), (r22 & 4) != 0 ? state.imageBgState : this.$backgroundUrl, (r22 & 8) != 0 ? state.gradientColor : this.$gradientColor, (r22 & 16) != 0 ? state.chatName : null, (r22 & 32) != 0 ? state.isVerified : false, (r22 & 64) != 0 ? state.isShowSubscriptionState : false, (r22 & 128) != 0 ? state.subscriptionStateLabel : null, (r22 & 256) != 0 ? state.chatInfo : null);
            return m6924copyfWhpE4E;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBackgroundDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$initChatBackground$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<ChatViewModel.UiState, ChatViewModel.UiState> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatViewModel.UiState invoke(ChatViewModel.UiState state) {
            ChatViewModel.UiState m6924copyfWhpE4E;
            Intrinsics.checkNotNullParameter(state, "state");
            m6924copyfWhpE4E = state.m6924copyfWhpE4E((r22 & 1) != 0 ? state.isLoading : false, (r22 & 2) != 0 ? state.animatedBgState : new AnimatedBackgroundView.State.Droplet(true), (r22 & 4) != 0 ? state.imageBgState : null, (r22 & 8) != 0 ? state.gradientColor : 0L, (r22 & 16) != 0 ? state.chatName : null, (r22 & 32) != 0 ? state.isVerified : false, (r22 & 64) != 0 ? state.isShowSubscriptionState : false, (r22 & 128) != 0 ? state.subscriptionStateLabel : null, (r22 & 256) != 0 ? state.chatInfo : null);
            return m6924copyfWhpE4E;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBackgroundDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$initChatBackground$1$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends Lambda implements Function1<ChatViewModel.UiState, ChatViewModel.UiState> {
        final /* synthetic */ String $backgroundUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(String str) {
            super(1);
            this.$backgroundUrl = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatViewModel.UiState invoke(ChatViewModel.UiState state) {
            ChatViewModel.UiState m6924copyfWhpE4E;
            Intrinsics.checkNotNullParameter(state, "state");
            m6924copyfWhpE4E = state.m6924copyfWhpE4E((r22 & 1) != 0 ? state.isLoading : false, (r22 & 2) != 0 ? state.animatedBgState : new AnimatedBackgroundView.State.Droplet(this.$backgroundUrl.length() == 0), (r22 & 4) != 0 ? state.imageBgState : this.$backgroundUrl, (r22 & 8) != 0 ? state.gradientColor : 0L, (r22 & 16) != 0 ? state.chatName : null, (r22 & 32) != 0 ? state.isVerified : false, (r22 & 64) != 0 ? state.isShowSubscriptionState : false, (r22 & 128) != 0 ? state.subscriptionStateLabel : null, (r22 & 256) != 0 ? state.chatInfo : null);
            return m6924copyfWhpE4E;
        }
    }
}
