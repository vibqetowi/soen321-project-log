package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlatformTypefaces.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\fJ?\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "()V", "createAndroidTypefaceUsingTypefaceStyle", "Landroid/graphics/Typeface;", "genericFontFamily", "", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", "createAndroidTypefaceUsingTypefaceStyle-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "name", "Landroidx/compose/ui/text/font/GenericFontFamily;", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull", "familyName", "weight", "style", "loadNamedFromTypefaceCacheOrNull-RetOiIg", "optionalOnDeviceFontFamilyByName", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "context", "Landroid/content/Context;", "optionalOnDeviceFontFamilyByName-78DK7lM", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformTypefacesApi implements PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo5227createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m5230createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo5228createNamedRetOiIg(GenericFontFamily name, FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        android.graphics.Typeface m5232loadNamedFromTypefaceCacheOrNullRetOiIg = m5232loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefacesKt.getWeightSuffixForFallbackFamilyName(name.getName(), fontWeight), fontWeight, i);
        return m5232loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m5230createAndroidTypefaceUsingTypefaceStyleRetOiIg(name.getName(), fontWeight, i) : m5232loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo5229optionalOnDeviceFontFamilyByName78DK7lM(String familyName, FontWeight weight, int i, FontVariation.Settings variationSettings, Context context) {
        android.graphics.Typeface mo5228createNamedRetOiIg;
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(familyName, FontFamily.Companion.getSansSerif().getName())) {
            mo5228createNamedRetOiIg = mo5228createNamedRetOiIg(FontFamily.Companion.getSansSerif(), weight, i);
        } else if (Intrinsics.areEqual(familyName, FontFamily.Companion.getSerif().getName())) {
            mo5228createNamedRetOiIg = mo5228createNamedRetOiIg(FontFamily.Companion.getSerif(), weight, i);
        } else if (Intrinsics.areEqual(familyName, FontFamily.Companion.getMonospace().getName())) {
            mo5228createNamedRetOiIg = mo5228createNamedRetOiIg(FontFamily.Companion.getMonospace(), weight, i);
        } else {
            mo5228createNamedRetOiIg = Intrinsics.areEqual(familyName, FontFamily.Companion.getCursive().getName()) ? mo5228createNamedRetOiIg(FontFamily.Companion.getCursive(), weight, i) : m5232loadNamedFromTypefaceCacheOrNullRetOiIg(familyName, weight, i);
        }
        return PlatformTypefacesKt.setFontVariationSettings(mo5228createNamedRetOiIg, variationSettings, context);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg  reason: not valid java name */
    private final android.graphics.Typeface m5232loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i) {
        boolean z = true;
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface m5230createAndroidTypefaceUsingTypefaceStyleRetOiIg = m5230createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
        if (Intrinsics.areEqual(m5230createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m5155getAndroidTypefaceStyleFO1MlWM(fontWeight, i))) || Intrinsics.areEqual(m5230createAndroidTypefaceUsingTypefaceStyleRetOiIg, m5230createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i))) {
            z = false;
        }
        if (z) {
            return m5230createAndroidTypefaceUsingTypefaceStyleRetOiIg;
        }
        return null;
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default  reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m5231createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m5207getNormal_LCdwA();
        }
        return platformTypefacesApi.m5230createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg  reason: not valid java name */
    private final android.graphics.Typeface m5230createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i) {
        boolean z = false;
        if (FontStyle.m5202equalsimpl0(i, FontStyle.Companion.m5207getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.Companion.getNormal())) {
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                android.graphics.Typeface DEFAULT = android.graphics.Typeface.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                return DEFAULT;
            }
        }
        int m5155getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m5155getAndroidTypefaceStyleFO1MlWM(fontWeight, i);
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        }
        if (z) {
            android.graphics.Typeface defaultFromStyle = android.graphics.Typeface.defaultFromStyle(m5155getAndroidTypefaceStyleFO1MlWM);
            Intrinsics.checkNotNullExpressionValue(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        android.graphics.Typeface create = android.graphics.Typeface.create(str, m5155getAndroidTypefaceStyleFO1MlWM);
        Intrinsics.checkNotNullExpressionValue(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }
}
