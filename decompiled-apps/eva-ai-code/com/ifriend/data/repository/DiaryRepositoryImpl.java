package com.ifriend.data.repository;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.share.internal.ShareConstants;
import com.ifriend.common_utils.Logger;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.data.networking.api.diary.DiaryApiDelegate;
import com.ifriend.data.networking.responses.DiaryNoteDaoModel;
import com.ifriend.data.networking.responses.DiaryNoteDaoModelKt;
import com.ifriend.data.storages.diary.DiaryDao;
import com.ifriend.data.storages.diary.ShownDiaryNotesDao;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.models.diary.DiaryNote;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: DiaryRepositoryImpl.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0011\u0010\u001d\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/ifriend/data/repository/DiaryRepositoryImpl;", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "apiDelegate", "Lcom/ifriend/data/networking/api/diary/DiaryApiDelegate;", "diaryDao", "Lcom/ifriend/data/storages/diary/DiaryDao;", "shownNotesDao", "Lcom/ifriend/data/storages/diary/ShownDiaryNotesDao;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/data/networking/api/diary/DiaryApiDelegate;Lcom/ifriend/data/storages/diary/DiaryDao;Lcom/ifriend/data/storages/diary/ShownDiaryNotesDao;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/socket/MessagesSource;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/common_utils/Logger;)V", "clear", "", "getDiaryNotes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/common_utils/data/Resource;", "", "Lcom/ifriend/domain/models/diary/DiaryNote;", "refresh", "", "markAllNotesAsShown", "refreshAllNotes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDiaryNote", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryRepositoryImpl implements DiaryRepository {
    private final DiaryApiDelegate apiDelegate;
    private final BotRepository botRepository;
    private final CoroutineScope coroutineScope;
    private final DiaryDao diaryDao;
    private final Logger logger;
    private final MessagesSource messagesSource;
    private final ShownDiaryNotesDao shownNotesDao;
    private final UserRepository userRepository;

    public DiaryRepositoryImpl(DiaryApiDelegate apiDelegate, DiaryDao diaryDao, ShownDiaryNotesDao shownNotesDao, UserRepository userRepository, BotRepository botRepository, MessagesSource messagesSource, CoroutineScope coroutineScope, Logger logger) {
        Intrinsics.checkNotNullParameter(apiDelegate, "apiDelegate");
        Intrinsics.checkNotNullParameter(diaryDao, "diaryDao");
        Intrinsics.checkNotNullParameter(shownNotesDao, "shownNotesDao");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.apiDelegate = apiDelegate;
        this.diaryDao = diaryDao;
        this.shownNotesDao = shownNotesDao;
        this.userRepository = userRepository;
        this.botRepository = botRepository;
        this.messagesSource = messagesSource;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: DiaryRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$1", f = "DiaryRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final Flow<MessagesSourceMessage> allMessages = DiaryRepositoryImpl.this.messagesSource.getAllMessages(true);
            FlowKt.launchIn(FlowKt.onEach(new Flow<Object>() { // from class: com.ifriend.data.repository.DiaryRepositoryImpl$1$invokeSuspend$$inlined$getMessagesOf$default$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", "com/ifriend/domain/socket/MessagesSourceKt$getMessagesOf$$inlined$filterIsInstance$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$1$invokeSuspend$$inlined$getMessagesOf$default$1$2  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$1$invokeSuspend$$inlined$getMessagesOf$default$1$2", f = "DiaryRepositoryImpl.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                    /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$1$invokeSuspend$$inlined$getMessagesOf$default$1$2$1  reason: invalid class name */
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
                                    if (obj instanceof MessagesSourceMessage.AddDiaryNotes) {
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
            }, new C01361(DiaryRepositoryImpl.this, null)), (CoroutineScope) this.L$0);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DiaryRepositoryImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$AddDiaryNotes;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$1$1", f = "DiaryRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01361 extends SuspendLambda implements Function2<MessagesSourceMessage.AddDiaryNotes, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DiaryRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01361(DiaryRepositoryImpl diaryRepositoryImpl, Continuation<? super C01361> continuation) {
                super(2, continuation);
                this.this$0 = diaryRepositoryImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01361 c01361 = new C01361(this.this$0, continuation);
                c01361.L$0 = obj;
                return c01361;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MessagesSourceMessage.AddDiaryNotes addDiaryNotes, Continuation<? super Unit> continuation) {
                return ((C01361) create(addDiaryNotes, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.diaryDao.addNotes(DiaryNoteDaoModelKt.toDaoModels(((MessagesSourceMessage.AddDiaryNotes) this.L$0).getNotes()));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.ifriend.domain.data.diary.DiaryRepository
    public Flow<Resource<List<DiaryNote>>> getDiaryNotes(boolean z) {
        Logger logger = this.logger;
        logger.log("getDiaryNotes(refresh = " + z + ")");
        return FlowKt.transformLatest(FlowKt.combine(this.userRepository.getUser(), this.botRepository.getBot(), new DiaryRepositoryImpl$getDiaryNotes$1(null)), new DiaryRepositoryImpl$getDiaryNotes$$inlined$flatMapLatest$1(null, this, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.ifriend.domain.data.diary.DiaryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object refreshAllNotes(Continuation<? super Unit> continuation) {
        DiaryRepositoryImpl$refreshAllNotes$1 diaryRepositoryImpl$refreshAllNotes$1;
        int i;
        DiaryRepositoryImpl diaryRepositoryImpl;
        if (continuation instanceof DiaryRepositoryImpl$refreshAllNotes$1) {
            diaryRepositoryImpl$refreshAllNotes$1 = (DiaryRepositoryImpl$refreshAllNotes$1) continuation;
            if ((diaryRepositoryImpl$refreshAllNotes$1.label & Integer.MIN_VALUE) != 0) {
                diaryRepositoryImpl$refreshAllNotes$1.label -= Integer.MIN_VALUE;
                Object obj = diaryRepositoryImpl$refreshAllNotes$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = diaryRepositoryImpl$refreshAllNotes$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DiaryApiDelegate diaryApiDelegate = this.apiDelegate;
                    diaryRepositoryImpl$refreshAllNotes$1.L$0 = this;
                    diaryRepositoryImpl$refreshAllNotes$1.label = 1;
                    obj = diaryApiDelegate.getDiaryNotes(diaryRepositoryImpl$refreshAllNotes$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    diaryRepositoryImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    diaryRepositoryImpl = (DiaryRepositoryImpl) diaryRepositoryImpl$refreshAllNotes$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                diaryRepositoryImpl.diaryDao.saveDiaryNotes((List) obj);
                return Unit.INSTANCE;
            }
        }
        diaryRepositoryImpl$refreshAllNotes$1 = new DiaryRepositoryImpl$refreshAllNotes$1(this, continuation);
        Object obj2 = diaryRepositoryImpl$refreshAllNotes$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = diaryRepositoryImpl$refreshAllNotes$1.label;
        if (i != 0) {
        }
        diaryRepositoryImpl.diaryDao.saveDiaryNotes((List) obj2);
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.diary.DiaryRepository
    public void markAllNotesAsShown() {
        List<DiaryNoteDaoModel> currentDiaryNotes = this.diaryDao.currentDiaryNotes();
        if (currentDiaryNotes != null) {
            List<DiaryNoteDaoModel> list = currentDiaryNotes;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (DiaryNoteDaoModel diaryNoteDaoModel : list) {
                arrayList.add(diaryNoteDaoModel.getId());
            }
            this.shownNotesDao.addShownIds(CollectionsKt.toSet(arrayList));
        }
    }

    @Override // com.ifriend.domain.data.diary.DiaryRepository
    public void clear() {
        this.diaryDao.clear();
        this.shownNotesDao.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.ifriend.domain.data.diary.DiaryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object refreshDiaryNote(String str, Continuation<? super Unit> continuation) {
        DiaryRepositoryImpl$refreshDiaryNote$1 diaryRepositoryImpl$refreshDiaryNote$1;
        int i;
        DiaryRepositoryImpl diaryRepositoryImpl;
        if (continuation instanceof DiaryRepositoryImpl$refreshDiaryNote$1) {
            diaryRepositoryImpl$refreshDiaryNote$1 = (DiaryRepositoryImpl$refreshDiaryNote$1) continuation;
            if ((diaryRepositoryImpl$refreshDiaryNote$1.label & Integer.MIN_VALUE) != 0) {
                diaryRepositoryImpl$refreshDiaryNote$1.label -= Integer.MIN_VALUE;
                Object obj = diaryRepositoryImpl$refreshDiaryNote$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = diaryRepositoryImpl$refreshDiaryNote$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DiaryApiDelegate diaryApiDelegate = this.apiDelegate;
                    diaryRepositoryImpl$refreshDiaryNote$1.L$0 = this;
                    diaryRepositoryImpl$refreshDiaryNote$1.label = 1;
                    obj = diaryApiDelegate.getDiaryNote(str, diaryRepositoryImpl$refreshDiaryNote$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    diaryRepositoryImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    diaryRepositoryImpl = (DiaryRepositoryImpl) diaryRepositoryImpl$refreshDiaryNote$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                diaryRepositoryImpl.diaryDao.updateNote((DiaryNoteDaoModel) obj);
                return Unit.INSTANCE;
            }
        }
        diaryRepositoryImpl$refreshDiaryNote$1 = new DiaryRepositoryImpl$refreshDiaryNote$1(this, continuation);
        Object obj2 = diaryRepositoryImpl$refreshDiaryNote$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = diaryRepositoryImpl$refreshDiaryNote$1.label;
        if (i != 0) {
        }
        diaryRepositoryImpl.diaryDao.updateNote((DiaryNoteDaoModel) obj2);
        return Unit.INSTANCE;
    }
}
