package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends Lambda implements Function3<Integer, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetContainerColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $sheetDragHandle;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ float $sheetShadowElevation;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ float $sheetTonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1(BottomSheetScaffoldState bottomSheetScaffoldState, float f, boolean z, Shape shape, long j, long j2, float f2, float f3, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
        super(3);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$sheetPeekHeight = f;
        this.$sheetSwipeEnabled = z;
        this.$sheetShape = shape;
        this.$sheetContainerColor = j;
        this.$sheetContentColor = j2;
        this.$sheetTonalElevation = f2;
        this.$sheetShadowElevation = f3;
        this.$sheetDragHandle = function2;
        this.$sheetContent = function3;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer, Integer num2) {
        invoke(num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i, Composer composer, int i2) {
        int i3;
        ComposerKt.sourceInformation(composer, "C127@6516L581:BottomSheetScaffold.kt#uh7d8r");
        if ((i2 & 14) == 0) {
            i3 = (composer.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(106433656, i2, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:126)");
            }
            Shape shape = this.$sheetShape;
            long j = this.$sheetContainerColor;
            long j2 = this.$sheetContentColor;
            float f = this.$sheetTonalElevation;
            float f2 = this.$sheetShadowElevation;
            Function2<Composer, Integer, Unit> function2 = this.$sheetDragHandle;
            Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$sheetContent;
            int i4 = this.$$dirty;
            BottomSheetScaffoldKt.m1590StandardBottomSheet8oydGBM(this.$scaffoldState.getBottomSheetState(), this.$sheetPeekHeight, this.$sheetSwipeEnabled, i, shape, j, j2, f, f2, function2, function3, composer, ((i4 >> 6) & 112) | ((this.$$dirty1 << 6) & 896) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), i4 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
