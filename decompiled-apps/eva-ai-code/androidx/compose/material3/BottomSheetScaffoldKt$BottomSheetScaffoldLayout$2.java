package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $body;
    final /* synthetic */ Function3<Integer, Composer, Integer, Unit> $bottomSheet;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function3<? super Integer, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function22, float f, Function0<Float> function0, SheetState sheetState, long j, long j2, int i) {
        super(2);
        this.$modifier = modifier;
        this.$topBar = function2;
        this.$body = function3;
        this.$bottomSheet = function32;
        this.$snackbarHost = function22;
        this.$sheetPeekHeight = f;
        this.$sheetOffset = function0;
        this.$sheetState = sheetState;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BottomSheetScaffoldKt.m1589BottomSheetScaffoldLayoutPxNyym8(this.$modifier, this.$topBar, this.$body, this.$bottomSheet, this.$snackbarHost, this.$sheetPeekHeight, this.$sheetOffset, this.$sheetState, this.$containerColor, this.$contentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
