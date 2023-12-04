package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeightInLinesModifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeightInLinesModifierKt$heightInLines$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ TextStyle $textStyle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeightInLinesModifierKt$heightInLines$2(int i, int i2, TextStyle textStyle) {
        super(3);
        this.$minLines = i;
        this.$maxLines = i2;
        this.$textStyle = textStyle;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(408240218);
        ComposerKt.sourceInformation(composer, "C62@2391L7,63@2452L7,64@2507L7,68@2678L96,71@2795L312,80@3135L366,96@3533L428:HeightInLinesModifier.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(408240218, i, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
        }
        HeightInLinesModifierKt.validateMinMaxLines(this.$minLines, this.$maxLines);
        if (this.$minLines == 1 && this.$maxLines == Integer.MAX_VALUE) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return companion;
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        ComposerKt.sourceInformationMarkerEnd(composer);
        FontFamily.Resolver resolver = (FontFamily.Resolver) consume2;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer);
        LayoutDirection layoutDirection = (LayoutDirection) consume3;
        TextStyle textStyle = this.$textStyle;
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(textStyle) | composer.changed(layoutDirection);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextStyle textStyle2 = (TextStyle) rememberedValue;
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(resolver) | composer.changed(textStyle2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            FontFamily fontFamily = textStyle2.getFontFamily();
            FontWeight fontWeight = textStyle2.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m5105getFontStyle4Lr2A7w = textStyle2.m5105getFontStyle4Lr2A7w();
            int m5205unboximpl = m5105getFontStyle4Lr2A7w != null ? m5105getFontStyle4Lr2A7w.m5205unboximpl() : FontStyle.Companion.m5207getNormal_LCdwA();
            FontSynthesis m5106getFontSynthesisZQGJjVo = textStyle2.m5106getFontSynthesisZQGJjVo();
            rememberedValue2 = resolver.mo5176resolveDPcqOEQ(fontFamily, fontWeight, m5205unboximpl, m5106getFontSynthesisZQGJjVo != null ? m5106getFontSynthesisZQGJjVo.m5216unboximpl() : FontSynthesis.Companion.m5217getAllGVVA2EU());
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue2;
        Object[] objArr = {density, resolver, this.$textStyle, layoutDirection, state.getValue()};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i2 = 0; i2 < 5; i2++) {
            z |= composer.changed(objArr[i2]);
        }
        Object rememberedValue3 = composer.rememberedValue();
        if (z || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = Integer.valueOf(IntSize.m5766getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        int intValue = ((Number) rememberedValue3).intValue();
        Object[] objArr2 = {density, resolver, this.$textStyle, layoutDirection, state.getValue()};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z2 = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z2 |= composer.changed(objArr2[i3]);
        }
        Object rememberedValue4 = composer.rememberedValue();
        if (z2 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = Integer.valueOf(IntSize.m5766getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        int intValue2 = ((Number) rememberedValue4).intValue() - intValue;
        int i4 = this.$minLines;
        Integer valueOf = i4 == 1 ? null : Integer.valueOf(((i4 - 1) * intValue2) + intValue);
        int i5 = this.$maxLines;
        Integer valueOf2 = i5 != Integer.MAX_VALUE ? Integer.valueOf(intValue + (intValue2 * (i5 - 1))) : null;
        Modifier m782heightInVpY3zN4 = SizeKt.m782heightInVpY3zN4(Modifier.Companion, valueOf != null ? density.mo585toDpu2uoSUM(valueOf.intValue()) : Dp.Companion.m5627getUnspecifiedD9Ej5fM(), valueOf2 != null ? density.mo585toDpu2uoSUM(valueOf2.intValue()) : Dp.Companion.m5627getUnspecifiedD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m782heightInVpY3zN4;
    }
}
