package o4;

import java.util.Collections;
import java.util.List;
/* compiled from: ModelLoader.java */
/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final h4.e f27079a;

        /* renamed from: b  reason: collision with root package name */
        public final List<h4.e> f27080b;

        /* renamed from: c  reason: collision with root package name */
        public final i4.d<Data> f27081c;

        public a() {
            throw null;
        }

        public a(h4.e eVar, i4.d<Data> dVar) {
            List<h4.e> emptyList = Collections.emptyList();
            kc.f.p(eVar);
            this.f27079a = eVar;
            kc.f.p(emptyList);
            this.f27080b = emptyList;
            kc.f.p(dVar);
            this.f27081c = dVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i6, int i10, h4.g gVar);
}
