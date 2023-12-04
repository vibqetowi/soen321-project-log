package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.HttpStatus;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InfiniteTransition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {181, HttpStatus.SC_RESET_CONTENT}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class InfiniteTransition$run$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, Continuation<? super InfiniteTransition$run$1> continuation) {
        super(2, continuation);
        this.$toolingOverride = mutableState;
        this.this$0 = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InfiniteTransition$run$1 infiniteTransition$run$1 = new InfiniteTransition$run$1(this.$toolingOverride, this.this$0, continuation);
        infiniteTransition$run$1.L$0 = obj;
        return infiniteTransition$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InfiniteTransition$run$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Long, Unit> {
        final /* synthetic */ CoroutineScope $$this$LaunchedEffect;
        final /* synthetic */ Ref.FloatRef $durationScale;
        final /* synthetic */ MutableState<State<Long>> $toolingOverride;
        final /* synthetic */ InfiniteTransition this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, Ref.FloatRef floatRef, CoroutineScope coroutineScope) {
            super(1);
            this.$toolingOverride = mutableState;
            this.this$0 = infiniteTransition;
            this.$durationScale = floatRef;
            this.$$this$LaunchedEffect = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
            if ((r6.$durationScale.element == androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r6.$$this$LaunchedEffect.getCoroutineContext())) == false) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(long j) {
            long j2;
            MutableVector mutableVector;
            long j3;
            MutableVector mutableVector2;
            State<Long> value = this.$toolingOverride.getValue();
            long longValue = value != null ? value.getValue().longValue() : j;
            j2 = this.this$0.startTimeNanos;
            int i = 0;
            if (j2 != Long.MIN_VALUE) {
            }
            this.this$0.startTimeNanos = j;
            mutableVector = this.this$0._animations;
            int size = mutableVector.getSize();
            if (size <= 0) {
                this.$durationScale.element = SuspendAnimationKt.getDurationScale(this.$$this$LaunchedEffect.getCoroutineContext());
                if (!(this.$durationScale.element != 0.0f)) {
                }
            } else {
                Object[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    ((InfiniteTransition.TransitionAnimationState) content[i2]).reset$animation_core_release();
                    i2++;
                } while (i2 < size);
                this.$durationScale.element = SuspendAnimationKt.getDurationScale(this.$$this$LaunchedEffect.getCoroutineContext());
                if (!(this.$durationScale.element != 0.0f)) {
                    mutableVector2 = this.this$0._animations;
                    int size2 = mutableVector2.getSize();
                    if (size2 > 0) {
                        Object[] content2 = mutableVector2.getContent();
                        do {
                            ((InfiniteTransition.TransitionAnimationState) content2[i]).skipToEnd$animation_core_release();
                            i++;
                        } while (i < size2);
                        return;
                    }
                    return;
                }
                j3 = this.this$0.startTimeNanos;
                this.this$0.onFrame(((float) (longValue - j3)) / this.$durationScale.element);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0<Float> {
        final /* synthetic */ CoroutineScope $$this$LaunchedEffect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CoroutineScope coroutineScope) {
            super(0);
            this.$$this$LaunchedEffect = coroutineScope;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(SuspendAnimationKt.getDurationScale(this.$$this$LaunchedEffect.getCoroutineContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Float, Continuation<? super Boolean>, Object> {
        /* synthetic */ float F$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.F$0 = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        public final Object invoke(float f, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass3) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f, Continuation<? super Boolean> continuation) {
            return invoke(f.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.F$0 > 0.0f);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0068 -> B:12:0x0043). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008a -> B:12:0x0043). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r8.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r4
            goto L42
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r1 = r8.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r4
            r4 = r8
            goto L5e
        L32:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.element = r4
        L42:
            r4 = r8
        L43:
            androidx.compose.animation.core.InfiniteTransition$run$1$1 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1
            androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> r6 = r4.$toolingOverride
            androidx.compose.animation.core.InfiniteTransition r7 = r4.this$0
            r5.<init>(r6, r7, r1, r9)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r6 = r4
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r4.L$0 = r9
            r4.L$1 = r1
            r4.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r5, r6)
            if (r5 != r0) goto L5e
            return r0
        L5e:
            float r5 = r1.element
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L67
            r5 = r3
            goto L68
        L67:
            r5 = 0
        L68:
            if (r5 == 0) goto L43
            androidx.compose.animation.core.InfiniteTransition$run$1$2 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$2
            r5.<init>(r9)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            kotlinx.coroutines.flow.Flow r5 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r5)
            androidx.compose.animation.core.InfiniteTransition$run$1$3 r6 = new androidx.compose.animation.core.InfiniteTransition$run$1$3
            r7 = 0
            r6.<init>(r7)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = r4
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r4.L$0 = r9
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.first(r5, r6, r7)
            if (r5 != r0) goto L43
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
