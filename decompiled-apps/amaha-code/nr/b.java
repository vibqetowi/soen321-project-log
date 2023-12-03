package nr;

import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.MyApplication;
import dw.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.k;
import lv.d0;
import lv.s;
import lv.u;
import lv.x;
import qv.f;
import sf.b;
import sf.i;
import sf.r;
import sf.s;
import uf.h;
import xf.d;
/* compiled from: RetrofitBuilder.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final i f26767a;

    /* renamed from: b  reason: collision with root package name */
    public static final hs.i f26768b;

    /* renamed from: c  reason: collision with root package name */
    public static final hs.i f26769c;

    /* renamed from: d  reason: collision with root package name */
    public static final nr.a f26770d;

    /* compiled from: RetrofitBuilder.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<a0> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f26771u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final a0 invoke() {
            a0.b bVar = new a0.b();
            bVar.a();
            i iVar = b.f26767a;
            if (iVar != null) {
                bVar.f13545d.add(new ew.a(iVar));
                x.a aVar = c.f26774b;
                aVar.getClass();
                bVar.f13543b = new x(aVar);
                return bVar.b();
            }
            throw new NullPointerException("gson == null");
        }
    }

    /* compiled from: RetrofitBuilder.kt */
    /* renamed from: nr.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0439b extends k implements ss.a<a0> {

        /* renamed from: u  reason: collision with root package name */
        public static final C0439b f26772u = new C0439b();

        public C0439b() {
            super(0);
        }

        @Override // ss.a
        public final a0 invoke() {
            a0.b bVar = new a0.b();
            bVar.a();
            i iVar = b.f26767a;
            if (iVar != null) {
                bVar.f13545d.add(new ew.a(iVar));
                x.a aVar = c.f26774b;
                nr.a interceptor = b.f26770d;
                aVar.getClass();
                kotlin.jvm.internal.i.g(interceptor, "interceptor");
                aVar.f24729d.add(interceptor);
                aVar.f24735k = (lv.c) MyApplication.V.a().L.getValue();
                bVar.f13543b = new x(aVar);
                return bVar.b();
            }
            throw new NullPointerException("gson == null");
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [nr.a] */
    static {
        h hVar = h.f34062z;
        r.a aVar = r.f31513u;
        b.a aVar2 = sf.b.f31491u;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TypeToken<?> typeToken = i.f31495n;
        s.a aVar3 = s.f31515u;
        s.b bVar = s.f31516v;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z10 = d.f37756a;
        f26767a = new i(hVar, aVar2, hashMap, true, true, true, aVar, arrayList, arrayList2, arrayList3, aVar3, bVar);
        f26768b = sp.b.O(a.f26771u);
        f26769c = sp.b.O(C0439b.f26772u);
        f26770d = new u() { // from class: nr.a
            @Override // lv.u
            public final d0 a(f fVar) {
                d0.a aVar4 = new d0.a(fVar.c(fVar.f30150e));
                s.a aVar5 = aVar4.f;
                aVar5.getClass();
                s.b.a("Cache-Control");
                s.b.b("public, max-age=864000", "Cache-Control");
                aVar5.f("Cache-Control");
                aVar5.c("Cache-Control", "public, max-age=864000");
                aVar4.f.f("Pragma");
                return aVar4.a();
            }
        };
    }

    public static Object a(Class cls) {
        return ((a0) f26768b.getValue()).b(cls);
    }
}
