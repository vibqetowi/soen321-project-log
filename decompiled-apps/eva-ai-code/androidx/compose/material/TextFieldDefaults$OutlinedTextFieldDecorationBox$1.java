package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextFieldDefaults.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldDefaults$OutlinedTextFieldDecorationBox$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$OutlinedTextFieldDecorationBox$1(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$colors = textFieldColors;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C649@30519L54:TextFieldDefaults.kt#jmzs0o");
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1261916269, i, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:648)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        boolean z = this.$enabled;
        boolean z2 = this.$isError;
        InteractionSource interactionSource = this.$interactionSource;
        TextFieldColors textFieldColors = this.$colors;
        int i2 = this.$$dirty;
        textFieldDefaults.m1508BorderBoxnbWgWpA(z, z2, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer, ((i2 >> 9) & 896) | ((i2 >> 6) & 14) | 12582912 | ((i2 >> 15) & 112) | ((this.$$dirty1 << 6) & 7168), 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
