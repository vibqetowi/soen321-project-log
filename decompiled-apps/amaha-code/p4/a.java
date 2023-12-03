package p4;

import h4.g;
import i4.i;
import java.io.InputStream;
import java.util.ArrayDeque;
import o4.l;
import o4.m;
import o4.n;
import o4.o;
import o4.r;
/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes.dex */
public final class a implements n<o4.f, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final h4.f<Integer> f27881b = h4.f.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final m<o4.f, o4.f> f27882a;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: p4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0466a implements o<o4.f, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final m<o4.f, o4.f> f27883a = new m<>();

        @Override // o4.o
        public final n<o4.f, InputStream> b(r rVar) {
            return new a(this.f27883a);
        }
    }

    public a(m<o4.f, o4.f> mVar) {
        this.f27882a = mVar;
    }

    @Override // o4.n
    public final /* bridge */ /* synthetic */ boolean a(o4.f fVar) {
        return true;
    }

    @Override // o4.n
    public final n.a<InputStream> b(o4.f fVar, int i6, int i10, g gVar) {
        o4.f fVar2 = fVar;
        m<o4.f, o4.f> mVar = this.f27882a;
        if (mVar != null) {
            m.a a10 = m.a.a(fVar2);
            l lVar = mVar.f27074a;
            Object a11 = lVar.a(a10);
            ArrayDeque arrayDeque = m.a.f27075d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            o4.f fVar3 = (o4.f) a11;
            if (fVar3 == null) {
                lVar.d(m.a.a(fVar2), fVar2);
            } else {
                fVar2 = fVar3;
            }
        }
        return new n.a<>(fVar2, new i(fVar2, ((Integer) gVar.c(f27881b)).intValue()));
    }
}
