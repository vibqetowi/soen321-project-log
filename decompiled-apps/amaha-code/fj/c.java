package fj;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Spanned;
import android.util.DisplayMetrics;
import androidx.core.graphics.drawable.IconCompat;
import hh.g;
/* compiled from: NotificationBuilder.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15064a;

    /* renamed from: b  reason: collision with root package name */
    public final ih.p f15065b;

    /* renamed from: c  reason: collision with root package name */
    public final pj.b f15066c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15067d;

    /* renamed from: e  reason: collision with root package name */
    public final Intent f15068e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final jj.d f15069g;

    public c(Context context, ih.p sdkInstance, pj.b bVar, int i6, Intent intent) {
        jj.d dVar;
        boolean z10;
        CharSequence a10;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f15064a = context;
        this.f15065b = sdkInstance;
        this.f15066c = bVar;
        this.f15067d = i6;
        this.f15068e = intent;
        this.f = "PushBase_6.6.0_NotificationBuilder";
        pj.a aVar = bVar.f28532h;
        boolean z11 = aVar.f28520d;
        qh.a aVar2 = bVar.f28528c;
        if (!z11 && !aVar.f28525j) {
            dVar = new jj.d(aVar2.f29590b, aVar2.f29591c, aVar2.f29592d);
        } else {
            Spanned a11 = r0.b.a(aVar2.f29590b, 63);
            kotlin.jvm.internal.i.f(a11, "fromHtml(\n              …COMPACT\n                )");
            Spanned a12 = r0.b.a(aVar2.f29591c, 63);
            kotlin.jvm.internal.i.f(a12, "fromHtml(\n              …COMPACT\n                )");
            String str = aVar2.f29592d;
            if (str != null && !gv.n.B0(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                a10 = "";
            } else {
                a10 = r0.b.a(str, 63);
                kotlin.jvm.internal.i.f(a10, "fromHtml(\n              …COMPACT\n                )");
            }
            dVar = new jj.d(a11, a12, a10);
        }
        this.f15069g = dVar;
    }

    public final void a(f0.t tVar) {
        String str = this.f15066c.f28529d;
        if (str == null) {
            return;
        }
        Bitmap e10 = di.b.e(str);
        IconCompat iconCompat = null;
        if (Build.VERSION.SDK_INT <= 30) {
            Context context = this.f15064a;
            kotlin.jvm.internal.i.g(context, "context");
            if (e10 == null) {
                e10 = null;
            } else if (e10.getWidth() > e10.getHeight()) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                try {
                    e10 = Bitmap.createScaledBitmap(e10, displayMetrics.widthPixels, (e10.getHeight() * displayMetrics.widthPixels) / e10.getWidth(), true);
                } catch (Throwable th2) {
                    hh.a aVar = hh.g.f17610d;
                    g.a.a(1, th2, d0.f15074u);
                }
            }
            if (e10 == null) {
                return;
            }
        }
        f0.p pVar = new f0.p();
        if (e10 != null) {
            iconCompat = new IconCompat(1);
            iconCompat.f1960b = e10;
        }
        pVar.f14654e = iconCompat;
        jj.d dVar = this.f15069g;
        pVar.f14682b = f0.t.c(dVar.f22071a);
        int i6 = Build.VERSION.SDK_INT;
        CharSequence charSequence = dVar.f22072b;
        if (i6 >= 24) {
            pVar.f14683c = f0.t.c(charSequence);
            pVar.f14684d = true;
        } else {
            CharSequence charSequence2 = dVar.f22073c;
            if (!gv.n.B0(charSequence2)) {
                pVar.f14683c = f0.t.c(charSequence2);
                pVar.f14684d = true;
            } else {
                pVar.f14683c = f0.t.c(charSequence);
                pVar.f14684d = true;
            }
        }
        tVar.j(pVar);
    }
}
