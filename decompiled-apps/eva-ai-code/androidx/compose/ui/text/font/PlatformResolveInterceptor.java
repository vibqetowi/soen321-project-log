package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.PlatformResolveInterceptor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "", "interceptFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", TtmlNode.ATTR_TTS_FONT_FAMILY, "interceptFontStyle", "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "interceptFontStyle-T2F_aPo", "(I)I", "interceptFontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "interceptFontSynthesis-Mscr08Y", "interceptFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PlatformResolveInterceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: FontFamilyResolver.kt */
    /* renamed from: androidx.compose.ui.text.font.PlatformResolveInterceptor$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static FontFamily $default$interceptFontFamily(PlatformResolveInterceptor _this, FontFamily fontFamily) {
            return fontFamily;
        }

        /* renamed from: $default$interceptFontStyle-T2F_aPo  reason: not valid java name */
        public static int m5225$default$interceptFontStyleT2F_aPo(PlatformResolveInterceptor _this, int i) {
            return i;
        }

        /* renamed from: $default$interceptFontSynthesis-Mscr08Y  reason: not valid java name */
        public static int m5226$default$interceptFontSynthesisMscr08Y(PlatformResolveInterceptor _this, int i) {
            return i;
        }
    }

    FontFamily interceptFontFamily(FontFamily fontFamily);

    /* renamed from: interceptFontStyle-T2F_aPo */
    int mo5153interceptFontStyleT2F_aPo(int i);

    /* renamed from: interceptFontSynthesis-Mscr08Y */
    int mo5154interceptFontSynthesisMscr08Y(int i);

    FontWeight interceptFontWeight(FontWeight fontWeight);

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "getDefault$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public /* synthetic */ FontFamily interceptFontFamily(FontFamily fontFamily) {
                return PlatformResolveInterceptor.CC.$default$interceptFontFamily(this, fontFamily);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontStyle-T2F_aPo */
            public /* synthetic */ int mo5153interceptFontStyleT2F_aPo(int i) {
                return PlatformResolveInterceptor.CC.m5225$default$interceptFontStyleT2F_aPo(this, i);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontSynthesis-Mscr08Y */
            public /* synthetic */ int mo5154interceptFontSynthesisMscr08Y(int i) {
                return PlatformResolveInterceptor.CC.m5226$default$interceptFontSynthesisMscr08Y(this, i);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public /* synthetic */ FontWeight interceptFontWeight(FontWeight fontWeight) {
                return Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
            }
        };

        private Companion() {
        }

        public final PlatformResolveInterceptor getDefault$ui_text_release() {
            return Default;
        }
    }
}
