package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SpannableExtensions.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", TtmlNode.START, "", TtmlNode.END, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SpannableExtensions_androidKt$setFontAttributes$1 extends Lambda implements Function3<SpanStyle, Integer, Integer, Unit> {
    final /* synthetic */ Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> $resolveTypeface;
    final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = function4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SpanStyle spanStyle, Integer num, Integer num2) {
        invoke(spanStyle, num.intValue(), num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(SpanStyle spanStyle, int i, int i2) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Spannable spannable = this.$this_setFontAttributes;
        Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> function4 = this.$resolveTypeface;
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle m5043getFontStyle4Lr2A7w = spanStyle.m5043getFontStyle4Lr2A7w();
        FontStyle m5199boximpl = FontStyle.m5199boximpl(m5043getFontStyle4Lr2A7w != null ? m5043getFontStyle4Lr2A7w.m5205unboximpl() : FontStyle.Companion.m5207getNormal_LCdwA());
        FontSynthesis m5044getFontSynthesisZQGJjVo = spanStyle.m5044getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan(function4.invoke(fontFamily, fontWeight, m5199boximpl, FontSynthesis.m5208boximpl(m5044getFontSynthesisZQGJjVo != null ? m5044getFontSynthesisZQGJjVo.m5216unboximpl() : FontSynthesis.Companion.m5217getAllGVVA2EU()))), i, i2, 33);
    }
}
