package he;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.l;
/* compiled from: Target.java */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public String f17470a;

    /* renamed from: b  reason: collision with root package name */
    public final List<x> f17471b;

    /* renamed from: c  reason: collision with root package name */
    public final List<l> f17472c;

    /* renamed from: d  reason: collision with root package name */
    public final ke.p f17473d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17474e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final e f17475g;

    /* renamed from: h  reason: collision with root package name */
    public final e f17476h;

    public d0(ke.p pVar, String str, List<l> list, List<x> list2, long j10, e eVar, e eVar2) {
        this.f17473d = pVar;
        this.f17474e = str;
        this.f17471b = list2;
        this.f17472c = list;
        this.f = j10;
        this.f17475g = eVar;
        this.f17476h = eVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r8 != 8) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<rf.s, Boolean> a(l.c cVar, e eVar) {
        boolean z10;
        int c10;
        rf.s sVar = ke.t.f23301c;
        Iterator it = d(cVar.d()).iterator();
        int i6 = 1;
        boolean z11 = true;
        while (true) {
            int i10 = -1;
            if (!it.hasNext()) {
                break;
            }
            k kVar = (k) it.next();
            rf.s sVar2 = ke.t.f23301c;
            int ordinal = kVar.f17537a.ordinal();
            rf.s sVar3 = kVar.f17538b;
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                            }
                        } else {
                            z10 = false;
                            c10 = ke.t.c(sVar, sVar3);
                            if (c10 == 0) {
                                i10 = c10;
                            } else if (!z11 || z10) {
                                if (!z11 && z10) {
                                    i10 = 1;
                                } else {
                                    i10 = 0;
                                }
                            }
                            if (i10 >= 0) {
                                sVar = sVar3;
                                z11 = z10;
                            }
                        }
                    }
                }
                sVar2 = sVar3;
            } else {
                sVar2 = ke.t.g(sVar3.i0());
            }
            sVar3 = sVar2;
            z10 = true;
            c10 = ke.t.c(sVar, sVar3);
            if (c10 == 0) {
            }
            if (i10 >= 0) {
            }
        }
        if (eVar != null) {
            int i11 = 0;
            while (true) {
                List<x> list = this.f17471b;
                if (i11 >= list.size()) {
                    break;
                } else if (list.get(i11).f17574b.equals(cVar.d())) {
                    rf.s sVar4 = eVar.f17478b.get(i11);
                    int c11 = ke.t.c(sVar, sVar4);
                    boolean z12 = eVar.f17477a;
                    if (c11 != 0) {
                        i6 = c11;
                    } else if (z11 && !z12) {
                        i6 = -1;
                    } else if (z11 || !z12) {
                        i6 = 0;
                    }
                    if (i6 < 0) {
                        sVar = sVar4;
                        z11 = z12;
                    }
                } else {
                    i11++;
                }
            }
        }
        return new Pair<>(sVar, Boolean.valueOf(z11));
    }

    public final String b() {
        boolean z10;
        String str;
        String str2;
        String str3 = this.f17470a;
        if (str3 != null) {
            return str3;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17473d.h());
        String str4 = this.f17474e;
        if (str4 != null) {
            sb2.append("|cg:");
            sb2.append(str4);
        }
        sb2.append("|f:");
        for (l lVar : this.f17472c) {
            sb2.append(lVar.a());
        }
        sb2.append("|ob:");
        Iterator<x> it = this.f17471b.iterator();
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            x next = it.next();
            sb2.append(next.f17574b.h());
            if (v.h.b(next.f17573a, 1)) {
                str2 = "asc";
            } else {
                str2 = "desc";
            }
            sb2.append(str2);
        }
        long j10 = this.f;
        if (j10 == -1) {
            z10 = false;
        }
        if (z10) {
            sb2.append("|l:");
            sb2.append(j10);
        }
        String str5 = "b:";
        e eVar = this.f17475g;
        if (eVar != null) {
            sb2.append("|lb:");
            if (eVar.f17477a) {
                str = "b:";
            } else {
                str = "a:";
            }
            sb2.append(str);
            sb2.append(eVar.b());
        }
        e eVar2 = this.f17476h;
        if (eVar2 != null) {
            sb2.append("|ub:");
            if (eVar2.f17477a) {
                str5 = "a:";
            }
            sb2.append(str5);
            sb2.append(eVar2.b());
        }
        String sb3 = sb2.toString();
        this.f17470a = sb3;
        return sb3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r10 != 8) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<rf.s, Boolean> c(l.c cVar, e eVar) {
        rf.s sVar;
        boolean z10;
        int c10;
        rf.s sVar2 = ke.t.f23303e;
        Iterator it = d(cVar.d()).iterator();
        int i6 = 1;
        boolean z11 = true;
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                k kVar = (k) it.next();
                rf.s sVar3 = ke.t.f23303e;
                int ordinal = kVar.f17537a.ordinal();
                rf.s sVar4 = kVar.f17538b;
                if (ordinal != 0) {
                    if (ordinal != i6 && ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4 || ordinal == 5) {
                                int i02 = sVar4.i0();
                                switch (v.h.d(i02)) {
                                    case 0:
                                        sVar = ke.t.g(2);
                                        break;
                                    case 1:
                                        sVar = ke.t.g(3);
                                        break;
                                    case 2:
                                    case 3:
                                        sVar = ke.t.g(5);
                                        break;
                                    case 4:
                                        sVar = ke.t.g(6);
                                        break;
                                    case 5:
                                        sVar = ke.t.g(7);
                                        break;
                                    case 6:
                                        sVar = ke.t.g(8);
                                        break;
                                    case 7:
                                        sVar = ke.t.g(9);
                                        break;
                                    case 8:
                                        sVar = ke.t.g(10);
                                        break;
                                    case 9:
                                        sVar = ke.t.g(11);
                                        break;
                                    case 10:
                                        sVar = sVar3;
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Unknown value type: ".concat(r1.b0.e(i02)));
                                }
                            }
                        }
                        sVar = sVar3;
                        z10 = true;
                        c10 = ke.t.c(sVar2, sVar);
                        if (c10 != 0) {
                            i10 = c10;
                        } else if (z11 && !z10) {
                            i10 = 1;
                        } else if (z11 || !z10) {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            sVar2 = sVar;
                            z11 = z10;
                        }
                        i6 = 1;
                    }
                    sVar = sVar4;
                    z10 = true;
                    c10 = ke.t.c(sVar2, sVar);
                    if (c10 != 0) {
                    }
                    if (i10 > 0) {
                    }
                    i6 = 1;
                } else {
                    sVar = sVar4;
                }
                z10 = false;
                c10 = ke.t.c(sVar2, sVar);
                if (c10 != 0) {
                }
                if (i10 > 0) {
                }
                i6 = 1;
            } else {
                if (eVar != null) {
                    int i11 = 0;
                    while (true) {
                        List<x> list = this.f17471b;
                        if (i11 < list.size()) {
                            if (list.get(i11).f17574b.equals(cVar.d())) {
                                rf.s sVar5 = eVar.f17478b.get(i11);
                                int c11 = ke.t.c(sVar2, sVar5);
                                boolean z12 = eVar.f17477a;
                                if (c11 == 0) {
                                    if (z11 && !z12) {
                                        c11 = 1;
                                    } else if (!z11 && z12) {
                                        c11 = -1;
                                    } else {
                                        c11 = 0;
                                    }
                                }
                                if (c11 > 0) {
                                    z11 = z12;
                                    sVar2 = sVar5;
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                return new Pair<>(sVar2, Boolean.valueOf(z11));
            }
        }
    }

    public final ArrayList d(ke.m mVar) {
        ArrayList arrayList = new ArrayList();
        for (l lVar : this.f17472c) {
            if (lVar instanceof k) {
                k kVar = (k) lVar;
                if (kVar.f17539c.equals(mVar)) {
                    arrayList.add(kVar);
                }
            }
        }
        return arrayList;
    }

    public final boolean e() {
        if (ke.i.j(this.f17473d) && this.f17474e == null && this.f17472c.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        String str = d0Var.f17474e;
        String str2 = this.f17474e;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (this.f != d0Var.f || !this.f17471b.equals(d0Var.f17471b) || !this.f17472c.equals(d0Var.f17472c) || !this.f17473d.equals(d0Var.f17473d)) {
            return false;
        }
        e eVar = d0Var.f17475g;
        e eVar2 = this.f17475g;
        if (eVar2 == null ? eVar != null : !eVar2.equals(eVar)) {
            return false;
        }
        e eVar3 = d0Var.f17476h;
        e eVar4 = this.f17476h;
        if (eVar4 != null) {
            return eVar4.equals(eVar3);
        }
        if (eVar3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int hashCode = this.f17471b.hashCode() * 31;
        int i11 = 0;
        String str = this.f17474e;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int hashCode2 = this.f17472c.hashCode();
        int hashCode3 = this.f17473d.hashCode();
        long j10 = this.f;
        int i12 = (((hashCode3 + ((hashCode2 + ((hashCode + i6) * 31)) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        e eVar = this.f17475g;
        if (eVar != null) {
            i10 = eVar.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        e eVar2 = this.f17476h;
        if (eVar2 != null) {
            i11 = eVar2.hashCode();
        }
        return i13 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Query(");
        sb2.append(this.f17473d.h());
        String str = this.f17474e;
        if (str != null) {
            sb2.append(" collectionGroup=");
            sb2.append(str);
        }
        List<l> list = this.f17472c;
        if (!list.isEmpty()) {
            sb2.append(" where ");
            for (int i6 = 0; i6 < list.size(); i6++) {
                if (i6 > 0) {
                    sb2.append(" and ");
                }
                sb2.append(list.get(i6));
            }
        }
        List<x> list2 = this.f17471b;
        if (!list2.isEmpty()) {
            sb2.append(" order by ");
            for (int i10 = 0; i10 < list2.size(); i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(list2.get(i10));
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
