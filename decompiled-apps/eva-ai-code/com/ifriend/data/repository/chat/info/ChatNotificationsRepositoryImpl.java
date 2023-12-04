package com.ifriend.data.repository.chat.info;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.share.internal.ShareConstants;
import com.ifriend.data.mappers.ChatNotificationsMapper;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.notifications.ChatNotificationsRepository;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.models.chat.notifications.ChatNotification;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.socket.MessagesSourceMessage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: ChatNotificationsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/ifriend/data/repository/chat/info/ChatNotificationsRepositoryImpl;", "Lcom/ifriend/domain/data/notifications/ChatNotificationsRepository;", "mapper", "Lcom/ifriend/data/mappers/ChatNotificationsMapper;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "(Lcom/ifriend/data/mappers/ChatNotificationsMapper;Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/domain/data/chat/ChatsInfoRepository;)V", "flow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$Message;", "emitNew", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "(Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowNotifications", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotificationsRepositoryImpl implements ChatNotificationsRepository {
    private final ChatsInfoRepository chatsInfoRepository;
    private final CoroutineDispatchers dispatchers;
    private final MutableSharedFlow<MessagesSourceMessage.Chat.Message> flow;
    private final ChatNotificationsMapper mapper;

    @Inject
    public ChatNotificationsRepositoryImpl(ChatNotificationsMapper mapper, CoroutineDispatchers dispatchers, ChatsInfoRepository chatsInfoRepository) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        this.mapper = mapper;
        this.dispatchers = dispatchers;
        this.chatsInfoRepository = chatsInfoRepository;
        this.flow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    @Override // com.ifriend.domain.data.notifications.ChatNotificationsRepository
    public Object emitNew(MessagesSourceMessage.Chat.Message message, Continuation<? super Unit> continuation) {
        Object emit = this.flow.emit(message, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.notifications.ChatNotificationsRepository
    public Flow<ChatNotification> flowNotifications() {
        final MutableSharedFlow<MessagesSourceMessage.Chat.Message> mutableSharedFlow = this.flow;
        final Flow<ChatMessage> flow = new Flow<ChatMessage>() { // from class: com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ChatMessage> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$map$1$2", f = "ChatNotificationsRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$map$1$2$1  reason: invalid class name */
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
                                ChatMessage chatMessage = ((MessagesSourceMessage.Chat.Message) obj).getChatMessage();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(chatMessage, anonymousClass1) == coroutine_suspended) {
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
        };
        final Flow<ChatMessage> flow2 = new Flow<ChatMessage>() { // from class: com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ChatMessage> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$filter$1$2", f = "ChatNotificationsRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$filter$1$2$1  reason: invalid class name */
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
                                if (ChatMessageKt.isFromBot((ChatMessage) obj)) {
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
        };
        return FlowKt.flowOn(new Flow<ChatNotification>() { // from class: com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ChatNotification> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$mapNotNull$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ChatNotificationsRepositoryImpl this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$mapNotNull$1$2", f = "ChatNotificationsRepositoryImpl.kt", i = {0, 0, 0}, l = {224, 231}, m = "emit", n = {"this", "$this$mapNotNull_u24lambda_u246", ShareConstants.WEB_DIALOG_PARAM_MESSAGE}, s = {"L$0", "L$1", "L$2"})
                /* renamed from: com.ifriend.data.repository.chat.info.ChatNotificationsRepositoryImpl$flowNotifications$$inlined$mapNotNull$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
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

                public AnonymousClass2(FlowCollector flowCollector, ChatNotificationsRepositoryImpl chatNotificationsRepositoryImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatNotificationsRepositoryImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    FlowCollector flowCollector;
                    ChatMessage chatMessage;
                    ChatsInfoRepository chatsInfoRepository;
                    AnonymousClass2<T> anonymousClass2;
                    ChatInfo chatInfo;
                    ChatNotification chatNotification;
                    ChatNotificationsMapper chatNotificationsMapper;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                flowCollector = this.$this_unsafeFlow;
                                chatMessage = (ChatMessage) obj;
                                chatsInfoRepository = this.this$0.chatsInfoRepository;
                                String senderId = chatMessage.getInfo().getIds().getSenderId();
                                anonymousClass1.L$0 = this;
                                anonymousClass1.L$1 = flowCollector;
                                anonymousClass1.L$2 = chatMessage;
                                anonymousClass1.label = 1;
                                obj2 = chatsInfoRepository.getChat(senderId, anonymousClass1);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                anonymousClass2 = this;
                            } else if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            } else {
                                chatMessage = (ChatMessage) anonymousClass1.L$2;
                                flowCollector = (FlowCollector) anonymousClass1.L$1;
                                anonymousClass2 = (AnonymousClass2) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                            }
                            chatInfo = (ChatInfo) obj2;
                            if (chatInfo == null) {
                                chatNotificationsMapper = anonymousClass2.this$0.mapper;
                                chatNotification = chatNotificationsMapper.map(chatMessage, chatInfo.getChatId(), chatInfo.getName(), chatInfo.getRoundAvatarUrl());
                            } else {
                                chatNotification = null;
                            }
                            if (chatNotification != null) {
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.label = 2;
                                if (flowCollector.emit(chatNotification, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
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
                    chatInfo = (ChatInfo) obj22;
                    if (chatInfo == null) {
                    }
                    if (chatNotification != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, this.dispatchers.getIO());
    }
}
