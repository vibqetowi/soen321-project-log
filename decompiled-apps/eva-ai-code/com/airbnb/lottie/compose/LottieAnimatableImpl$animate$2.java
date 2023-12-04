package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
/* compiled from: LottieAnimatable.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class LottieAnimatableImpl$animate$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ LottieClipSpec $clipSpec;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ boolean $continueFromPreviousAnimate;
    final /* synthetic */ float $initialProgress;
    final /* synthetic */ int $iteration;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ float $speed;
    final /* synthetic */ boolean $useCompositionFrameRate;
    int label;
    final /* synthetic */ LottieAnimatableImpl this$0;

    /* compiled from: LottieAnimatable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LottieCancellationBehavior.values().length];
            try {
                iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LottieCancellationBehavior.Immediately.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$animate$2(LottieAnimatableImpl lottieAnimatableImpl, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, LottieComposition lottieComposition, float f2, boolean z2, boolean z3, LottieCancellationBehavior lottieCancellationBehavior, Continuation<? super LottieAnimatableImpl$animate$2> continuation) {
        super(1, continuation);
        this.this$0 = lottieAnimatableImpl;
        this.$iteration = i;
        this.$iterations = i2;
        this.$reverseOnRepeat = z;
        this.$speed = f;
        this.$clipSpec = lottieClipSpec;
        this.$composition = lottieComposition;
        this.$initialProgress = f2;
        this.$useCompositionFrameRate = z2;
        this.$continueFromPreviousAnimate = z3;
        this.$cancellationBehavior = lottieCancellationBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new LottieAnimatableImpl$animate$2(this.this$0, this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$clipSpec, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((LottieAnimatableImpl$animate$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NonCancellable nonCancellable;
        float endProgress;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setIteration(this.$iteration);
                this.this$0.setIterations(this.$iterations);
                this.this$0.setReverseOnRepeat(this.$reverseOnRepeat);
                this.this$0.setSpeed(this.$speed);
                this.this$0.setClipSpec(this.$clipSpec);
                this.this$0.setComposition(this.$composition);
                this.this$0.updateProgress(this.$initialProgress);
                this.this$0.setUseCompositionFrameRate(this.$useCompositionFrameRate);
                if (!this.$continueFromPreviousAnimate) {
                    this.this$0.setLastFrameNanos(Long.MIN_VALUE);
                }
                if (this.$composition == null) {
                    this.this$0.setPlaying(false);
                    return Unit.INSTANCE;
                } else if (!Float.isInfinite(this.$speed)) {
                    this.this$0.setPlaying(true);
                    int i2 = WhenMappings.$EnumSwitchMapping$0[this.$cancellationBehavior.ordinal()];
                    if (i2 == 1) {
                        nonCancellable = NonCancellable.INSTANCE;
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        nonCancellable = EmptyCoroutineContext.INSTANCE;
                    }
                    Job job = JobKt.getJob(getContext());
                    this.label = 1;
                    if (BuildersKt.withContext(nonCancellable, new AnonymousClass1(this.$cancellationBehavior, job, this.$iterations, this.$iteration, this.this$0, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    LottieAnimatableImpl lottieAnimatableImpl = this.this$0;
                    endProgress = lottieAnimatableImpl.getEndProgress();
                    lottieAnimatableImpl.updateProgress(endProgress);
                    this.this$0.setPlaying(false);
                    this.this$0.setIteration(this.$iterations);
                    return Unit.INSTANCE;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            JobKt.ensureActive(getContext());
            this.this$0.setPlaying(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.setPlaying(false);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieAnimatable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
        final /* synthetic */ int $iteration;
        final /* synthetic */ int $iterations;
        final /* synthetic */ Job $parentJob;
        int label;
        final /* synthetic */ LottieAnimatableImpl this$0;

        /* compiled from: LottieAnimatable.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1$WhenMappings */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                try {
                    iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LottieCancellationBehavior lottieCancellationBehavior, Job job, int i, int i2, LottieAnimatableImpl lottieAnimatableImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cancellationBehavior = lottieCancellationBehavior;
            this.$parentJob = job;
            this.$iterations = i;
            this.$iteration = i2;
            this.this$0 = lottieAnimatableImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0047 -> B:20:0x004b). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            int i;
            Object doFrame;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                anonymousClass1 = this;
                if (WhenMappings.$EnumSwitchMapping$0[anonymousClass1.$cancellationBehavior.ordinal()] == 1) {
                }
                anonymousClass1.label = 1;
                doFrame = anonymousClass1.this$0.doFrame(i, anonymousClass1);
                if (doFrame != coroutine_suspended) {
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                Object obj2 = coroutine_suspended;
                AnonymousClass1 anonymousClass12 = this;
                if (!((Boolean) obj).booleanValue()) {
                    anonymousClass1 = anonymousClass12;
                    coroutine_suspended = obj2;
                    if (WhenMappings.$EnumSwitchMapping$0[anonymousClass1.$cancellationBehavior.ordinal()] == 1) {
                        i = anonymousClass1.$parentJob.isActive() ? anonymousClass1.$iterations : anonymousClass1.$iteration;
                    } else {
                        i = anonymousClass1.$iterations;
                    }
                    anonymousClass1.label = 1;
                    doFrame = anonymousClass1.this$0.doFrame(i, anonymousClass1);
                    if (doFrame != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj3 = coroutine_suspended;
                    anonymousClass12 = anonymousClass1;
                    obj = doFrame;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
