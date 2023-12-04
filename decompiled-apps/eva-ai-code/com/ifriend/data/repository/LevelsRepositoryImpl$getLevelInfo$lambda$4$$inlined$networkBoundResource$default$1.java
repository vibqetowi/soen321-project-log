package com.ifriend.data.repository;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.data.networking.api.levels.LevelsApiDelegate;
import com.ifriend.data.networking.api.levels.LevelsResponse;
import com.ifriend.domain.models.levels.LevelInfo;
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
@DebugMetadata(c = "com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1", f = "LevelsRepositoryImpl.kt", i = {0, 1, 2}, l = {11, 14, 30, 26}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1 extends SuspendLambda implements Function2<FlowCollector<? super Resource<LevelInfo>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LevelsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1(Continuation continuation, LevelsRepositoryImpl levelsRepositoryImpl, LevelsRepositoryImpl levelsRepositoryImpl2, LevelsRepositoryImpl levelsRepositoryImpl3) {
        super(2, continuation);
        this.this$0 = levelsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LevelsRepositoryImpl levelsRepositoryImpl = this.this$0;
        LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1 levelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1 = new LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1(continuation, levelsRepositoryImpl, levelsRepositoryImpl, levelsRepositoryImpl);
        levelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1.L$0 = obj;
        return levelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Resource<LevelInfo>> flowCollector, Continuation<? super Unit> continuation) {
        return ((LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(1:(1:(1:(1:(3:7|8|9)(2:11|12))(8:13|14|15|16|17|(1:19)|8|9))(4:23|24|25|(1:27)(6:28|16|17|(0)|8|9)))(1:32))(2:36|(1:38))|33|(1:35)|24|25|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
        r3 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        LevelsApiDelegate levelsApiDelegate;
        Object levelInfo;
        LevelsRepositoryImpl levelsRepositoryImpl;
        Flow<Resource.Error<LevelInfo>> flow;
        LevelInfo domainModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = FlowKt.first(this.this$0.dao.getLevelInfo(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1 levelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1 = this;
                LevelsRepositoryImpl levelsRepositoryImpl2 = this.this$0;
                levelsApiDelegate = levelsRepositoryImpl2.apiDelegate;
                this.L$0 = flowCollector;
                this.L$1 = levelsRepositoryImpl2;
                this.label = 3;
                levelInfo = levelsApiDelegate.getLevelInfo(this);
                if (levelInfo != coroutine_suspended) {
                    return coroutine_suspended;
                }
                FlowCollector flowCollector3 = flowCollector;
                levelsRepositoryImpl = levelsRepositoryImpl2;
                obj = levelInfo;
                flowCollector2 = flowCollector3;
                domainModel = levelsRepositoryImpl.toDomainModel((LevelsResponse) obj);
                LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1 levelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$12 = this;
                this.this$0.dao.updateLevelInfo(domainModel);
                final Flow<LevelInfo> levelInfo2 = this.this$0.dao.getLevelInfo();
                flow = (Flow) new Flow<Resource.Success<LevelInfo>>() { // from class: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1.1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Resource.Success<LevelInfo>> flowCollector4, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector4), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$1$2", f = "LevelsRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$1$2$1  reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes6.dex */
                        public static final class C01381 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public C01381(Continuation continuation) {
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
                            C01381 c01381;
                            int i;
                            if (continuation instanceof C01381) {
                                c01381 = (C01381) continuation;
                                if ((c01381.label & Integer.MIN_VALUE) != 0) {
                                    c01381.label -= Integer.MIN_VALUE;
                                    Object obj2 = c01381.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = c01381.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        Resource.Success success = new Resource.Success(obj);
                                        c01381.label = 1;
                                        if (flowCollector.emit(success, c01381) == coroutine_suspended) {
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
                            c01381 = new C01381(continuation);
                            Object obj22 = c01381.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c01381.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (FlowKt.emitAll(flowCollector2, flow, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            } else if (i != 3) {
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                levelsRepositoryImpl = (LevelsRepositoryImpl) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    domainModel = levelsRepositoryImpl.toDomainModel((LevelsResponse) obj);
                    LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1 levelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$122 = this;
                    this.this$0.dao.updateLevelInfo(domainModel);
                    final Flow levelInfo22 = this.this$0.dao.getLevelInfo();
                    flow = (Flow) new Flow<Resource.Success<LevelInfo>>() { // from class: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1.1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Resource.Success<LevelInfo>> flowCollector4, Continuation continuation) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector4), continuation);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$1$2  reason: invalid class name */
                        /* loaded from: classes6.dex */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            @DebugMetadata(c = "com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$1$2", f = "LevelsRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$1$2$1  reason: invalid class name and collision with other inner class name */
                            /* loaded from: classes6.dex */
                            public static final class C01381 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public C01381(Continuation continuation) {
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
                                C01381 c01381;
                                int i;
                                if (continuation instanceof C01381) {
                                    c01381 = (C01381) continuation;
                                    if ((c01381.label & Integer.MIN_VALUE) != 0) {
                                        c01381.label -= Integer.MIN_VALUE;
                                        Object obj22 = c01381.result;
                                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = c01381.label;
                                        if (i != 0) {
                                            ResultKt.throwOnFailure(obj22);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            Resource.Success success = new Resource.Success(obj);
                                            c01381.label = 1;
                                            if (flowCollector.emit(success, c01381) == coroutine_suspended2) {
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
                                c01381 = new C01381(continuation);
                                Object obj222 = c01381.result;
                                Object coroutine_suspended22 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = c01381.label;
                                if (i != 0) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                } catch (Throwable th) {
                    th = th;
                    final Flow<LevelInfo> levelInfo3 = this.this$0.dao.getLevelInfo();
                    flow = new Flow<Resource.Error<LevelInfo>>() { // from class: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1.2
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Resource.Error<LevelInfo>> flowCollector4, Continuation continuation) {
                            Object collect = Flow.this.collect(new C01392(flowCollector4, th), continuation);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$2$2  reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes6.dex */
                        public static final class C01392<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ Throwable $throwable$inlined;

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            @DebugMetadata(c = "com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$2$2", f = "LevelsRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$2$2$1  reason: invalid class name */
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
                                    return C01392.this.emit(null, this);
                                }
                            }

                            public C01392(FlowCollector flowCollector, Throwable th) {
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
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (FlowKt.emitAll(flowCollector2, flow, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (FlowKt.emitAll(flowCollector2, flow, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else {
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = flowCollector;
        this.label = 2;
        if (flowCollector.emit(new Resource.Loading(obj), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1 levelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$13 = this;
        LevelsRepositoryImpl levelsRepositoryImpl22 = this.this$0;
        levelsApiDelegate = levelsRepositoryImpl22.apiDelegate;
        this.L$0 = flowCollector;
        this.L$1 = levelsRepositoryImpl22;
        this.label = 3;
        levelInfo = levelsApiDelegate.getLevelInfo(this);
        if (levelInfo != coroutine_suspended) {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 implements Flow<Resource.Success<LevelInfo>> {
        final /* synthetic */ Flow $this_unsafeTransform$inlined;

        public AnonymousClass3(Flow flow) {
            this.$this_unsafeTransform$inlined = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Resource.Success<LevelInfo>> flowCollector, Continuation continuation) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "com/ifriend/common_utils/data/NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$3$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2<T> implements FlowCollector {
            final /* synthetic */ FlowCollector $this_unsafeFlow;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$3$2", f = "LevelsRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            /* renamed from: com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1$3$2$1  reason: invalid class name */
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
    }
}
