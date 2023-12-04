package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Ref;
/* compiled from: ScrollExtensions.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"animateScrollBy", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "value", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy", "(Landroidx/compose/foundation/gestures/ScrollableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopScroll", "", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateScrollBy(ScrollableState scrollableState, float f, AnimationSpec<Float> animationSpec, Continuation<? super Float> continuation) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        int i;
        Ref.FloatRef floatRef;
        if (continuation instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) continuation;
            if ((scrollExtensionsKt$animateScrollBy$1.label & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.label -= Integer.MIN_VALUE;
                ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$12 = scrollExtensionsKt$animateScrollBy$1;
                Object obj = scrollExtensionsKt$animateScrollBy$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollExtensionsKt$animateScrollBy$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    scrollExtensionsKt$animateScrollBy$12.L$0 = floatRef2;
                    scrollExtensionsKt$animateScrollBy$12.label = 1;
                    if (ScrollableState.CC.scroll$default(scrollableState, null, new ScrollExtensionsKt$animateScrollBy$2(f, animationSpec, floatRef2, null), scrollExtensionsKt$animateScrollBy$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    floatRef = (Ref.FloatRef) scrollExtensionsKt$animateScrollBy$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxFloat(floatRef.element);
            }
        }
        scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(continuation);
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$122 = scrollExtensionsKt$animateScrollBy$1;
        Object obj2 = scrollExtensionsKt$animateScrollBy$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollExtensionsKt$animateScrollBy$122.label;
        if (i != 0) {
        }
        return Boxing.boxFloat(floatRef.element);
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f, AnimationSpec animationSpec, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f, animationSpec, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object scrollBy(ScrollableState scrollableState, float f, Continuation<? super Float> continuation) {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        int i;
        Ref.FloatRef floatRef;
        if (continuation instanceof ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (ScrollExtensionsKt$scrollBy$1) continuation;
            if ((scrollExtensionsKt$scrollBy$1.label & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$1.label -= Integer.MIN_VALUE;
                ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$12 = scrollExtensionsKt$scrollBy$1;
                Object obj = scrollExtensionsKt$scrollBy$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollExtensionsKt$scrollBy$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    scrollExtensionsKt$scrollBy$12.L$0 = floatRef2;
                    scrollExtensionsKt$scrollBy$12.label = 1;
                    if (ScrollableState.CC.scroll$default(scrollableState, null, new ScrollExtensionsKt$scrollBy$2(floatRef2, f, null), scrollExtensionsKt$scrollBy$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    floatRef = (Ref.FloatRef) scrollExtensionsKt$scrollBy$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxFloat(floatRef.element);
            }
        }
        scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(continuation);
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$122 = scrollExtensionsKt$scrollBy$1;
        Object obj2 = scrollExtensionsKt$scrollBy$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollExtensionsKt$scrollBy$122.label;
        if (i != 0) {
        }
        return Boxing.boxFloat(floatRef.element);
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, continuation);
    }

    public static final Object stopScroll(ScrollableState scrollableState, MutatePriority mutatePriority, Continuation<? super Unit> continuation) {
        Object scroll = scrollableState.scroll(mutatePriority, new ScrollExtensionsKt$stopScroll$2(null), continuation);
        return scroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : Unit.INSTANCE;
    }
}
