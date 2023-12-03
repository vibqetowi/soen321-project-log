package r4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: classes.dex */
public final class a implements h4.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30383a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final h4.i f30384b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f30385c;

    public a(t4.d dVar, l4.d dVar2) {
        this.f30384b = dVar;
        this.f30385c = dVar2;
    }

    @Override // h4.i
    public final boolean a(Object obj, h4.g gVar) {
        switch (this.f30383a) {
            case 0:
                return this.f30384b.a(obj, gVar);
            default:
                return "android.resource".equals(((Uri) obj).getScheme());
        }
    }

    @Override // h4.i
    public final k4.v b(Object obj, int i6, int i10, h4.g gVar) {
        int i11 = this.f30383a;
        Object obj2 = this.f30385c;
        h4.i iVar = this.f30384b;
        switch (i11) {
            case 0:
                k4.v b10 = iVar.b(obj, i6, i10, gVar);
                Resources resources = (Resources) obj2;
                if (b10 == null) {
                    return null;
                }
                return new c(resources, b10);
            default:
                k4.v c10 = ((t4.d) iVar).c((Uri) obj);
                if (c10 == null) {
                    return null;
                }
                return j.a((l4.d) obj2, (Drawable) ((t4.b) c10).get(), i6, i10);
        }
    }

    public a(Resources resources, h4.i iVar) {
        this.f30385c = resources;
        this.f30384b = iVar;
    }
}
