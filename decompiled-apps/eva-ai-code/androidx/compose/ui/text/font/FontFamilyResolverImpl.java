package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\"\u001a\u00020\u000fH\u0002R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "platformFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "(Landroidx/compose/ui/text/font/PlatformFontLoader;Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;)V", "createDefaultTypeface", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "", "getPlatformFontLoader$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformFontLoader;", "preload", "", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/runtime/State;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "typefaceRequest", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    private final Function1<TypefaceRequest, Object> createDefaultTypeface;
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final PlatformFontLoader platformFontLoader;
    private final PlatformResolveInterceptor platformResolveInterceptor;
    private final TypefaceRequestCache typefaceRequestCache;

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter) {
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(platformResolveInterceptor, "platformResolveInterceptor");
        Intrinsics.checkNotNullParameter(typefaceRequestCache, "typefaceRequestCache");
        Intrinsics.checkNotNullParameter(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        Intrinsics.checkNotNullParameter(platformFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFamilyTypefaceAdapter;
        this.createDefaultTypeface = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    public final PlatformFontLoader getPlatformFontLoader$ui_text_release() {
        return this.platformFontLoader;
    }

    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(platformFontLoader, (i & 2) != 0 ? PlatformResolveInterceptor.Companion.getDefault$ui_text_release() : platformResolveInterceptor, (i & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, null) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[LOOP:0: B:23:0x0071->B:24:0x0073, LOOP_END] */
    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object preload(FontFamily fontFamily, Continuation<? super Unit> continuation) {
        FontFamilyResolverImpl$preload$1 fontFamilyResolverImpl$preload$1;
        int i;
        FontFamilyResolverImpl fontFamilyResolverImpl;
        int size;
        int i2;
        FontFamily fontFamily2 = fontFamily;
        if (continuation instanceof FontFamilyResolverImpl$preload$1) {
            fontFamilyResolverImpl$preload$1 = (FontFamilyResolverImpl$preload$1) continuation;
            if ((fontFamilyResolverImpl$preload$1.label & Integer.MIN_VALUE) != 0) {
                fontFamilyResolverImpl$preload$1.label -= Integer.MIN_VALUE;
                Object obj = fontFamilyResolverImpl$preload$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fontFamilyResolverImpl$preload$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!(fontFamily2 instanceof FontListFontFamily)) {
                        return Unit.INSTANCE;
                    }
                    FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.fontListFontFamilyTypefaceAdapter;
                    PlatformFontLoader platformFontLoader = this.platformFontLoader;
                    fontFamilyResolverImpl$preload$1.L$0 = this;
                    fontFamilyResolverImpl$preload$1.L$1 = fontFamily2;
                    fontFamilyResolverImpl$preload$1.label = 1;
                    if (fontListFontFamilyTypefaceAdapter.preload(fontFamily2, platformFontLoader, fontFamilyResolverImpl$preload$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fontFamilyResolverImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fontFamily2 = (FontFamily) fontFamilyResolverImpl$preload$1.L$1;
                    fontFamilyResolverImpl = (FontFamilyResolverImpl) fontFamilyResolverImpl$preload$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                List<Font> fonts = ((FontListFontFamily) fontFamily2).getFonts();
                ArrayList arrayList = new ArrayList(fonts.size());
                size = fonts.size();
                for (i2 = 0; i2 < size; i2++) {
                    Font font = fonts.get(i2);
                    arrayList.add(new TypefaceRequest(fontFamilyResolverImpl.platformResolveInterceptor.interceptFontFamily(fontFamily2), fontFamilyResolverImpl.platformResolveInterceptor.interceptFontWeight(font.getWeight()), fontFamilyResolverImpl.platformResolveInterceptor.mo5153interceptFontStyleT2F_aPo(font.mo5156getStyle_LCdwA()), FontSynthesis.Companion.m5217getAllGVVA2EU(), fontFamilyResolverImpl.platformFontLoader.getCacheKey(), null));
                }
                fontFamilyResolverImpl.typefaceRequestCache.preWarmCache(arrayList, new FontFamilyResolverImpl$preload$2(fontFamilyResolverImpl));
                return Unit.INSTANCE;
            }
        }
        fontFamilyResolverImpl$preload$1 = new FontFamilyResolverImpl$preload$1(this, continuation);
        Object obj2 = fontFamilyResolverImpl$preload$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fontFamilyResolverImpl$preload$1.label;
        if (i != 0) {
        }
        List<Font> fonts2 = ((FontListFontFamily) fontFamily2).getFonts();
        ArrayList arrayList2 = new ArrayList(fonts2.size());
        size = fonts2.size();
        while (i2 < size) {
        }
        fontFamilyResolverImpl.typefaceRequestCache.preWarmCache(arrayList2, new FontFamilyResolverImpl$preload$2(fontFamilyResolverImpl));
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /* renamed from: resolve-DPcqOEQ */
    public State<Object> mo5176resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.mo5153interceptFontStyleT2F_aPo(i), this.platformResolveInterceptor.mo5154interceptFontSynthesisMscr08Y(i2), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State<Object> resolve(TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new FontFamilyResolverImpl$resolve$result$1(this, typefaceRequest));
    }
}
