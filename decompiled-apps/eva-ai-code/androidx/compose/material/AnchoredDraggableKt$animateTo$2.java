package androidx.compose.material;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/material/AnchoredDragScope;", "", "", "anchors", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {586}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$2 extends SuspendLambda implements Function3<AnchoredDragScope, Map<T, ? extends Float>, Continuation<? super Unit>, Object> {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(T t, AnchoredDraggableState<T> anchoredDraggableState, float f, Continuation<? super AnchoredDraggableKt$animateTo$2> continuation) {
        super(3, continuation);
        this.$targetValue = t;
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AnchoredDragScope anchoredDragScope, Map<T, Float> map, Continuation<? super Unit> continuation) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$targetValue, this.$this_animateTo, this.$velocity, continuation);
        anchoredDraggableKt$animateTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$animateTo$2.L$1 = map;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            Float f = (Float) ((Map) this.L$1).get(this.$targetValue);
            if (f != null) {
                Ref.FloatRef floatRef = new Ref.FloatRef();
                floatRef.element = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                this.L$0 = null;
                this.label = 1;
                if (SuspendAnimationKt.animate(floatRef.element, f.floatValue(), this.$velocity, this.$this_animateTo.getAnimationSpec(), new AnonymousClass1(anchoredDragScope, floatRef), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "", "velocity", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$animateTo$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Float, Float, Unit> {
        final /* synthetic */ AnchoredDragScope $$this$anchoredDrag;
        final /* synthetic */ Ref.FloatRef $prev;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef) {
            super(2);
            this.$$this$anchoredDrag = anchoredDragScope;
            this.$prev = floatRef;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
            invoke(f.floatValue(), f2.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f, float f2) {
            this.$$this$anchoredDrag.dragTo(f, f2);
            this.$prev.element = f;
        }
    }
}
