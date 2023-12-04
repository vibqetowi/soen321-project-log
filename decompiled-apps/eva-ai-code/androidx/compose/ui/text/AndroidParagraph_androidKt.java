package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\t\u001a\u001d\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\r\u001a\u001d\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001bH\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-AMY3VfE", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-u6PBz3U", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency-0_XeFpE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-4a2g8L8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-gvcdTPQ", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-AMY3VfE  reason: not valid java name */
    public static final int m4952toLayoutAlignAMY3VfE(TextAlign textAlign) {
        if (textAlign == null ? false : TextAlign.m5465equalsimpl0(textAlign.m5468unboximpl(), TextAlign.Companion.m5472getLefte0LSkKk())) {
            return 3;
        }
        if (textAlign == null ? false : TextAlign.m5465equalsimpl0(textAlign.m5468unboximpl(), TextAlign.Companion.m5473getRighte0LSkKk())) {
            return 4;
        }
        if (textAlign == null ? false : TextAlign.m5465equalsimpl0(textAlign.m5468unboximpl(), TextAlign.Companion.m5469getCentere0LSkKk())) {
            return 2;
        }
        if (textAlign == null ? false : TextAlign.m5465equalsimpl0(textAlign.m5468unboximpl(), TextAlign.Companion.m5474getStarte0LSkKk())) {
            return 0;
        }
        return textAlign == null ? false : TextAlign.m5465equalsimpl0(textAlign.m5468unboximpl(), TextAlign.Companion.m5470getEnde0LSkKk()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency-0_XeFpE  reason: not valid java name */
    public static final int m4954toLayoutHyphenationFrequency0_XeFpE(Hyphens hyphens) {
        if (hyphens == null ? false : Hyphens.m5384equalsimpl0(hyphens.m5387unboximpl(), Hyphens.Companion.m5388getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        int m5389getNonevmbZdU8 = Hyphens.Companion.m5389getNonevmbZdU8();
        if (hyphens == null) {
            return 0;
        }
        Hyphens.m5384equalsimpl0(hyphens.m5387unboximpl(), m5389getNonevmbZdU8);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-u6PBz3U  reason: not valid java name */
    public static final int m4953toLayoutBreakStrategyu6PBz3U(LineBreak.Strategy strategy) {
        if (strategy == null ? false : LineBreak.Strategy.m5409equalsimpl0(strategy.m5412unboximpl(), LineBreak.Strategy.Companion.m5415getSimplefcGXIks())) {
            return 0;
        }
        if (strategy == null ? false : LineBreak.Strategy.m5409equalsimpl0(strategy.m5412unboximpl(), LineBreak.Strategy.Companion.m5414getHighQualityfcGXIks())) {
            return 1;
        }
        return strategy == null ? false : LineBreak.Strategy.m5409equalsimpl0(strategy.m5412unboximpl(), LineBreak.Strategy.Companion.m5413getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-4a2g8L8  reason: not valid java name */
    public static final int m4955toLayoutLineBreakStyle4a2g8L8(LineBreak.Strictness strictness) {
        if (strictness == null ? false : LineBreak.Strictness.m5419equalsimpl0(strictness.m5422unboximpl(), LineBreak.Strictness.Companion.m5423getDefaultusljTpc())) {
            return 0;
        }
        if (strictness == null ? false : LineBreak.Strictness.m5419equalsimpl0(strictness.m5422unboximpl(), LineBreak.Strictness.Companion.m5424getLooseusljTpc())) {
            return 1;
        }
        if (strictness == null ? false : LineBreak.Strictness.m5419equalsimpl0(strictness.m5422unboximpl(), LineBreak.Strictness.Companion.m5425getNormalusljTpc())) {
            return 2;
        }
        return strictness == null ? false : LineBreak.Strictness.m5419equalsimpl0(strictness.m5422unboximpl(), LineBreak.Strictness.Companion.m5426getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-gvcdTPQ  reason: not valid java name */
    public static final int m4956toLayoutLineBreakWordStylegvcdTPQ(LineBreak.WordBreak wordBreak) {
        if (wordBreak == null ? false : LineBreak.WordBreak.m5430equalsimpl0(wordBreak.m5433unboximpl(), LineBreak.WordBreak.Companion.m5434getDefaultjp8hJ3c())) {
            return 0;
        }
        return wordBreak == null ? false : LineBreak.WordBreak.m5430equalsimpl0(wordBreak.m5433unboximpl(), LineBreak.WordBreak.Companion.m5435getPhrasejp8hJ3c()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        if (!z || TextUnit.m5785equalsimpl0(textStyle.m5108getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m5785equalsimpl0(textStyle.m5108getLetterSpacingXSAIIZE(), TextUnit.Companion.m5799getUnspecifiedXSAIIZE()) || textStyle.m5111getTextAlignbuA522U() == null) {
            return false;
        }
        TextAlign m5111getTextAlignbuA522U = textStyle.m5111getTextAlignbuA522U();
        if (m5111getTextAlignbuA522U == null ? false : TextAlign.m5465equalsimpl0(m5111getTextAlignbuA522U.m5468unboximpl(), TextAlign.Companion.m5474getStarte0LSkKk())) {
            return false;
        }
        TextAlign m5111getTextAlignbuA522U2 = textStyle.m5111getTextAlignbuA522U();
        return !(m5111getTextAlignbuA522U2 == null ? false : TextAlign.m5465equalsimpl0(m5111getTextAlignbuA522U2.m5468unboximpl(), TextAlign.Companion.m5471getJustifye0LSkKk()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }
}
