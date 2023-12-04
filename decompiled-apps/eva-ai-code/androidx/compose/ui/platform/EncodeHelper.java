package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidClipboardManager.android.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "()V", "parcel", "Landroid/os/Parcel;", "encode", "", "color", "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", "byte", "", TypedValues.Custom.S_FLOAT, "", "int", "", TypedValues.Custom.S_STRING, "", "uLong", "Lkotlin/ULong;", "encode-VKZWuLQ", "encodedString", "reset", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EncodeHelper {
    private Parcel parcel;

    public EncodeHelper() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.parcel = obtain;
    }

    public final void reset() {
        this.parcel.recycle();
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.parcel = obtain;
    }

    public final String encodedString() {
        String encodeToString = Base64.encodeToString(this.parcel.marshall(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void encode(SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        if (!Color.m3292equalsimpl0(spanStyle.m5041getColor0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m4868encode8_81llA(spanStyle.m5041getColor0d7_KjU());
        }
        if (!TextUnit.m5785equalsimpl0(spanStyle.m5042getFontSizeXSAIIZE(), TextUnit.Companion.m5799getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m4865encodeR2X_6o(spanStyle.m5042getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m5043getFontStyle4Lr2A7w = spanStyle.m5043getFontStyle4Lr2A7w();
        if (m5043getFontStyle4Lr2A7w != null) {
            int m5205unboximpl = m5043getFontStyle4Lr2A7w.m5205unboximpl();
            encode((byte) 4);
            m4870encodenzbMABs(m5205unboximpl);
        }
        FontSynthesis m5044getFontSynthesisZQGJjVo = spanStyle.m5044getFontSynthesisZQGJjVo();
        if (m5044getFontSynthesisZQGJjVo != null) {
            int m5216unboximpl = m5044getFontSynthesisZQGJjVo.m5216unboximpl();
            encode((byte) 5);
            m4867encode6p3vJLY(m5216unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m5785equalsimpl0(spanStyle.m5045getLetterSpacingXSAIIZE(), TextUnit.Companion.m5799getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m4865encodeR2X_6o(spanStyle.m5045getLetterSpacingXSAIIZE());
        }
        BaselineShift m5040getBaselineShift5SSeXJ0 = spanStyle.m5040getBaselineShift5SSeXJ0();
        if (m5040getBaselineShift5SSeXJ0 != null) {
            float m5368unboximpl = m5040getBaselineShift5SSeXJ0.m5368unboximpl();
            encode((byte) 8);
            m4866encode4Dl_Bck(m5368unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m3292equalsimpl0(spanStyle.m5039getBackground0d7_KjU(), Color.Companion.m3327getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m4868encode8_81llA(spanStyle.m5039getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode(Ascii.VT);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode(Ascii.FF);
            encode(shadow);
        }
    }

    /* renamed from: encode-8_81llA  reason: not valid java name */
    public final void m4868encode8_81llA(long j) {
        m4869encodeVKZWuLQ(j);
    }

    /* renamed from: encode--R2X_6o  reason: not valid java name */
    public final void m4865encodeR2X_6o(long j) {
        long m5787getTypeUIouoOA = TextUnit.m5787getTypeUIouoOA(j);
        byte b = 0;
        if (!TextUnitType.m5816equalsimpl0(m5787getTypeUIouoOA, TextUnitType.Companion.m5822getUnspecifiedUIouoOA())) {
            if (TextUnitType.m5816equalsimpl0(m5787getTypeUIouoOA, TextUnitType.Companion.m5821getSpUIouoOA())) {
                b = 1;
            } else if (TextUnitType.m5816equalsimpl0(m5787getTypeUIouoOA, TextUnitType.Companion.m5820getEmUIouoOA())) {
                b = 2;
            }
        }
        encode(b);
        if (TextUnitType.m5816equalsimpl0(TextUnit.m5787getTypeUIouoOA(j), TextUnitType.Companion.m5822getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m5788getValueimpl(j));
    }

    public final void encode(FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    /* renamed from: encode-nzbMABs  reason: not valid java name */
    public final void m4870encodenzbMABs(int i) {
        byte b = 0;
        if (!FontStyle.m5202equalsimpl0(i, FontStyle.Companion.m5207getNormal_LCdwA()) && FontStyle.m5202equalsimpl0(i, FontStyle.Companion.m5206getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    /* renamed from: encode-6p3vJLY  reason: not valid java name */
    public final void m4867encode6p3vJLY(int i) {
        byte b = 0;
        if (!FontSynthesis.m5211equalsimpl0(i, FontSynthesis.Companion.m5218getNoneGVVA2EU())) {
            if (FontSynthesis.m5211equalsimpl0(i, FontSynthesis.Companion.m5217getAllGVVA2EU())) {
                b = 1;
            } else if (FontSynthesis.m5211equalsimpl0(i, FontSynthesis.Companion.m5220getWeightGVVA2EU())) {
                b = 2;
            } else if (FontSynthesis.m5211equalsimpl0(i, FontSynthesis.Companion.m5219getStyleGVVA2EU())) {
                b = 3;
            }
        }
        encode(b);
    }

    /* renamed from: encode-4Dl_Bck  reason: not valid java name */
    public final void m4866encode4Dl_Bck(float f) {
        encode(f);
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        Intrinsics.checkNotNullParameter(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        m4868encode8_81llA(shadow.m3616getColor0d7_KjU());
        encode(Offset.m3018getXimpl(shadow.m3617getOffsetF1C5BW0()));
        encode(Offset.m3019getYimpl(shadow.m3617getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b) {
        this.parcel.writeByte(b);
    }

    public final void encode(int i) {
        this.parcel.writeInt(i);
    }

    public final void encode(float f) {
        this.parcel.writeFloat(f);
    }

    /* renamed from: encode-VKZWuLQ  reason: not valid java name */
    public final void m4869encodeVKZWuLQ(long j) {
        this.parcel.writeLong(j);
    }

    public final void encode(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.parcel.writeString(string);
    }
}
