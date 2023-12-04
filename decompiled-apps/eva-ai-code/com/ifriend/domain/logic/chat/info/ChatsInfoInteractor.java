package com.ifriend.domain.logic.chat.info;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chat.ChatClientsRepository;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.logic.chat.chats.GetActiveChattingChatsUseCase;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatsState;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.ClientId;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.newChat.chat.ChatClient;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatsInfoInteractor.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u001a\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012J\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0013\u0010 \u001a\u0004\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0011\u0010!\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0019\u0010\"\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "chatsRepository", "Lcom/ifriend/domain/data/chat/ChatClientsRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "chatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "isMultiChatEnabledUseCase", "Lcom/ifriend/domain/logic/chat/info/IsMultiChatEnabledUseCase;", "getActiveChattingChatsUseCase", "Lcom/ifriend/domain/logic/chat/chats/GetActiveChattingChatsUseCase;", "activateNewChatUseCase", "Lcom/ifriend/domain/logic/chat/info/ActivateNewChatUseCase;", "(Lcom/ifriend/domain/data/chat/ChatsInfoRepository;Lcom/ifriend/domain/data/chat/ChatClientsRepository;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;Lcom/ifriend/domain/logic/chat/info/IsMultiChatEnabledUseCase;Lcom/ifriend/domain/logic/chat/chats/GetActiveChattingChatsUseCase;Lcom/ifriend/domain/logic/chat/info/ActivateNewChatUseCase;)V", "getAvailableChatsInfoFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "getChatInfo", "chatId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatsInfoFlow", "getChatsState", "Lcom/ifriend/domain/logic/chat/models/ChatsState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatsStateFlow", "getCountOfUnreadMessages", "", "getDefaultChatInfo", "getSafeDefaultChatInfo", "setLastActiveChat", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsInfoInteractor {
    private final ActivateNewChatUseCase activateNewChatUseCase;
    private final ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
    private final ChatsInfoRepository chatsInfoRepository;
    private final ChatClientsRepository chatsRepository;
    private final GetActiveChattingChatsUseCase getActiveChattingChatsUseCase;
    private final IsMultiChatEnabledUseCase isMultiChatEnabledUseCase;
    private final UserRepository userRepository;

    @Inject
    public ChatsInfoInteractor(ChatsInfoRepository chatsInfoRepository, ChatClientsRepository chatsRepository, UserRepository userRepository, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, IsMultiChatEnabledUseCase isMultiChatEnabledUseCase, GetActiveChattingChatsUseCase getActiveChattingChatsUseCase, ActivateNewChatUseCase activateNewChatUseCase) {
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(chatsRepository, "chatsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "chatsInfoConfigurationRepository");
        Intrinsics.checkNotNullParameter(isMultiChatEnabledUseCase, "isMultiChatEnabledUseCase");
        Intrinsics.checkNotNullParameter(getActiveChattingChatsUseCase, "getActiveChattingChatsUseCase");
        Intrinsics.checkNotNullParameter(activateNewChatUseCase, "activateNewChatUseCase");
        this.chatsInfoRepository = chatsInfoRepository;
        this.chatsRepository = chatsRepository;
        this.userRepository = userRepository;
        this.chatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
        this.isMultiChatEnabledUseCase = isMultiChatEnabledUseCase;
        this.getActiveChattingChatsUseCase = getActiveChattingChatsUseCase;
        this.activateNewChatUseCase = activateNewChatUseCase;
    }

    public final Flow<List<ChatInfo>> getAvailableChatsInfoFlow() {
        return FlowKt.combine(this.getActiveChattingChatsUseCase.execute(), this.isMultiChatEnabledUseCase.execute(), new ChatsInfoInteractor$getAvailableChatsInfoFlow$1(null));
    }

    public final Flow<ChatInfo> getChatsInfoFlow(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return this.chatsInfoRepository.getChatFlow(chatId);
    }

    public final Object getChatInfo(String str, Continuation<? super ChatInfo> continuation) {
        return this.chatsInfoRepository.getChat(str, continuation);
    }

    public final Flow<ChatsState> getChatsStateFlow() {
        final Flow<Boolean> execute = this.isMultiChatEnabledUseCase.execute();
        return new Flow<ChatsState>() { // from class: com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getChatsStateFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ChatsState> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getChatsStateFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getChatsStateFlow$$inlined$map$1$2", f = "ChatsInfoInteractor.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getChatsStateFlow$$inlined$map$1$2$1  reason: invalid class name */
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
                    ChatsState chatsState;
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
                                    chatsState = ChatsState.ChatListChats.INSTANCE;
                                } else {
                                    chatsState = ChatsState.SingleChat.INSTANCE;
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(chatsState, anonymousClass1) == coroutine_suspended) {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatsState(Continuation<? super ChatsState> continuation) {
        ChatsInfoInteractor$getChatsState$1 chatsInfoInteractor$getChatsState$1;
        Object obj;
        int i;
        if (continuation instanceof ChatsInfoInteractor$getChatsState$1) {
            chatsInfoInteractor$getChatsState$1 = (ChatsInfoInteractor$getChatsState$1) continuation;
            if ((chatsInfoInteractor$getChatsState$1.label & Integer.MIN_VALUE) != 0) {
                chatsInfoInteractor$getChatsState$1.label -= Integer.MIN_VALUE;
                obj = chatsInfoInteractor$getChatsState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatsInfoInteractor$getChatsState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> execute = this.isMultiChatEnabledUseCase.execute();
                    chatsInfoInteractor$getChatsState$1.label = 1;
                    obj = FlowKt.firstOrNull(execute, chatsInfoInteractor$getChatsState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                if (!ommonKt.orFalse((Boolean) obj)) {
                    return ChatsState.ChatListChats.INSTANCE;
                }
                return ChatsState.SingleChat.INSTANCE;
            }
        }
        chatsInfoInteractor$getChatsState$1 = new ChatsInfoInteractor$getChatsState$1(this, continuation);
        obj = chatsInfoInteractor$getChatsState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatsInfoInteractor$getChatsState$1.label;
        if (i != 0) {
        }
        if (!ommonKt.orFalse((Boolean) obj)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCountOfUnreadMessages(final String str, Continuation<? super Flow<Integer>> continuation) {
        ChatsInfoInteractor$getCountOfUnreadMessages$1 chatsInfoInteractor$getCountOfUnreadMessages$1;
        int i;
        if (continuation instanceof ChatsInfoInteractor$getCountOfUnreadMessages$1) {
            chatsInfoInteractor$getCountOfUnreadMessages$1 = (ChatsInfoInteractor$getCountOfUnreadMessages$1) continuation;
            if ((chatsInfoInteractor$getCountOfUnreadMessages$1.label & Integer.MIN_VALUE) != 0) {
                chatsInfoInteractor$getCountOfUnreadMessages$1.label -= Integer.MIN_VALUE;
                Object obj = chatsInfoInteractor$getCountOfUnreadMessages$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatsInfoInteractor$getCountOfUnreadMessages$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatClientsRepository chatClientsRepository = this.chatsRepository;
                    chatsInfoInteractor$getCountOfUnreadMessages$1.L$0 = str;
                    chatsInfoInteractor$getCountOfUnreadMessages$1.label = 1;
                    obj = chatClientsRepository.getChatClientsWithChatIdFlow(chatsInfoInteractor$getCountOfUnreadMessages$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) chatsInfoInteractor$getCountOfUnreadMessages$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                final Flow flow = (Flow) obj;
                return FlowKt.transformLatest(new Flow<List<? extends ChatClient>>() { // from class: com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getCountOfUnreadMessages$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends ChatClient>> flowCollector, Continuation continuation2) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str), continuation2);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getCountOfUnreadMessages$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ String $chatId$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getCountOfUnreadMessages$$inlined$map$1$2", f = "ChatsInfoInteractor.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getCountOfUnreadMessages$$inlined$map$1$2$1  reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, String str) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$chatId$inlined = str;
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
                                        ArrayList arrayList = new ArrayList();
                                        for (Pair pair : (List) obj) {
                                            ChatClient chatClient = !Intrinsics.areEqual(pair.getFirst(), this.$chatId$inlined) ? (ChatClient) pair.getSecond() : null;
                                            if (chatClient != null) {
                                                arrayList.add(chatClient);
                                            }
                                        }
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
                }, new ChatsInfoInteractor$getCountOfUnreadMessages$$inlined$flatMapLatest$1(null));
            }
        }
        chatsInfoInteractor$getCountOfUnreadMessages$1 = new ChatsInfoInteractor$getCountOfUnreadMessages$1(this, continuation);
        Object obj2 = chatsInfoInteractor$getCountOfUnreadMessages$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatsInfoInteractor$getCountOfUnreadMessages$1.label;
        if (i != 0) {
        }
        final Flow flow2 = (Flow) obj2;
        return FlowKt.transformLatest(new Flow<List<? extends ChatClient>>() { // from class: com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getCountOfUnreadMessages$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ChatClient>> flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getCountOfUnreadMessages$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $chatId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getCountOfUnreadMessages$$inlined$map$1$2", f = "ChatsInfoInteractor.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.domain.logic.chat.info.ChatsInfoInteractor$getCountOfUnreadMessages$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$chatId$inlined = str;
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
                                ArrayList arrayList = new ArrayList();
                                for (Pair pair : (List) obj) {
                                    ChatClient chatClient = !Intrinsics.areEqual(pair.getFirst(), this.$chatId$inlined) ? (ChatClient) pair.getSecond() : null;
                                    if (chatClient != null) {
                                        arrayList.add(chatClient);
                                    }
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended2) {
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
        }, new ChatsInfoInteractor$getCountOfUnreadMessages$$inlined$flatMapLatest$1(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDefaultChatInfo(Continuation<? super ChatInfo> continuation) {
        ChatsInfoInteractor$getDefaultChatInfo$1 chatsInfoInteractor$getDefaultChatInfo$1;
        int i;
        List list;
        if (continuation instanceof ChatsInfoInteractor$getDefaultChatInfo$1) {
            chatsInfoInteractor$getDefaultChatInfo$1 = (ChatsInfoInteractor$getDefaultChatInfo$1) continuation;
            if ((chatsInfoInteractor$getDefaultChatInfo$1.label & Integer.MIN_VALUE) != 0) {
                chatsInfoInteractor$getDefaultChatInfo$1.label -= Integer.MIN_VALUE;
                Object obj = chatsInfoInteractor$getDefaultChatInfo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatsInfoInteractor$getDefaultChatInfo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<List<ChatInfo>> chatFlow = this.chatsInfoRepository.getChatFlow();
                    chatsInfoInteractor$getDefaultChatInfo$1.label = 1;
                    obj = FlowKt.firstOrNull(chatFlow, chatsInfoInteractor$getDefaultChatInfo$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                for (Object obj2 : list) {
                    if (((ChatInfo) obj2).isMain()) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        chatsInfoInteractor$getDefaultChatInfo$1 = new ChatsInfoInteractor$getDefaultChatInfo$1(this, continuation);
        Object obj3 = chatsInfoInteractor$getDefaultChatInfo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatsInfoInteractor$getDefaultChatInfo$1.label;
        if (i != 0) {
        }
        list = (List) obj3;
        if (list == null) {
        }
        while (r5.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSafeDefaultChatInfo(Continuation<? super ChatInfo> continuation) {
        ChatsInfoInteractor$getSafeDefaultChatInfo$1 chatsInfoInteractor$getSafeDefaultChatInfo$1;
        int i;
        ChatsInfoInteractor chatsInfoInteractor;
        ChatInfo chatInfo;
        AuthData auth;
        ClientId clientId;
        if (continuation instanceof ChatsInfoInteractor$getSafeDefaultChatInfo$1) {
            chatsInfoInteractor$getSafeDefaultChatInfo$1 = (ChatsInfoInteractor$getSafeDefaultChatInfo$1) continuation;
            if ((chatsInfoInteractor$getSafeDefaultChatInfo$1.label & Integer.MIN_VALUE) != 0) {
                chatsInfoInteractor$getSafeDefaultChatInfo$1.label -= Integer.MIN_VALUE;
                Object obj = chatsInfoInteractor$getSafeDefaultChatInfo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatsInfoInteractor$getSafeDefaultChatInfo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    chatsInfoInteractor$getSafeDefaultChatInfo$1.L$0 = this;
                    chatsInfoInteractor$getSafeDefaultChatInfo$1.label = 1;
                    obj = getDefaultChatInfo(chatsInfoInteractor$getSafeDefaultChatInfo$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatsInfoInteractor = this;
                } else if (i == 1) {
                    chatsInfoInteractor = (ChatsInfoInteractor) chatsInfoInteractor$getSafeDefaultChatInfo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        if (obj != null) {
                            return (ChatInfo) obj;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatsInfoInteractor = (ChatsInfoInteractor) chatsInfoInteractor$getSafeDefaultChatInfo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    chatsInfoInteractor$getSafeDefaultChatInfo$1.L$0 = null;
                    chatsInfoInteractor$getSafeDefaultChatInfo$1.label = 3;
                    obj = chatsInfoInteractor.getDefaultChatInfo(chatsInfoInteractor$getSafeDefaultChatInfo$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (obj != null) {
                    }
                }
                chatInfo = (ChatInfo) obj;
                if (chatInfo == null) {
                    return chatInfo;
                }
                User currentUser = chatsInfoInteractor.userRepository.getCurrentUser();
                String value = (currentUser == null || (auth = currentUser.getAuth()) == null || (clientId = auth.getClientId()) == null) ? null : clientId.getValue();
                if (value == null) {
                    value = "";
                }
                ActivateNewChatUseCase activateNewChatUseCase = chatsInfoInteractor.activateNewChatUseCase;
                chatsInfoInteractor$getSafeDefaultChatInfo$1.L$0 = chatsInfoInteractor;
                chatsInfoInteractor$getSafeDefaultChatInfo$1.label = 2;
                if (activateNewChatUseCase.execute(value, chatsInfoInteractor$getSafeDefaultChatInfo$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                chatsInfoInteractor$getSafeDefaultChatInfo$1.L$0 = null;
                chatsInfoInteractor$getSafeDefaultChatInfo$1.label = 3;
                obj = chatsInfoInteractor.getDefaultChatInfo(chatsInfoInteractor$getSafeDefaultChatInfo$1);
                if (obj == coroutine_suspended) {
                }
                if (obj != null) {
                }
            }
        }
        chatsInfoInteractor$getSafeDefaultChatInfo$1 = new ChatsInfoInteractor$getSafeDefaultChatInfo$1(this, continuation);
        Object obj2 = chatsInfoInteractor$getSafeDefaultChatInfo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatsInfoInteractor$getSafeDefaultChatInfo$1.label;
        if (i != 0) {
        }
        chatInfo = (ChatInfo) obj2;
        if (chatInfo == null) {
        }
    }

    public final Object setLastActiveChat(String str, Continuation<? super Unit> continuation) {
        Object lastActiveChat = this.chatsInfoConfigurationRepository.setLastActiveChat(str, continuation);
        return lastActiveChat == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? lastActiveChat : Unit.INSTANCE;
    }
}
