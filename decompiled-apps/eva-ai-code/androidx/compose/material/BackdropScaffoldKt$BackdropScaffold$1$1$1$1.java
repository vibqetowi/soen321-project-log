package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/Density;", "invoke-Bjo55l4", "(Landroidx/compose/ui/unit/Density;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropScaffold$1$1$1$1 extends Lambda implements Function1<Density, IntOffset> {
    final /* synthetic */ BackdropScaffoldState $scaffoldState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$1$1$1$1(BackdropScaffoldState backdropScaffoldState) {
        super(1);
        this.$scaffoldState = backdropScaffoldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
        return IntOffset.m5716boximpl(m1250invokeBjo55l4(density));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m1250invokeBjo55l4(Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffsetKt.IntOffset(0, MathKt.roundToInt(this.$scaffoldState.getOffset().getValue().floatValue()));
    }
}
