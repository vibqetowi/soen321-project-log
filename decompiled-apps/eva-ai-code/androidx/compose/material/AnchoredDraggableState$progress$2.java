package androidx.compose.material;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState$progress$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$progress$2(AnchoredDraggableState<T> anchoredDraggableState) {
        super(0);
        this.this$0 = anchoredDraggableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Float f = (Float) this.this$0.getAnchors$material_release().get(this.this$0.getCurrentValue());
        float f2 = 0.0f;
        float floatValue = f != null ? f.floatValue() : 0.0f;
        Float f3 = (Float) this.this$0.getAnchors$material_release().get(this.this$0.getClosestValue$material_release());
        float floatValue2 = (f3 != null ? f3.floatValue() : 0.0f) - floatValue;
        if (Math.abs(floatValue2) > 1.0E-6f) {
            float requireOffset = (this.this$0.requireOffset() - floatValue) / floatValue2;
            if (requireOffset >= 1.0E-6f) {
                if (requireOffset <= 0.999999f) {
                    f2 = requireOffset;
                }
            }
            return Float.valueOf(f2);
        }
        f2 = 1.0f;
        return Float.valueOf(f2);
    }
}
