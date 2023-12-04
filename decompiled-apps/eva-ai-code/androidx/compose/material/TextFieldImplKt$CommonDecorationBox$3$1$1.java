package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Size;", "invoke-uvyYCjk", "(J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends Lambda implements Function1<Size, Unit> {
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ MutableState<Size> $labelSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(float f, MutableState<Size> mutableState) {
        super(1);
        this.$labelProgress = f;
        this.$labelSize = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Size size) {
        m1523invokeuvyYCjk(size.m3092unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-uvyYCjk  reason: not valid java name */
    public final void m1523invokeuvyYCjk(long j) {
        float m3087getWidthimpl = Size.m3087getWidthimpl(j) * this.$labelProgress;
        float m3084getHeightimpl = Size.m3084getHeightimpl(j) * this.$labelProgress;
        if (Size.m3087getWidthimpl(this.$labelSize.getValue().m3092unboximpl()) == m3087getWidthimpl) {
            if (Size.m3084getHeightimpl(this.$labelSize.getValue().m3092unboximpl()) == m3084getHeightimpl) {
                return;
            }
        }
        this.$labelSize.setValue(Size.m3075boximpl(SizeKt.Size(m3087getWidthimpl, m3084getHeightimpl)));
    }
}
