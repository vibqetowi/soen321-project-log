package e3;

import a3.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import m3.c;
/* compiled from: ImageAssetManager.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f13734d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f13735a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13736b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, l> f13737c;

    public b(Drawable.Callback callback, String str, Map map) {
        this.f13736b = str;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f13736b = str.concat("/");
        }
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f13737c = new HashMap();
            this.f13735a = null;
            return;
        }
        this.f13735a = ((View) callback).getContext();
        this.f13737c = map;
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (f13734d) {
            this.f13737c.get(str).f243d = bitmap;
        }
    }
}
