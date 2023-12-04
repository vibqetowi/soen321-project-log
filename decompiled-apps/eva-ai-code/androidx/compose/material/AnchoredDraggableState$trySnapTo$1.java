package androidx.compose.material;

import androidx.compose.material.AnchoredDragScope;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState$trySnapTo$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$trySnapTo$1(AnchoredDraggableState<T> anchoredDraggableState, T t) {
        super(0);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = t;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnchoredDragScope anchoredDragScope;
        anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
        AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
        Object obj = this.$targetValue;
        Float f = (Float) anchoredDraggableState.getAnchors$material_release().get(obj);
        if (f != null) {
            AnchoredDragScope.CC.dragTo$default(anchoredDragScope, f.floatValue(), 0.0f, 2, null);
            anchoredDraggableState.setAnimationTarget(null);
        }
        anchoredDraggableState.setCurrentValue(obj);
    }
}
