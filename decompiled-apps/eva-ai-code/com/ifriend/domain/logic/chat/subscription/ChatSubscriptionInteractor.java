package com.ifriend.domain.logic.chat.subscription;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatPaymentStatus;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionState;
import com.ifriend.domain.logic.chat.subscription.models.ChatSubscriptionBenefits;
import com.ifriend.domain.newChat.chat.ChatClientKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatSubscriptionInteractor.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;", "", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "chatSubscriptionRepository", "Lcom/ifriend/domain/data/chat/subscription/ChatSubscriptionRepository;", "(Lcom/ifriend/domain/data/chat/ChatsInfoRepository;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/domain/data/chat/subscription/ChatSubscriptionRepository;)V", "getChatSubscriptionState", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState;", "chatInfo", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "getChatSubscriptionStateFlow", "Lkotlinx/coroutines/flow/Flow;", "chatId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriptionBenefitsFlow", "", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionInteractor {
    private final ChatClientInteractor chatClientInteractor;
    private final ChatSubscriptionRepository chatSubscriptionRepository;
    private final ChatsInfoRepository chatsInfoRepository;

    @Inject
    public ChatSubscriptionInteractor(ChatsInfoRepository chatsInfoRepository, ChatClientInteractor chatClientInteractor, ChatSubscriptionRepository chatSubscriptionRepository) {
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(chatSubscriptionRepository, "chatSubscriptionRepository");
        this.chatsInfoRepository = chatsInfoRepository;
        this.chatClientInteractor = chatClientInteractor;
        this.chatSubscriptionRepository = chatSubscriptionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatSubscriptionStateFlow(String str, Continuation<? super Flow<? extends ChatSubscriptionState>> continuation) {
        ChatSubscriptionInteractor$getChatSubscriptionStateFlow$1 chatSubscriptionInteractor$getChatSubscriptionStateFlow$1;
        int i;
        ChatSubscriptionInteractor chatSubscriptionInteractor;
        Flow<ChatInfo> flow;
        if (continuation instanceof ChatSubscriptionInteractor$getChatSubscriptionStateFlow$1) {
            chatSubscriptionInteractor$getChatSubscriptionStateFlow$1 = (ChatSubscriptionInteractor$getChatSubscriptionStateFlow$1) continuation;
            if ((chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.label & Integer.MIN_VALUE) != 0) {
                chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.label -= Integer.MIN_VALUE;
                Object obj = chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<ChatInfo> chatFlow = this.chatsInfoRepository.getChatFlow(str);
                    ChatClientInteractor chatClientInteractor = this.chatClientInteractor;
                    chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.L$0 = this;
                    chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.L$1 = chatFlow;
                    chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.label = 1;
                    Object state = chatClientInteractor.getState(str, chatSubscriptionInteractor$getChatSubscriptionStateFlow$1);
                    if (state == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatSubscriptionInteractor = this;
                    obj = state;
                    flow = chatFlow;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    flow = (Flow) chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.L$1;
                    chatSubscriptionInteractor = (ChatSubscriptionInteractor) chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                final Flow flow2 = (Flow) obj;
                return FlowKt.combine(flow, FlowKt.distinctUntilChanged(new Flow<Integer>() { // from class: com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor$getChatSubscriptionStateFlow$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation2) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor$getChatSubscriptionStateFlow$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor$getChatSubscriptionStateFlow$$inlined$map$1$2", f = "ChatSubscriptionInteractor.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor$getChatSubscriptionStateFlow$$inlined$map$1$2$1  reason: invalid class name */
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
                                        Integer boxInt = Boxing.boxInt(ChatClientKt.getMessages((EntitiesState) obj).size());
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(boxInt, anonymousClass1) == coroutine_suspended) {
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
                }), new ChatSubscriptionInteractor$getChatSubscriptionStateFlow$3(chatSubscriptionInteractor, null));
            }
        }
        chatSubscriptionInteractor$getChatSubscriptionStateFlow$1 = new ChatSubscriptionInteractor$getChatSubscriptionStateFlow$1(this, continuation);
        Object obj2 = chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatSubscriptionInteractor$getChatSubscriptionStateFlow$1.label;
        if (i != 0) {
        }
        final Flow flow22 = (Flow) obj2;
        return FlowKt.combine(flow, FlowKt.distinctUntilChanged(new Flow<Integer>() { // from class: com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor$getChatSubscriptionStateFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor$getChatSubscriptionStateFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor$getChatSubscriptionStateFlow$$inlined$map$1$2", f = "ChatSubscriptionInteractor.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor$getChatSubscriptionStateFlow$$inlined$map$1$2$1  reason: invalid class name */
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
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj22);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Integer boxInt = Boxing.boxInt(ChatClientKt.getMessages((EntitiesState) obj).size());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boxInt, anonymousClass1) == coroutine_suspended2) {
                                    return coroutine_suspended2;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj22);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj222 = anonymousClass1.result;
                    Object coroutine_suspended22 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }), new ChatSubscriptionInteractor$getChatSubscriptionStateFlow$3(chatSubscriptionInteractor, null));
    }

    public final Object getSubscriptionBenefitsFlow(String str, Continuation<? super Flow<? extends List<ChatSubscriptionBenefits>>> continuation) {
        return this.chatSubscriptionRepository.getSubscriptionBenefitsFlow(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatSubscriptionState getChatSubscriptionState(ChatInfo chatInfo) {
        ChatPaymentStatus paymentStatus = chatInfo.getPaymentStatus();
        if (paymentStatus instanceof ChatPaymentStatus.Subscription) {
            if (((ChatPaymentStatus.Subscription) paymentStatus).getHasSubscription()) {
                return ChatSubscriptionState.SubscriptionActivated.INSTANCE;
            }
            return ChatSubscriptionState.SubscriptionUnactivated.INSTANCE;
        } else if (paymentStatus instanceof ChatPaymentStatus.TrialPeriod) {
            if (ChatoptionsKt.isSubscriptionPaymentOptions(chatInfo)) {
                return ChatSubscriptionState.TrialPeriod.INSTANCE;
            }
            return ChatSubscriptionState.TrialPeriodFinished.INSTANCE;
        } else {
            return ChatSubscriptionState.Empty.INSTANCE;
        }
    }
}
