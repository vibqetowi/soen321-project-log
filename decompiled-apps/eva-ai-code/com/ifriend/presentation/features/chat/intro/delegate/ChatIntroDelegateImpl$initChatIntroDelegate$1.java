package com.ifriend.presentation.features.chat.intro.delegate;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.intro.GetChatIntroSlidesUseCase;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatIntroSlide;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroCardUiParams;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroCardUiParamsKt;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroUiState;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatIntroDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegateImpl$initChatIntroDelegate$1", f = "ChatIntroDelegate.kt", i = {2, 2}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF, ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE, 59}, m = "invokeSuspend", n = {"info", "config"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class ChatIntroDelegateImpl$initChatIntroDelegate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChatIntroDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroDelegateImpl$initChatIntroDelegate$1(ChatIntroDelegateImpl chatIntroDelegateImpl, String str, Continuation<? super ChatIntroDelegateImpl$initChatIntroDelegate$1> continuation) {
        super(2, continuation);
        this.this$0 = chatIntroDelegateImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatIntroDelegateImpl$initChatIntroDelegate$1(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatIntroDelegateImpl$initChatIntroDelegate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChatsConfigurationInteractor chatsConfigurationInteractor;
        ChatsConfiguration chatsConfiguration;
        GetChatIntroSlidesUseCase getChatIntroSlidesUseCase;
        ChatConfig chatConfig;
        ChatInfo chatInfo;
        List list;
        List list2;
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
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                chatsConfiguration = (ChatsConfiguration) obj;
                if (chatsConfiguration != null) {
                    return Unit.INSTANCE;
                }
                ChatInfo component1 = chatsConfiguration.component1();
                ChatConfig component2 = chatsConfiguration.component2();
                getChatIntroSlidesUseCase = this.this$0.chatsIntroSlidesUseCase;
                this.L$0 = component1;
                this.L$1 = component2;
                this.label = 3;
                Object execute = getChatIntroSlidesUseCase.execute(component1.getUId(), this);
                if (execute == coroutine_suspended) {
                    return coroutine_suspended;
                }
                chatConfig = component2;
                obj = execute;
                chatInfo = component1;
                list = (List) obj;
                if (!list.isEmpty()) {
                }
                return Unit.INSTANCE;
            } else if (i != 3) {
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                chatConfig = (ChatConfig) this.L$1;
                chatInfo = (ChatInfo) this.L$0;
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (!list.isEmpty()) {
                    list2 = this.this$0.slides;
                    List<ChatIntroSlide> list3 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (ChatIntroSlide chatIntroSlide : list3) {
                        arrayList.add(ChatIntroCardUiParamsKt.toUiParams(chatIntroSlide));
                    }
                    list2.addAll(arrayList);
                    UiStateDelegate<ChatIntroUiState, Unit> uiStateDelegate = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (uiStateDelegate.reduce(uiStateDelegate, new AnonymousClass2(chatInfo, chatConfig, this.this$0), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        obj = FlowKt.firstOrNull((Flow) obj, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        chatsConfiguration = (ChatsConfiguration) obj;
        if (chatsConfiguration != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatIntroDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroUiState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegateImpl$initChatIntroDelegate$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<ChatIntroUiState, ChatIntroUiState> {
        final /* synthetic */ ChatConfig $config;
        final /* synthetic */ ChatInfo $info;
        final /* synthetic */ ChatIntroDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ChatInfo chatInfo, ChatConfig chatConfig, ChatIntroDelegateImpl chatIntroDelegateImpl) {
            super(1);
            this.$info = chatInfo;
            this.$config = chatConfig;
            this.this$0 = chatIntroDelegateImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatIntroUiState invoke(ChatIntroUiState it) {
            List list;
            ChatConfig.Descriptions descriptions;
            Intrinsics.checkNotNullParameter(it, "it");
            String roundAvatarUrl = this.$info.getRoundAvatarUrl();
            String name = this.$info.getName();
            ChatConfig chatConfig = this.$config;
            String status = (chatConfig == null || (descriptions = chatConfig.getDescriptions()) == null) ? null : descriptions.getStatus();
            if (status == null) {
                status = "";
            }
            String str = status;
            list = this.this$0.slides;
            return ChatIntroUiState.copy$default(it, true, roundAvatarUrl, name, null, str, (ChatIntroCardUiParams) CollectionsKt.first((List<? extends Object>) list), 8, null);
        }
    }
}
