package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/SpanStyle;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaversKt$SpanStyleSaver$1 extends Lambda implements Function2<SaverScope, SpanStyle, Object> {
    public static final SaversKt$SpanStyleSaver$1 INSTANCE = new SaversKt$SpanStyleSaver$1();

    SaversKt$SpanStyleSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SaverScope Saver, SpanStyle it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.arrayListOf(SaversKt.save(Color.m3281boximpl(it.m5041getColor0d7_KjU()), SaversKt.getSaver(Color.Companion), Saver), SaversKt.save(TextUnit.m5778boximpl(it.m5042getFontSizeXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), Saver), SaversKt.save(it.getFontWeight(), SaversKt.getSaver(FontWeight.Companion), Saver), SaversKt.save(it.m5043getFontStyle4Lr2A7w()), SaversKt.save(it.m5044getFontSynthesisZQGJjVo()), SaversKt.save(-1), SaversKt.save(it.getFontFeatureSettings()), SaversKt.save(TextUnit.m5778boximpl(it.m5045getLetterSpacingXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), Saver), SaversKt.save(it.m5040getBaselineShift5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), Saver), SaversKt.save(it.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), Saver), SaversKt.save(it.getLocaleList(), SaversKt.getSaver(LocaleList.Companion), Saver), SaversKt.save(Color.m3281boximpl(it.m5039getBackground0d7_KjU()), SaversKt.getSaver(Color.Companion), Saver), SaversKt.save(it.getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), Saver), SaversKt.save(it.getShadow(), SaversKt.getSaver(Shadow.Companion), Saver));
    }
}
