package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ Function2<Composer, Integer, Unit> $headlineContent;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingContent;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function2<Composer, Integer, Unit> $overlineContent;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ Function2<Composer, Integer, Unit> $supportingContent;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItem$2(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, ListItemColors listItemColors, float f, float f2, int i, int i2) {
        super(2);
        this.$headlineContent = function2;
        this.$modifier = modifier;
        this.$overlineContent = function22;
        this.$supportingContent = function23;
        this.$leadingContent = function24;
        this.$trailingContent = function25;
        this.$colors = listItemColors;
        this.$tonalElevation = f;
        this.$shadowElevation = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ListItemKt.m1850ListItemHXNGIdc(this.$headlineContent, this.$modifier, this.$overlineContent, this.$supportingContent, this.$leadingContent, this.$trailingContent, this.$colors, this.$tonalElevation, this.$shadowElevation, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
