package com.ifriend.presentation.features.profile.header.delegate;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatar;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.profile.header.mappers.ChatAvatarMapper;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatHeaderDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initBotInfoObserver$2", f = "ChatHeaderDelegate.kt", i = {}, l = {123, 132}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatHeaderDelegateImpl$initBotInfoObserver$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatHeaderDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHeaderDelegateImpl$initBotInfoObserver$2(ChatHeaderDelegateImpl chatHeaderDelegateImpl, String str, Continuation<? super ChatHeaderDelegateImpl$initBotInfoObserver$2> continuation) {
        super(2, continuation);
        this.this$0 = chatHeaderDelegateImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHeaderDelegateImpl$initBotInfoObserver$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatHeaderDelegateImpl$initBotInfoObserver$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GeneratedChatAvatarInteractor generatedChatAvatarInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            generatedChatAvatarInteractor = this.this$0.generatedChatAvatarInteractor;
            this.label = 1;
            obj = generatedChatAvatarInteractor.getGeneratedChatAvatarFlow(this.$chatId, this);
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
        final Flow flow = (Flow) obj;
        final ChatHeaderDelegateImpl chatHeaderDelegateImpl = this.this$0;
        this.label = 2;
        if (FlowKt.collect(FlowKt.onEach(new Flow<AnimatedAvatarViewState>() { // from class: com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initBotInfoObserver$2$invokeSuspend$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AnimatedAvatarViewState> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, chatHeaderDelegateImpl), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initBotInfoObserver$2$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ChatHeaderDelegateImpl this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initBotInfoObserver$2$invokeSuspend$$inlined$map$1$2", f = "ChatHeaderDelegate.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initBotInfoObserver$2$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ChatHeaderDelegateImpl chatHeaderDelegateImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatHeaderDelegateImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    ChatAvatarMapper chatAvatarMapper;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                chatAvatarMapper = this.this$0.chatAvatarMapper;
                                AnimatedAvatarViewState map = chatAvatarMapper.map((GeneratedChatAvatar) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new AnonymousClass2(this.this$0, null)), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "avatarState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initBotInfoObserver$2$2", f = "ChatHeaderDelegate.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initBotInfoObserver$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<AnimatedAvatarViewState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChatHeaderDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ChatHeaderDelegateImpl chatHeaderDelegateImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chatHeaderDelegateImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AnimatedAvatarViewState animatedAvatarViewState, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(animatedAvatarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate = this.this$0;
                this.label = 1;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1((AnimatedAvatarViewState) this.L$0), this) == coroutine_suspended) {
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
        /* compiled from: ChatHeaderDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initBotInfoObserver$2$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<ChatHeaderUiState, ChatHeaderUiState> {
            final /* synthetic */ AnimatedAvatarViewState $avatarState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AnimatedAvatarViewState animatedAvatarViewState) {
                super(1);
                this.$avatarState = animatedAvatarViewState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatHeaderUiState invoke(ChatHeaderUiState state) {
                ChatHeaderUiState copy;
                Intrinsics.checkNotNullParameter(state, "state");
                copy = state.copy((r26 & 1) != 0 ? state.animatedAvatarState : this.$avatarState, (r26 & 2) != 0 ? state.title : null, (r26 & 4) != 0 ? state.unreadMessagesCount : 0, (r26 & 8) != 0 ? state.lvlProgress : 0.0f, (r26 & 16) != 0 ? state.lvlLabel : null, (r26 & 32) != 0 ? state.isVisibleLvlProgress : false, (r26 & 64) != 0 ? state.balanceLabel : null, (r26 & 128) != 0 ? state.isVisibleBackButton : false, (r26 & 256) != 0 ? state.isVisibleMenuButton : false, (r26 & 512) != 0 ? state.isVisibleMenuIndicator : false, (r26 & 1024) != 0 ? state.isVisibleUpdateIndicator : false, (r26 & 2048) != 0 ? state.isVisibleVerified : false);
                return copy;
            }
        }
    }
}
