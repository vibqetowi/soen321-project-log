package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportDrawn.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Boolean> $predicate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1(Function0<Boolean> function0, int i) {
        super(2);
        this.$predicate = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ReportDrawnKt.ReportDrawnWhen(this.$predicate, composer, this.$$changed | 1);
    }
}
