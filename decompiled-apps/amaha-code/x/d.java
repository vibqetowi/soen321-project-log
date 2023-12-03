package x;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import y.o;
/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public int f37347b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f37348c;

    /* renamed from: d  reason: collision with root package name */
    public final e f37349d;

    /* renamed from: e  reason: collision with root package name */
    public final a f37350e;
    public d f;

    /* renamed from: i  reason: collision with root package name */
    public v.i f37353i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f37346a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f37351g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f37352h = LinearLayoutManager.INVALID_OFFSET;

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f37349d = eVar;
        this.f37350e = aVar;
    }

    public final void a(d dVar, int i6) {
        b(dVar, i6, LinearLayoutManager.INVALID_OFFSET, false);
    }

    public final boolean b(d dVar, int i6, int i10, boolean z10) {
        if (dVar == null) {
            j();
            return true;
        } else if (!z10 && !i(dVar)) {
            return false;
        } else {
            this.f = dVar;
            if (dVar.f37346a == null) {
                dVar.f37346a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f.f37346a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f37351g = i6;
            this.f37352h = i10;
            return true;
        }
    }

    public final void c(int i6, o oVar, ArrayList arrayList) {
        HashSet<d> hashSet = this.f37346a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                y.i.a(it.next().f37349d, i6, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (!this.f37348c) {
            return 0;
        }
        return this.f37347b;
    }

    public final int e() {
        d dVar;
        if (this.f37349d.f37376j0 == 8) {
            return 0;
        }
        int i6 = this.f37352h;
        if (i6 != Integer.MIN_VALUE && (dVar = this.f) != null && dVar.f37349d.f37376j0 == 8) {
            return i6;
        }
        return this.f37351g;
    }

    public final d f() {
        a aVar = this.f37350e;
        int ordinal = aVar.ordinal();
        e eVar = this.f37349d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.M;
            case 2:
                return eVar.N;
            case 3:
                return eVar.K;
            case 4:
                return eVar.L;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final boolean g() {
        HashSet<d> hashSet = this.f37346a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public final boolean i(d dVar) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (dVar == null) {
            return false;
        }
        a aVar = a.BASELINE;
        a aVar2 = this.f37350e;
        e eVar = dVar.f37349d;
        a aVar3 = dVar.f37350e;
        if (aVar3 == aVar2) {
            if (aVar2 == aVar && (!eVar.F || !this.f37349d.F)) {
                return false;
            }
            return true;
        }
        int ordinal = aVar2.ordinal();
        a aVar4 = a.CENTER_Y;
        a aVar5 = a.RIGHT;
        a aVar6 = a.CENTER_X;
        a aVar7 = a.LEFT;
        switch (ordinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                if (aVar3 != aVar7 && aVar3 != aVar5) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (eVar instanceof h) {
                    return (z10 || aVar3 == aVar6) ? true : true;
                }
                return z10;
            case 2:
            case 4:
                if (aVar3 != a.TOP && aVar3 != a.BOTTOM) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (eVar instanceof h) {
                    return (z11 || aVar3 == aVar4) ? true : true;
                }
                return z11;
            case 5:
                if (aVar3 == aVar7 || aVar3 == aVar5) {
                    return false;
                }
                return true;
            case 6:
                if (aVar3 == aVar || aVar3 == aVar6 || aVar3 == aVar4) {
                    return false;
                }
                return true;
            default:
                throw new AssertionError(aVar2.name());
        }
    }

    public final void j() {
        HashSet<d> hashSet;
        d dVar = this.f;
        if (dVar != null && (hashSet = dVar.f37346a) != null) {
            hashSet.remove(this);
            if (this.f.f37346a.size() == 0) {
                this.f.f37346a = null;
            }
        }
        this.f37346a = null;
        this.f = null;
        this.f37351g = 0;
        this.f37352h = LinearLayoutManager.INVALID_OFFSET;
        this.f37348c = false;
        this.f37347b = 0;
    }

    public final void k() {
        v.i iVar = this.f37353i;
        if (iVar == null) {
            this.f37353i = new v.i(1);
        } else {
            iVar.h();
        }
    }

    public final void l(int i6) {
        this.f37347b = i6;
        this.f37348c = true;
    }

    public final String toString() {
        return this.f37349d.f37380l0 + ":" + this.f37350e.toString();
    }
}
