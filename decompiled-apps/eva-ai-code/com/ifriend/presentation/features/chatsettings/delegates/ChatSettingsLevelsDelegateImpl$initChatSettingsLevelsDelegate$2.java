package com.ifriend.presentation.features.chatsettings.delegates;

import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.models.levels.LevelInfo;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
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
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatSettingsLevelsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2", f = "ChatSettingsLevelsDelegate.kt", i = {}, l = {29, 30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatSettingsViewModel $$context_receiver_0;
    int label;
    final /* synthetic */ ChatSettingsLevelsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2(ChatSettingsLevelsDelegateImpl chatSettingsLevelsDelegateImpl, ChatSettingsViewModel chatSettingsViewModel, Continuation<? super ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2> continuation) {
        super(2, continuation);
        this.this$0 = chatSettingsLevelsDelegateImpl;
        this.$$context_receiver_0 = chatSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2(this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        this.label = 2;
        if (FlowKt.collectLatest((Flow) obj, new AnonymousClass1(this.$$context_receiver_0, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatSettingsLevelsDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lcom/ifriend/common_utils/data/Resource;", "Lcom/ifriend/domain/models/levels/LevelInfo;", "levelInfo", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2$1", f = "ChatSettingsLevelsDelegate.kt", i = {}, l = {38, 46}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Resource<LevelInfo>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatSettingsViewModel $$context_receiver_0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatSettingsViewModel chatSettingsViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$context_receiver_0 = chatSettingsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$context_receiver_0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Resource<LevelInfo> resource, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(resource, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LevelInfo levelInfo = (LevelInfo) ((Resource) this.L$0).getData();
                if (levelInfo != null) {
                    float coerceIn = RangesKt.coerceIn(levelInfo.getCurrentPoints() / levelInfo.getNextLevelPoints(), 0.0f, 1.0f);
                    String valueOf = String.valueOf(levelInfo.getLevel());
                    UiStateDelegate<ChatSettingsViewModel.UiState, Object> uiStateDelegate = this.$$context_receiver_0;
                    this.label = 1;
                    if (uiStateDelegate.updateUiState(uiStateDelegate, new C01541(this.$$context_receiver_0, valueOf, coerceIn), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    UiStateDelegate<ChatSettingsViewModel.UiState, Object> uiStateDelegate2 = this.$$context_receiver_0;
                    this.label = 2;
                    if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass2.INSTANCE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatSettingsLevelsDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01541 extends Lambda implements Function1<ChatSettingsViewModel.UiState, ChatSettingsViewModel.UiState> {
            final /* synthetic */ ChatSettingsViewModel $$context_receiver_0;
            final /* synthetic */ String $lvl;
            final /* synthetic */ float $progress;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01541(ChatSettingsViewModel chatSettingsViewModel, String str, float f) {
                super(1);
                this.$$context_receiver_0 = chatSettingsViewModel;
                this.$lvl = str;
                this.$progress = f;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatSettingsViewModel.UiState invoke(ChatSettingsViewModel.UiState state) {
                ChatSettingsViewModel.UiState copy;
                Intrinsics.checkNotNullParameter(state, "state");
                copy = state.copy((r24 & 1) != 0 ? state.lvlProgress : this.$progress, (r24 & 2) != 0 ? state.lvlLabel : this.$$context_receiver_0.getString(R.string.chat_header__lvl, this.$lvl), (r24 & 4) != 0 ? state.isVisibleLvlProgress : true, (r24 & 8) != 0 ? state.name : null, (r24 & 16) != 0 ? state.avatarUrl : null, (r24 & 32) != 0 ? state.description : null, (r24 & 64) != 0 ? state.isVerified : false, (r24 & 128) != 0 ? state.interests : null, (r24 & 256) != 0 ? state.actionTags : null, (r24 & 512) != 0 ? state.subscriptionStateLabel : null, (r24 & 1024) != 0 ? state.isShowSubscriptionState : false);
                return copy;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatSettingsLevelsDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2$1$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends Lambda implements Function1<ChatSettingsViewModel.UiState, ChatSettingsViewModel.UiState> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatSettingsViewModel.UiState invoke(ChatSettingsViewModel.UiState state) {
                ChatSettingsViewModel.UiState copy;
                Intrinsics.checkNotNullParameter(state, "state");
                copy = state.copy((r24 & 1) != 0 ? state.lvlProgress : 0.0f, (r24 & 2) != 0 ? state.lvlLabel : "", (r24 & 4) != 0 ? state.isVisibleLvlProgress : false, (r24 & 8) != 0 ? state.name : null, (r24 & 16) != 0 ? state.avatarUrl : null, (r24 & 32) != 0 ? state.description : null, (r24 & 64) != 0 ? state.isVerified : false, (r24 & 128) != 0 ? state.interests : null, (r24 & 256) != 0 ? state.actionTags : null, (r24 & 512) != 0 ? state.subscriptionStateLabel : null, (r24 & 1024) != 0 ? state.isShowSubscriptionState : false);
                return copy;
            }
        }
    }
}
