package e3;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.l;
import java.util.HashMap;
import m3.c;
/* compiled from: FontAssetManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f13732d;

    /* renamed from: a  reason: collision with root package name */
    public final l f13729a = new l(3, 0);

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f13730b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f13731c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final String f13733e = ".ttf";

    public a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f13732d = null;
            return;
        }
        this.f13732d = ((View) callback).getContext().getAssets();
    }
}
