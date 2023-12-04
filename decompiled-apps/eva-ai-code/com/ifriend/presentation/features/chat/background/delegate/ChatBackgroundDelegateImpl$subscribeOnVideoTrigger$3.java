package com.ifriend.presentation.features.chat.background.delegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.chat.ChatBackgroundUseCase;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBackgroundDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3", f = "ChatBackgroundDelegate.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    Object L$0;
    int label;
    final /* synthetic */ ChatBackgroundDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3(ChatBackgroundDelegateImpl chatBackgroundDelegateImpl, String str, ChatViewModel chatViewModel, Continuation<? super ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundDelegateImpl;
        this.$chatId = str;
        this.$$context_receiver_0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3(this.this$0, this.$chatId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserRepository userRepository;
        ChatBackgroundUseCase chatBackgroundUseCase;
        Flow flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            userRepository = this.this$0.userRepository;
            Flow filterNotNull = FlowKt.filterNotNull(userRepository.getUser());
            chatBackgroundUseCase = this.this$0.chatBackgroundUseCase;
            this.L$0 = filterNotNull;
            this.label = 1;
            Object isAvailableVideoBackgroundFlow = chatBackgroundUseCase.isAvailableVideoBackgroundFlow(this.$chatId, this);
            if (isAvailableVideoBackgroundFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
            flow = filterNotNull;
            obj = isAvailableVideoBackgroundFlow;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            flow = (Flow) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        final Flow flow2 = (Flow) obj;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(FlowKt.transformLatest(FlowKt.combine(flow, new Flow<Boolean>() { // from class: com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$invokeSuspend$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$invokeSuspend$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$invokeSuspend$$inlined$filter$1$2", f = "ChatBackgroundDelegate.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$invokeSuspend$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                                if (((Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
        }, new AnonymousClass2(null)), new ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0, this.$chatId))), new AnonymousClass4(this.this$0, this.$$context_receiver_0, null)), ViewModelKt.getViewModelScope(this.$$context_receiver_0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBackgroundDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/user/User;", "user", "", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$2", f = "ChatBackgroundDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<User, Boolean, Continuation<? super User>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        public final Object invoke(User user, boolean z, Continuation<? super User> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = user;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(User user, Boolean bool, Continuation<? super User> continuation) {
            return invoke(user, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return (User) this.L$0;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBackgroundDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackground;", "chatBackground", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$4", f = "ChatBackgroundDelegate.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<ChatBackground, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatViewModel $$context_receiver_0;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChatBackgroundDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ChatBackgroundDelegateImpl chatBackgroundDelegateImpl, ChatViewModel chatViewModel, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = chatBackgroundDelegateImpl;
            this.$$context_receiver_0 = chatViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$$context_receiver_0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChatBackground chatBackground, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(chatBackground, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object updateChatBackground;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ChatBackgroundDelegateImpl chatBackgroundDelegateImpl = this.this$0;
                ChatViewModel chatViewModel = this.$$context_receiver_0;
                this.label = 1;
                updateChatBackground = chatBackgroundDelegateImpl.updateChatBackground(chatViewModel, (ChatBackground) this.L$0, this);
                if (updateChatBackground == coroutine_suspended) {
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
