package com.ifriend.domain.services.initialData;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.services.initialData.InitialTimeoutDataLoader;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitialTimeoutDataLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.services.initialData.InitialTimeoutDataLoader$load$2", f = "InitialTimeoutDataLoader.kt", i = {0}, l = {27}, m = "invokeSuspend", n = {"success"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class InitialTimeoutDataLoader$load$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InitialTimeoutDataLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialTimeoutDataLoader$load$2(InitialTimeoutDataLoader initialTimeoutDataLoader, Continuation<? super InitialTimeoutDataLoader$load$2> continuation) {
        super(2, continuation);
        this.this$0 = initialTimeoutDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InitialTimeoutDataLoader$load$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((InitialTimeoutDataLoader$load$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        long j;
        Ref.BooleanRef booleanRef;
        Logger logger2;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            booleanRef2.element = true;
            logger = this.this$0.logger;
            str = this.this$0.loggingTag;
            logger.info("Starting initial data loading...", str);
            j = this.this$0.allLoadersTimeout;
            this.L$0 = booleanRef2;
            this.label = 1;
            if (TimeoutKt.withTimeout(j, new AnonymousClass1(this.this$0, booleanRef2, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            booleanRef = booleanRef2;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            booleanRef = (Ref.BooleanRef) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        logger2 = this.this$0.logger;
        str2 = this.this$0.loggingTag;
        logger2.info("Finishing initial data loading", str2);
        return Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object invokeSuspend$runAndUpdateState(InitialDataLoader initialDataLoader, InitialTimeoutDataLoader initialTimeoutDataLoader, Ref.BooleanRef booleanRef, Continuation<? super Unit> continuation) {
        InitialTimeoutDataLoader$load$2$runAndUpdateState$1 initialTimeoutDataLoader$load$2$runAndUpdateState$1;
        Object obj;
        int i;
        if (continuation instanceof InitialTimeoutDataLoader$load$2$runAndUpdateState$1) {
            initialTimeoutDataLoader$load$2$runAndUpdateState$1 = (InitialTimeoutDataLoader$load$2$runAndUpdateState$1) continuation;
            if ((initialTimeoutDataLoader$load$2$runAndUpdateState$1.label & Integer.MIN_VALUE) != 0) {
                initialTimeoutDataLoader$load$2$runAndUpdateState$1.label -= Integer.MIN_VALUE;
                obj = initialTimeoutDataLoader$load$2$runAndUpdateState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initialTimeoutDataLoader$load$2$runAndUpdateState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    initialTimeoutDataLoader$load$2$runAndUpdateState$1.L$0 = booleanRef;
                    initialTimeoutDataLoader$load$2$runAndUpdateState$1.label = 1;
                    obj = initialTimeoutDataLoader.run(initialDataLoader, initialTimeoutDataLoader$load$2$runAndUpdateState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    booleanRef = (Ref.BooleanRef) initialTimeoutDataLoader$load$2$runAndUpdateState$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    booleanRef.element = false;
                }
                return Unit.INSTANCE;
            }
        }
        initialTimeoutDataLoader$load$2$runAndUpdateState$1 = new InitialTimeoutDataLoader$load$2$runAndUpdateState$1(continuation);
        obj = initialTimeoutDataLoader$load$2$runAndUpdateState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initialTimeoutDataLoader$load$2$runAndUpdateState$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InitialTimeoutDataLoader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.domain.services.initialData.InitialTimeoutDataLoader$load$2$1", f = "InitialTimeoutDataLoader.kt", i = {0}, l = {31}, m = "invokeSuspend", n = {"$this$withTimeout"}, s = {"L$0"})
    /* renamed from: com.ifriend.domain.services.initialData.InitialTimeoutDataLoader$load$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $success;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ InitialTimeoutDataLoader this$0;

        /* compiled from: InitialTimeoutDataLoader.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.domain.services.initialData.InitialTimeoutDataLoader$load$2$1$WhenMappings */
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InitialTimeoutDataLoader.Start.values().length];
                try {
                    iArr[InitialTimeoutDataLoader.Start.BLOCKING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InitialTimeoutDataLoader.Start.PARALLEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InitialTimeoutDataLoader.Start.BACKGROUND.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InitialTimeoutDataLoader initialTimeoutDataLoader, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = initialTimeoutDataLoader;
            this.$success = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$success, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            List list;
            Iterator it;
            AnonymousClass1 anonymousClass1;
            CompletableJob Job$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                list = this.this$0.loaders;
                it = list.iterator();
                anonymousClass1 = this;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                it = (Iterator) this.L$1;
                ResultKt.throwOnFailure(obj);
                anonymousClass1 = this;
                coroutineScope = (CoroutineScope) this.L$0;
            }
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                InitialDataLoader initialDataLoader = (InitialDataLoader) pair.component2();
                int i2 = WhenMappings.$EnumSwitchMapping$0[((InitialTimeoutDataLoader.Start) pair.component1()).ordinal()];
                if (i2 == 1) {
                    anonymousClass1.L$0 = coroutineScope;
                    anonymousClass1.L$1 = it;
                    anonymousClass1.label = 1;
                    if (InitialTimeoutDataLoader$load$2.invokeSuspend$runAndUpdateState(initialDataLoader, anonymousClass1.this$0, anonymousClass1.$success, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == 2) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C01441(initialDataLoader, anonymousClass1.this$0, anonymousClass1.$success, null), 3, null);
                } else if (i2 == 3) {
                    Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Job$default, null, new AnonymousClass2(anonymousClass1.this$0, initialDataLoader, null), 2, null);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InitialTimeoutDataLoader.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.domain.services.initialData.InitialTimeoutDataLoader$load$2$1$1", f = "InitialTimeoutDataLoader.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.domain.services.initialData.InitialTimeoutDataLoader$load$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ InitialDataLoader $loader;
            final /* synthetic */ Ref.BooleanRef $success;
            int label;
            final /* synthetic */ InitialTimeoutDataLoader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01441(InitialDataLoader initialDataLoader, InitialTimeoutDataLoader initialTimeoutDataLoader, Ref.BooleanRef booleanRef, Continuation<? super C01441> continuation) {
                super(2, continuation);
                this.$loader = initialDataLoader;
                this.this$0 = initialTimeoutDataLoader;
                this.$success = booleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01441(this.$loader, this.this$0, this.$success, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (InitialTimeoutDataLoader$load$2.invokeSuspend$runAndUpdateState(this.$loader, this.this$0, this.$success, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InitialTimeoutDataLoader.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.domain.services.initialData.InitialTimeoutDataLoader$load$2$1$2", f = "InitialTimeoutDataLoader.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.domain.services.initialData.InitialTimeoutDataLoader$load$2$1$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ InitialDataLoader $loader;
            int label;
            final /* synthetic */ InitialTimeoutDataLoader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InitialTimeoutDataLoader initialTimeoutDataLoader, InitialDataLoader initialDataLoader, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = initialTimeoutDataLoader;
                this.$loader = initialDataLoader;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$loader, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                Object run;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        run = this.this$0.run(this.$loader, this);
                        if (run == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Exception e) {
                    logger = this.this$0.logger;
                    String simpleName = Reflection.getOrCreateKotlinClass(this.$loader.getClass()).getSimpleName();
                    String message = e.getMessage();
                    logger.log("Exception in background loader " + simpleName + ": " + message);
                }
                return Unit.INSTANCE;
            }
        }
    }
}
