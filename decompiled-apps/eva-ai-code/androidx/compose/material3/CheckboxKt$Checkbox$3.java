package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Checkbox.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt$Checkbox$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ CheckboxColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckboxKt$Checkbox$3(boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        super(2);
        this.$checked = z;
        this.$onCheckedChange = function1;
        this.$modifier = modifier;
        this.$enabled = z2;
        this.$colors = checkboxColors;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        CheckboxKt.Checkbox(this.$checked, this.$onCheckedChange, this.$modifier, this.$enabled, this.$colors, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
