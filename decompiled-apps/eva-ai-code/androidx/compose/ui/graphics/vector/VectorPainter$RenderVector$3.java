package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VectorPainter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VectorPainter$RenderVector$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function4<Float, Float, Composer, Integer, Unit> $content;
    final /* synthetic */ String $name;
    final /* synthetic */ VectorPainter $tmp0_rcvr;
    final /* synthetic */ float $viewportHeight;
    final /* synthetic */ float $viewportWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter$RenderVector$3(VectorPainter vectorPainter, String str, float f, float f2, Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> function4, int i) {
        super(2);
        this.$tmp0_rcvr = vectorPainter;
        this.$name = str;
        this.$viewportWidth = f;
        this.$viewportHeight = f2;
        this.$content = function4;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.RenderVector$ui_release(this.$name, this.$viewportWidth, this.$viewportHeight, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
