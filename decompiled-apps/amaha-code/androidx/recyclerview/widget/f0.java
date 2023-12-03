package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final t.h<RecyclerView.c0, a> f2938a = new t.h<>();

    /* renamed from: b  reason: collision with root package name */
    public final t.e<RecyclerView.c0> f2939b = new t.e<>();

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final v.e f2940d = new v.e(20, 1);

        /* renamed from: a  reason: collision with root package name */
        public int f2941a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.j.c f2942b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.j.c f2943c;

        public static a a() {
            a aVar = (a) f2940d.b();
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }
    }

    public final void a(RecyclerView.c0 c0Var, RecyclerView.j.c cVar) {
        t.h<RecyclerView.c0, a> hVar = this.f2938a;
        a orDefault = hVar.getOrDefault(c0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            hVar.put(c0Var, orDefault);
        }
        orDefault.f2943c = cVar;
        orDefault.f2941a |= 8;
    }

    public final RecyclerView.j.c b(RecyclerView.c0 c0Var, int i6) {
        a m10;
        RecyclerView.j.c cVar;
        t.h<RecyclerView.c0, a> hVar = this.f2938a;
        int f = hVar.f(c0Var);
        if (f >= 0 && (m10 = hVar.m(f)) != null) {
            int i10 = m10.f2941a;
            if ((i10 & i6) != 0) {
                int i11 = i10 & (~i6);
                m10.f2941a = i11;
                if (i6 == 4) {
                    cVar = m10.f2942b;
                } else if (i6 == 8) {
                    cVar = m10.f2943c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    hVar.k(f);
                    m10.f2941a = 0;
                    m10.f2942b = null;
                    m10.f2943c = null;
                    a.f2940d.a(m10);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.c0 c0Var) {
        a orDefault = this.f2938a.getOrDefault(c0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f2941a &= -2;
    }

    public final void d(RecyclerView.c0 c0Var) {
        t.e<RecyclerView.c0> eVar = this.f2939b;
        int j10 = eVar.j() - 1;
        while (true) {
            if (j10 < 0) {
                break;
            } else if (c0Var == eVar.k(j10)) {
                Object[] objArr = eVar.f32233w;
                Object obj = objArr[j10];
                Object obj2 = t.e.f32230y;
                if (obj != obj2) {
                    objArr[j10] = obj2;
                    eVar.f32231u = true;
                }
            } else {
                j10--;
            }
        }
        a remove = this.f2938a.remove(c0Var);
        if (remove != null) {
            remove.f2941a = 0;
            remove.f2942b = null;
            remove.f2943c = null;
            a.f2940d.a(remove);
        }
    }
}
