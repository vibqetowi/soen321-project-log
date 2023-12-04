package com.ifriend.ui.components.progress.dots;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.RepeatMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* compiled from: DotsLoading.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.components.progress.dots.DotsLoadingKt$DotsLoadingFade$2$1", f = "DotsLoading.kt", i = {0}, l = {131}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class DotsLoadingKt$DotsLoadingFade$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animAlpha;
    final /* synthetic */ float $endValue;
    final /* synthetic */ int $index;
    final /* synthetic */ DotsLoadingState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsLoadingKt$DotsLoadingFade$2$1(DotsLoadingState dotsLoadingState, int i, Animatable<Float, AnimationVector1D> animatable, float f, Continuation<? super DotsLoadingKt$DotsLoadingFade$2$1> continuation) {
        super(2, continuation);
        this.$state = dotsLoadingState;
        this.$index = i;
        this.$animAlpha = animatable;
        this.$endValue = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DotsLoadingKt$DotsLoadingFade$2$1 dotsLoadingKt$DotsLoadingFade$2$1 = new DotsLoadingKt$DotsLoadingFade$2$1(this.$state, this.$index, this.$animAlpha, this.$endValue, continuation);
        dotsLoadingKt$DotsLoadingFade$2$1.L$0 = obj;
        return dotsLoadingKt$DotsLoadingFade$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DotsLoadingKt$DotsLoadingFade$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.delay((this.$state.getDuration$common_ui_release() / this.$state.getSelectedDotsCount$common_ui_release()) * this.$index, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$animAlpha, this.$endValue, this.$state, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DotsLoading.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.ui.components.progress.dots.DotsLoadingKt$DotsLoadingFade$2$1$1", f = "DotsLoading.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.ui.components.progress.dots.DotsLoadingKt$DotsLoadingFade$2$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animAlpha;
        final /* synthetic */ float $endValue;
        final /* synthetic */ DotsLoadingState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, float f, DotsLoadingState dotsLoadingState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$animAlpha = animatable;
            this.$endValue = f;
            this.$state = dotsLoadingState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$animAlpha, this.$endValue, this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Animatable.animateTo$default(this.$animAlpha, Boxing.boxFloat(this.$endValue), AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(this.$state.getDuration$common_ui_release(), 0, this.$state.getSelectedEasing$common_ui_release(), 2, null), RepeatMode.Reverse, 0L, 4, null), null, null, this, 12, null) == coroutine_suspended) {
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
}
