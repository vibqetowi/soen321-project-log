package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OutlinedTextFieldKt$OutlinedTextField$3 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldKt$OutlinedTextField$3(String str, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, TextFieldColors textFieldColors, int i, int i2, Shape shape) {
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
        this.$shape = shape;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        ComposerKt.sourceInformation(composer, "C191@10038L834:OutlinedTextField.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = i | (composer.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1710364390, i2, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:190)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            String str = this.$value;
            boolean z = this.$enabled;
            boolean z2 = this.$singleLine;
            VisualTransformation visualTransformation = this.$visualTransformation;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            boolean z3 = this.$isError;
            Function2<Composer, Integer, Unit> function2 = this.$label;
            Function2<Composer, Integer, Unit> function22 = this.$placeholder;
            Function2<Composer, Integer, Unit> function23 = this.$leadingIcon;
            Function2<Composer, Integer, Unit> function24 = this.$trailingIcon;
            TextFieldColors textFieldColors = this.$colors;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1823843281, true, new AnonymousClass1(this.$enabled, this.$isError, this.$interactionSource, this.$colors, this.$shape, this.$$dirty, this.$$dirty1));
            int i3 = this.$$dirty;
            int i4 = this.$$dirty1;
            textFieldDefaults.OutlinedTextFieldDecorationBox(str, innerTextField, z, z2, visualTransformation, mutableInteractionSource, z3, function2, function22, function23, function24, textFieldColors, null, composableLambda, composer, (i3 & 14) | ((i2 << 3) & 112) | ((i3 >> 3) & 896) | ((i4 >> 3) & 7168) | ((i4 << 9) & 57344) | ((i4 >> 6) & 458752) | ((i4 << 18) & 3670016) | ((i3 << 3) & 29360128) | ((i3 << 3) & 234881024) | ((i3 << 3) & 1879048192), ((i3 >> 27) & 14) | 27648 | ((i4 >> 24) & 112), 4096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OutlinedTextField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$isError = z2;
            this.$interactionSource = mutableInteractionSource;
            this.$colors = textFieldColors;
            this.$shape = shape;
            this.$$dirty = i;
            this.$$dirty1 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C205@10637L203:OutlinedTextField.kt#jmzs0o");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1823843281, i, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:204)");
                }
                TextFieldColors textFieldColors = this.$colors;
                Shape shape = this.$shape;
                int i2 = this.$$dirty1;
                TextFieldDefaults.INSTANCE.m1508BorderBoxnbWgWpA(this.$enabled, this.$isError, this.$interactionSource, textFieldColors, shape, 0.0f, 0.0f, composer, ((this.$$dirty >> 9) & 14) | 12582912 | ((i2 << 3) & 112) | ((i2 >> 15) & 896) | ((i2 >> 18) & 7168) | ((i2 >> 12) & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }
}
