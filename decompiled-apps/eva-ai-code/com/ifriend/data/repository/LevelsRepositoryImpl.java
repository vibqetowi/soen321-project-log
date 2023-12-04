package com.ifriend.data.repository;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.data.networking.api.levels.LevelsApiDelegate;
import com.ifriend.data.networking.api.levels.LevelsResponse;
import com.ifriend.data.storages.levels.LevelsDao;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.models.levels.LevelInfo;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: LevelsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00150\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\f\u0010\u0017\u001a\u00020\u0012*\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/ifriend/data/repository/LevelsRepositoryImpl;", "Lcom/ifriend/domain/data/levels/LevelsRepository;", "apiDelegate", "Lcom/ifriend/data/networking/api/levels/LevelsApiDelegate;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "dao", "Lcom/ifriend/data/storages/levels/LevelsDao;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/data/networking/api/levels/LevelsApiDelegate;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/data/storages/levels/LevelsDao;Lcom/ifriend/domain/socket/MessagesSource;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/CoroutineDispatchers;)V", "clear", "", "getCurrentLevelInfo", "Lcom/ifriend/domain/models/levels/LevelInfo;", "getLevelInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/common_utils/data/Resource;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toDomainModel", "Lcom/ifriend/data/networking/api/levels/LevelsResponse;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelsRepositoryImpl implements LevelsRepository {
    private final LevelsApiDelegate apiDelegate;
    private final LevelsDao dao;
    private final UserRepository userRepository;

    public LevelsRepositoryImpl(LevelsApiDelegate apiDelegate, UserRepository userRepository, LevelsDao dao, MessagesSource messagesSource, CoroutineScope scope, CoroutineDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(apiDelegate, "apiDelegate");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.apiDelegate = apiDelegate;
        this.userRepository = userRepository;
        this.dao = dao;
        final Flow<MessagesSourceMessage> allMessages = messagesSource.getAllMessages(false);
        FlowKt.launchIn(FlowKt.onEach(new Flow<Object>() { // from class: com.ifriend.data.repository.LevelsRepositoryImpl$special$$inlined$getMessagesOf$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", "com/ifriend/domain/socket/MessagesSourceKt$getMessagesOf$$inlined$filterIsInstance$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$special$$inlined$getMessagesOf$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.repository.LevelsRepositoryImpl$special$$inlined$getMessagesOf$1$2", f = "LevelsRepositoryImpl.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$special$$inlined$getMessagesOf$1$2$1  reason: invalid class name */
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
                                if (obj instanceof MessagesSourceMessage.LevelInfoUpdate) {
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
        }, new AnonymousClass1(null)), CoroutineScopeKt.plus(scope, dispatchers.getIO()));
    }

    /* compiled from: LevelsRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.LevelsRepositoryImpl$1", f = "LevelsRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<MessagesSourceMessage.LevelInfoUpdate, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MessagesSourceMessage.LevelInfoUpdate levelInfoUpdate, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(levelInfoUpdate, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MessagesSourceMessage.LevelInfoUpdate levelInfoUpdate = (MessagesSourceMessage.LevelInfoUpdate) this.L$0;
            LevelsRepositoryImpl.this.dao.updateLevelInfo(new LevelInfo(levelInfoUpdate.getCurrent().getLevel(), levelInfoUpdate.getCurrent().getCurrentPoints(), levelInfoUpdate.getCurrent().getNextLevelPoints()));
            return Unit.INSTANCE;
        }
    }

    @Override // com.ifriend.domain.data.levels.LevelsRepository
    public Object getLevelInfo(Continuation<? super Flow<? extends Resource<LevelInfo>>> continuation) {
        final Flow<User> user = this.userRepository.getUser();
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$$inlined$map$1$2", f = "LevelsRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$$inlined$map$1$2$1  reason: invalid class name */
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
                                User user = (User) obj;
                                String userIdValue = user != null ? user.getUserIdValue() : null;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(userIdValue, anonymousClass1) == coroutine_suspended) {
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
        }), new LevelsRepositoryImpl$getLevelInfo$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.ifriend.domain.data.levels.LevelsRepository
    public LevelInfo getCurrentLevelInfo() {
        return this.dao.getCurrentLevelInfo();
    }

    @Override // com.ifriend.domain.data.levels.LevelsRepository
    public void clear() {
        this.dao.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LevelInfo toDomainModel(LevelsResponse levelsResponse) {
        return new LevelInfo(levelsResponse.getLevel(), levelsResponse.getCurrentPoints(), levelsResponse.getNextLevelPoints());
    }
}
