package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackdropScaffold.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropScaffold$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<Composer, Integer, Unit> $appBar;
    final /* synthetic */ long $backLayerBackgroundColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $backLayerContent;
    final /* synthetic */ long $backLayerContentColor;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ Shape $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ boolean $persistentAppBar;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropScaffold$2(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Modifier modifier, BackdropScaffoldState backdropScaffoldState, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, Shape shape, float f3, long j3, long j4, long j5, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, int i, int i2, int i3) {
        super(2);
        this.$appBar = function2;
        this.$backLayerContent = function22;
        this.$frontLayerContent = function23;
        this.$modifier = modifier;
        this.$scaffoldState = backdropScaffoldState;
        this.$gesturesEnabled = z;
        this.$peekHeight = f;
        this.$headerHeight = f2;
        this.$persistentAppBar = z2;
        this.$stickyFrontLayer = z3;
        this.$backLayerBackgroundColor = j;
        this.$backLayerContentColor = j2;
        this.$frontLayerShape = shape;
        this.$frontLayerElevation = f3;
        this.$frontLayerBackgroundColor = j3;
        this.$frontLayerContentColor = j4;
        this.$frontLayerScrimColor = j5;
        this.$snackbarHost = function3;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BackdropScaffoldKt.m1246BackdropScaffoldBZszfkY(this.$appBar, this.$backLayerContent, this.$frontLayerContent, this.$modifier, this.$scaffoldState, this.$gesturesEnabled, this.$peekHeight, this.$headerHeight, this.$persistentAppBar, this.$stickyFrontLayer, this.$backLayerBackgroundColor, this.$backLayerContentColor, this.$frontLayerShape, this.$frontLayerElevation, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerScrimColor, this.$snackbarHost, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
