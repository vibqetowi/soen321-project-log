package com.ifriend.data.repository;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.data.networking.api.diary.DiaryApiDelegate;
import com.ifriend.data.storages.diary.ShownDiaryNotesDao;
import com.ifriend.domain.models.diary.DiaryNote;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.user.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: NetworkBoundResource.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¨\u0006\u0005"}, d2 = {"ResultType", "RequestType", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/ifriend/common_utils/data/Resource;", "", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1", f = "DiaryRepositoryImpl.kt", i = {0, 1, 2}, l = {11, 14, 32, 26}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1 extends SuspendLambda implements Function2<FlowCollector<? super Resource<List<? extends DiaryNote>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bot $bot$inlined;
    final /* synthetic */ boolean $refresh$inlined;
    final /* synthetic */ User $user$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DiaryRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1(Continuation continuation, DiaryRepositoryImpl diaryRepositoryImpl, User user, Bot bot, boolean z, DiaryRepositoryImpl diaryRepositoryImpl2, DiaryRepositoryImpl diaryRepositoryImpl3) {
        super(2, continuation);
        this.this$0 = diaryRepositoryImpl;
        this.$user$inlined = user;
        this.$bot$inlined = bot;
        this.$refresh$inlined = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DiaryRepositoryImpl diaryRepositoryImpl = this.this$0;
        DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1 diaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1 = new DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1(continuation, diaryRepositoryImpl, this.$user$inlined, this.$bot$inlined, this.$refresh$inlined, diaryRepositoryImpl, diaryRepositoryImpl);
        diaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1.L$0 = obj;
        return diaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Resource<List<? extends DiaryNote>>> flowCollector, Continuation<? super Unit> continuation) {
        return ((DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ShownDiaryNotesDao shownDiaryNotesDao;
        Flow<Resource.Error<List<? extends DiaryNote>>> flow;
        FlowCollector flowCollector;
        ShownDiaryNotesDao shownDiaryNotesDao2;
        FlowCollector flowCollector2;
        ShownDiaryNotesDao shownDiaryNotesDao3;
        FlowCollector flowCollector3;
        DiaryApiDelegate diaryApiDelegate;
        ShownDiaryNotesDao shownDiaryNotesDao4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        try {
        } catch (Throwable th) {
            shownDiaryNotesDao = this.this$0.shownNotesDao;
            final Flow transformLatest = FlowKt.transformLatest(shownDiaryNotesDao.getShownNoteIds(), new DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1(null, this.this$0, this.$user$inlined, this.$bot$inlined));
            flow = new Flow<Resource.Error<List<? extends DiaryNote>>>() { // from class: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1.2
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Resource.Error<List<? extends DiaryNote>>> flowCollector4, Continuation continuation) {
                    Object collect = Flow.this.collect(new C01352(flowCollector4, th), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$2$2  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C01352<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ Throwable $throwable$inlined;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$2$2", f = "DiaryRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$2$2$1  reason: invalid class name */
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
                            return C01352.this.emit(null, this);
                        }
                    }

                    public C01352(FlowCollector flowCollector, Throwable th) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$throwable$inlined = th;
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
                                    Resource.Error error = new Resource.Error(this.$throwable$inlined, obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(error, anonymousClass1) == coroutine_suspended) {
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
            flowCollector = i;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector4 = (FlowCollector) this.L$0;
            shownDiaryNotesDao2 = this.this$0.shownNotesDao;
            this.L$0 = flowCollector4;
            this.label = 1;
            obj = FlowKt.first(FlowKt.transformLatest(shownDiaryNotesDao2.getShownNoteIds(), new DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1(null, this.this$0, this.$user$inlined, this.$bot$inlined)), this);
            flowCollector2 = flowCollector4;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r1 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = r1;
                DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1 diaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1 = this;
                this.this$0.diaryDao.saveDiaryNotes((List) obj);
                shownDiaryNotesDao4 = this.this$0.shownNotesDao;
                final Flow transformLatest2 = FlowKt.transformLatest(shownDiaryNotesDao4.getShownNoteIds(), new DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1(null, this.this$0, this.$user$inlined, this.$bot$inlined));
                flow = (Flow) new Flow<Resource.Success<List<? extends DiaryNote>>>() { // from class: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1.1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Resource.Success<List<? extends DiaryNote>>> flowCollector5, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector5), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$1$2", f = "DiaryRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$1$2$1  reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes6.dex */
                        public static final class C01341 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public C01341(Continuation continuation) {
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
                            C01341 c01341;
                            int i;
                            if (continuation instanceof C01341) {
                                c01341 = (C01341) continuation;
                                if ((c01341.label & Integer.MIN_VALUE) != 0) {
                                    c01341.label -= Integer.MIN_VALUE;
                                    Object obj2 = c01341.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = c01341.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        Resource.Success success = new Resource.Success(obj);
                                        c01341.label = 1;
                                        if (flowCollector.emit(success, c01341) == coroutine_suspended) {
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
                            c01341 = new C01341(continuation);
                            Object obj22 = c01341.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c01341.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                flowCollector = i;
                this.L$0 = null;
                this.label = 4;
                if (FlowKt.emitAll((FlowCollector) flowCollector, flow, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector3 = (FlowCollector) this.L$0;
            DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1 diaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$12 = this;
            diaryApiDelegate = this.this$0.apiDelegate;
            this.L$0 = flowCollector3;
            this.label = 3;
            obj = diaryApiDelegate.getDiaryNotes(this);
            i = flowCollector3;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1 diaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$13 = this;
            this.this$0.diaryDao.saveDiaryNotes((List) obj);
            shownDiaryNotesDao4 = this.this$0.shownNotesDao;
            final Flow transformLatest22 = FlowKt.transformLatest(shownDiaryNotesDao4.getShownNoteIds(), new DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1(null, this.this$0, this.$user$inlined, this.$bot$inlined));
            flow = (Flow) new Flow<Resource.Success<List<? extends DiaryNote>>>() { // from class: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1.1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Resource.Success<List<? extends DiaryNote>>> flowCollector5, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector5), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$1$2  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$1$2", f = "DiaryRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$1$2$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes6.dex */
                    public static final class C01341 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public C01341(Continuation continuation) {
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
                        C01341 c01341;
                        int i;
                        if (continuation instanceof C01341) {
                            c01341 = (C01341) continuation;
                            if ((c01341.label & Integer.MIN_VALUE) != 0) {
                                c01341.label -= Integer.MIN_VALUE;
                                Object obj22 = c01341.result;
                                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = c01341.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj22);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Resource.Success success = new Resource.Success(obj);
                                    c01341.label = 1;
                                    if (flowCollector.emit(success, c01341) == coroutine_suspended2) {
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
                        c01341 = new C01341(continuation);
                        Object obj222 = c01341.result;
                        Object coroutine_suspended22 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c01341.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            flowCollector = i;
            this.L$0 = null;
            this.label = 4;
            if (FlowKt.emitAll((FlowCollector) flowCollector, flow, this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
            flowCollector2 = (FlowCollector) this.L$0;
        }
        if (!((List) obj).isEmpty() && !this.$refresh$inlined) {
            z = false;
        }
        if (!z) {
            shownDiaryNotesDao3 = this.this$0.shownNotesDao;
            final Flow transformLatest3 = FlowKt.transformLatest(shownDiaryNotesDao3.getShownNoteIds(), new DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1(null, this.this$0, this.$user$inlined, this.$bot$inlined));
            flow = (Flow) new Flow<Resource.Success<List<? extends DiaryNote>>>() { // from class: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1.3
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Resource.Success<List<? extends DiaryNote>>> flowCollector5, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector5), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$3$2  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$3$2", f = "DiaryRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$3$2$1  reason: invalid class name */
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
                                    Resource.Success success = new Resource.Success(obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(success, anonymousClass1) == coroutine_suspended) {
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
            flowCollector = flowCollector2;
            this.L$0 = null;
            this.label = 4;
            if (FlowKt.emitAll((FlowCollector) flowCollector, flow, this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
        this.L$0 = flowCollector2;
        this.label = 2;
        Object emit = flowCollector2.emit(new Resource.Loading(obj), this);
        flowCollector3 = flowCollector2;
        if (emit == coroutine_suspended) {
            return coroutine_suspended;
        }
        DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1 diaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$122 = this;
        diaryApiDelegate = this.this$0.apiDelegate;
        this.L$0 = flowCollector3;
        this.label = 3;
        obj = diaryApiDelegate.getDiaryNotes(this);
        i = flowCollector3;
        if (obj == coroutine_suspended) {
        }
        DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1 diaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$132 = this;
        this.this$0.diaryDao.saveDiaryNotes((List) obj);
        shownDiaryNotesDao4 = this.this$0.shownNotesDao;
        final Flow transformLatest222 = FlowKt.transformLatest(shownDiaryNotesDao4.getShownNoteIds(), new DiaryRepositoryImpl$getDiaryNotes$lambda$6$lambda$2$$inlined$flatMapLatest$1(null, this.this$0, this.$user$inlined, this.$bot$inlined));
        flow = (Flow) new Flow<Resource.Success<List<? extends DiaryNote>>>() { // from class: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1.1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Resource.Success<List<? extends DiaryNote>>> flowCollector5, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector5), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$1$2", f = "DiaryRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.repository.DiaryRepositoryImpl$getDiaryNotes$lambda$6$$inlined$networkBoundResource$1$1$2$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C01341 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C01341(Continuation continuation) {
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
                    C01341 c01341;
                    int i;
                    if (continuation instanceof C01341) {
                        c01341 = (C01341) continuation;
                        if ((c01341.label & Integer.MIN_VALUE) != 0) {
                            c01341.label -= Integer.MIN_VALUE;
                            Object obj222 = c01341.result;
                            Object coroutine_suspended22 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c01341.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj222);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Resource.Success success = new Resource.Success(obj);
                                c01341.label = 1;
                                if (flowCollector.emit(success, c01341) == coroutine_suspended22) {
                                    return coroutine_suspended22;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj222);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c01341 = new C01341(continuation);
                    Object obj2222 = c01341.result;
                    Object coroutine_suspended222 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c01341.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        flowCollector = i;
        this.L$0 = null;
        this.label = 4;
        if (FlowKt.emitAll((FlowCollector) flowCollector, flow, this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
