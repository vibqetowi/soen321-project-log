package androidx.compose.material;

import androidx.compose.material.AnchoredDragScope;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/material/AnchoredDragScope;", "", "", "anchors", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AnchoredDraggableKt$snapTo$2 extends SuspendLambda implements Function3<AnchoredDragScope, Map<T, ? extends Float>, Continuation<? super Unit>, Object> {
    final /* synthetic */ T $targetValue;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$snapTo$2(T t, Continuation<? super AnchoredDraggableKt$snapTo$2> continuation) {
        super(3, continuation);
        this.$targetValue = t;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AnchoredDragScope anchoredDragScope, Map<T, Float> map, Continuation<? super Unit> continuation) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(this.$targetValue, continuation);
        anchoredDraggableKt$snapTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$snapTo$2.L$1 = map;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
        Float f = (Float) ((Map) this.L$1).get(this.$targetValue);
        if (f != null) {
            AnchoredDragScope.CC.dragTo$default(anchoredDragScope, f.floatValue(), 0.0f, 2, null);
        }
        return Unit.INSTANCE;
    }
}
