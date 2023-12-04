package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyAnimateScroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {137, 237}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
/* loaded from: classes.dex */
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ LazyAnimateScrollScope $this_animateScrollToItem;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyAnimateScrollKt$animateScrollToItem$2(int i, LazyAnimateScrollScope lazyAnimateScrollScope, int i2, Continuation<? super LazyAnimateScrollKt$animateScrollToItem$2> continuation) {
        super(2, continuation);
        this.$index = i;
        this.$this_animateScrollToItem = lazyAnimateScrollScope;
        this.$scrollOffset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.$index, this.$this_animateScrollToItem, this.$scrollOffset, continuation);
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00da A[Catch: ItemFoundInScroll -> 0x01d3, TryCatch #1 {ItemFoundInScroll -> 0x01d3, blocks: (B:27:0x00d6, B:29:0x00da, B:31:0x00e2, B:41:0x0106, B:48:0x0153, B:52:0x0160), top: B:91:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4 A[Catch: ItemFoundInScroll -> 0x01c5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {ItemFoundInScroll -> 0x01c5, blocks: (B:61:0x01b8, B:34:0x00f4), top: B:89:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024c A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01b0 -> B:89:0x01b8). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2;
        ItemFoundInScroll itemFoundInScroll;
        ScrollScope scrollScope;
        float f;
        float mo588toPx0680j_4;
        float f2;
        float mo588toPx0680j_42;
        float f3;
        float mo588toPx0680j_43;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Integer targetItemOffset;
        Ref.IntRef intRef;
        float f4;
        float f5;
        int i;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef2;
        ScrollScope scrollScope2;
        float f6;
        AnimationState copy$default;
        float itemOffset;
        Ref.FloatRef floatRef;
        Float boxFloat;
        boolean z;
        ScrollScope scrollScope3;
        float f7;
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$22;
        ScrollScope scrollScope4;
        Ref.BooleanRef booleanRef3;
        Ref.ObjectRef objectRef3;
        Ref.IntRef intRef2;
        Object obj2;
        float f8;
        float f9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        float f10 = 0.0f;
        boolean z2 = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollScope scrollScope5 = (ScrollScope) this.L$0;
            int i3 = this.$index;
            if (!(((float) i3) >= 0.0f)) {
                throw new IllegalArgumentException(("Index should be non-negative (" + i3 + ')').toString());
            }
            try {
                Density density = this.$this_animateScrollToItem.getDensity();
                f = LazyAnimateScrollKt.TargetDistance;
                mo588toPx0680j_4 = density.mo588toPx0680j_4(f);
                Density density2 = this.$this_animateScrollToItem.getDensity();
                f2 = LazyAnimateScrollKt.BoundDistance;
                mo588toPx0680j_42 = density2.mo588toPx0680j_4(f2);
                Density density3 = this.$this_animateScrollToItem.getDensity();
                f3 = LazyAnimateScrollKt.MinimumDistance;
                mo588toPx0680j_43 = density3.mo588toPx0680j_4(f3);
                booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                objectRef = new Ref.ObjectRef();
                objectRef.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                targetItemOffset = this.$this_animateScrollToItem.getTargetItemOffset(this.$index);
            } catch (ItemFoundInScroll e) {
                lazyAnimateScrollKt$animateScrollToItem$2 = this;
                itemFoundInScroll = e;
                scrollScope = scrollScope5;
            }
            if (targetItemOffset != null) {
                throw new ItemFoundInScroll(targetItemOffset.intValue(), (AnimationState) objectRef.element);
            }
            int i4 = this.$index > this.$this_animateScrollToItem.getFirstVisibleItemIndex() ? 1 : 0;
            intRef = new Ref.IntRef();
            intRef.element = 1;
            f4 = mo588toPx0680j_4;
            f5 = mo588toPx0680j_42;
            i = i4;
            objectRef2 = objectRef;
            booleanRef2 = booleanRef;
            scrollScope2 = scrollScope5;
            f6 = mo588toPx0680j_43;
            lazyAnimateScrollKt$animateScrollToItem$2 = this;
            if (booleanRef2.element) {
            }
            return Unit.INSTANCE;
        } else if (i2 != 1) {
            if (i2 == 2) {
                scrollScope = (ScrollScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                lazyAnimateScrollKt$animateScrollToItem$2 = this;
                lazyAnimateScrollKt$animateScrollToItem$2.$this_animateScrollToItem.snapToItem(scrollScope, lazyAnimateScrollKt$animateScrollToItem$2.$index, lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i = this.I$0;
            f6 = this.F$2;
            float f11 = this.F$1;
            float f12 = this.F$0;
            Ref.IntRef intRef3 = (Ref.IntRef) this.L$3;
            Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.L$2;
            Ref.BooleanRef booleanRef4 = (Ref.BooleanRef) this.L$1;
            ScrollScope scrollScope6 = (ScrollScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                f5 = f11;
                f4 = f12;
                lazyAnimateScrollKt$animateScrollToItem$2 = this;
                intRef = intRef3;
                scrollScope2 = scrollScope6;
                objectRef2 = objectRef4;
                booleanRef2 = booleanRef4;
                try {
                    try {
                        intRef.element++;
                        if (booleanRef2.element && lazyAnimateScrollKt$animateScrollToItem$2.$this_animateScrollToItem.getItemCount() > 0) {
                            try {
                                try {
                                    float expectedDistanceTo = lazyAnimateScrollKt$animateScrollToItem$2.$this_animateScrollToItem.expectedDistanceTo(lazyAnimateScrollKt$animateScrollToItem$2.$index, lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset);
                                    if (Math.abs(expectedDistanceTo) >= f4) {
                                        f7 = i != 0 ? f4 : -f4;
                                    } else {
                                        f7 = Math.max(Math.abs(expectedDistanceTo), f6);
                                        if (i == 0) {
                                            f7 = -f7;
                                        }
                                    }
                                    int i5 = lazyAnimateScrollKt$animateScrollToItem$2.$index;
                                    int i6 = lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset;
                                    LazyAnimateScrollScope lazyAnimateScrollScope = lazyAnimateScrollKt$animateScrollToItem$2.$this_animateScrollToItem;
                                    objectRef2.element = AnimationStateKt.copy$default((AnimationState) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                    AnimationState animationState = (AnimationState) objectRef2.element;
                                    Float boxFloat2 = Boxing.boxFloat(f7);
                                    boolean z3 = (((Number) ((AnimationState) objectRef2.element).getVelocity()).floatValue() > f10 ? 1 : (((Number) ((AnimationState) objectRef2.element).getVelocity()).floatValue() == f10 ? 0 : -1)) != 0 ? z2 : false ? z2 : false;
                                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(lazyAnimateScrollKt$animateScrollToItem$2.$this_animateScrollToItem, lazyAnimateScrollKt$animateScrollToItem$2.$index, r11, floatRef2, scrollScope4, booleanRef3, i == 0 ? z2 : false, f9, intRef2, lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset, objectRef3);
                                    LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$23 = lazyAnimateScrollKt$animateScrollToItem$22;
                                    lazyAnimateScrollKt$animateScrollToItem$22.L$0 = scrollScope3;
                                    lazyAnimateScrollKt$animateScrollToItem$22.L$1 = booleanRef3;
                                    lazyAnimateScrollKt$animateScrollToItem$22.L$2 = objectRef3;
                                    lazyAnimateScrollKt$animateScrollToItem$22.L$3 = intRef2;
                                    lazyAnimateScrollKt$animateScrollToItem$22.F$0 = f8;
                                    lazyAnimateScrollKt$animateScrollToItem$22.F$1 = f9;
                                    lazyAnimateScrollKt$animateScrollToItem$22.F$2 = f6;
                                    lazyAnimateScrollKt$animateScrollToItem$22.I$0 = i;
                                    lazyAnimateScrollKt$animateScrollToItem$22.label = 1;
                                    if (SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z3, anonymousClass3, lazyAnimateScrollKt$animateScrollToItem$23, 2, null) != obj2) {
                                        return obj2;
                                    }
                                    lazyAnimateScrollKt$animateScrollToItem$2 = lazyAnimateScrollKt$animateScrollToItem$22;
                                    f4 = f8;
                                    objectRef2 = objectRef3;
                                    booleanRef2 = booleanRef3;
                                    intRef = intRef2;
                                    f5 = f9;
                                    coroutine_suspended = obj2;
                                    scrollScope2 = scrollScope3;
                                    intRef.element++;
                                    f10 = 0.0f;
                                    z2 = true;
                                    if (booleanRef2.element) {
                                        float expectedDistanceTo2 = lazyAnimateScrollKt$animateScrollToItem$2.$this_animateScrollToItem.expectedDistanceTo(lazyAnimateScrollKt$animateScrollToItem$2.$index, lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset);
                                        if (Math.abs(expectedDistanceTo2) >= f4) {
                                        }
                                        int i52 = lazyAnimateScrollKt$animateScrollToItem$2.$index;
                                        int i62 = lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset;
                                        LazyAnimateScrollScope lazyAnimateScrollScope2 = lazyAnimateScrollKt$animateScrollToItem$2.$this_animateScrollToItem;
                                        objectRef2.element = AnimationStateKt.copy$default((AnimationState) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                        Ref.FloatRef floatRef22 = new Ref.FloatRef();
                                        AnimationState animationState2 = (AnimationState) objectRef2.element;
                                        Float boxFloat22 = Boxing.boxFloat(f7);
                                        if ((((Number) ((AnimationState) objectRef2.element).getVelocity()).floatValue() > f10 ? 1 : (((Number) ((AnimationState) objectRef2.element).getVelocity()).floatValue() == f10 ? 0 : -1)) != 0 ? z2 : false) {
                                        }
                                        lazyAnimateScrollKt$animateScrollToItem$22 = lazyAnimateScrollKt$animateScrollToItem$2;
                                        scrollScope4 = scrollScope2;
                                        booleanRef3 = booleanRef2;
                                        float f13 = f7;
                                        objectRef3 = objectRef2;
                                        intRef2 = intRef;
                                        obj2 = coroutine_suspended;
                                        f8 = f4;
                                        f9 = f5;
                                        AnonymousClass3 anonymousClass32 = new AnonymousClass3(lazyAnimateScrollKt$animateScrollToItem$2.$this_animateScrollToItem, lazyAnimateScrollKt$animateScrollToItem$2.$index, f13, floatRef22, scrollScope4, booleanRef3, i == 0 ? z2 : false, f9, intRef2, lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset, objectRef3);
                                        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$232 = lazyAnimateScrollKt$animateScrollToItem$22;
                                        scrollScope3 = scrollScope4;
                                        lazyAnimateScrollKt$animateScrollToItem$22.L$0 = scrollScope3;
                                        lazyAnimateScrollKt$animateScrollToItem$22.L$1 = booleanRef3;
                                        lazyAnimateScrollKt$animateScrollToItem$22.L$2 = objectRef3;
                                        lazyAnimateScrollKt$animateScrollToItem$22.L$3 = intRef2;
                                        lazyAnimateScrollKt$animateScrollToItem$22.F$0 = f8;
                                        lazyAnimateScrollKt$animateScrollToItem$22.F$1 = f9;
                                        lazyAnimateScrollKt$animateScrollToItem$22.F$2 = f6;
                                        lazyAnimateScrollKt$animateScrollToItem$22.I$0 = i;
                                        lazyAnimateScrollKt$animateScrollToItem$22.label = 1;
                                        if (SuspendAnimationKt.animateTo$default(animationState2, boxFloat22, null, z3, anonymousClass32, lazyAnimateScrollKt$animateScrollToItem$232, 2, null) != obj2) {
                                        }
                                    }
                                } catch (ItemFoundInScroll e2) {
                                    e = e2;
                                    lazyAnimateScrollKt$animateScrollToItem$2 = lazyAnimateScrollKt$animateScrollToItem$22;
                                    coroutine_suspended = obj2;
                                    itemFoundInScroll = e;
                                    scrollScope = scrollScope3;
                                    copy$default = AnimationStateKt.copy$default((AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                    itemOffset = itemFoundInScroll.getItemOffset() + lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset;
                                    floatRef = new Ref.FloatRef();
                                    boxFloat = Boxing.boxFloat(itemOffset);
                                    if (((Number) copy$default.getVelocity()).floatValue() != 0.0f) {
                                    }
                                    lazyAnimateScrollKt$animateScrollToItem$2.L$0 = scrollScope;
                                    lazyAnimateScrollKt$animateScrollToItem$2.L$1 = null;
                                    lazyAnimateScrollKt$animateScrollToItem$2.L$2 = null;
                                    lazyAnimateScrollKt$animateScrollToItem$2.L$3 = null;
                                    lazyAnimateScrollKt$animateScrollToItem$2.label = 2;
                                    if (SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, new AnonymousClass5(itemOffset, floatRef, scrollScope), lazyAnimateScrollKt$animateScrollToItem$2, 2, null) == coroutine_suspended) {
                                    }
                                    lazyAnimateScrollKt$animateScrollToItem$2.$this_animateScrollToItem.snapToItem(scrollScope, lazyAnimateScrollKt$animateScrollToItem$2.$index, lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset);
                                    return Unit.INSTANCE;
                                }
                                scrollScope3 = scrollScope4;
                            } catch (ItemFoundInScroll e3) {
                                e = e3;
                                scrollScope3 = scrollScope4;
                            }
                            lazyAnimateScrollKt$animateScrollToItem$22 = lazyAnimateScrollKt$animateScrollToItem$2;
                            scrollScope4 = scrollScope2;
                            booleanRef3 = booleanRef2;
                            float f132 = f7;
                            objectRef3 = objectRef2;
                            intRef2 = intRef;
                            obj2 = coroutine_suspended;
                            f8 = f4;
                            f9 = f5;
                        }
                    } catch (ItemFoundInScroll e4) {
                        itemFoundInScroll = e4;
                        scrollScope = scrollScope2;
                    }
                } catch (ItemFoundInScroll e5) {
                    e = e5;
                    scrollScope3 = scrollScope2;
                }
                f10 = 0.0f;
                z2 = true;
            } catch (ItemFoundInScroll e6) {
                lazyAnimateScrollKt$animateScrollToItem$2 = this;
                itemFoundInScroll = e6;
                scrollScope = scrollScope6;
            }
            return Unit.INSTANCE;
        }
        copy$default = AnimationStateKt.copy$default((AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        itemOffset = itemFoundInScroll.getItemOffset() + lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset;
        floatRef = new Ref.FloatRef();
        boxFloat = Boxing.boxFloat(itemOffset);
        z = ((Number) copy$default.getVelocity()).floatValue() != 0.0f;
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = scrollScope;
        lazyAnimateScrollKt$animateScrollToItem$2.L$1 = null;
        lazyAnimateScrollKt$animateScrollToItem$2.L$2 = null;
        lazyAnimateScrollKt$animateScrollToItem$2.L$3 = null;
        lazyAnimateScrollKt$animateScrollToItem$2.label = 2;
        if (SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, new AnonymousClass5(itemOffset, floatRef, scrollScope), lazyAnimateScrollKt$animateScrollToItem$2, 2, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        lazyAnimateScrollKt$animateScrollToItem$2.$this_animateScrollToItem.snapToItem(scrollScope, lazyAnimateScrollKt$animateScrollToItem$2.$index, lazyAnimateScrollKt$animateScrollToItem$2.$scrollOffset);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z, LazyAnimateScrollScope lazyAnimateScrollScope, int i, int i2) {
        if (z) {
            if (lazyAnimateScrollScope.getFirstVisibleItemIndex() <= i && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i2)) {
                return false;
            }
        } else if (lazyAnimateScrollScope.getFirstVisibleItemIndex() >= i && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i2)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyAnimateScroll.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> $anim;
        final /* synthetic */ float $boundDistancePx;
        final /* synthetic */ boolean $forward;
        final /* synthetic */ int $index;
        final /* synthetic */ Ref.BooleanRef $loop;
        final /* synthetic */ Ref.IntRef $loops;
        final /* synthetic */ Ref.FloatRef $prevValue;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ float $target;
        final /* synthetic */ LazyAnimateScrollScope $this_animateScrollToItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LazyAnimateScrollScope lazyAnimateScrollScope, int i, float f, Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.BooleanRef booleanRef, boolean z, float f2, Ref.IntRef intRef, int i2, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef) {
            super(1);
            this.$this_animateScrollToItem = lazyAnimateScrollScope;
            this.$index = i;
            this.$target = f;
            this.$prevValue = floatRef;
            this.$$this$scroll = scrollScope;
            this.$loop = booleanRef;
            this.$forward = z;
            this.$boundDistancePx = f2;
            this.$loops = intRef;
            this.$scrollOffset = i2;
            this.$anim = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(AnimationScope<Float, AnimationVector1D> animateTo) {
            float coerceAtLeast;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            Integer targetItemOffset = this.$this_animateScrollToItem.getTargetItemOffset(this.$index);
            if (targetItemOffset == null) {
                if (this.$target > 0.0f) {
                    coerceAtLeast = RangesKt.coerceAtMost(animateTo.getValue().floatValue(), this.$target);
                } else {
                    coerceAtLeast = RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), this.$target);
                }
                float f = coerceAtLeast - this.$prevValue.element;
                float scrollBy = this.$$this$scroll.scrollBy(f);
                Integer targetItemOffset2 = this.$this_animateScrollToItem.getTargetItemOffset(this.$index);
                if (targetItemOffset2 == null && !LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(this.$forward, this.$this_animateScrollToItem, this.$index, this.$scrollOffset)) {
                    if (!(f == scrollBy)) {
                        animateTo.cancelAnimation();
                        this.$loop.element = false;
                        return;
                    }
                    this.$prevValue.element += f;
                    if (this.$forward) {
                        if (animateTo.getValue().floatValue() > this.$boundDistancePx) {
                            animateTo.cancelAnimation();
                        }
                    } else if (animateTo.getValue().floatValue() < (-this.$boundDistancePx)) {
                        animateTo.cancelAnimation();
                    }
                    if (this.$forward) {
                        if (this.$loops.element >= 2 && this.$index - this.$this_animateScrollToItem.getLastVisibleItemIndex() > this.$this_animateScrollToItem.getNumOfItemsForTeleport()) {
                            LazyAnimateScrollScope lazyAnimateScrollScope = this.$this_animateScrollToItem;
                            lazyAnimateScrollScope.snapToItem(this.$$this$scroll, this.$index - lazyAnimateScrollScope.getNumOfItemsForTeleport(), 0);
                        }
                    } else if (this.$loops.element >= 2 && this.$this_animateScrollToItem.getFirstVisibleItemIndex() - this.$index > this.$this_animateScrollToItem.getNumOfItemsForTeleport()) {
                        LazyAnimateScrollScope lazyAnimateScrollScope2 = this.$this_animateScrollToItem;
                        lazyAnimateScrollScope2.snapToItem(this.$$this$scroll, this.$index + lazyAnimateScrollScope2.getNumOfItemsForTeleport(), 0);
                    }
                }
                targetItemOffset = targetItemOffset2;
            }
            if (!LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(this.$forward, this.$this_animateScrollToItem, this.$index, this.$scrollOffset)) {
                if (targetItemOffset != null) {
                    throw new ItemFoundInScroll(targetItemOffset.intValue(), this.$anim.element);
                }
                return;
            }
            this.$this_animateScrollToItem.snapToItem(this.$$this$scroll, this.$index, this.$scrollOffset);
            this.$loop.element = false;
            animateTo.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyAnimateScroll.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ Ref.FloatRef $prevValue;
        final /* synthetic */ float $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(float f, Ref.FloatRef floatRef, ScrollScope scrollScope) {
            super(1);
            this.$target = f;
            this.$prevValue = floatRef;
            this.$$this$scroll = scrollScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
            if ((r1 == r6.getValue().floatValue()) == false) goto L15;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(AnimationScope<Float, AnimationVector1D> animateTo) {
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            float f = this.$target;
            float f2 = 0.0f;
            if (f > 0.0f) {
                f2 = RangesKt.coerceAtMost(animateTo.getValue().floatValue(), this.$target);
            } else if (f < 0.0f) {
                f2 = RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), this.$target);
            }
            float f3 = f2 - this.$prevValue.element;
            if (f3 == this.$$this$scroll.scrollBy(f3)) {
            }
            animateTo.cancelAnimation();
            this.$prevValue.element += f3;
        }
    }
}
