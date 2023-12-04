package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VectorPainter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VectorPainter$composeVector$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function4<Float, Float, Composer, Integer, Unit> $composable;
    final /* synthetic */ VectorPainter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter$composeVector$1(Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> function4, VectorPainter vectorPainter) {
        super(2);
        this.$composable = function4;
        this.this$0 = vectorPainter;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        VectorComponent vectorComponent;
        VectorComponent vectorComponent2;
        ComposerKt.sourceInformation(composer, "C213@8239L55:VectorPainter.kt#huu6hf");
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1916507005, i, -1, "androidx.compose.ui.graphics.vector.VectorPainter.composeVector.<anonymous> (VectorPainter.kt:212)");
        }
        Function4<Float, Float, Composer, Integer, Unit> function4 = this.$composable;
        vectorComponent = this.this$0.vector;
        Float valueOf = Float.valueOf(vectorComponent.getViewportWidth());
        vectorComponent2 = this.this$0.vector;
        function4.invoke(valueOf, Float.valueOf(vectorComponent2.getViewportHeight()), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
