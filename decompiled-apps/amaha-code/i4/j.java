package i4;

import i4.e;
import java.io.InputStream;
import r4.p;
/* compiled from: InputStreamRewinder.java */
/* loaded from: classes.dex */
public final class j implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final p f19823a;

    /* compiled from: InputStreamRewinder.java */
    /* loaded from: classes.dex */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final l4.b f19824a;

        public a(l4.b bVar) {
            this.f19824a = bVar;
        }

        @Override // i4.e.a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // i4.e.a
        public final e<InputStream> b(InputStream inputStream) {
            return new j(inputStream, this.f19824a);
        }
    }

    public j(InputStream inputStream, l4.b bVar) {
        p pVar = new p(inputStream, bVar);
        this.f19823a = pVar;
        pVar.mark(5242880);
    }

    @Override // i4.e
    public final InputStream a() {
        p pVar = this.f19823a;
        pVar.reset();
        return pVar;
    }

    @Override // i4.e
    public final void b() {
        this.f19823a.e();
    }
}
