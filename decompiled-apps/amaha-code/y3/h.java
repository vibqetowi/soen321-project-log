package y3;

import androidx.recyclerview.widget.k;
import fv.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.d0;
import org.json.JSONArray;
import org.json.JSONException;
import ss.p;
import ss.q;
import ta.v;
/* compiled from: FileResponseHandler.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final f f38229a;

    /* renamed from: b  reason: collision with root package name */
    public final w3.f f38230b;

    /* renamed from: c  reason: collision with root package name */
    public final u3.e f38231c;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f38232d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f38233e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f38234g;

    /* compiled from: FileResponseHandler.kt */
    @ns.e(c = "com.amplitude.core.utilities.FileResponseHandler$handleBadRequestResponse$3", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        public a(ls.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            h hVar = h.this;
            hVar.f38229a.k(hVar.f);
            return hs.k.f19476a;
        }
    }

    /* compiled from: FileResponseHandler.kt */
    @ns.e(c = "com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$1", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        public b(ls.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            h hVar = h.this;
            hVar.f38229a.k(hVar.f);
            return hs.k.f19476a;
        }
    }

    /* compiled from: FileResponseHandler.kt */
    @ns.e(c = "com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$2", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ JSONArray f38238v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONArray jSONArray, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f38238v = jSONArray;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new c(this.f38238v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            h hVar = h.this;
            hVar.f38229a.e(hVar.f, this.f38238v);
            return hs.k.f19476a;
        }
    }

    /* compiled from: FileResponseHandler.kt */
    @ns.e(c = "com.amplitude.core.utilities.FileResponseHandler$handleSuccessResponse$1", f = "FileResponseHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        public d(ls.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            h hVar = h.this;
            hVar.f38229a.k(hVar.f);
            return hs.k.f19476a;
        }
    }

    public h(f storage, w3.f fVar, u3.e configuration, d0 scope, a0 dispatcher, String eventFilePath, String eventsString) {
        kotlin.jvm.internal.i.g(storage, "storage");
        kotlin.jvm.internal.i.g(configuration, "configuration");
        kotlin.jvm.internal.i.g(scope, "scope");
        kotlin.jvm.internal.i.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.g(eventFilePath, "eventFilePath");
        kotlin.jvm.internal.i.g(eventsString, "eventsString");
        this.f38229a = storage;
        this.f38230b = fVar;
        this.f38231c = configuration;
        this.f38232d = scope;
        this.f38233e = dispatcher;
        this.f = eventFilePath;
        this.f38234g = eventsString;
    }

    public final void a(l lVar) {
        if (lVar instanceof m) {
            d((m) lVar);
        } else if (lVar instanceof y3.b) {
            b((y3.b) lVar);
        } else if (lVar instanceof k) {
            c((k) lVar);
        } else if (lVar instanceof o) {
            o oVar = (o) lVar;
        } else if (lVar instanceof n) {
            n nVar = (n) lVar;
        } else {
            g gVar = (g) lVar;
        }
    }

    public final void b(y3.b bVar) {
        boolean contains;
        String str = this.f;
        f fVar = this.f38229a;
        String str2 = this.f38234g;
        try {
            ArrayList f02 = sc.b.f0(new JSONArray(str2));
            int size = f02.size();
            String str3 = bVar.f38193a;
            if (size == 1) {
                f(400, str3, f02);
                fVar.k(str);
                return;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(bVar.f38194b);
            linkedHashSet.addAll(bVar.f38195c);
            linkedHashSet.addAll(bVar.f38196d);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = f02.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i10 = i6 + 1;
                if (i6 >= 0) {
                    v3.a event = (v3.a) next;
                    if (!linkedHashSet.contains(Integer.valueOf(i6))) {
                        kotlin.jvm.internal.i.g(event, "event");
                        String str4 = event.f34777b;
                        if (str4 == null) {
                            contains = false;
                        } else {
                            contains = bVar.f38197e.contains(str4);
                        }
                        if (!contains) {
                            arrayList2.add(event);
                            i6 = i10;
                        }
                    }
                    arrayList.add(event);
                    i6 = i10;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
            f(400, str3, arrayList);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                v3.a event2 = (v3.a) it2.next();
                w3.f fVar2 = this.f38230b;
                fVar2.getClass();
                kotlin.jvm.internal.i.g(event2, "event");
                fVar2.f36376b.q(new w3.k(1, event2));
            }
            v.H(this.f38232d, this.f38233e, 0, new a(null), 2);
        } catch (JSONException e10) {
            fVar.k(str);
            e(str2);
            throw e10;
        }
    }

    public final void c(k kVar) {
        String str = this.f38234g;
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            a0 a0Var = this.f38233e;
            d0 d0Var = this.f38232d;
            if (length == 1) {
                f(413, kVar.f38241a, sc.b.f0(jSONArray));
                v.H(d0Var, a0Var, 0, new b(null), 2);
                return;
            }
            v.H(d0Var, a0Var, 0, new c(jSONArray, null), 2);
        } catch (JSONException e10) {
            this.f38229a.k(this.f);
            e(str);
            throw e10;
        }
    }

    public final void d(m mVar) {
        String str = this.f38234g;
        try {
            f(k.d.DEFAULT_DRAG_ANIMATION_DURATION, "Event sent success.", sc.b.f0(new JSONArray(str)));
            v.H(this.f38232d, this.f38233e, 0, new d(null), 2);
        } catch (JSONException e10) {
            this.f38229a.k(this.f);
            e(str);
            throw e10;
        }
    }

    public final void e(String input) {
        gv.e eVar = new gv.e("\"insert_id\":\"(.{36})\",");
        kotlin.jvm.internal.i.g(input, "input");
        if (input.length() >= 0) {
            gv.f fVar = new gv.f(eVar, input, 0);
            gv.g nextFunction = gv.g.f16951u;
            kotlin.jvm.internal.i.g(nextFunction, "nextFunction");
            g.a aVar = new g.a(new fv.g(fVar, nextFunction));
            while (aVar.hasNext()) {
                this.f38229a.d(((gv.c) aVar.next()).a().get(1));
            }
            return;
        }
        StringBuilder u10 = defpackage.c.u("Start index out of bounds: ", 0, ", input length: ");
        u10.append(input.length());
        throw new IndexOutOfBoundsException(u10.toString());
    }

    public final void f(int i6, String str, ArrayList arrayList) {
        f fVar;
        q<v3.a, Integer, String, hs.k> i10;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v3.a aVar = (v3.a) it.next();
            q<v3.a, Integer, String, hs.k> a10 = this.f38231c.a();
            if (a10 != null) {
                a10.invoke(aVar, Integer.valueOf(i6), str);
            }
            String str2 = aVar.f;
            if (str2 != null && (i10 = (fVar = this.f38229a).i(str2)) != null) {
                i10.invoke(aVar, Integer.valueOf(i6), str);
                fVar.d(str2);
            }
        }
    }
}
