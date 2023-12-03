package r4;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import r4.i;
import r4.o;
/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes.dex */
public final class r implements h4.i<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final i f30437a;

    /* renamed from: b  reason: collision with root package name */
    public final l4.b f30438b;

    /* compiled from: StreamBitmapDecoder.java */
    /* loaded from: classes.dex */
    public static class a implements i.b {

        /* renamed from: a  reason: collision with root package name */
        public final p f30439a;

        /* renamed from: b  reason: collision with root package name */
        public final d5.d f30440b;

        public a(p pVar, d5.d dVar) {
            this.f30439a = pVar;
            this.f30440b = dVar;
        }

        @Override // r4.i.b
        public final void a(Bitmap bitmap, l4.d dVar) {
            IOException iOException = this.f30440b.f12188v;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.d(bitmap);
                }
                throw iOException;
            }
        }

        @Override // r4.i.b
        public final void b() {
            p pVar = this.f30439a;
            synchronized (pVar) {
                pVar.f30431w = pVar.f30429u.length;
            }
        }
    }

    public r(i iVar, l4.b bVar) {
        this.f30437a = iVar;
        this.f30438b = bVar;
    }

    @Override // h4.i
    public final boolean a(InputStream inputStream, h4.g gVar) {
        this.f30437a.getClass();
        return true;
    }

    @Override // h4.i
    public final k4.v<Bitmap> b(InputStream inputStream, int i6, int i10, h4.g gVar) {
        p pVar;
        boolean z10;
        d5.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof p) {
            pVar = (p) inputStream2;
            z10 = false;
        } else {
            pVar = new p(inputStream2, this.f30438b);
            z10 = true;
        }
        ArrayDeque arrayDeque = d5.d.f12186w;
        synchronized (arrayDeque) {
            dVar = (d5.d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new d5.d();
        }
        dVar.f12187u = pVar;
        d5.h hVar = new d5.h(dVar);
        a aVar = new a(pVar, dVar);
        try {
            i iVar = this.f30437a;
            return iVar.a(new o.a(iVar.f30410c, hVar, iVar.f30411d), i6, i10, gVar, aVar);
        } finally {
            dVar.a();
            if (z10) {
                pVar.e();
            }
        }
    }
}
