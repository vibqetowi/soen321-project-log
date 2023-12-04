package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "labelProgress", "", "labelTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "labelContentColor", "placeholderAlphaProgress", "invoke-RIQooxk", "(FJJFLandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3 extends Lambda implements Function6<Float, Color, Color, Float, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Function2<Composer, Integer, Unit> $border;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$CommonDecorationBox$3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, String str, boolean z, int i, TextFieldColors textFieldColors, boolean z2, InteractionSource interactionSource, int i2, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, TextFieldType textFieldType, Function2<? super Composer, ? super Integer, Unit> function25, boolean z3, PaddingValues paddingValues, boolean z4, Function2<? super Composer, ? super Integer, Unit> function26) {
        super(6);
        this.$label = function2;
        this.$placeholder = function22;
        this.$transformedText = str;
        this.$isError = z;
        this.$$dirty1 = i;
        this.$colors = textFieldColors;
        this.$enabled = z2;
        this.$interactionSource = interactionSource;
        this.$$dirty = i2;
        this.$leadingIcon = function23;
        this.$trailingIcon = function24;
        this.$type = textFieldType;
        this.$innerTextField = function25;
        this.$singleLine = z3;
        this.$contentPadding = paddingValues;
        this.$shouldOverrideTextStyleColor = z4;
        this.$border = function26;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer, Integer num) {
        m1522invokeRIQooxk(f.floatValue(), color.m3301unboximpl(), color2.m3301unboximpl(), f2.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r26v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* renamed from: invoke-RIQooxk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1522invokeRIQooxk(float f, long j, long j2, float f2, Composer composer, int i) {
        int i2;
        ?? r14;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        boolean changed;
        TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1 rememberedValue;
        String str;
        long m3301unboximpl;
        long m3301unboximpl2;
        int i3;
        ComposerKt.sourceInformation(composer, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)151@6394L30,152@6480L43:TextFieldImpl.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (composer.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composer.changed(j2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composer.changed(f2) ? 2048 : 1024;
        }
        int i4 = i2;
        if ((46811 & i4) != 9362 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(341865432, i4, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:118)");
            }
            Function2<Composer, Integer, Unit> function2 = this.$label;
            if (function2 != null) {
                r14 = 1;
                composableLambda = ComposableLambdaKt.composableLambda(composer, 362863774, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(f, j2, function2, i4, this.$shouldOverrideTextStyleColor, j));
            } else {
                r14 = 1;
                composableLambda = null;
            }
            if (this.$placeholder != null) {
                if ((this.$transformedText.length() == 0 ? r14 : false) && f2 > 0.0f) {
                    composableLambda2 = ComposableLambdaKt.composableLambda(composer, 1120552650, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(f2, this.$colors, this.$enabled, this.$$dirty, this.$$dirty1, this.$placeholder));
                    String m1469getString4foXLRw = Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1464getDefaultErrorMessageUdPEhr4(), composer, 6);
                    Modifier.Companion companion = Modifier.Companion;
                    Boolean valueOf = Boolean.valueOf(this.$isError);
                    boolean z = this.$isError;
                    composer.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = composer.changed(valueOf) | composer.changed(m1469getString4foXLRw);
                    rememberedValue = composer.rememberedValue();
                    if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(z, m1469getString4foXLRw);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, r14, null);
                    if (!(this.$colors instanceof TextFieldColorsWithIcons)) {
                        composer.startReplaceableGroup(-1083197701);
                        ComposerKt.sourceInformation(composer, "155@6617L53");
                        boolean z2 = this.$enabled;
                        boolean z3 = this.$isError;
                        InteractionSource interactionSource = this.$interactionSource;
                        int i5 = this.$$dirty1;
                        str = "CC(remember)P(1,2):Composables.kt#9igjgp";
                        m3301unboximpl = ((TextFieldColorsWithIcons) this.$colors).leadingIconColor(z2, z3, interactionSource, composer, ((i5 << 3) & 896) | ((this.$$dirty >> 27) & 14) | ((i5 << 3) & 112)).getValue().m3301unboximpl();
                        composer.endReplaceableGroup();
                    } else {
                        str = "CC(remember)P(1,2):Composables.kt#9igjgp";
                        composer.startReplaceableGroup(-1083197605);
                        ComposerKt.sourceInformation(composer, "157@6713L34");
                        TextFieldColors textFieldColors = this.$colors;
                        boolean z4 = this.$enabled;
                        boolean z5 = this.$isError;
                        int i6 = this.$$dirty1;
                        m3301unboximpl = textFieldColors.leadingIconColor(z4, z5, composer, ((this.$$dirty >> 27) & 14) | ((i6 << 3) & 112) | ((i6 >> 3) & 896)).getValue().m3301unboximpl();
                        composer.endReplaceableGroup();
                    }
                    Function2<Composer, Integer, Unit> function22 = this.$leadingIcon;
                    ComposableLambda composableLambda3 = function22 == null ? ComposableLambdaKt.composableLambda(composer, 1505327088, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1(m3301unboximpl, function22)) : null;
                    if (!(this.$colors instanceof TextFieldColorsWithIcons)) {
                        composer.startReplaceableGroup(-1083197259);
                        ComposerKt.sourceInformation(composer, "166@7059L54");
                        boolean z6 = this.$enabled;
                        boolean z7 = this.$isError;
                        InteractionSource interactionSource2 = this.$interactionSource;
                        int i7 = this.$$dirty1;
                        m3301unboximpl2 = ((TextFieldColorsWithIcons) this.$colors).trailingIconColor(z6, z7, interactionSource2, composer, ((i7 << 3) & 896) | ((this.$$dirty >> 27) & 14) | ((i7 << 3) & 112)).getValue().m3301unboximpl();
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(-1083197162);
                        ComposerKt.sourceInformation(composer, "168@7156L35");
                        TextFieldColors textFieldColors2 = this.$colors;
                        boolean z8 = this.$enabled;
                        boolean z9 = this.$isError;
                        int i8 = this.$$dirty1;
                        m3301unboximpl2 = textFieldColors2.trailingIconColor(z8, z9, composer, ((this.$$dirty >> 27) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 896)).getValue().m3301unboximpl();
                        composer.endReplaceableGroup();
                    }
                    Function2<Composer, Integer, Unit> function23 = this.$trailingIcon;
                    ComposableLambda composableLambda4 = function23 == null ? ComposableLambdaKt.composableLambda(composer, -1894727196, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1(m3301unboximpl2, function23)) : null;
                    i3 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
                    if (i3 != r14) {
                        composer.startReplaceableGroup(-1083196826);
                        ComposerKt.sourceInformation(composer, "178@7489L485");
                        Function2<Composer, Integer, Unit> function24 = this.$innerTextField;
                        boolean z10 = this.$singleLine;
                        PaddingValues paddingValues = this.$contentPadding;
                        int i9 = this.$$dirty;
                        TextFieldKt.TextFieldLayout(semantics$default, function24, composableLambda, composableLambda2, composableLambda3, composableLambda4, z10, f, paddingValues, composer, ((i9 >> 6) & 3670016) | ((i9 >> 3) & 112) | ((i4 << 21) & 29360128) | ((this.$$dirty1 << 18) & 234881024));
                        composer.endReplaceableGroup();
                    } else if (i3 == 2) {
                        composer.startReplaceableGroup(-1083196270);
                        ComposerKt.sourceInformation(composer, "192@8096L38,210@8904L420,202@8496L994");
                        composer.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                        Object rememberedValue2 = composer.rememberedValue();
                        if (rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3075boximpl(Size.Companion.m3096getZeroNHjbRc()), null, 2, null);
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        composer.endReplaceableGroup();
                        MutableState mutableState = (MutableState) rememberedValue2;
                        ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer, 139886979, r14, new TextFieldImplKt$CommonDecorationBox$3$drawBorder$1(mutableState, this.$contentPadding, this.$border, this.$$dirty1));
                        Function2<Composer, Integer, Unit> function25 = this.$innerTextField;
                        boolean z11 = this.$singleLine;
                        Float valueOf2 = Float.valueOf(f);
                        composer.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer, str);
                        boolean changed2 = composer.changed(valueOf2) | composer.changed(mutableState);
                        TextFieldImplKt$CommonDecorationBox$3$1$1 rememberedValue3 = composer.rememberedValue();
                        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = new TextFieldImplKt$CommonDecorationBox$3$1$1(f, mutableState);
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        composer.endReplaceableGroup();
                        PaddingValues paddingValues2 = this.$contentPadding;
                        int i10 = this.$$dirty;
                        OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function25, composableLambda2, composableLambda, composableLambda3, composableLambda4, z11, f, rememberedValue3, composableLambda5, paddingValues2, composer, ((i10 >> 6) & 3670016) | ((i10 >> 3) & 112) | C.ENCODING_PCM_32BIT | ((i4 << 21) & 29360128), (this.$$dirty1 >> 6) & 14);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(-1083194783);
                        composer.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
            }
            composableLambda2 = null;
            String m1469getString4foXLRw2 = Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1464getDefaultErrorMessageUdPEhr4(), composer, 6);
            Modifier.Companion companion2 = Modifier.Companion;
            Boolean valueOf3 = Boolean.valueOf(this.$isError);
            boolean z12 = this.$isError;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = composer.changed(valueOf3) | composer.changed(m1469getString4foXLRw2);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(z12, m1469getString4foXLRw2);
            composer.updateRememberedValue(rememberedValue);
            composer.endReplaceableGroup();
            Modifier semantics$default2 = SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue, r14, null);
            if (!(this.$colors instanceof TextFieldColorsWithIcons)) {
            }
            Function2<Composer, Integer, Unit> function222 = this.$leadingIcon;
            if (function222 == null) {
            }
            if (!(this.$colors instanceof TextFieldColorsWithIcons)) {
            }
            Function2<Composer, Integer, Unit> function232 = this.$trailingIcon;
            if (function232 == null) {
            }
            i3 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
            if (i3 != r14) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
    }
}
