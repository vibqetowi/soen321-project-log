package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aé\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001aß\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001aÉ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aÓ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), TextKt$LocalTextStyle$1.INSTANCE);

    /* JADX WARN: Removed duplicated region for block: B:106:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013a  */
    /* renamed from: Text--4IGK_g  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2145Text4IGK_g(String text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Modifier.Companion companion;
        long m3327getUnspecified0d7_KjU;
        long m5799getUnspecifiedXSAIIZE;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long m5799getUnspecifiedXSAIIZE2;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        long m5799getUnspecifiedXSAIIZE3;
        int m5516getClipgIe3tQ8;
        boolean z2;
        int i24;
        int i25;
        TextKt$Text$1 textKt$Text$1;
        int i26;
        TextStyle textStyle2;
        long j5;
        long j6;
        long j7;
        int i27;
        TextAlign textAlign3;
        FontFamily fontFamily3;
        long j8;
        long j9;
        boolean z3;
        TextStyle textStyle3;
        FontStyle fontStyle3;
        FontWeight fontWeight3;
        int i28;
        Function1<? super TextLayoutResult, Unit> function12;
        TextDecoration textDecoration3;
        int i29;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-2055108902);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12)108@5583L7,131@6301L162:Text.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i7 = (startRestartGroup.changed(text) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i30 = i6 & 2;
        if (i30 != 0) {
            i7 |= 48;
        } else if ((i4 & 112) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 896) == 0) {
                i7 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i4 & 7168) == 0) {
                i7 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= 24576;
            } else if ((i4 & 57344) == 0) {
                i7 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i11 = i6 & 32;
            if (i11 == 0) {
                i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i4 & 458752) == 0) {
                i7 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i12 = i6 & 64;
            if (i12 == 0) {
                i7 |= 1572864;
            } else if ((i4 & 3670016) == 0) {
                i7 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i13 = i6 & 128;
            if (i13 == 0) {
                i7 |= 12582912;
            } else if ((i4 & 29360128) == 0) {
                i7 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i14 = i6 & 256;
            if (i14 == 0) {
                i7 |= 100663296;
            } else if ((i4 & 234881024) == 0) {
                i7 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i15 = i6 & 512;
            if (i15 == 0) {
                i7 |= C.ENCODING_PCM_32BIT;
            } else if ((i4 & 1879048192) == 0) {
                i7 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
            }
            i16 = i6 & 1024;
            if (i16 == 0) {
                i17 = i5 | 6;
            } else if ((i5 & 14) == 0) {
                i17 = i5 | (startRestartGroup.changed(j4) ? 4 : 2);
            } else {
                i17 = i5;
            }
            i18 = i6 & 2048;
            if (i18 == 0) {
                i17 |= 48;
            } else if ((i5 & 112) == 0) {
                i17 |= startRestartGroup.changed(i) ? 32 : 16;
            }
            int i31 = i17;
            i19 = i6 & 4096;
            if (i19 == 0) {
                i31 |= 384;
            } else if ((i5 & 896) == 0) {
                i31 |= startRestartGroup.changed(z) ? 256 : 128;
                i20 = i6 & 8192;
                if (i20 != 0) {
                    i31 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i5 & 7168) == 0) {
                    i31 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                    i21 = i6 & 16384;
                    if (i21 == 0) {
                        i31 |= 24576;
                    } else if ((i5 & 57344) == 0) {
                        i22 = i21;
                        i31 |= startRestartGroup.changed(i3) ? 16384 : 8192;
                        i23 = i6 & 32768;
                        if (i23 != 0) {
                            i31 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i5 & 458752) == 0) {
                            i31 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                        }
                        if ((i5 & 3670016) == 0) {
                            i31 |= ((i6 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                        }
                        if ((i7 & 1533916891) == 306783378 || (2995931 & i31) != 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i4 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i30 != 0 ? Modifier.Companion : modifier;
                                m3327getUnspecified0d7_KjU = i8 != 0 ? Color.Companion.m3327getUnspecified0d7_KjU() : j;
                                m5799getUnspecifiedXSAIIZE = i9 != 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j2;
                                fontStyle2 = i10 != 0 ? null : fontStyle;
                                fontWeight2 = i11 != 0 ? null : fontWeight;
                                fontFamily2 = i12 != 0 ? null : fontFamily;
                                m5799getUnspecifiedXSAIIZE2 = i13 != 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j3;
                                textDecoration2 = i14 != 0 ? null : textDecoration;
                                textAlign2 = i15 == 0 ? textAlign : null;
                                m5799getUnspecifiedXSAIIZE3 = i16 != 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j4;
                                m5516getClipgIe3tQ8 = i18 != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i;
                                z2 = i19 != 0 ? true : z;
                                i24 = i20 != 0 ? Integer.MAX_VALUE : i2;
                                i25 = i22 != 0 ? 1 : i3;
                                textKt$Text$1 = i23 != 0 ? TextKt$Text$1.INSTANCE : function1;
                                if ((i6 & 65536) != 0) {
                                    TextDecoration textDecoration4 = textDecoration2;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(LocalTextStyle);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    m5516getClipgIe3tQ8 = m5516getClipgIe3tQ8;
                                    i26 = i31 & (-3670017);
                                    textStyle2 = (TextStyle) consume;
                                    textDecoration2 = textDecoration4;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2055108902, i7, i26, "androidx.compose.material3.Text (Text.kt:91)");
                                    }
                                    startRestartGroup.startReplaceableGroup(79582822);
                                    ComposerKt.sourceInformation(startRestartGroup, "*113@5698L7");
                                    if (m3327getUnspecified0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU()) {
                                        long m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                                        if (m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU()) {
                                            j5 = m3327getUnspecified0d7_KjU;
                                        } else {
                                            j5 = m3327getUnspecified0d7_KjU;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume2 = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            m5103getColor0d7_KjU = ((Color) consume2).m3301unboximpl();
                                        }
                                        j6 = m5103getColor0d7_KjU;
                                    } else {
                                        j5 = m3327getUnspecified0d7_KjU;
                                        j6 = j5;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    int i32 = i26 << 9;
                                    BasicTextKt.m1014BasicText4YKlhWE(text, companion, textStyle2.merge(new TextStyle(j6, m5799getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m5799getUnspecifiedXSAIIZE2, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, m5799getUnspecifiedXSAIIZE3, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4108112, (DefaultConstructorMarker) null)), textKt$Text$1, m5516getClipgIe3tQ8, z2, i24, i25, startRestartGroup, (i7 & 112) | (i7 & 14) | ((i26 >> 6) & 7168) | (i32 & 57344) | (i32 & 458752) | (i32 & 3670016) | (i32 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    j7 = m5799getUnspecifiedXSAIIZE3;
                                    i27 = i24;
                                    textAlign3 = textAlign2;
                                    fontFamily3 = fontFamily2;
                                    j8 = m5799getUnspecifiedXSAIIZE2;
                                    j9 = j5;
                                    z3 = z2;
                                    textStyle3 = textStyle2;
                                    fontStyle3 = fontStyle2;
                                    fontWeight3 = fontWeight2;
                                    i28 = i25;
                                    function12 = textKt$Text$1;
                                    textDecoration3 = textDecoration2;
                                    i29 = m5516getClipgIe3tQ8;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i6 & 65536) != 0) {
                                    i31 &= -3670017;
                                }
                                companion = modifier;
                                m3327getUnspecified0d7_KjU = j;
                                m5799getUnspecifiedXSAIIZE = j2;
                                fontStyle2 = fontStyle;
                                fontWeight2 = fontWeight;
                                fontFamily2 = fontFamily;
                                m5799getUnspecifiedXSAIIZE2 = j3;
                                textDecoration2 = textDecoration;
                                textAlign2 = textAlign;
                                m5799getUnspecifiedXSAIIZE3 = j4;
                                m5516getClipgIe3tQ8 = i;
                                z2 = z;
                                i24 = i2;
                                i25 = i3;
                                textKt$Text$1 = function1;
                            }
                            i26 = i31;
                            textStyle2 = textStyle;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceableGroup(79582822);
                            ComposerKt.sourceInformation(startRestartGroup, "*113@5698L7");
                            if (m3327getUnspecified0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i322 = i26 << 9;
                            BasicTextKt.m1014BasicText4YKlhWE(text, companion, textStyle2.merge(new TextStyle(j6, m5799getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m5799getUnspecifiedXSAIIZE2, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, m5799getUnspecifiedXSAIIZE3, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4108112, (DefaultConstructorMarker) null)), textKt$Text$1, m5516getClipgIe3tQ8, z2, i24, i25, startRestartGroup, (i7 & 112) | (i7 & 14) | ((i26 >> 6) & 7168) | (i322 & 57344) | (i322 & 458752) | (i322 & 3670016) | (i322 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            j7 = m5799getUnspecifiedXSAIIZE3;
                            i27 = i24;
                            textAlign3 = textAlign2;
                            fontFamily3 = fontFamily2;
                            j8 = m5799getUnspecifiedXSAIIZE2;
                            j9 = j5;
                            z3 = z2;
                            textStyle3 = textStyle2;
                            fontStyle3 = fontStyle2;
                            fontWeight3 = fontWeight2;
                            i28 = i25;
                            function12 = textKt$Text$1;
                            textDecoration3 = textDecoration2;
                            i29 = m5516getClipgIe3tQ8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            j9 = j;
                            m5799getUnspecifiedXSAIIZE = j2;
                            fontStyle3 = fontStyle;
                            fontWeight3 = fontWeight;
                            fontFamily3 = fontFamily;
                            j8 = j3;
                            textDecoration3 = textDecoration;
                            textAlign3 = textAlign;
                            j7 = j4;
                            i29 = i;
                            z3 = z;
                            i27 = i2;
                            i28 = i3;
                            function12 = function1;
                            textStyle3 = textStyle;
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new TextKt$Text$2(text, companion, j9, m5799getUnspecifiedXSAIIZE, fontStyle3, fontWeight3, fontFamily3, j8, textDecoration3, textAlign3, j7, i29, z3, i27, i28, function12, textStyle3, i4, i5, i6));
                        return;
                    }
                    i22 = i21;
                    i23 = i6 & 32768;
                    if (i23 != 0) {
                    }
                    if ((i5 & 3670016) == 0) {
                    }
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i4 & 1) != 0) {
                    }
                    if (i30 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if ((i6 & 65536) != 0) {
                    }
                }
                i21 = i6 & 16384;
                if (i21 == 0) {
                }
                i22 = i21;
                i23 = i6 & 32768;
                if (i23 != 0) {
                }
                if ((i5 & 3670016) == 0) {
                }
                if ((i7 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i4 & 1) != 0) {
                }
                if (i30 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 == 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 != 0) {
                }
                if ((i6 & 65536) != 0) {
                }
            }
            i20 = i6 & 8192;
            if (i20 != 0) {
            }
            i21 = i6 & 16384;
            if (i21 == 0) {
            }
            i22 = i21;
            i23 = i6 & 32768;
            if (i23 != 0) {
            }
            if ((i5 & 3670016) == 0) {
            }
            if ((i7 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i4 & 1) != 0) {
            }
            if (i30 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 == 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 != 0) {
            }
            if ((i6 & 65536) != 0) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        if (i11 == 0) {
        }
        i12 = i6 & 64;
        if (i12 == 0) {
        }
        i13 = i6 & 128;
        if (i13 == 0) {
        }
        i14 = i6 & 256;
        if (i14 == 0) {
        }
        i15 = i6 & 512;
        if (i15 == 0) {
        }
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i18 = i6 & 2048;
        if (i18 == 0) {
        }
        int i312 = i17;
        i19 = i6 & 4096;
        if (i19 == 0) {
        }
        i20 = i6 & 8192;
        if (i20 != 0) {
        }
        i21 = i6 & 16384;
        if (i21 == 0) {
        }
        i22 = i21;
        i23 = i6 & 32768;
        if (i23 != 0) {
        }
        if ((i5 & 3670016) == 0) {
        }
        if ((i7 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i4 & 1) != 0) {
        }
        if (i30 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 == 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 != 0) {
        }
        if ((i6 & 65536) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2147TextfLXpl1I(String text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        TextDecoration textDecoration2;
        long j5;
        TextStyle textStyle2;
        Modifier modifier2;
        int i22;
        boolean z2;
        TextAlign textAlign2;
        int i23;
        Function1 function12;
        long j6;
        long j7;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long j8;
        Composer composer2;
        Modifier modifier3;
        FontStyle fontStyle3;
        long j9;
        long j10;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j11;
        TextDecoration textDecoration3;
        TextAlign textAlign3;
        long j12;
        int i24;
        boolean z3;
        int i25;
        Function1 function13;
        TextStyle textStyle3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(1968784669);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)164@7243L7,166@7259L322:Text.kt#uh7d8r");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i26 = i5 & 2;
        if (i26 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 896) == 0) {
                i6 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                i6 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i10 = i5 & 32;
            if (i10 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & 458752) == 0) {
                i6 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i11 = i5 & 64;
            if (i11 == 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                i6 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i12 = i5 & 128;
            if (i12 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i5 & 256;
            if (i13 == 0) {
                i6 |= 100663296;
            } else if ((234881024 & i3) == 0) {
                i6 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                i14 = i5 & 512;
                if (i14 != 0) {
                    i6 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                }
                i15 = i5 & 1024;
                if (i15 != 0) {
                    i16 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i16 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                } else {
                    i16 = i4;
                }
                i17 = i5 & 2048;
                if (i17 != 0) {
                    i16 |= 48;
                } else if ((i4 & 112) == 0) {
                    i16 |= startRestartGroup.changed(i) ? 32 : 16;
                }
                int i27 = i16;
                i18 = i5 & 4096;
                if (i18 != 0) {
                    i27 |= 384;
                } else if ((i4 & 896) == 0) {
                    i27 |= startRestartGroup.changed(z) ? 256 : 128;
                    i19 = i5 & 8192;
                    if (i19 == 0) {
                        i27 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i4 & 7168) == 0) {
                        i27 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                        i20 = i5 & 16384;
                        if (i20 != 0) {
                            i27 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i21 = i20;
                            i27 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                            if ((i4 & 458752) == 0) {
                                i27 |= ((i5 & 32768) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                            }
                            if ((i6 & 1533916891) == 306783378 || (374491 & i27) != 74898 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i26 == 0 ? Modifier.Companion : modifier;
                                    long m3327getUnspecified0d7_KjU = i7 == 0 ? Color.Companion.m3327getUnspecified0d7_KjU() : j;
                                    long m5799getUnspecifiedXSAIIZE = i8 == 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j2;
                                    FontStyle fontStyle4 = i9 == 0 ? null : fontStyle;
                                    FontWeight fontWeight4 = i10 == 0 ? null : fontWeight;
                                    FontFamily fontFamily4 = i11 == 0 ? null : fontFamily;
                                    long m5799getUnspecifiedXSAIIZE2 = i12 == 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j3;
                                    TextDecoration textDecoration4 = i13 == 0 ? null : textDecoration;
                                    TextAlign textAlign4 = i14 == 0 ? textAlign : null;
                                    long m5799getUnspecifiedXSAIIZE3 = i15 == 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j4;
                                    int m5516getClipgIe3tQ8 = i17 == 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i;
                                    boolean z4 = i18 == 0 ? true : z;
                                    int i28 = i19 == 0 ? Integer.MAX_VALUE : i2;
                                    TextKt$Text$3 textKt$Text$3 = i21 == 0 ? TextKt$Text$3.INSTANCE : function1;
                                    if ((i5 & 32768) == 0) {
                                        TextDecoration textDecoration5 = textDecoration4;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(LocalTextStyle);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        i27 &= -458753;
                                        textDecoration2 = textDecoration5;
                                        j5 = m5799getUnspecifiedXSAIIZE3;
                                        textStyle2 = (TextStyle) consume;
                                    } else {
                                        textDecoration2 = textDecoration4;
                                        j5 = m5799getUnspecifiedXSAIIZE3;
                                        textStyle2 = textStyle;
                                    }
                                    modifier2 = companion;
                                    i22 = m5516getClipgIe3tQ8;
                                    z2 = z4;
                                    textAlign2 = textAlign4;
                                    i23 = i28;
                                    function12 = textKt$Text$3;
                                    j6 = m3327getUnspecified0d7_KjU;
                                    j7 = m5799getUnspecifiedXSAIIZE;
                                    fontStyle2 = fontStyle4;
                                    fontWeight2 = fontWeight4;
                                    fontFamily2 = fontFamily4;
                                    j8 = m5799getUnspecifiedXSAIIZE2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i5 & 32768) != 0) {
                                        i27 &= -458753;
                                    }
                                    modifier2 = modifier;
                                    j6 = j;
                                    j7 = j2;
                                    fontStyle2 = fontStyle;
                                    fontWeight2 = fontWeight;
                                    fontFamily2 = fontFamily;
                                    j8 = j3;
                                    textDecoration2 = textDecoration;
                                    textAlign2 = textAlign;
                                    j5 = j4;
                                    i22 = i;
                                    z2 = z;
                                    i23 = i2;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1968784669, i6, i27, "androidx.compose.material3.Text (Text.kt:148)");
                                }
                                int i29 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192);
                                int i30 = i27 << 3;
                                composer2 = startRestartGroup;
                                m2145Text4IGK_g(text, modifier2, j6, j7, fontStyle2, fontWeight2, fontFamily2, j8, textDecoration2, textAlign2, j5, i22, z2, i23, 1, function12, textStyle2, composer2, i29, (i27 & 14) | 24576 | (i27 & 112) | (i27 & 896) | (i27 & 7168) | (i30 & 458752) | (i30 & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                fontStyle3 = fontStyle2;
                                j9 = j6;
                                j10 = j7;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j11 = j8;
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                j12 = j5;
                                i24 = i22;
                                z3 = z2;
                                i25 = i23;
                                function13 = function12;
                                textStyle3 = textStyle2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                j9 = j;
                                j10 = j2;
                                fontStyle3 = fontStyle;
                                fontWeight3 = fontWeight;
                                fontFamily3 = fontFamily;
                                textDecoration3 = textDecoration;
                                textAlign3 = textAlign;
                                j12 = j4;
                                i24 = i;
                                z3 = z;
                                i25 = i2;
                                function13 = function1;
                                textStyle3 = textStyle;
                                composer2 = startRestartGroup;
                                j11 = j3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextKt$Text$4(text, modifier3, j9, j10, fontStyle3, fontWeight3, fontFamily3, j11, textDecoration3, textAlign3, j12, i24, z3, i25, function13, textStyle3, i3, i4, i5));
                            return;
                        }
                        i21 = i20;
                        if ((i4 & 458752) == 0) {
                        }
                        if ((i6 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if ((i5 & 32768) == 0) {
                        }
                        modifier2 = companion;
                        i22 = m5516getClipgIe3tQ8;
                        z2 = z4;
                        textAlign2 = textAlign4;
                        i23 = i28;
                        function12 = textKt$Text$3;
                        j6 = m3327getUnspecified0d7_KjU;
                        j7 = m5799getUnspecifiedXSAIIZE;
                        fontStyle2 = fontStyle4;
                        fontWeight2 = fontWeight4;
                        fontFamily2 = fontFamily4;
                        j8 = m5799getUnspecifiedXSAIIZE2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i292 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192);
                        int i302 = i27 << 3;
                        composer2 = startRestartGroup;
                        m2145Text4IGK_g(text, modifier2, j6, j7, fontStyle2, fontWeight2, fontFamily2, j8, textDecoration2, textAlign2, j5, i22, z2, i23, 1, function12, textStyle2, composer2, i292, (i27 & 14) | 24576 | (i27 & 112) | (i27 & 896) | (i27 & 7168) | (i302 & 458752) | (i302 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        fontStyle3 = fontStyle2;
                        j9 = j6;
                        j10 = j7;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j11 = j8;
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        j12 = j5;
                        i24 = i22;
                        z3 = z2;
                        i25 = i23;
                        function13 = function12;
                        textStyle3 = textStyle2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i20 = i5 & 16384;
                    if (i20 != 0) {
                    }
                    i21 = i20;
                    if ((i4 & 458752) == 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if ((i5 & 32768) == 0) {
                    }
                    modifier2 = companion;
                    i22 = m5516getClipgIe3tQ8;
                    z2 = z4;
                    textAlign2 = textAlign4;
                    i23 = i28;
                    function12 = textKt$Text$3;
                    j6 = m3327getUnspecified0d7_KjU;
                    j7 = m5799getUnspecifiedXSAIIZE;
                    fontStyle2 = fontStyle4;
                    fontWeight2 = fontWeight4;
                    fontFamily2 = fontFamily4;
                    j8 = m5799getUnspecifiedXSAIIZE2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i2922 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192);
                    int i3022 = i27 << 3;
                    composer2 = startRestartGroup;
                    m2145Text4IGK_g(text, modifier2, j6, j7, fontStyle2, fontWeight2, fontFamily2, j8, textDecoration2, textAlign2, j5, i22, z2, i23, 1, function12, textStyle2, composer2, i2922, (i27 & 14) | 24576 | (i27 & 112) | (i27 & 896) | (i27 & 7168) | (i3022 & 458752) | (i3022 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    fontStyle3 = fontStyle2;
                    j9 = j6;
                    j10 = j7;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j11 = j8;
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    j12 = j5;
                    i24 = i22;
                    z3 = z2;
                    i25 = i23;
                    function13 = function12;
                    textStyle3 = textStyle2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i19 = i5 & 8192;
                if (i19 == 0) {
                }
                i20 = i5 & 16384;
                if (i20 != 0) {
                }
                i21 = i20;
                if ((i4 & 458752) == 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i26 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i21 == 0) {
                }
                if ((i5 & 32768) == 0) {
                }
                modifier2 = companion;
                i22 = m5516getClipgIe3tQ8;
                z2 = z4;
                textAlign2 = textAlign4;
                i23 = i28;
                function12 = textKt$Text$3;
                j6 = m3327getUnspecified0d7_KjU;
                j7 = m5799getUnspecifiedXSAIIZE;
                fontStyle2 = fontStyle4;
                fontWeight2 = fontWeight4;
                fontFamily2 = fontFamily4;
                j8 = m5799getUnspecifiedXSAIIZE2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i29222 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192);
                int i30222 = i27 << 3;
                composer2 = startRestartGroup;
                m2145Text4IGK_g(text, modifier2, j6, j7, fontStyle2, fontWeight2, fontFamily2, j8, textDecoration2, textAlign2, j5, i22, z2, i23, 1, function12, textStyle2, composer2, i29222, (i27 & 14) | 24576 | (i27 & 112) | (i27 & 896) | (i27 & 7168) | (i30222 & 458752) | (i30222 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                fontStyle3 = fontStyle2;
                j9 = j6;
                j10 = j7;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j11 = j8;
                textDecoration3 = textDecoration2;
                textAlign3 = textAlign2;
                j12 = j5;
                i24 = i22;
                z3 = z2;
                i25 = i23;
                function13 = function12;
                textStyle3 = textStyle2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i5 & 1024;
            if (i15 != 0) {
            }
            i17 = i5 & 2048;
            if (i17 != 0) {
            }
            int i272 = i16;
            i18 = i5 & 4096;
            if (i18 != 0) {
            }
            i19 = i5 & 8192;
            if (i19 == 0) {
            }
            i20 = i5 & 16384;
            if (i20 != 0) {
            }
            i21 = i20;
            if ((i4 & 458752) == 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i26 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i21 == 0) {
            }
            if ((i5 & 32768) == 0) {
            }
            modifier2 = companion;
            i22 = m5516getClipgIe3tQ8;
            z2 = z4;
            textAlign2 = textAlign4;
            i23 = i28;
            function12 = textKt$Text$3;
            j6 = m3327getUnspecified0d7_KjU;
            j7 = m5799getUnspecifiedXSAIIZE;
            fontStyle2 = fontStyle4;
            fontWeight2 = fontWeight4;
            fontFamily2 = fontFamily4;
            j8 = m5799getUnspecifiedXSAIIZE2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i292222 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192);
            int i302222 = i272 << 3;
            composer2 = startRestartGroup;
            m2145Text4IGK_g(text, modifier2, j6, j7, fontStyle2, fontWeight2, fontFamily2, j8, textDecoration2, textAlign2, j5, i22, z2, i23, 1, function12, textStyle2, composer2, i292222, (i272 & 14) | 24576 | (i272 & 112) | (i272 & 896) | (i272 & 7168) | (i302222 & 458752) | (i302222 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            fontStyle3 = fontStyle2;
            j9 = j6;
            j10 = j7;
            fontWeight3 = fontWeight2;
            fontFamily3 = fontFamily2;
            j11 = j8;
            textDecoration3 = textDecoration2;
            textAlign3 = textAlign2;
            j12 = j5;
            i24 = i22;
            z3 = z2;
            i25 = i23;
            function13 = function12;
            textStyle3 = textStyle2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i5 & 1024;
        if (i15 != 0) {
        }
        i17 = i5 & 2048;
        if (i17 != 0) {
        }
        int i2722 = i16;
        i18 = i5 & 4096;
        if (i18 != 0) {
        }
        i19 = i5 & 8192;
        if (i19 == 0) {
        }
        i20 = i5 & 16384;
        if (i20 != 0) {
        }
        i21 = i20;
        if ((i4 & 458752) == 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i26 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i21 == 0) {
        }
        if ((i5 & 32768) == 0) {
        }
        modifier2 = companion;
        i22 = m5516getClipgIe3tQ8;
        z2 = z4;
        textAlign2 = textAlign4;
        i23 = i28;
        function12 = textKt$Text$3;
        j6 = m3327getUnspecified0d7_KjU;
        j7 = m5799getUnspecifiedXSAIIZE;
        fontStyle2 = fontStyle4;
        fontWeight2 = fontWeight4;
        fontFamily2 = fontFamily4;
        j8 = m5799getUnspecifiedXSAIIZE2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i2922222 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192);
        int i3022222 = i2722 << 3;
        composer2 = startRestartGroup;
        m2145Text4IGK_g(text, modifier2, j6, j7, fontStyle2, fontWeight2, fontFamily2, j8, textDecoration2, textAlign2, j5, i22, z2, i23, 1, function12, textStyle2, composer2, i2922222, (i2722 & 14) | 24576 | (i2722 & 112) | (i2722 & 896) | (i2722 & 7168) | (i3022222 & 458752) | (i3022222 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        fontStyle3 = fontStyle2;
        j9 = j6;
        j10 = j7;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        j11 = j8;
        textDecoration3 = textDecoration2;
        textAlign3 = textAlign2;
        j12 = j5;
        i24 = i22;
        z3 = z2;
        i25 = i23;
        function13 = function12;
        textStyle3 = textStyle2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013c  */
    /* renamed from: Text-IbK3jfQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2146TextIbK3jfQ(AnnotatedString text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Modifier.Companion companion;
        long m3327getUnspecified0d7_KjU;
        long m5799getUnspecifiedXSAIIZE;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long m5799getUnspecifiedXSAIIZE2;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        long m5799getUnspecifiedXSAIIZE3;
        int m5516getClipgIe3tQ8;
        boolean z2;
        int i26;
        int i27;
        Map<String, InlineTextContent> emptyMap;
        TextKt$Text$5 textKt$Text$5;
        int i28;
        TextStyle textStyle2;
        Map<String, InlineTextContent> map2;
        long j5;
        long j6;
        TextAlign textAlign3;
        int i29;
        long j7;
        long j8;
        Map<String, InlineTextContent> map3;
        int i30;
        Function1<? super TextLayoutResult, Unit> function12;
        int i31;
        FontFamily fontFamily3;
        TextStyle textStyle3;
        FontWeight fontWeight3;
        boolean z3;
        FontStyle fontStyle3;
        TextDecoration textDecoration3;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(2027001676);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(15,10,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,17,16:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,12:c#ui.text.style.TextOverflow,13,8,9)258@11733L7,280@12450L286:Text.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i7 = (startRestartGroup.changed(text) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i32 = i6 & 2;
        if (i32 != 0) {
            i7 |= 48;
        } else if ((i4 & 112) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 896) == 0) {
                i7 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i4 & 7168) == 0) {
                i7 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= 24576;
            } else if ((i4 & 57344) == 0) {
                i7 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i11 = i6 & 32;
            if (i11 == 0) {
                i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i4 & 458752) == 0) {
                i7 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i12 = i6 & 64;
            if (i12 == 0) {
                i7 |= 1572864;
            } else if ((i4 & 3670016) == 0) {
                i7 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i13 = i6 & 128;
            if (i13 == 0) {
                i7 |= 12582912;
            } else if ((i4 & 29360128) == 0) {
                i7 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i14 = i6 & 256;
            if (i14 == 0) {
                i7 |= 100663296;
            } else if ((i4 & 234881024) == 0) {
                i7 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i15 = i6 & 512;
            if (i15 == 0) {
                i7 |= C.ENCODING_PCM_32BIT;
            } else if ((i4 & 1879048192) == 0) {
                i7 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
            }
            i16 = i6 & 1024;
            if (i16 == 0) {
                i17 = i5 | 6;
            } else if ((i5 & 14) == 0) {
                i17 = i5 | (startRestartGroup.changed(j4) ? 4 : 2);
            } else {
                i17 = i5;
            }
            i18 = i6 & 2048;
            if (i18 == 0) {
                i17 |= 48;
            } else if ((i5 & 112) == 0) {
                i17 |= startRestartGroup.changed(i) ? 32 : 16;
            }
            int i33 = i17;
            i19 = i6 & 4096;
            if (i19 == 0) {
                i33 |= 384;
            } else if ((i5 & 896) == 0) {
                i33 |= startRestartGroup.changed(z) ? 256 : 128;
                i20 = i6 & 8192;
                if (i20 != 0) {
                    i33 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i5 & 7168) == 0) {
                    i33 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                    i21 = i6 & 16384;
                    if (i21 == 0) {
                        i33 |= 24576;
                    } else if ((i5 & 57344) == 0) {
                        i22 = i21;
                        i33 |= startRestartGroup.changed(i3) ? 16384 : 8192;
                        i23 = i6 & 32768;
                        if (i23 != 0) {
                            i33 |= 65536;
                        }
                        i24 = i6 & 65536;
                        if (i24 != 0) {
                            i33 |= 1572864;
                        } else if ((i5 & 3670016) == 0) {
                            i25 = i20;
                            i33 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                            if ((i5 & 29360128) == 0) {
                                i33 |= ((i6 & 131072) == 0 && startRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                            }
                            if (i23 == 32768 || (1533916891 & i7) != 306783378 || (23967451 & i33) != 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i4 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i32 == 0 ? Modifier.Companion : modifier;
                                    m3327getUnspecified0d7_KjU = i8 == 0 ? Color.Companion.m3327getUnspecified0d7_KjU() : j;
                                    m5799getUnspecifiedXSAIIZE = i9 == 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j2;
                                    fontStyle2 = i10 == 0 ? null : fontStyle;
                                    fontWeight2 = i11 == 0 ? null : fontWeight;
                                    fontFamily2 = i12 == 0 ? null : fontFamily;
                                    m5799getUnspecifiedXSAIIZE2 = i13 == 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j3;
                                    textDecoration2 = i14 == 0 ? null : textDecoration;
                                    textAlign2 = i15 == 0 ? textAlign : null;
                                    m5799getUnspecifiedXSAIIZE3 = i16 == 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j4;
                                    m5516getClipgIe3tQ8 = i18 == 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i;
                                    z2 = i19 == 0 ? true : z;
                                    i26 = i25 == 0 ? Integer.MAX_VALUE : i2;
                                    i27 = i22 == 0 ? 1 : i3;
                                    emptyMap = i23 == 0 ? MapsKt.emptyMap() : map;
                                    textKt$Text$5 = i24 == 0 ? TextKt$Text$5.INSTANCE : function1;
                                    if ((i6 & 131072) == 0) {
                                        TextDecoration textDecoration4 = textDecoration2;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(LocalTextStyle);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        m5516getClipgIe3tQ8 = m5516getClipgIe3tQ8;
                                        i28 = i33 & (-29360129);
                                        textStyle2 = (TextStyle) consume;
                                        textDecoration2 = textDecoration4;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2027001676, i7, i28, "androidx.compose.material3.Text (Text.kt:240)");
                                        }
                                        startRestartGroup.startReplaceableGroup(79588971);
                                        ComposerKt.sourceInformation(startRestartGroup, "*262@11847L7");
                                        if (m3327getUnspecified0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU()) {
                                            long m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                                            if (m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU()) {
                                                map2 = emptyMap;
                                            } else {
                                                map2 = emptyMap;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object consume2 = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                m5103getColor0d7_KjU = ((Color) consume2).m3301unboximpl();
                                            }
                                            j5 = m5103getColor0d7_KjU;
                                        } else {
                                            map2 = emptyMap;
                                            j5 = m3327getUnspecified0d7_KjU;
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        int i34 = i28 << 9;
                                        BasicTextKt.m1017BasicTextVhcvRP8(text, companion, textStyle2.merge(new TextStyle(j5, m5799getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m5799getUnspecifiedXSAIIZE2, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, m5799getUnspecifiedXSAIIZE3, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4108112, (DefaultConstructorMarker) null)), textKt$Text$5, m5516getClipgIe3tQ8, z2, i26, i27, map2, startRestartGroup, (i7 & 112) | 134217728 | (i7 & 14) | ((i28 >> 9) & 7168) | (i34 & 57344) | (458752 & i34) | (i34 & 3670016) | (i34 & 29360128), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        j6 = m5799getUnspecifiedXSAIIZE3;
                                        textAlign3 = textAlign2;
                                        i29 = i27;
                                        j7 = m3327getUnspecified0d7_KjU;
                                        j8 = m5799getUnspecifiedXSAIIZE2;
                                        map3 = map2;
                                        i30 = m5516getClipgIe3tQ8;
                                        function12 = textKt$Text$5;
                                        i31 = i26;
                                        fontFamily3 = fontFamily2;
                                        textStyle3 = textStyle2;
                                        fontWeight3 = fontWeight2;
                                        z3 = z2;
                                        fontStyle3 = fontStyle2;
                                        textDecoration3 = textDecoration2;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i6 & 131072) != 0) {
                                        i33 &= -29360129;
                                    }
                                    companion = modifier;
                                    m3327getUnspecified0d7_KjU = j;
                                    m5799getUnspecifiedXSAIIZE = j2;
                                    fontStyle2 = fontStyle;
                                    fontWeight2 = fontWeight;
                                    fontFamily2 = fontFamily;
                                    m5799getUnspecifiedXSAIIZE2 = j3;
                                    textDecoration2 = textDecoration;
                                    textAlign2 = textAlign;
                                    m5799getUnspecifiedXSAIIZE3 = j4;
                                    m5516getClipgIe3tQ8 = i;
                                    z2 = z;
                                    i26 = i2;
                                    i27 = i3;
                                    emptyMap = map;
                                    textKt$Text$5 = function1;
                                }
                                i28 = i33;
                                textStyle2 = textStyle;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceableGroup(79588971);
                                ComposerKt.sourceInformation(startRestartGroup, "*262@11847L7");
                                if (m3327getUnspecified0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                int i342 = i28 << 9;
                                BasicTextKt.m1017BasicTextVhcvRP8(text, companion, textStyle2.merge(new TextStyle(j5, m5799getUnspecifiedXSAIIZE, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m5799getUnspecifiedXSAIIZE2, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, m5799getUnspecifiedXSAIIZE3, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4108112, (DefaultConstructorMarker) null)), textKt$Text$5, m5516getClipgIe3tQ8, z2, i26, i27, map2, startRestartGroup, (i7 & 112) | 134217728 | (i7 & 14) | ((i28 >> 9) & 7168) | (i342 & 57344) | (458752 & i342) | (i342 & 3670016) | (i342 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                j6 = m5799getUnspecifiedXSAIIZE3;
                                textAlign3 = textAlign2;
                                i29 = i27;
                                j7 = m3327getUnspecified0d7_KjU;
                                j8 = m5799getUnspecifiedXSAIIZE2;
                                map3 = map2;
                                i30 = m5516getClipgIe3tQ8;
                                function12 = textKt$Text$5;
                                i31 = i26;
                                fontFamily3 = fontFamily2;
                                textStyle3 = textStyle2;
                                fontWeight3 = fontWeight2;
                                z3 = z2;
                                fontStyle3 = fontStyle2;
                                textDecoration3 = textDecoration2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                companion = modifier;
                                j7 = j;
                                m5799getUnspecifiedXSAIIZE = j2;
                                fontStyle3 = fontStyle;
                                fontWeight3 = fontWeight;
                                fontFamily3 = fontFamily;
                                j8 = j3;
                                textDecoration3 = textDecoration;
                                textAlign3 = textAlign;
                                j6 = j4;
                                i30 = i;
                                z3 = z;
                                i31 = i2;
                                i29 = i3;
                                map3 = map;
                                function12 = function1;
                                textStyle3 = textStyle;
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextKt$Text$6(text, companion, j7, m5799getUnspecifiedXSAIIZE, fontStyle3, fontWeight3, fontFamily3, j8, textDecoration3, textAlign3, j6, i30, z3, i31, i29, map3, function12, textStyle3, i4, i5, i6));
                            return;
                        }
                        i25 = i20;
                        if ((i5 & 29360128) == 0) {
                        }
                        if (i23 == 32768) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i4 & 1) != 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) == 0) {
                        }
                    }
                    i22 = i21;
                    i23 = i6 & 32768;
                    if (i23 != 0) {
                    }
                    i24 = i6 & 65536;
                    if (i24 != 0) {
                    }
                    i25 = i20;
                    if ((i5 & 29360128) == 0) {
                    }
                    if (i23 == 32768) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i4 & 1) != 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) == 0) {
                    }
                }
                i21 = i6 & 16384;
                if (i21 == 0) {
                }
                i22 = i21;
                i23 = i6 & 32768;
                if (i23 != 0) {
                }
                i24 = i6 & 65536;
                if (i24 != 0) {
                }
                i25 = i20;
                if ((i5 & 29360128) == 0) {
                }
                if (i23 == 32768) {
                }
                startRestartGroup.startDefaults();
                if ((i4 & 1) != 0) {
                }
                if (i32 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i25 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i24 == 0) {
                }
                if ((i6 & 131072) == 0) {
                }
            }
            i20 = i6 & 8192;
            if (i20 != 0) {
            }
            i21 = i6 & 16384;
            if (i21 == 0) {
            }
            i22 = i21;
            i23 = i6 & 32768;
            if (i23 != 0) {
            }
            i24 = i6 & 65536;
            if (i24 != 0) {
            }
            i25 = i20;
            if ((i5 & 29360128) == 0) {
            }
            if (i23 == 32768) {
            }
            startRestartGroup.startDefaults();
            if ((i4 & 1) != 0) {
            }
            if (i32 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i25 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (i24 == 0) {
            }
            if ((i6 & 131072) == 0) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        if (i11 == 0) {
        }
        i12 = i6 & 64;
        if (i12 == 0) {
        }
        i13 = i6 & 128;
        if (i13 == 0) {
        }
        i14 = i6 & 256;
        if (i14 == 0) {
        }
        i15 = i6 & 512;
        if (i15 == 0) {
        }
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i18 = i6 & 2048;
        if (i18 == 0) {
        }
        int i332 = i17;
        i19 = i6 & 4096;
        if (i19 == 0) {
        }
        i20 = i6 & 8192;
        if (i20 != 0) {
        }
        i21 = i6 & 16384;
        if (i21 == 0) {
        }
        i22 = i21;
        i23 = i6 & 32768;
        if (i23 != 0) {
        }
        i24 = i6 & 65536;
        if (i24 != 0) {
        }
        i25 = i20;
        if ((i5 & 29360128) == 0) {
        }
        if (i23 == 32768) {
        }
        startRestartGroup.startDefaults();
        if ((i4 & 1) != 0) {
        }
        if (i32 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i25 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (i24 == 0) {
        }
        if ((i6 & 131072) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0136  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2144Text4IGK_g(AnnotatedString text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, Function1 function1, TextStyle textStyle, Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        TextDecoration textDecoration2;
        long j5;
        TextStyle textStyle2;
        Modifier modifier2;
        int i23;
        boolean z2;
        TextAlign textAlign2;
        int i24;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        Map map2;
        Function1 function12;
        FontFamily fontFamily2;
        long j6;
        long j7;
        long j8;
        Composer composer2;
        Modifier modifier3;
        FontStyle fontStyle3;
        FontWeight fontWeight3;
        long j9;
        long j10;
        FontFamily fontFamily3;
        long j11;
        TextDecoration textDecoration3;
        TextAlign textAlign3;
        long j12;
        int i25;
        boolean z3;
        int i26;
        Map map3;
        Function1 function13;
        TextStyle textStyle3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(224529679);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)315@13586L7,317@13602L345:Text.kt#uh7d8r");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 896) == 0) {
                i6 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                i6 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i10 = i5 & 32;
            if (i10 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & 458752) == 0) {
                i6 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i11 = i5 & 64;
            if (i11 == 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                i6 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i12 = i5 & 128;
            if (i12 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i5 & 256;
            if (i13 == 0) {
                i6 |= 100663296;
            } else if ((234881024 & i3) == 0) {
                i6 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                i14 = i5 & 512;
                if (i14 != 0) {
                    i6 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                }
                i15 = i5 & 1024;
                if (i15 != 0) {
                    i16 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i16 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                } else {
                    i16 = i4;
                }
                i17 = i5 & 2048;
                if (i17 != 0) {
                    i16 |= 48;
                } else if ((i4 & 112) == 0) {
                    i16 |= startRestartGroup.changed(i) ? 32 : 16;
                }
                int i28 = i16;
                i18 = i5 & 4096;
                if (i18 != 0) {
                    i28 |= 384;
                } else if ((i4 & 896) == 0) {
                    i28 |= startRestartGroup.changed(z) ? 256 : 128;
                    i19 = i5 & 8192;
                    if (i19 == 0) {
                        i28 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i4 & 7168) == 0) {
                        i28 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                        i20 = i5 & 16384;
                        if (i20 != 0) {
                            i28 |= 8192;
                        }
                        i21 = i5 & 32768;
                        if (i21 != 0) {
                            i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i22 = i19;
                            i28 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                            if ((i4 & 3670016) == 0) {
                                i28 |= ((i5 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                            }
                            if (i20 == 16384 || (1533916891 & i6) != 306783378 || (2995931 & i28) != 599186 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i27 == 0 ? Modifier.Companion : modifier;
                                    long m3327getUnspecified0d7_KjU = i7 == 0 ? Color.Companion.m3327getUnspecified0d7_KjU() : j;
                                    long m5799getUnspecifiedXSAIIZE = i8 == 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j2;
                                    FontStyle fontStyle4 = i9 == 0 ? null : fontStyle;
                                    FontWeight fontWeight4 = i10 == 0 ? null : fontWeight;
                                    FontFamily fontFamily4 = i11 == 0 ? null : fontFamily;
                                    long m5799getUnspecifiedXSAIIZE2 = i12 == 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j3;
                                    TextDecoration textDecoration4 = i13 == 0 ? null : textDecoration;
                                    TextAlign textAlign4 = i14 == 0 ? textAlign : null;
                                    long m5799getUnspecifiedXSAIIZE3 = i15 == 0 ? TextUnit.Companion.m5799getUnspecifiedXSAIIZE() : j4;
                                    int m5516getClipgIe3tQ8 = i17 == 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i;
                                    boolean z4 = i18 == 0 ? true : z;
                                    int i29 = i22 == 0 ? Integer.MAX_VALUE : i2;
                                    Map emptyMap = i20 == 0 ? MapsKt.emptyMap() : map;
                                    TextKt$Text$7 textKt$Text$7 = i21 == 0 ? TextKt$Text$7.INSTANCE : function1;
                                    if ((i5 & 65536) == 0) {
                                        TextDecoration textDecoration5 = textDecoration4;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(LocalTextStyle);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        i28 &= -3670017;
                                        textDecoration2 = textDecoration5;
                                        j5 = m5799getUnspecifiedXSAIIZE3;
                                        textStyle2 = (TextStyle) consume;
                                    } else {
                                        textDecoration2 = textDecoration4;
                                        j5 = m5799getUnspecifiedXSAIIZE3;
                                        textStyle2 = textStyle;
                                    }
                                    modifier2 = companion;
                                    i23 = m5516getClipgIe3tQ8;
                                    z2 = z4;
                                    textAlign2 = textAlign4;
                                    i24 = i29;
                                    fontStyle2 = fontStyle4;
                                    fontWeight2 = fontWeight4;
                                    map2 = emptyMap;
                                    function12 = textKt$Text$7;
                                    fontFamily2 = fontFamily4;
                                    j6 = m3327getUnspecified0d7_KjU;
                                    j7 = m5799getUnspecifiedXSAIIZE2;
                                    j8 = m5799getUnspecifiedXSAIIZE;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i5 & 65536) != 0) {
                                        i28 &= -3670017;
                                    }
                                    modifier2 = modifier;
                                    j6 = j;
                                    j8 = j2;
                                    fontStyle2 = fontStyle;
                                    fontWeight2 = fontWeight;
                                    fontFamily2 = fontFamily;
                                    j7 = j3;
                                    textDecoration2 = textDecoration;
                                    textAlign2 = textAlign;
                                    j5 = j4;
                                    i23 = i;
                                    z2 = z;
                                    i24 = i2;
                                    map2 = map;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(224529679, i6, i28, "androidx.compose.material3.Text (Text.kt:298)");
                                }
                                int i30 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192);
                                int i31 = i28 << 3;
                                composer2 = startRestartGroup;
                                m2146TextIbK3jfQ(text, modifier2, j6, j8, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i23, z2, i24, 1, map2, function12, textStyle2, composer2, i30, 286720 | (i28 & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (i31 & 3670016) | (i31 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                fontStyle3 = fontStyle2;
                                fontWeight3 = fontWeight2;
                                j9 = j6;
                                j10 = j8;
                                fontFamily3 = fontFamily2;
                                j11 = j7;
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                j12 = j5;
                                i25 = i23;
                                z3 = z2;
                                i26 = i24;
                                map3 = map2;
                                function13 = function12;
                                textStyle3 = textStyle2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                j9 = j;
                                j10 = j2;
                                fontStyle3 = fontStyle;
                                fontWeight3 = fontWeight;
                                fontFamily3 = fontFamily;
                                textDecoration3 = textDecoration;
                                textAlign3 = textAlign;
                                j12 = j4;
                                i25 = i;
                                z3 = z;
                                i26 = i2;
                                map3 = map;
                                function13 = function1;
                                textStyle3 = textStyle;
                                composer2 = startRestartGroup;
                                j11 = j3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextKt$Text$8(text, modifier3, j9, j10, fontStyle3, fontWeight3, fontFamily3, j11, textDecoration3, textAlign3, j12, i25, z3, i26, map3, function13, textStyle3, i3, i4, i5));
                            return;
                        }
                        i22 = i19;
                        if ((i4 & 3670016) == 0) {
                        }
                        if (i20 == 16384) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i27 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if ((i5 & 65536) == 0) {
                        }
                        modifier2 = companion;
                        i23 = m5516getClipgIe3tQ8;
                        z2 = z4;
                        textAlign2 = textAlign4;
                        i24 = i29;
                        fontStyle2 = fontStyle4;
                        fontWeight2 = fontWeight4;
                        map2 = emptyMap;
                        function12 = textKt$Text$7;
                        fontFamily2 = fontFamily4;
                        j6 = m3327getUnspecified0d7_KjU;
                        j7 = m5799getUnspecifiedXSAIIZE2;
                        j8 = m5799getUnspecifiedXSAIIZE;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i302 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192);
                        int i312 = i28 << 3;
                        composer2 = startRestartGroup;
                        m2146TextIbK3jfQ(text, modifier2, j6, j8, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i23, z2, i24, 1, map2, function12, textStyle2, composer2, i302, 286720 | (i28 & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (i312 & 3670016) | (i312 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        j9 = j6;
                        j10 = j8;
                        fontFamily3 = fontFamily2;
                        j11 = j7;
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        j12 = j5;
                        i25 = i23;
                        z3 = z2;
                        i26 = i24;
                        map3 = map2;
                        function13 = function12;
                        textStyle3 = textStyle2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i20 = i5 & 16384;
                    if (i20 != 0) {
                    }
                    i21 = i5 & 32768;
                    if (i21 != 0) {
                    }
                    i22 = i19;
                    if ((i4 & 3670016) == 0) {
                    }
                    if (i20 == 16384) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if ((i5 & 65536) == 0) {
                    }
                    modifier2 = companion;
                    i23 = m5516getClipgIe3tQ8;
                    z2 = z4;
                    textAlign2 = textAlign4;
                    i24 = i29;
                    fontStyle2 = fontStyle4;
                    fontWeight2 = fontWeight4;
                    map2 = emptyMap;
                    function12 = textKt$Text$7;
                    fontFamily2 = fontFamily4;
                    j6 = m3327getUnspecified0d7_KjU;
                    j7 = m5799getUnspecifiedXSAIIZE2;
                    j8 = m5799getUnspecifiedXSAIIZE;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i3022 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192);
                    int i3122 = i28 << 3;
                    composer2 = startRestartGroup;
                    m2146TextIbK3jfQ(text, modifier2, j6, j8, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i23, z2, i24, 1, map2, function12, textStyle2, composer2, i3022, 286720 | (i28 & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (i3122 & 3670016) | (i3122 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    j9 = j6;
                    j10 = j8;
                    fontFamily3 = fontFamily2;
                    j11 = j7;
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    j12 = j5;
                    i25 = i23;
                    z3 = z2;
                    i26 = i24;
                    map3 = map2;
                    function13 = function12;
                    textStyle3 = textStyle2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i19 = i5 & 8192;
                if (i19 == 0) {
                }
                i20 = i5 & 16384;
                if (i20 != 0) {
                }
                i21 = i5 & 32768;
                if (i21 != 0) {
                }
                i22 = i19;
                if ((i4 & 3670016) == 0) {
                }
                if (i20 == 16384) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i27 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i22 == 0) {
                }
                if (i20 == 0) {
                }
                if (i21 == 0) {
                }
                if ((i5 & 65536) == 0) {
                }
                modifier2 = companion;
                i23 = m5516getClipgIe3tQ8;
                z2 = z4;
                textAlign2 = textAlign4;
                i24 = i29;
                fontStyle2 = fontStyle4;
                fontWeight2 = fontWeight4;
                map2 = emptyMap;
                function12 = textKt$Text$7;
                fontFamily2 = fontFamily4;
                j6 = m3327getUnspecified0d7_KjU;
                j7 = m5799getUnspecifiedXSAIIZE2;
                j8 = m5799getUnspecifiedXSAIIZE;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i30222 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192);
                int i31222 = i28 << 3;
                composer2 = startRestartGroup;
                m2146TextIbK3jfQ(text, modifier2, j6, j8, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i23, z2, i24, 1, map2, function12, textStyle2, composer2, i30222, 286720 | (i28 & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (i31222 & 3670016) | (i31222 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                fontStyle3 = fontStyle2;
                fontWeight3 = fontWeight2;
                j9 = j6;
                j10 = j8;
                fontFamily3 = fontFamily2;
                j11 = j7;
                textDecoration3 = textDecoration2;
                textAlign3 = textAlign2;
                j12 = j5;
                i25 = i23;
                z3 = z2;
                i26 = i24;
                map3 = map2;
                function13 = function12;
                textStyle3 = textStyle2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i5 & 1024;
            if (i15 != 0) {
            }
            i17 = i5 & 2048;
            if (i17 != 0) {
            }
            int i282 = i16;
            i18 = i5 & 4096;
            if (i18 != 0) {
            }
            i19 = i5 & 8192;
            if (i19 == 0) {
            }
            i20 = i5 & 16384;
            if (i20 != 0) {
            }
            i21 = i5 & 32768;
            if (i21 != 0) {
            }
            i22 = i19;
            if ((i4 & 3670016) == 0) {
            }
            if (i20 == 16384) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i27 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i22 == 0) {
            }
            if (i20 == 0) {
            }
            if (i21 == 0) {
            }
            if ((i5 & 65536) == 0) {
            }
            modifier2 = companion;
            i23 = m5516getClipgIe3tQ8;
            z2 = z4;
            textAlign2 = textAlign4;
            i24 = i29;
            fontStyle2 = fontStyle4;
            fontWeight2 = fontWeight4;
            map2 = emptyMap;
            function12 = textKt$Text$7;
            fontFamily2 = fontFamily4;
            j6 = m3327getUnspecified0d7_KjU;
            j7 = m5799getUnspecifiedXSAIIZE2;
            j8 = m5799getUnspecifiedXSAIIZE;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i302222 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192);
            int i312222 = i282 << 3;
            composer2 = startRestartGroup;
            m2146TextIbK3jfQ(text, modifier2, j6, j8, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i23, z2, i24, 1, map2, function12, textStyle2, composer2, i302222, 286720 | (i282 & 14) | (i282 & 112) | (i282 & 896) | (i282 & 7168) | (i312222 & 3670016) | (i312222 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            fontStyle3 = fontStyle2;
            fontWeight3 = fontWeight2;
            j9 = j6;
            j10 = j8;
            fontFamily3 = fontFamily2;
            j11 = j7;
            textDecoration3 = textDecoration2;
            textAlign3 = textAlign2;
            j12 = j5;
            i25 = i23;
            z3 = z2;
            i26 = i24;
            map3 = map2;
            function13 = function12;
            textStyle3 = textStyle2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i5 & 1024;
        if (i15 != 0) {
        }
        i17 = i5 & 2048;
        if (i17 != 0) {
        }
        int i2822 = i16;
        i18 = i5 & 4096;
        if (i18 != 0) {
        }
        i19 = i5 & 8192;
        if (i19 == 0) {
        }
        i20 = i5 & 16384;
        if (i20 != 0) {
        }
        i21 = i5 & 32768;
        if (i21 != 0) {
        }
        i22 = i19;
        if ((i4 & 3670016) == 0) {
        }
        if (i20 == 16384) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i27 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i22 == 0) {
        }
        if (i20 == 0) {
        }
        if (i21 == 0) {
        }
        if ((i5 & 65536) == 0) {
        }
        modifier2 = companion;
        i23 = m5516getClipgIe3tQ8;
        z2 = z4;
        textAlign2 = textAlign4;
        i24 = i29;
        fontStyle2 = fontStyle4;
        fontWeight2 = fontWeight4;
        map2 = emptyMap;
        function12 = textKt$Text$7;
        fontFamily2 = fontFamily4;
        j6 = m3327getUnspecified0d7_KjU;
        j7 = m5799getUnspecifiedXSAIIZE2;
        j8 = m5799getUnspecifiedXSAIIZE;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i3022222 = (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192);
        int i3122222 = i2822 << 3;
        composer2 = startRestartGroup;
        m2146TextIbK3jfQ(text, modifier2, j6, j8, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration2, textAlign2, j5, i23, z2, i24, 1, map2, function12, textStyle2, composer2, i3022222, 286720 | (i2822 & 14) | (i2822 & 112) | (i2822 & 896) | (i2822 & 7168) | (i3122222 & 3670016) | (i3122222 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        fontStyle3 = fontStyle2;
        fontWeight3 = fontWeight2;
        j9 = j6;
        j10 = j8;
        fontFamily3 = fontFamily2;
        j11 = j7;
        textDecoration3 = textDecoration2;
        textAlign3 = textAlign2;
        j12 = j5;
        i25 = i23;
        z3 = z2;
        i26 = i24;
        map3 = map2;
        function13 = function12;
        textStyle3 = textStyle2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(TextStyle value, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-460300127);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyle)P(1)358@14903L7,359@14928L80:Text.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:357)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) consume).merge(value))}, content, startRestartGroup, (i2 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TextKt$ProvideTextStyle$1(value, content, i));
    }
}
