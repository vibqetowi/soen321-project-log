package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.input.VisualTransformation;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldKt$TextField$2 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKt$TextField$2(String str, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, TextFieldColors textFieldColors, int i, int i2) {
        super(3);
        this.$value = str;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$isError = z3;
        this.$label = function2;
        this.$placeholder = function22;
        this.$leadingIcon = function23;
        this.$trailingIcon = function24;
        this.$colors = textFieldColors;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        ComposerKt.sourceInformation(composer, "C211@10686L538:TextField.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = i | (composer.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(989834338, i2, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:209)");
            }
            boolean z = this.$isError;
            Function2<Composer, Integer, Unit> function2 = this.$label;
            Function2<Composer, Integer, Unit> function22 = this.$placeholder;
            Function2<Composer, Integer, Unit> function23 = this.$leadingIcon;
            Function2<Composer, Integer, Unit> function24 = this.$trailingIcon;
            TextFieldColors textFieldColors = this.$colors;
            int i3 = i2;
            int i4 = this.$$dirty;
            int i5 = this.$$dirty1;
            TextFieldDefaults.INSTANCE.TextFieldDecorationBox(this.$value, innerTextField, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, z, function2, function22, function23, function24, textFieldColors, null, composer, ((i5 >> 3) & 7168) | (i4 & 14) | ((i3 << 3) & 112) | ((i4 >> 3) & 896) | ((i5 << 9) & 57344) | ((i5 >> 6) & 458752) | ((i5 << 18) & 3670016) | ((i4 << 3) & 29360128) | ((i4 << 3) & 234881024) | ((i4 << 3) & 1879048192), ((i4 >> 27) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i5 >> 24) & 112), 4096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
