package yt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import yt.o;
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ yt.a<Object, Object> f38999a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HashMap<r, List<Object>> f39000b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f39001c;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes2.dex */
    public final class a extends C0660b {
        public a(r rVar) {
            super(rVar);
        }

        public final h c(int i6, fu.b bVar, mt.a aVar) {
            r signature = this.f39003a;
            kotlin.jvm.internal.i.g(signature, "signature");
            r rVar = new r(signature.f39056a + '@' + i6);
            b bVar2 = b.this;
            List<Object> list = bVar2.f39000b.get(rVar);
            if (list == null) {
                list = new ArrayList<>();
                bVar2.f39000b.put(rVar, list);
            }
            return bVar2.f38999a.r(bVar, aVar, list);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: yt.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0660b implements o.c {

        /* renamed from: a  reason: collision with root package name */
        public final r f39003a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<Object> f39004b = new ArrayList<>();

        public C0660b(r rVar) {
            this.f39003a = rVar;
        }

        @Override // yt.o.c
        public final void a() {
            ArrayList<Object> arrayList = this.f39004b;
            if (!arrayList.isEmpty()) {
                b.this.f39000b.put(this.f39003a, arrayList);
            }
        }

        @Override // yt.o.c
        public final o.a b(fu.b bVar, mt.a aVar) {
            return b.this.f38999a.r(bVar, aVar, this.f39004b);
        }
    }

    public b(yt.a aVar, HashMap hashMap, o oVar, HashMap hashMap2) {
        this.f38999a = aVar;
        this.f39000b = hashMap;
        this.f39001c = oVar;
    }

    public final C0660b a(fu.e eVar, String desc) {
        kotlin.jvm.internal.i.g(desc, "desc");
        String f = eVar.f();
        kotlin.jvm.internal.i.f(f, "name.asString()");
        return new C0660b(new r(f + '#' + desc));
    }

    public final a b(fu.e name, String str) {
        kotlin.jvm.internal.i.g(name, "name");
        String f = name.f();
        kotlin.jvm.internal.i.f(f, "name.asString()");
        return new a(new r(f.concat(str)));
    }
}
