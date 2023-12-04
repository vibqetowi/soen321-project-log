package com.ifriend.presentation.services;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.notifications.ChatNotificationsRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.events.ChatRemoveMessageEvent;
import com.ifriend.domain.logic.chat.info.ActivateNewChatUseCase;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatMessagesService.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/ifriend/presentation/services/ChatMessagesServiceImpl;", "Lcom/ifriend/presentation/services/ChatMessagesService;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "userProfileRepository", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "notificationsRepo", "Lcom/ifriend/domain/data/notifications/ChatNotificationsRepository;", "activateNewChatUseCase", "Lcom/ifriend/domain/logic/chat/info/ActivateNewChatUseCase;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "chatEventsInteractor", "Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;", "(Lcom/ifriend/domain/socket/MessagesSource;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/user/UserProfileRepository;Lcom/ifriend/core/tools/api/DispatcherProvider;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/domain/data/notifications/ChatNotificationsRepository;Lcom/ifriend/domain/logic/chat/info/ActivateNewChatUseCase;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;)V", "messagesSourceJob", "Lkotlinx/coroutines/Job;", "regenerateMessageFailedJob", "removedMessagesSourceJob", "removeMessage", "", "chatId", "", "messageId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TtmlNode.START, "stop", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessagesServiceImpl implements ChatMessagesService {
    public static final int $stable = 8;
    private final ActivateNewChatUseCase activateNewChatUseCase;
    private final ChatClientInteractor chatClientInteractor;
    private final ChatEventsInteractor chatEventsInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final CoroutineScope coroutineScope;
    private final DispatcherProvider dispatcherProvider;
    private final MessagesSource messagesSource;
    private Job messagesSourceJob;
    private final ChatNotificationsRepository notificationsRepo;
    private Job regenerateMessageFailedJob;
    private Job removedMessagesSourceJob;
    private final UserProfileRepository userProfileRepository;
    private final UserRepository userRepository;

    @Inject
    public ChatMessagesServiceImpl(MessagesSource messagesSource, UserRepository userRepository, UserProfileRepository userProfileRepository, DispatcherProvider dispatcherProvider, CoroutineScope coroutineScope, ChatClientInteractor chatClientInteractor, ChatNotificationsRepository notificationsRepo, ActivateNewChatUseCase activateNewChatUseCase, ChatsInfoInteractor chatsInfoInteractor, ChatEventsInteractor chatEventsInteractor) {
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(notificationsRepo, "notificationsRepo");
        Intrinsics.checkNotNullParameter(activateNewChatUseCase, "activateNewChatUseCase");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(chatEventsInteractor, "chatEventsInteractor");
        this.messagesSource = messagesSource;
        this.userRepository = userRepository;
        this.userProfileRepository = userProfileRepository;
        this.dispatcherProvider = dispatcherProvider;
        this.coroutineScope = coroutineScope;
        this.chatClientInteractor = chatClientInteractor;
        this.notificationsRepo = notificationsRepo;
        this.activateNewChatUseCase = activateNewChatUseCase;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.chatEventsInteractor = chatEventsInteractor;
    }

    @Override // com.ifriend.presentation.services.ChatMessagesService
    public void start() {
        Job job = this.removedMessagesSourceJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.messagesSourceJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Job job3 = this.regenerateMessageFailedJob;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        final Flow<MessagesSourceMessage> allMessages = this.messagesSource.getAllMessages(true);
        final Flow<Object> flow = new Flow<Object>() { // from class: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$getMessagesOf$default$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", "com/ifriend/domain/socket/MessagesSourceKt$getMessagesOf$$inlined$filterIsInstance$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$getMessagesOf$default$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$getMessagesOf$default$1$2", f = "ChatMessagesService.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$getMessagesOf$default$1$2$1  reason: invalid class name */
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
                                if (obj instanceof MessagesSourceMessage.Chat.ChatMessageEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
        final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<MessagesSourceMessage.Chat.ChatMessageEvent>() { // from class: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super MessagesSourceMessage.Chat.ChatMessageEvent> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ChatMessagesServiceImpl this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$1$2", f = "ChatMessagesService.kt", i = {0, 0}, l = {225, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
                /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, ChatMessagesServiceImpl chatMessagesServiceImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatMessagesServiceImpl;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    UserRepository userRepository;
                    FlowCollector flowCollector;
                    Boolean boxBoolean;
                    UserProfileRepository userProfileRepository;
                    Object obj2;
                    FlowCollector flowCollector2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj3);
                                FlowCollector flowCollector3 = this.$this_unsafeFlow;
                                MessagesSourceMessage.Chat.ChatMessageEvent chatMessageEvent = (MessagesSourceMessage.Chat.ChatMessageEvent) obj;
                                userRepository = this.this$0.userRepository;
                                if (userRepository.isAuthorized()) {
                                    userProfileRepository = this.this$0.userProfileRepository;
                                    anonymousClass1.L$0 = obj;
                                    anonymousClass1.L$1 = flowCollector3;
                                    anonymousClass1.label = 1;
                                    Object isOnboardingDataSubmitted = userProfileRepository.isOnboardingDataSubmitted(anonymousClass1);
                                    if (isOnboardingDataSubmitted == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    obj2 = obj;
                                    flowCollector2 = flowCollector3;
                                    obj3 = isOnboardingDataSubmitted;
                                } else {
                                    flowCollector = flowCollector3;
                                    boxBoolean = Boxing.boxBoolean(false);
                                    if (((Boolean) boxBoolean).booleanValue()) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.label = 2;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj3);
                                return Unit.INSTANCE;
                            } else {
                                flowCollector2 = (FlowCollector) anonymousClass1.L$1;
                                obj2 = anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj3);
                            }
                            Object obj4 = obj2;
                            flowCollector = flowCollector2;
                            obj = obj4;
                            boxBoolean = obj3;
                            if (((Boolean) boxBoolean).booleanValue()) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    Object obj42 = obj2;
                    flowCollector = flowCollector2;
                    obj = obj42;
                    boxBoolean = obj32;
                    if (((Boolean) boxBoolean).booleanValue()) {
                    }
                    return Unit.INSTANCE;
                }
            }
        });
        this.messagesSourceJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.onEach(FlowKt.onEach(new Flow<MessagesSourceMessage.Chat.ChatMessageEvent>() { // from class: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super MessagesSourceMessage.Chat.ChatMessageEvent> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ChatMessagesServiceImpl this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$2$2", f = "ChatMessagesService.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$2$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, ChatMessagesServiceImpl chatMessagesServiceImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatMessagesServiceImpl;
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
                    UserRepository userRepository;
                    User currentUser;
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
                                String senderId = ((MessagesSourceMessage.Chat.ChatMessageEvent) obj).getChatMessage().getInfo().getIds().getSenderId();
                                userRepository = this.this$0.userRepository;
                                if (!Intrinsics.areEqual(senderId, userRepository.getCurrentUser() != null ? currentUser.getUserIdValue() : null)) {
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
        }, new ChatMessagesServiceImpl$start$3(this, null)), new ChatMessagesServiceImpl$start$4(this, null)), this.dispatcherProvider.background()), this.coroutineScope);
        final Flow<MessagesSourceMessage> allMessages2 = this.messagesSource.getAllMessages(true);
        final Flow<Object> flow2 = new Flow<Object>() { // from class: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$getMessagesOf$default$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", "com/ifriend/domain/socket/MessagesSourceKt$getMessagesOf$$inlined$filterIsInstance$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$getMessagesOf$default$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$getMessagesOf$default$2$2", f = "ChatMessagesService.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$getMessagesOf$default$2$2$1  reason: invalid class name */
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
                                if (obj instanceof MessagesSourceMessage.Chat.MessageRemoved) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
        this.removedMessagesSourceJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<MessagesSourceMessage.Chat.MessageRemoved>() { // from class: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$3
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super MessagesSourceMessage.Chat.MessageRemoved> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$3$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ChatMessagesServiceImpl this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$3$2", f = "ChatMessagesService.kt", i = {0, 0}, l = {225, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
                /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$3$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, ChatMessagesServiceImpl chatMessagesServiceImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatMessagesServiceImpl;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    UserRepository userRepository;
                    FlowCollector flowCollector;
                    Boolean boxBoolean;
                    UserProfileRepository userProfileRepository;
                    Object obj2;
                    FlowCollector flowCollector2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj3);
                                FlowCollector flowCollector3 = this.$this_unsafeFlow;
                                MessagesSourceMessage.Chat.MessageRemoved messageRemoved = (MessagesSourceMessage.Chat.MessageRemoved) obj;
                                userRepository = this.this$0.userRepository;
                                if (userRepository.isAuthorized()) {
                                    userProfileRepository = this.this$0.userProfileRepository;
                                    anonymousClass1.L$0 = obj;
                                    anonymousClass1.L$1 = flowCollector3;
                                    anonymousClass1.label = 1;
                                    Object isOnboardingDataSubmitted = userProfileRepository.isOnboardingDataSubmitted(anonymousClass1);
                                    if (isOnboardingDataSubmitted == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    obj2 = obj;
                                    flowCollector2 = flowCollector3;
                                    obj3 = isOnboardingDataSubmitted;
                                } else {
                                    flowCollector = flowCollector3;
                                    boxBoolean = Boxing.boxBoolean(false);
                                    if (((Boolean) boxBoolean).booleanValue()) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.label = 2;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj3);
                                return Unit.INSTANCE;
                            } else {
                                flowCollector2 = (FlowCollector) anonymousClass1.L$1;
                                obj2 = anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj3);
                            }
                            Object obj4 = obj2;
                            flowCollector = flowCollector2;
                            obj = obj4;
                            boxBoolean = obj3;
                            if (((Boolean) boxBoolean).booleanValue()) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    Object obj42 = obj2;
                    flowCollector = flowCollector2;
                    obj = obj42;
                    boxBoolean = obj32;
                    if (((Boolean) boxBoolean).booleanValue()) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }), new ChatMessagesServiceImpl$start$6(this, null)), this.dispatcherProvider.background()), this.coroutineScope);
        final Flow<MessagesSourceMessage.Chat.ChatRegenerateMessageFailed> chatRegenerateMessageFailedFlow = this.chatEventsInteractor.getChatRegenerateMessageFailedFlow();
        this.regenerateMessageFailedJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<MessagesSourceMessage.Chat.ChatRegenerateMessageFailed>() { // from class: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$4
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super MessagesSourceMessage.Chat.ChatRegenerateMessageFailed> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$4$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ChatMessagesServiceImpl this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$4$2", f = "ChatMessagesService.kt", i = {0, 0}, l = {225, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
                /* renamed from: com.ifriend.presentation.services.ChatMessagesServiceImpl$start$$inlined$filter$4$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, ChatMessagesServiceImpl chatMessagesServiceImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatMessagesServiceImpl;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    UserRepository userRepository;
                    FlowCollector flowCollector;
                    Boolean boxBoolean;
                    UserProfileRepository userProfileRepository;
                    Object obj2;
                    FlowCollector flowCollector2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj3);
                                FlowCollector flowCollector3 = this.$this_unsafeFlow;
                                MessagesSourceMessage.Chat.ChatRegenerateMessageFailed chatRegenerateMessageFailed = (MessagesSourceMessage.Chat.ChatRegenerateMessageFailed) obj;
                                userRepository = this.this$0.userRepository;
                                if (userRepository.isAuthorized()) {
                                    userProfileRepository = this.this$0.userProfileRepository;
                                    anonymousClass1.L$0 = obj;
                                    anonymousClass1.L$1 = flowCollector3;
                                    anonymousClass1.label = 1;
                                    Object isOnboardingDataSubmitted = userProfileRepository.isOnboardingDataSubmitted(anonymousClass1);
                                    if (isOnboardingDataSubmitted == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    obj2 = obj;
                                    flowCollector2 = flowCollector3;
                                    obj3 = isOnboardingDataSubmitted;
                                } else {
                                    flowCollector = flowCollector3;
                                    boxBoolean = Boxing.boxBoolean(false);
                                    if (((Boolean) boxBoolean).booleanValue()) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.label = 2;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj3);
                                return Unit.INSTANCE;
                            } else {
                                flowCollector2 = (FlowCollector) anonymousClass1.L$1;
                                obj2 = anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj3);
                            }
                            Object obj4 = obj2;
                            flowCollector = flowCollector2;
                            obj = obj4;
                            boxBoolean = obj3;
                            if (((Boolean) boxBoolean).booleanValue()) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    Object obj42 = obj2;
                    flowCollector = flowCollector2;
                    obj = obj42;
                    boxBoolean = obj32;
                    if (((Boolean) boxBoolean).booleanValue()) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }), new ChatMessagesServiceImpl$start$8(this, null)), this.dispatcherProvider.background()), this.coroutineScope);
    }

    @Override // com.ifriend.presentation.services.ChatMessagesService
    public void stop() {
        Job job = this.removedMessagesSourceJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.regenerateMessageFailedJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Job job3 = this.messagesSourceJob;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeMessage(String str, String str2, Continuation<? super Unit> continuation) {
        Object handleEvent = this.chatClientInteractor.handleEvent(str, new ChatRemoveMessageEvent(str2), continuation);
        return handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? handleEvent : Unit.INSTANCE;
    }
}
