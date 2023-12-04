package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Rgb.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Rgb$eotf$1 extends Lambda implements Function1<Double, Double> {
    final /* synthetic */ Rgb this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d) {
        return invoke(d.doubleValue());
    }

    public final Double invoke(double d) {
        float f;
        float f2;
        DoubleFunction eotfOrig$ui_graphics_release = this.this$0.getEotfOrig$ui_graphics_release();
        f = this.this$0.min;
        double d2 = f;
        f2 = this.this$0.max;
        return Double.valueOf(eotfOrig$ui_graphics_release.invoke(RangesKt.coerceIn(d, d2, f2)));
    }
}
