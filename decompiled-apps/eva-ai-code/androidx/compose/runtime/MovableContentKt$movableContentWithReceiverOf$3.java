package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
/* compiled from: MovableContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u00032\u0006\u0010\u0006\u001a\u0002H\u0004H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "R", "P1", "P2", "p1", "p2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MovableContentKt$movableContentWithReceiverOf$3 extends Lambda implements Function5<R, P1, P2, Composer, Integer, Unit> {
    final /* synthetic */ MovableContent<Pair<Pair<R, P1>, P2>> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$3(MovableContent<Pair<Pair<R, P1>, P2>> movableContent) {
        super(5);
        this.$movableContent = movableContent;
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        invoke((MovableContentKt$movableContentWithReceiverOf$3) obj, obj2, obj3, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(R r, P1 p1, P2 p2, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
        if ((i & 14) == 0) {
            i2 = (composer.changed(r) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.changed(p1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composer.changed(p2) ? 256 : 128;
        }
        if ((i2 & 5851) == 1170 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(583402949, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:227)");
        }
        composer.insertMovableContent(this.$movableContent, TuplesKt.to(TuplesKt.to(r, p1), p2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
