package com.ifriend.ui.components.scrollable;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* compiled from: AutoScroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.components.scrollable.AutoScrollKt$autoScroll$2", f = "AutoScroll.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class AutoScrollKt$autoScroll$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Ref.FloatRef $previousValue;
    final /* synthetic */ float $scrollDx;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollKt$autoScroll$2(float f, AnimationSpec<Float> animationSpec, Ref.FloatRef floatRef, Continuation<? super AutoScrollKt$autoScroll$2> continuation) {
        super(2, continuation);
        this.$scrollDx = f;
        this.$animationSpec = animationSpec;
        this.$previousValue = floatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoScrollKt$autoScroll$2 autoScrollKt$autoScroll$2 = new AutoScrollKt$autoScroll$2(this.$scrollDx, this.$animationSpec, this.$previousValue, continuation);
        autoScrollKt$autoScroll$2.L$0 = obj;
        return autoScrollKt$autoScroll$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
        return ((AutoScrollKt$autoScroll$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoScroll.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "currentValue", "", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.ui.components.scrollable.AutoScrollKt$autoScroll$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Float, Float, Unit> {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ Ref.FloatRef $previousValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.FloatRef floatRef, ScrollScope scrollScope) {
            super(2);
            this.$previousValue = floatRef;
            this.$$this$scroll = scrollScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
            invoke(f.floatValue(), f2.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f, float f2) {
            this.$previousValue.element += this.$$this$scroll.scrollBy(f - this.$previousValue.element);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float f = this.$scrollDx;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            Ref.FloatRef floatRef = this.$previousValue;
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, f, 0.0f, animationSpec, new AnonymousClass1(floatRef, (ScrollScope) this.L$0), this, 4, null) == coroutine_suspended) {
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
