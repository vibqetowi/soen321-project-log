package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BasicMarquee.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {352}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class MarqueeModifierNode$runAnimation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$runAnimation$2(MarqueeModifierNode marqueeModifierNode, Continuation<? super MarqueeModifierNode$runAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarqueeModifierNode$runAnimation$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarqueeModifierNode$runAnimation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.collectLatest(SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.this$0)), new AnonymousClass2(this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Float> {
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MarqueeModifierNode marqueeModifierNode) {
            super(0);
            this.this$0 = marqueeModifierNode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            int contentWidth;
            int containerWidth;
            int contentWidth2;
            int spacingPx;
            boolean hasFocus;
            contentWidth = this.this$0.getContentWidth();
            containerWidth = this.this$0.getContainerWidth();
            if (contentWidth <= containerWidth) {
                return null;
            }
            if (MarqueeAnimationMode.m487equalsimpl0(this.this$0.m499getAnimationModeZbEOnfQ(), MarqueeAnimationMode.Companion.m494getWhileFocusedZbEOnfQ())) {
                hasFocus = this.this$0.getHasFocus();
                if (!hasFocus) {
                    return null;
                }
            }
            contentWidth2 = this.this$0.getContentWidth();
            spacingPx = this.this$0.getSpacingPx();
            return Float.valueOf(contentWidth2 + spacingPx);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "contentWithSpacingWidth", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {365, 367, 369, 369}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MarqueeModifierNode marqueeModifierNode, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Float f, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c6 A[RETURN] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Float, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            int i;
            int i2;
            int i3;
            float f;
            AnimationSpec m428createMarqueeAnimationSpecZ4HSEVQ;
            Animatable animatable2;
            Float f2;
            AnimationSpec animationSpec;
            Animatable animatable3;
            Animatable animatable4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            int i5 = 4;
            try {
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Float f3 = (Float) this.L$0;
                    if (f3 != null) {
                        i = this.this$0.iterations;
                        float floatValue = f3.floatValue();
                        i2 = this.this$0.initialDelayMillis;
                        i3 = this.this$0.delayMillis;
                        f = this.this$0.velocity;
                        m428createMarqueeAnimationSpecZ4HSEVQ = BasicMarqueeKt.m428createMarqueeAnimationSpecZ4HSEVQ(i, floatValue, i2, i3, f, DelegatableNodeKt.requireDensity(this.this$0));
                        animatable2 = this.this$0.offset;
                        this.L$0 = f3;
                        this.L$1 = m428createMarqueeAnimationSpecZ4HSEVQ;
                        this.label = 1;
                        if (animatable2.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        f2 = f3;
                        animationSpec = m428createMarqueeAnimationSpecZ4HSEVQ;
                    } else {
                        return Unit.INSTANCE;
                    }
                } else if (i4 != 1) {
                    if (i4 == 2) {
                        ResultKt.throwOnFailure(obj);
                        animatable4 = this.this$0.offset;
                        i5 = Boxing.boxFloat(0.0f);
                        this.label = 3;
                        if (animatable4.snapTo(i5, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } else if (i4 == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    } else if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        Throwable th = (Throwable) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    animationSpec = (AnimationSpec) this.L$1;
                    f2 = (Float) this.L$0;
                }
                animatable3 = this.this$0.offset;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (Animatable.animateTo$default(animatable3, f2, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                animatable4 = this.this$0.offset;
                i5 = Boxing.boxFloat(0.0f);
                this.label = 3;
                if (animatable4.snapTo(i5, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                animatable = this.this$0.offset;
                this.L$0 = th2;
                this.L$1 = null;
                this.label = i5;
                if (animatable.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th2;
            }
        }
    }
}
