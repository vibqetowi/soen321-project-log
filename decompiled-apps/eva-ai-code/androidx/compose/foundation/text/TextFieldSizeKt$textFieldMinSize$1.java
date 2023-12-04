package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* compiled from: TextFieldSize.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldSizeKt$textFieldMinSize$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TextStyle $style;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSizeKt$textFieldMinSize$1(TextStyle textStyle) {
        super(3);
        this.$style = textStyle;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1582736677);
        ComposerKt.sourceInformation(composer, "C38@1591L7,39@1652L7,40@1707L7,42@1740L88,45@1849L312,54@2186L101:TextFieldSize.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1582736677, i, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
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
        TextStyle textStyle = this.$style;
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(textStyle) | composer.changed(layoutDirection);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextStyle textStyle2 = rememberedValue;
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
        State state = rememberedValue2;
        TextStyle textStyle3 = this.$style;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        TextFieldSize textFieldSize = rememberedValue3;
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            TextFieldSize textFieldSize2 = new TextFieldSize(layoutDirection, density, resolver, textStyle3, state.getValue());
            composer.updateRememberedValue(textFieldSize2);
            textFieldSize = textFieldSize2;
        }
        composer.endReplaceableGroup();
        TextFieldSize textFieldSize3 = (TextFieldSize) textFieldSize;
        textFieldSize3.update(layoutDirection, density, resolver, textStyle2, state.getValue());
        Modifier layout = LayoutModifierKt.layout(Modifier.Companion, new AnonymousClass1(textFieldSize3));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return layout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldSize.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {
        final /* synthetic */ TextFieldSize $minSizeState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSize textFieldSize) {
            super(3);
            this.$minSizeState = textFieldSize;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
            return m1102invoke3p2s80s(measureScope, measurable, constraints.m5557unboximpl());
        }

        /* renamed from: invoke-3p2s80s  reason: not valid java name */
        public final MeasureResult m1102invoke3p2s80s(MeasureScope layout, Measurable measurable, long j) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            SizeKt.m780defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, 0.0f, 3, null);
            long m1101getMinSizeYbymL2g = this.$minSizeState.m1101getMinSizeYbymL2g();
            Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, RangesKt.coerceIn(IntSize.m5767getWidthimpl(m1101getMinSizeYbymL2g), Constraints.m5553getMinWidthimpl(j), Constraints.m5551getMaxWidthimpl(j)), 0, RangesKt.coerceIn(IntSize.m5766getHeightimpl(m1101getMinSizeYbymL2g), Constraints.m5552getMinHeightimpl(j), Constraints.m5550getMaxHeightimpl(j)), 0, 10, null));
            return MeasureScope.CC.layout$default(layout, mo4545measureBRTryo0.getWidth(), mo4545measureBRTryo0.getHeight(), null, new C00271(mo4545measureBRTryo0), 4, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldSize.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00271 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
            final /* synthetic */ Placeable $measured;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00271(Placeable placeable) {
                super(1);
                this.$measured = placeable;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, this.$measured, 0, 0, 0.0f, 4, null);
            }
        }
    }
}
