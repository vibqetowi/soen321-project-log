package h2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import h2.k;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class p extends k {
    public int T;
    public ArrayList<k> R = new ArrayList<>();
    public boolean S = true;
    public boolean U = false;
    public int V = 0;

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f17063a;

        public a(k kVar) {
            this.f17063a = kVar;
        }

        @Override // h2.k.d
        public final void c(k kVar) {
            this.f17063a.B();
            kVar.y(this);
        }
    }

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        public final p f17064a;

        public b(p pVar) {
            this.f17064a = pVar;
        }

        @Override // h2.n, h2.k.d
        public final void a(k kVar) {
            p pVar = this.f17064a;
            if (!pVar.U) {
                pVar.J();
                pVar.U = true;
            }
        }

        @Override // h2.k.d
        public final void c(k kVar) {
            p pVar = this.f17064a;
            int i6 = pVar.T - 1;
            pVar.T = i6;
            if (i6 == 0) {
                pVar.U = false;
                pVar.n();
            }
            kVar.y(this);
        }
    }

    @Override // h2.k
    public final void A(ViewGroup viewGroup) {
        super.A(viewGroup);
        int size = this.R.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.R.get(i6).A(viewGroup);
        }
    }

    @Override // h2.k
    public final void B() {
        if (this.R.isEmpty()) {
            J();
            n();
            return;
        }
        b bVar = new b(this);
        Iterator<k> it = this.R.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.T = this.R.size();
        if (!this.S) {
            for (int i6 = 1; i6 < this.R.size(); i6++) {
                this.R.get(i6 - 1).a(new a(this.R.get(i6)));
            }
            k kVar = this.R.get(0);
            if (kVar != null) {
                kVar.B();
                return;
            }
            return;
        }
        Iterator<k> it2 = this.R.iterator();
        while (it2.hasNext()) {
            it2.next().B();
        }
    }

    @Override // h2.k
    public final void D(k.c cVar) {
        this.M = cVar;
        this.V |= 8;
        int size = this.R.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.R.get(i6).D(cVar);
        }
    }

    @Override // h2.k
    public final void F(com.android.volley.toolbox.a aVar) {
        super.F(aVar);
        this.V |= 4;
        if (this.R != null) {
            for (int i6 = 0; i6 < this.R.size(); i6++) {
                this.R.get(i6).F(aVar);
            }
        }
    }

    @Override // h2.k
    public final void G() {
        this.V |= 2;
        int size = this.R.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.R.get(i6).G();
        }
    }

    @Override // h2.k
    public final void H(long j10) {
        this.f17043v = j10;
    }

    @Override // h2.k
    public final String K(String str) {
        String K = super.K(str);
        for (int i6 = 0; i6 < this.R.size(); i6++) {
            StringBuilder d10 = v.g.d(K, "\n");
            d10.append(this.R.get(i6).K(str + "  "));
            K = d10.toString();
        }
        return K;
    }

    public final void L(k kVar) {
        this.R.add(kVar);
        kVar.C = this;
        long j10 = this.f17044w;
        if (j10 >= 0) {
            kVar.C(j10);
        }
        if ((this.V & 1) != 0) {
            kVar.E(this.f17045x);
        }
        if ((this.V & 2) != 0) {
            kVar.G();
        }
        if ((this.V & 4) != 0) {
            kVar.F(this.N);
        }
        if ((this.V & 8) != 0) {
            kVar.D(this.M);
        }
    }

    @Override // h2.k
    /* renamed from: M */
    public final void C(long j10) {
        ArrayList<k> arrayList;
        this.f17044w = j10;
        if (j10 >= 0 && (arrayList = this.R) != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.R.get(i6).C(j10);
            }
        }
    }

    @Override // h2.k
    /* renamed from: N */
    public final void E(TimeInterpolator timeInterpolator) {
        this.V |= 1;
        ArrayList<k> arrayList = this.R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.R.get(i6).E(timeInterpolator);
            }
        }
        this.f17045x = timeInterpolator;
    }

    public final void P(int i6) {
        if (i6 != 0) {
            if (i6 == 1) {
                this.S = false;
                return;
            }
            throw new AndroidRuntimeException(defpackage.c.p("Invalid parameter for TransitionSet ordering: ", i6));
        }
        this.S = true;
    }

    @Override // h2.k
    public final void a(k.d dVar) {
        super.a(dVar);
    }

    @Override // h2.k
    public final void b(View view) {
        for (int i6 = 0; i6 < this.R.size(); i6++) {
            this.R.get(i6).b(view);
        }
        this.f17047z.add(view);
    }

    @Override // h2.k
    public final void cancel() {
        super.cancel();
        int size = this.R.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.R.get(i6).cancel();
        }
    }

    @Override // h2.k
    public final void d(r rVar) {
        View view = rVar.f17069b;
        if (v(view)) {
            Iterator<k> it = this.R.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next.v(view)) {
                    next.d(rVar);
                    rVar.f17070c.add(next);
                }
            }
        }
    }

    @Override // h2.k
    public final void f(r rVar) {
        int size = this.R.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.R.get(i6).f(rVar);
        }
    }

    @Override // h2.k
    public final void h(r rVar) {
        View view = rVar.f17069b;
        if (v(view)) {
            Iterator<k> it = this.R.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next.v(view)) {
                    next.h(rVar);
                    rVar.f17070c.add(next);
                }
            }
        }
    }

    @Override // h2.k
    /* renamed from: k */
    public final k clone() {
        p pVar = (p) super.clone();
        pVar.R = new ArrayList<>();
        int size = this.R.size();
        for (int i6 = 0; i6 < size; i6++) {
            k clone = this.R.get(i6).clone();
            pVar.R.add(clone);
            clone.C = pVar;
        }
        return pVar;
    }

    @Override // h2.k
    public final void m(ViewGroup viewGroup, v.c cVar, v.c cVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        long j10 = this.f17043v;
        int size = this.R.size();
        for (int i6 = 0; i6 < size; i6++) {
            k kVar = this.R.get(i6);
            if (j10 > 0 && (this.S || i6 == 0)) {
                long j11 = kVar.f17043v;
                if (j11 > 0) {
                    kVar.H(j11 + j10);
                } else {
                    kVar.H(j10);
                }
            }
            kVar.m(viewGroup, cVar, cVar2, arrayList, arrayList2);
        }
    }

    @Override // h2.k
    public final void x(View view) {
        super.x(view);
        int size = this.R.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.R.get(i6).x(view);
        }
    }

    @Override // h2.k
    public final void y(k.d dVar) {
        super.y(dVar);
    }

    @Override // h2.k
    public final void z(View view) {
        for (int i6 = 0; i6 < this.R.size(); i6++) {
            this.R.get(i6).z(view);
        }
        this.f17047z.remove(view);
    }
}
