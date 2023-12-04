package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Function2<Composer, Integer, Unit> $child;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffold$2(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, BottomSheetScaffoldState bottomSheetScaffoldState, boolean z, Shape shape, float f, long j, long j2, long j3, int i) {
        super(2);
        this.$drawerContent = function3;
        this.$child = function2;
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$drawerGesturesEnabled = z;
        this.$drawerShape = shape;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$drawerScrimColor = j3;
        this.$$dirty1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:BottomSheetScaffold.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1273816607, i, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:504)");
            }
            if (this.$drawerContent == null) {
                composer.startReplaceableGroup(-249540336);
                ComposerKt.sourceInformation(composer, "506@20705L7");
                this.$child.invoke(composer, 6);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-249540299);
                ComposerKt.sourceInformation(composer, "508@20742L480");
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$drawerContent;
                DrawerState drawerState = this.$scaffoldState.getDrawerState();
                boolean z = this.$drawerGesturesEnabled;
                Shape shape = this.$drawerShape;
                float f = this.$drawerElevation;
                long j = this.$drawerBackgroundColor;
                long j2 = this.$drawerContentColor;
                long j3 = this.$drawerScrimColor;
                Function2<Composer, Integer, Unit> function2 = this.$child;
                int i2 = this.$$dirty1;
                DrawerKt.m1352ModalDrawerGs3lGvM(function3, null, drawerState, z, shape, f, j, j2, j3, function2, composer, ((i2 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i2 >> 3) & 7168) | ((i2 >> 3) & 57344) | ((i2 >> 3) & 458752) | ((i2 >> 3) & 3670016) | ((i2 >> 3) & 29360128) | ((i2 >> 3) & 234881024), 2);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
