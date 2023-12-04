package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyGrid.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridKt$LazyGrid$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<LazyGridScope, Unit> $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ Function2<Density, Constraints, LazyGridSlots> $slots;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridKt$LazyGrid$1(Modifier modifier, LazyGridState lazyGridState, Function2<? super Density, ? super Constraints, LazyGridSlots> function2, PaddingValues paddingValues, boolean z, boolean z2, FlingBehavior flingBehavior, boolean z3, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function1<? super LazyGridScope, Unit> function1, int i, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$state = lazyGridState;
        this.$slots = function2;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.$isVertical = z2;
        this.$flingBehavior = flingBehavior;
        this.$userScrollEnabled = z3;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$content = function1;
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
        LazyGridKt.LazyGrid(this.$modifier, this.$state, this.$slots, this.$contentPadding, this.$reverseLayout, this.$isVertical, this.$flingBehavior, this.$userScrollEnabled, this.$verticalArrangement, this.$horizontalArrangement, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
