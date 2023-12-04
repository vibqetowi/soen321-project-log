package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialTheme.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialThemeKt$MaterialTheme$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Colors $colors;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ Shapes $shapes;
    final /* synthetic */ Typography $typography;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MaterialThemeKt$MaterialTheme$2(Colors colors, Typography typography, Shapes shapes, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.$colors = colors;
        this.$typography = typography;
        this.$shapes = shapes;
        this.$content = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        MaterialThemeKt.MaterialTheme(this.$colors, this.$typography, this.$shapes, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
