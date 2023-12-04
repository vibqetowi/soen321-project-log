package androidx.compose.material3;

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
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$3 extends Lambda implements Function7<Float, Color, Color, Float, Float, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextStyle $bodyLarge;
    final /* synthetic */ TextStyle $bodySmall;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ Function2<Composer, Integer, Unit> $container;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
    final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
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
    public TextFieldImplKt$CommonDecorationBox$3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, String str, TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, int i, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, TextFieldType textFieldType, Function2<? super Composer, ? super Integer, Unit> function28, boolean z3, PaddingValues paddingValues, int i2, boolean z4, TextStyle textStyle, TextStyle textStyle2, Function2<? super Composer, ? super Integer, Unit> function29) {
        super(7);
        this.$label = function2;
        this.$placeholder = function22;
        this.$transformedText = str;
        this.$colors = textFieldColors;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$$dirty1 = i;
        this.$prefix = function23;
        this.$suffix = function24;
        this.$leadingIcon = function25;
        this.$trailingIcon = function26;
        this.$supportingText = function27;
        this.$type = textFieldType;
        this.$innerTextField = function28;
        this.$singleLine = z3;
        this.$contentPadding = paddingValues;
        this.$$dirty = i2;
        this.$shouldOverrideTextStyleColor = z4;
        this.$bodyLarge = textStyle;
        this.$bodySmall = textStyle2;
        this.$container = function29;
    }

    @Override // kotlin.jvm.functions.Function7
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Float f3, Composer composer, Integer num) {
        m2136invokeeopBjH0(f.floatValue(), color.m3301unboximpl(), color2.m3301unboximpl(), f2.floatValue(), f3.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02eb  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* renamed from: invoke-eopBjH0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2136invokeeopBjH0(float f, long j, long j2, float f2, float f3, Composer composer, int i) {
        int i2;
        ?? r13;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        boolean changed;
        Object rememberedValue;
        int i3;
        ComposerKt.sourceInformation(composer, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)146@6118L48,160@6710L48,177@7510L30,178@7596L43,180@7679L53,187@7980L54,195@8299L56:TextFieldImpl.kt#uh7d8r");
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
        if ((i & 57344) == 0) {
            i2 |= composer.changed(f3) ? 16384 : 8192;
        }
        int i4 = i2;
        if ((374491 & i4) != 74898 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1290853831, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:113)");
            }
            Function2<Composer, Integer, Unit> function2 = this.$label;
            if (function2 != null) {
                r13 = 1;
                composableLambda = ComposableLambdaKt.composableLambda(composer, -382297919, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(f, j2, function2, i4, this.$shouldOverrideTextStyleColor, j));
            } else {
                r13 = 1;
                composableLambda = null;
            }
            if (this.$placeholder != null) {
                if ((this.$transformedText.length() == 0 ? r13 : false) && f2 > 0.0f) {
                    composableLambda2 = ComposableLambdaKt.composableLambda(composer, -524658155, r13, new TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(f2, this.$colors, this.$enabled, this.$isError, this.$interactionSource, this.$$dirty1, this.$placeholder, this.$$dirty));
                    TextFieldColors textFieldColors = this.$colors;
                    boolean z = this.$enabled;
                    boolean z2 = this.$isError;
                    InteractionSource interactionSource = this.$interactionSource;
                    int i5 = this.$$dirty1;
                    ComposableLambda composableLambda3 = (this.$prefix != null || f3 <= 0.0f) ? null : ComposableLambdaKt.composableLambda(composer, 1824482619, r13, new TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1(f3, textFieldColors.prefixColor$material3_release(z, z2, interactionSource, composer, ((i5 >> 6) & 14) | ((i5 >> 6) & 112) | ((i5 >> 6) & 896) | ((i5 >> 9) & 7168)).getValue().m3301unboximpl(), this.$bodyLarge, this.$prefix, this.$$dirty));
                    TextFieldColors textFieldColors2 = this.$colors;
                    boolean z3 = this.$enabled;
                    boolean z4 = this.$isError;
                    InteractionSource interactionSource2 = this.$interactionSource;
                    int i6 = this.$$dirty1;
                    ComposableLambda composableLambda4 = (this.$suffix != null || f3 <= 0.0f) ? null : ComposableLambdaKt.composableLambda(composer, 907456412, r13, new TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1(f3, textFieldColors2.suffixColor$material3_release(z3, z4, interactionSource2, composer, ((i6 >> 6) & 14) | ((i6 >> 6) & 112) | ((i6 >> 6) & 896) | ((i6 >> 9) & 7168)).getValue().m3301unboximpl(), this.$bodyLarge, this.$suffix, this.$$dirty));
                    String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2033getDefaultErrorMessageadMyvUU(), composer, 6);
                    Modifier.Companion companion = Modifier.Companion;
                    Object valueOf = Boolean.valueOf(this.$isError);
                    boolean z5 = this.$isError;
                    composer.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = composer.changed(valueOf) | composer.changed(m2058getStringNWtq28);
                    rememberedValue = composer.rememberedValue();
                    if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = (Function1) new TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(z5, m2058getStringNWtq28);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, r13, null);
                    TextFieldColors textFieldColors3 = this.$colors;
                    boolean z6 = this.$enabled;
                    boolean z7 = this.$isError;
                    InteractionSource interactionSource3 = this.$interactionSource;
                    int i7 = this.$$dirty1;
                    long m3301unboximpl = textFieldColors3.leadingIconColor$material3_release(z6, z7, interactionSource3, composer, ((i7 >> 6) & 14) | ((i7 >> 6) & 112) | ((i7 >> 6) & 896) | ((i7 >> 9) & 7168)).getValue().m3301unboximpl();
                    Function2<Composer, Integer, Unit> function22 = this.$leadingIcon;
                    ComposableLambda composableLambda5 = function22 == null ? ComposableLambdaKt.composableLambda(composer, 90769583, r13, new TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1(m3301unboximpl, function22)) : null;
                    TextFieldColors textFieldColors4 = this.$colors;
                    boolean z8 = this.$enabled;
                    boolean z9 = this.$isError;
                    InteractionSource interactionSource4 = this.$interactionSource;
                    int i8 = this.$$dirty1;
                    long m3301unboximpl2 = textFieldColors4.trailingIconColor$material3_release(z8, z9, interactionSource4, composer, ((i8 >> 9) & 7168) | ((i8 >> 6) & 14) | ((i8 >> 6) & 112) | ((i8 >> 6) & 896)).getValue().m3301unboximpl();
                    Function2<Composer, Integer, Unit> function23 = this.$trailingIcon;
                    ComposableLambda composableLambda6 = function23 == null ? ComposableLambdaKt.composableLambda(composer, 2077796155, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1(m3301unboximpl2, function23)) : null;
                    TextFieldColors textFieldColors5 = this.$colors;
                    boolean z10 = this.$enabled;
                    boolean z11 = this.$isError;
                    InteractionSource interactionSource5 = this.$interactionSource;
                    int i9 = this.$$dirty1;
                    long m3301unboximpl3 = textFieldColors5.supportingTextColor$material3_release(z10, z11, interactionSource5, composer, ((i9 >> 9) & 7168) | ((i9 >> 6) & 14) | ((i9 >> 6) & 112) | ((i9 >> 6) & 896)).getValue().m3301unboximpl();
                    Function2<Composer, Integer, Unit> function24 = this.$supportingText;
                    ComposableLambda composableLambda7 = function24 == null ? ComposableLambdaKt.composableLambda(composer, -1531019900, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1(m3301unboximpl3, this.$bodySmall, function24)) : null;
                    i3 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
                    if (i3 != 1) {
                        composer.startReplaceableGroup(404043011);
                        ComposerKt.sourceInformation(composer, "211@8928L680");
                        ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composer, -2124779163, true, new TextFieldImplKt$CommonDecorationBox$3$containerWithId$1(this.$container, this.$$dirty1));
                        Function2<Composer, Integer, Unit> function25 = this.$innerTextField;
                        boolean z12 = this.$singleLine;
                        PaddingValues paddingValues = this.$contentPadding;
                        int i10 = this.$$dirty1;
                        TextFieldKt.TextFieldLayout(semantics$default, function25, composableLambda, composableLambda2, composableLambda5, composableLambda6, composableLambda3, composableLambda4, z12, f, composableLambda8, composableLambda7, paddingValues, composer, ((this.$$dirty >> 3) & 112) | ((i10 << 21) & 234881024) | ((i4 << 27) & 1879048192), ((i10 >> 9) & 896) | 6);
                        composer.endReplaceableGroup();
                        Unit unit = Unit.INSTANCE;
                    } else if (i3 == 2) {
                        composer.startReplaceableGroup(404044017);
                        ComposerKt.sourceInformation(composer, "229@9730L38,252@10751L420,241@10197L1154");
                        composer.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                        Object rememberedValue2 = composer.rememberedValue();
                        if (rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3075boximpl(Size.Companion.m3096getZeroNHjbRc()), null, 2, null);
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        composer.endReplaceableGroup();
                        MutableState mutableState = (MutableState) rememberedValue2;
                        ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composer, 1902535592, true, new TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1(mutableState, this.$contentPadding, this.$container, this.$$dirty1));
                        Function2<Composer, Integer, Unit> function26 = this.$innerTextField;
                        boolean z13 = this.$singleLine;
                        Object valueOf2 = Float.valueOf(f);
                        composer.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed2 = composer.changed(valueOf2) | composer.changed(mutableState);
                        Object rememberedValue3 = composer.rememberedValue();
                        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = (Function1) new TextFieldImplKt$CommonDecorationBox$3$1$1(f, mutableState);
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        composer.endReplaceableGroup();
                        PaddingValues paddingValues2 = this.$contentPadding;
                        int i11 = this.$$dirty1;
                        OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function26, composableLambda2, composableLambda, composableLambda5, composableLambda6, composableLambda3, composableLambda4, z13, f, (Function1) rememberedValue3, composableLambda9, composableLambda7, paddingValues2, composer, ((this.$$dirty >> 3) & 112) | ((i11 << 21) & 234881024) | ((i4 << 27) & 1879048192), ((i11 >> 6) & 7168) | 48);
                        composer.endReplaceableGroup();
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        composer.startReplaceableGroup(404045731);
                        composer.endReplaceableGroup();
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
            }
            composableLambda2 = null;
            TextFieldColors textFieldColors6 = this.$colors;
            boolean z14 = this.$enabled;
            boolean z22 = this.$isError;
            InteractionSource interactionSource6 = this.$interactionSource;
            int i52 = this.$$dirty1;
            if (this.$prefix != null) {
            }
            TextFieldColors textFieldColors22 = this.$colors;
            boolean z32 = this.$enabled;
            boolean z42 = this.$isError;
            InteractionSource interactionSource22 = this.$interactionSource;
            int i62 = this.$$dirty1;
            if (this.$suffix != null) {
            }
            String m2058getStringNWtq282 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2033getDefaultErrorMessageadMyvUU(), composer, 6);
            Modifier.Companion companion2 = Modifier.Companion;
            Object valueOf3 = Boolean.valueOf(this.$isError);
            boolean z52 = this.$isError;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = composer.changed(valueOf3) | composer.changed(m2058getStringNWtq282);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (Function1) new TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(z52, m2058getStringNWtq282);
            composer.updateRememberedValue(rememberedValue);
            composer.endReplaceableGroup();
            Modifier semantics$default2 = SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue, r13, null);
            TextFieldColors textFieldColors32 = this.$colors;
            boolean z62 = this.$enabled;
            boolean z72 = this.$isError;
            InteractionSource interactionSource32 = this.$interactionSource;
            int i72 = this.$$dirty1;
            long m3301unboximpl4 = textFieldColors32.leadingIconColor$material3_release(z62, z72, interactionSource32, composer, ((i72 >> 6) & 14) | ((i72 >> 6) & 112) | ((i72 >> 6) & 896) | ((i72 >> 9) & 7168)).getValue().m3301unboximpl();
            Function2<Composer, Integer, Unit> function222 = this.$leadingIcon;
            if (function222 == null) {
            }
            TextFieldColors textFieldColors42 = this.$colors;
            boolean z82 = this.$enabled;
            boolean z92 = this.$isError;
            InteractionSource interactionSource42 = this.$interactionSource;
            int i82 = this.$$dirty1;
            long m3301unboximpl22 = textFieldColors42.trailingIconColor$material3_release(z82, z92, interactionSource42, composer, ((i82 >> 9) & 7168) | ((i82 >> 6) & 14) | ((i82 >> 6) & 112) | ((i82 >> 6) & 896)).getValue().m3301unboximpl();
            Function2<Composer, Integer, Unit> function232 = this.$trailingIcon;
            if (function232 == null) {
            }
            TextFieldColors textFieldColors52 = this.$colors;
            boolean z102 = this.$enabled;
            boolean z112 = this.$isError;
            InteractionSource interactionSource52 = this.$interactionSource;
            int i92 = this.$$dirty1;
            long m3301unboximpl32 = textFieldColors52.supportingTextColor$material3_release(z102, z112, interactionSource52, composer, ((i92 >> 9) & 7168) | ((i92 >> 6) & 14) | ((i92 >> 6) & 112) | ((i92 >> 6) & 896)).getValue().m3301unboximpl();
            Function2<Composer, Integer, Unit> function242 = this.$supportingText;
            if (function242 == null) {
            }
            i3 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
            if (i3 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
    }
}
