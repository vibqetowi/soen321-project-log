package r0;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
/* compiled from: HtmlCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: HtmlCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Spanned a(String str, int i6) {
            Spanned fromHtml;
            fromHtml = Html.fromHtml(str, i6);
            return fromHtml;
        }

        public static Spanned b(String str, int i6, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            Spanned fromHtml;
            fromHtml = Html.fromHtml(str, i6, imageGetter, tagHandler);
            return fromHtml;
        }

        public static String c(Spanned spanned, int i6) {
            String html;
            html = Html.toHtml(spanned, i6);
            return html;
        }
    }

    public static Spanned a(String str, int i6) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(str, i6);
        }
        return Html.fromHtml(str);
    }
}
