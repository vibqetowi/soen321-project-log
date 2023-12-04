package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "kotlin.jvm.PlatformType", "awaitLoad", "Landroid/graphics/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public android.graphics.Typeface loadBlocking(Font font) {
        Object m7271constructorimpl;
        android.graphics.Typeface typeface;
        android.graphics.Typeface load;
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return typefaceLoader.loadBlocking(context, androidFont);
        }
        if (font instanceof ResourceFont) {
            int mo5146getLoadingStrategyPKNRLFQ = font.mo5146getLoadingStrategyPKNRLFQ();
            if (FontLoadingStrategy.m5189equalsimpl0(mo5146getLoadingStrategyPKNRLFQ, FontLoadingStrategy.Companion.m5194getBlockingPKNRLFQ())) {
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                typeface = AndroidFontLoader_androidKt.load((ResourceFont) font, context2);
            } else if (FontLoadingStrategy.m5189equalsimpl0(mo5146getLoadingStrategyPKNRLFQ, FontLoadingStrategy.Companion.m5195getOptionalLocalPKNRLFQ())) {
                try {
                    Result.Companion companion = Result.Companion;
                    AndroidFontLoader androidFontLoader = this;
                    Context context3 = this.context;
                    Intrinsics.checkNotNullExpressionValue(context3, "context");
                    load = AndroidFontLoader_androidKt.load((ResourceFont) font, context3);
                    m7271constructorimpl = Result.m7271constructorimpl(load);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                }
                typeface = Result.m7277isFailureimpl(m7271constructorimpl) ? null : m7271constructorimpl;
            } else if (FontLoadingStrategy.m5189equalsimpl0(mo5146getLoadingStrategyPKNRLFQ, FontLoadingStrategy.Companion.m5193getAsyncPKNRLFQ())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            } else {
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m5191toStringimpl(font.mo5146getLoadingStrategyPKNRLFQ())));
            }
            FontVariation.Settings variationSettings = ((ResourceFont) font).getVariationSettings();
            Context context4 = this.context;
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            return PlatformTypefacesKt.setFontVariationSettings(typeface, variationSettings, context4);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitLoad(Font font, Continuation<? super android.graphics.Typeface> continuation) {
        AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        int i;
        AndroidFontLoader androidFontLoader;
        if (continuation instanceof AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1) continuation;
            if ((androidFontLoader$awaitLoad$1.label & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.label -= Integer.MIN_VALUE;
                Object obj = androidFontLoader$awaitLoad$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidFontLoader$awaitLoad$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        font = (Font) androidFontLoader$awaitLoad$1.L$1;
                        androidFontLoader = (AndroidFontLoader) androidFontLoader$awaitLoad$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        FontVariation.Settings variationSettings = ((ResourceFont) font).getVariationSettings();
                        Context context = androidFontLoader.context;
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        return PlatformTypefacesKt.setFontVariationSettings((android.graphics.Typeface) obj, variationSettings, context);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
                if (font instanceof AndroidFont) {
                    AndroidFont androidFont = (AndroidFont) font;
                    AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
                    Context context2 = this.context;
                    Intrinsics.checkNotNullExpressionValue(context2, "context");
                    androidFontLoader$awaitLoad$1.label = 1;
                    obj = typefaceLoader.awaitLoad(context2, androidFont, androidFontLoader$awaitLoad$1);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                } else if (font instanceof ResourceFont) {
                    Context context3 = this.context;
                    Intrinsics.checkNotNullExpressionValue(context3, "context");
                    androidFontLoader$awaitLoad$1.L$0 = this;
                    androidFontLoader$awaitLoad$1.L$1 = font;
                    androidFontLoader$awaitLoad$1.label = 2;
                    obj = AndroidFontLoader_androidKt.loadAsync((ResourceFont) font, context3, androidFontLoader$awaitLoad$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidFontLoader = this;
                    FontVariation.Settings variationSettings2 = ((ResourceFont) font).getVariationSettings();
                    Context context4 = androidFontLoader.context;
                    Intrinsics.checkNotNullExpressionValue(context4, "context");
                    return PlatformTypefacesKt.setFontVariationSettings((android.graphics.Typeface) obj, variationSettings2, context4);
                } else {
                    throw new IllegalArgumentException("Unknown font type: " + font);
                }
            }
        }
        androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, continuation);
        Object obj2 = androidFontLoader$awaitLoad$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidFontLoader$awaitLoad$1.label;
        if (i == 0) {
        }
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
