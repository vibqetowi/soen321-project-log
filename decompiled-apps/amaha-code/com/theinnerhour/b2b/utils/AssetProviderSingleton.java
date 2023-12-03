package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.graphics.Typeface;
import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: AssetProviderSingleton.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/theinnerhour/b2b/utils/AssetProviderSingleton;", "", "()V", "boldQuicksandTypeface", "Landroid/graphics/Typeface;", "boldTypeface", "mediumQuicksandTypeface", "mediumTypeface", "getTypeface", "context", "Landroid/content/Context;", "fontName", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class AssetProviderSingleton {
    public static final AssetProviderSingleton INSTANCE = new AssetProviderSingleton();
    private static Typeface boldQuicksandTypeface;
    private static Typeface boldTypeface;
    private static Typeface mediumQuicksandTypeface;
    private static Typeface mediumTypeface;

    private AssetProviderSingleton() {
    }

    public final Typeface getTypeface(Context context, String fontName) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(fontName, "fontName");
        int hashCode = fontName.hashCode();
        if (hashCode != -1569020550) {
            if (hashCode != -1206323815) {
                if (hashCode == 206117769 && fontName.equals("Quicksand-Medium.ttf")) {
                    if (mediumQuicksandTypeface == null) {
                        mediumQuicksandTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/".concat(fontName));
                    }
                    Typeface typeface = mediumQuicksandTypeface;
                    kotlin.jvm.internal.i.d(typeface);
                    return typeface;
                }
            } else if (fontName.equals("Quicksand-Bold.ttf")) {
                if (boldQuicksandTypeface == null) {
                    boldQuicksandTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/".concat(fontName));
                }
                Typeface typeface2 = boldQuicksandTypeface;
                kotlin.jvm.internal.i.d(typeface2);
                return typeface2;
            }
        } else if (fontName.equals("Lato-Bold.ttf")) {
            if (boldTypeface == null) {
                boldTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/".concat(fontName));
            }
            Typeface typeface3 = boldTypeface;
            kotlin.jvm.internal.i.d(typeface3);
            return typeface3;
        }
        if (mediumTypeface == null) {
            mediumTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/".concat(fontName));
        }
        Typeface typeface4 = mediumTypeface;
        kotlin.jvm.internal.i.d(typeface4);
        return typeface4;
    }
}
