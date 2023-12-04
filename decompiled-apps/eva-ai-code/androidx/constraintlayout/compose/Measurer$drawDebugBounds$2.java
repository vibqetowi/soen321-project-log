package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstraintLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class Measurer$drawDebugBounds$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $forcedScaleFactor;
    final /* synthetic */ BoxScope $this_drawDebugBounds;
    final /* synthetic */ Measurer $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Measurer$drawDebugBounds$2(Measurer measurer, BoxScope boxScope, float f, int i) {
        super(2);
        this.$tmp0_rcvr = measurer;
        this.$this_drawDebugBounds = boxScope;
        this.$forcedScaleFactor = f;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.drawDebugBounds(this.$this_drawDebugBounds, this.$forcedScaleFactor, composer, this.$$changed | 1);
    }
}
