package androidx.recyclerview.widget;

import androidx.recyclerview.widget.s;
import java.util.ArrayList;
/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public final class a implements s.a {

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0037a f2873d;

    /* renamed from: a  reason: collision with root package name */
    public final v.e f2870a = new v.e(30, 1);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f2871b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2872c = new ArrayList<>();
    public int f = 0;

    /* renamed from: e  reason: collision with root package name */
    public final s f2874e = new s(this);

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0037a {
    }

    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2875a;

        /* renamed from: b  reason: collision with root package name */
        public int f2876b;

        /* renamed from: c  reason: collision with root package name */
        public Object f2877c;

        /* renamed from: d  reason: collision with root package name */
        public int f2878d;

        public b(Object obj, int i6, int i10, int i11) {
            this.f2875a = i6;
            this.f2876b = i10;
            this.f2878d = i11;
            this.f2877c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i6 = this.f2875a;
            if (i6 != bVar.f2875a) {
                return false;
            }
            if (i6 == 8 && Math.abs(this.f2878d - this.f2876b) == 1 && this.f2878d == bVar.f2876b && this.f2876b == bVar.f2878d) {
                return true;
            }
            if (this.f2878d != bVar.f2878d || this.f2876b != bVar.f2876b) {
                return false;
            }
            Object obj2 = this.f2877c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f2877c)) {
                    return false;
                }
            } else if (bVar.f2877c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f2875a * 31) + this.f2876b) * 31) + this.f2878d;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i6 = this.f2875a;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 4) {
                        if (i6 != 8) {
                            str = "??";
                        } else {
                            str = "mv";
                        }
                    } else {
                        str = "up";
                    }
                } else {
                    str = "rm";
                }
            } else {
                str = "add";
            }
            sb2.append(str);
            sb2.append(",s:");
            sb2.append(this.f2876b);
            sb2.append("c:");
            sb2.append(this.f2878d);
            sb2.append(",p:");
            sb2.append(this.f2877c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public a(y yVar) {
        this.f2873d = yVar;
    }

    public final boolean a(int i6) {
        ArrayList<b> arrayList = this.f2872c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = arrayList.get(i10);
            int i11 = bVar.f2875a;
            if (i11 == 8) {
                if (f(bVar.f2878d, i10 + 1) == i6) {
                    return true;
                }
            } else if (i11 == 1) {
                int i12 = bVar.f2876b;
                int i13 = bVar.f2878d + i12;
                while (i12 < i13) {
                    if (f(i12, i10 + 1) == i6) {
                        return true;
                    }
                    i12++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.f2872c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((y) this.f2873d).a(arrayList.get(i6));
        }
        l(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f2871b;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = arrayList.get(i6);
            int i10 = bVar.f2875a;
            InterfaceC0037a interfaceC0037a = this.f2873d;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            y yVar = (y) interfaceC0037a;
                            yVar.a(bVar);
                            yVar.e(bVar.f2876b, bVar.f2878d);
                        }
                    } else {
                        y yVar2 = (y) interfaceC0037a;
                        yVar2.a(bVar);
                        yVar2.c(bVar.f2876b, bVar.f2878d, bVar.f2877c);
                    }
                } else {
                    y yVar3 = (y) interfaceC0037a;
                    yVar3.a(bVar);
                    int i11 = bVar.f2876b;
                    int i12 = bVar.f2878d;
                    RecyclerView recyclerView = yVar3.f3062a;
                    recyclerView.Q(i11, i12, true);
                    recyclerView.F0 = true;
                    recyclerView.C0.f2814c += i12;
                }
            } else {
                y yVar4 = (y) interfaceC0037a;
                yVar4.a(bVar);
                yVar4.d(bVar.f2876b, bVar.f2878d);
            }
        }
        l(arrayList);
        this.f = 0;
    }

    public final void d(b bVar) {
        int i6;
        v.e eVar;
        boolean z10;
        int i10 = bVar.f2875a;
        if (i10 != 1 && i10 != 8) {
            int m10 = m(bVar.f2876b, i10);
            int i11 = bVar.f2876b;
            int i12 = bVar.f2875a;
            if (i12 != 2) {
                if (i12 == 4) {
                    i6 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i6 = 0;
            }
            int i13 = 1;
            int i14 = 1;
            while (true) {
                int i15 = bVar.f2878d;
                eVar = this.f2870a;
                if (i13 >= i15) {
                    break;
                }
                int m11 = m((i6 * i13) + bVar.f2876b, bVar.f2875a);
                int i16 = bVar.f2875a;
                if (i16 == 2 ? m11 == m10 : !(i16 != 4 || m11 != m10 + 1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i14++;
                } else {
                    b h10 = h(bVar.f2877c, i16, m10, i14);
                    e(h10, i11);
                    h10.f2877c = null;
                    eVar.a(h10);
                    if (bVar.f2875a == 4) {
                        i11 += i14;
                    }
                    m10 = m11;
                    i14 = 1;
                }
                i13++;
            }
            Object obj = bVar.f2877c;
            bVar.f2877c = null;
            eVar.a(bVar);
            if (i14 > 0) {
                b h11 = h(obj, bVar.f2875a, m10, i14);
                e(h11, i11);
                h11.f2877c = null;
                eVar.a(h11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(b bVar, int i6) {
        y yVar = (y) this.f2873d;
        yVar.a(bVar);
        int i10 = bVar.f2875a;
        if (i10 != 2) {
            if (i10 == 4) {
                yVar.c(i6, bVar.f2878d, bVar.f2877c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i11 = bVar.f2878d;
        RecyclerView recyclerView = yVar.f3062a;
        recyclerView.Q(i6, i11, true);
        recyclerView.F0 = true;
        recyclerView.C0.f2814c += i11;
    }

    public final int f(int i6, int i10) {
        ArrayList<b> arrayList = this.f2872c;
        int size = arrayList.size();
        while (i10 < size) {
            b bVar = arrayList.get(i10);
            int i11 = bVar.f2875a;
            if (i11 == 8) {
                int i12 = bVar.f2876b;
                if (i12 == i6) {
                    i6 = bVar.f2878d;
                } else {
                    if (i12 < i6) {
                        i6--;
                    }
                    if (bVar.f2878d <= i6) {
                        i6++;
                    }
                }
            } else {
                int i13 = bVar.f2876b;
                if (i13 > i6) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = bVar.f2878d;
                    if (i6 < i13 + i14) {
                        return -1;
                    }
                    i6 -= i14;
                } else if (i11 == 1) {
                    i6 += bVar.f2878d;
                }
            }
            i10++;
        }
        return i6;
    }

    public final boolean g() {
        if (this.f2871b.size() > 0) {
            return true;
        }
        return false;
    }

    public final b h(Object obj, int i6, int i10, int i11) {
        b bVar = (b) this.f2870a.b();
        if (bVar == null) {
            return new b(obj, i6, i10, i11);
        }
        bVar.f2875a = i6;
        bVar.f2876b = i10;
        bVar.f2878d = i11;
        bVar.f2877c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f2872c.add(bVar);
        int i6 = bVar.f2875a;
        InterfaceC0037a interfaceC0037a = this.f2873d;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 4) {
                    if (i6 == 8) {
                        ((y) interfaceC0037a).e(bVar.f2876b, bVar.f2878d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                ((y) interfaceC0037a).c(bVar.f2876b, bVar.f2878d, bVar.f2877c);
                return;
            }
            int i10 = bVar.f2876b;
            int i11 = bVar.f2878d;
            RecyclerView recyclerView = ((y) interfaceC0037a).f3062a;
            recyclerView.Q(i10, i11, false);
            recyclerView.F0 = true;
            return;
        }
        ((y) interfaceC0037a).d(bVar.f2876b, bVar.f2878d);
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        int i6;
        char c10;
        int i10;
        boolean z10;
        char c11;
        b h10;
        int i11;
        int i12;
        b h11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        b h12;
        int i16;
        ArrayList<b> arrayList = this.f2871b;
        s sVar = this.f2874e;
        sVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z14 = false;
            while (true) {
                i6 = 8;
                c10 = 65535;
                if (size >= 0) {
                    if (arrayList.get(size).f2875a == 8) {
                        if (z14) {
                            break;
                        }
                    } else {
                        z14 = true;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            i10 = 2;
            if (size == -1) {
                break;
            }
            int i17 = size + 1;
            b bVar = arrayList.get(size);
            b bVar2 = arrayList.get(i17);
            int i18 = bVar2.f2875a;
            if (i18 != 1) {
                s.a aVar = sVar.f3054a;
                if (i18 != 2) {
                    if (i18 == 4) {
                        int i19 = bVar.f2878d;
                        int i20 = bVar2.f2876b;
                        if (i19 < i20) {
                            bVar2.f2876b = i20 - 1;
                        } else {
                            int i21 = bVar2.f2878d;
                            if (i19 < i20 + i21) {
                                bVar2.f2878d = i21 - 1;
                                h10 = ((a) aVar).h(bVar2.f2877c, 4, bVar.f2876b, 1);
                                i11 = bVar.f2876b;
                                i12 = bVar2.f2876b;
                                if (i11 > i12) {
                                    bVar2.f2876b = i12 + 1;
                                } else {
                                    int i22 = i12 + bVar2.f2878d;
                                    if (i11 < i22) {
                                        int i23 = i22 - i11;
                                        h11 = ((a) aVar).h(bVar2.f2877c, 4, i11 + 1, i23);
                                        bVar2.f2878d -= i23;
                                        arrayList.set(i17, bVar);
                                        if (bVar2.f2878d > 0) {
                                            arrayList.set(size, bVar2);
                                        } else {
                                            arrayList.remove(size);
                                            a aVar2 = (a) aVar;
                                            aVar2.getClass();
                                            bVar2.f2877c = null;
                                            aVar2.f2870a.a(bVar2);
                                        }
                                        if (h10 != null) {
                                            arrayList.add(size, h10);
                                        }
                                        if (h11 != null) {
                                            arrayList.add(size, h11);
                                        }
                                    }
                                }
                                h11 = null;
                                arrayList.set(i17, bVar);
                                if (bVar2.f2878d > 0) {
                                }
                                if (h10 != null) {
                                }
                                if (h11 != null) {
                                }
                            }
                        }
                        h10 = null;
                        i11 = bVar.f2876b;
                        i12 = bVar2.f2876b;
                        if (i11 > i12) {
                        }
                        h11 = null;
                        arrayList.set(i17, bVar);
                        if (bVar2.f2878d > 0) {
                        }
                        if (h10 != null) {
                        }
                        if (h11 != null) {
                        }
                    }
                } else {
                    int i24 = bVar.f2876b;
                    int i25 = bVar.f2878d;
                    if (i24 < i25) {
                        if (bVar2.f2876b == i24 && bVar2.f2878d == i25 - i24) {
                            z13 = false;
                            z12 = z13;
                            z11 = true;
                            i13 = bVar2.f2876b;
                            if (i25 >= i13) {
                            }
                            i14 = bVar.f2876b;
                            i15 = bVar2.f2876b;
                            if (i14 > i15) {
                            }
                            h12 = null;
                            if (z11) {
                            }
                        } else {
                            z11 = false;
                            z12 = false;
                            i13 = bVar2.f2876b;
                            if (i25 >= i13) {
                                bVar2.f2876b = i13 - 1;
                            } else {
                                int i26 = bVar2.f2878d;
                                if (i25 < i13 + i26) {
                                    bVar2.f2878d = i26 - 1;
                                    bVar.f2875a = 2;
                                    bVar.f2878d = 1;
                                    if (bVar2.f2878d == 0) {
                                        arrayList.remove(i17);
                                        a aVar3 = (a) aVar;
                                        aVar3.getClass();
                                        bVar2.f2877c = null;
                                        aVar3.f2870a.a(bVar2);
                                    }
                                }
                            }
                            i14 = bVar.f2876b;
                            i15 = bVar2.f2876b;
                            if (i14 > i15) {
                                bVar2.f2876b = i15 + 1;
                            } else {
                                int i27 = i15 + bVar2.f2878d;
                                if (i14 < i27) {
                                    h12 = ((a) aVar).h(null, 2, i14 + 1, i27 - i14);
                                    bVar2.f2878d = bVar.f2876b - bVar2.f2876b;
                                    if (z11) {
                                        arrayList.set(size, bVar2);
                                        arrayList.remove(i17);
                                        a aVar4 = (a) aVar;
                                        aVar4.getClass();
                                        bVar.f2877c = null;
                                        aVar4.f2870a.a(bVar);
                                    } else {
                                        if (z12) {
                                            if (h12 != null) {
                                                int i28 = bVar.f2876b;
                                                if (i28 > h12.f2876b) {
                                                    bVar.f2876b = i28 - h12.f2878d;
                                                }
                                                int i29 = bVar.f2878d;
                                                if (i29 > h12.f2876b) {
                                                    bVar.f2878d = i29 - h12.f2878d;
                                                }
                                            }
                                            int i30 = bVar.f2876b;
                                            if (i30 > bVar2.f2876b) {
                                                bVar.f2876b = i30 - bVar2.f2878d;
                                            }
                                            int i31 = bVar.f2878d;
                                            if (i31 > bVar2.f2876b) {
                                                bVar.f2878d = i31 - bVar2.f2878d;
                                            }
                                        } else {
                                            if (h12 != null) {
                                                int i32 = bVar.f2876b;
                                                if (i32 >= h12.f2876b) {
                                                    bVar.f2876b = i32 - h12.f2878d;
                                                }
                                                int i33 = bVar.f2878d;
                                                if (i33 >= h12.f2876b) {
                                                    bVar.f2878d = i33 - h12.f2878d;
                                                }
                                            }
                                            int i34 = bVar.f2876b;
                                            if (i34 >= bVar2.f2876b) {
                                                bVar.f2876b = i34 - bVar2.f2878d;
                                            }
                                            int i35 = bVar.f2878d;
                                            if (i35 >= bVar2.f2876b) {
                                                bVar.f2878d = i35 - bVar2.f2878d;
                                            }
                                        }
                                        arrayList.set(size, bVar2);
                                        if (bVar.f2876b != bVar.f2878d) {
                                            arrayList.set(i17, bVar);
                                        } else {
                                            arrayList.remove(i17);
                                        }
                                        if (h12 != null) {
                                            arrayList.add(size, h12);
                                        }
                                    }
                                }
                            }
                            h12 = null;
                            if (z11) {
                            }
                        }
                    } else if (bVar2.f2876b == i25 + 1 && bVar2.f2878d == i24 - i25) {
                        z13 = true;
                        z12 = z13;
                        z11 = true;
                        i13 = bVar2.f2876b;
                        if (i25 >= i13) {
                        }
                        i14 = bVar.f2876b;
                        i15 = bVar2.f2876b;
                        if (i14 > i15) {
                        }
                        h12 = null;
                        if (z11) {
                        }
                    } else {
                        z11 = false;
                        z12 = true;
                        i13 = bVar2.f2876b;
                        if (i25 >= i13) {
                        }
                        i14 = bVar.f2876b;
                        i15 = bVar2.f2876b;
                        if (i14 > i15) {
                        }
                        h12 = null;
                        if (z11) {
                        }
                    }
                }
            } else {
                int i36 = bVar.f2878d;
                int i37 = bVar2.f2876b;
                if (i36 < i37) {
                    i16 = -1;
                } else {
                    i16 = 0;
                }
                int i38 = bVar.f2876b;
                if (i38 < i37) {
                    i16++;
                }
                if (i37 <= i38) {
                    bVar.f2876b = i38 + bVar2.f2878d;
                }
                int i39 = bVar2.f2876b;
                if (i39 <= i36) {
                    bVar.f2878d = i36 + bVar2.f2878d;
                }
                bVar2.f2876b = i39 + i16;
                arrayList.set(size, bVar2);
                arrayList.set(i17, bVar);
            }
        }
        int size2 = arrayList.size();
        int i40 = 0;
        while (i40 < size2) {
            b bVar3 = arrayList.get(i40);
            int i41 = bVar3.f2875a;
            if (i41 != 1) {
                v.e eVar = this.f2870a;
                InterfaceC0037a interfaceC0037a = this.f2873d;
                if (i41 != i10) {
                    if (i41 != 4) {
                        if (i41 == i6) {
                            i(bVar3);
                        }
                    } else {
                        int i42 = bVar3.f2876b;
                        int i43 = bVar3.f2878d + i42;
                        int i44 = i42;
                        int i45 = 0;
                        while (i42 < i43) {
                            if (((y) interfaceC0037a).b(i42) == null && !a(i42)) {
                                if (c10 == 1) {
                                    i(h(bVar3.f2877c, 4, i44, i45));
                                    i44 = i42;
                                    i45 = 0;
                                }
                                c10 = 0;
                            } else {
                                if (c10 == 0) {
                                    d(h(bVar3.f2877c, 4, i44, i45));
                                    i44 = i42;
                                    i45 = 0;
                                }
                                c10 = 1;
                            }
                            i45++;
                            i42++;
                        }
                        if (i45 != bVar3.f2878d) {
                            Object obj = bVar3.f2877c;
                            bVar3.f2877c = null;
                            eVar.a(bVar3);
                            bVar3 = h(obj, 4, i44, i45);
                        }
                        if (c10 == 0) {
                            d(bVar3);
                        } else {
                            i(bVar3);
                        }
                    }
                } else {
                    int i46 = bVar3.f2876b;
                    int i47 = bVar3.f2878d + i46;
                    int i48 = i46;
                    int i49 = 0;
                    char c12 = 65535;
                    while (i48 < i47) {
                        if (((y) interfaceC0037a).b(i48) == null && !a(i48)) {
                            if (c12 == 1) {
                                i(h(null, 2, i46, i49));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c11 = 0;
                        } else {
                            if (c12 == 0) {
                                d(h(null, 2, i46, i49));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c11 = 1;
                        }
                        if (z10) {
                            i48 -= i49;
                            i47 -= i49;
                            i49 = 1;
                        } else {
                            i49++;
                        }
                        i48++;
                        c12 = c11;
                    }
                    if (i49 != bVar3.f2878d) {
                        bVar3.f2877c = null;
                        eVar.a(bVar3);
                        bVar3 = h(null, 2, i46, i49);
                    }
                    if (c12 == 0) {
                        d(bVar3);
                    } else {
                        i(bVar3);
                    }
                }
            } else {
                i(bVar3);
            }
            i40++;
            i6 = 8;
            c10 = 65535;
            i10 = 2;
        }
        arrayList.clear();
    }

    public final void k(b bVar) {
        bVar.f2877c = null;
        this.f2870a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            k((b) arrayList.get(i6));
        }
        arrayList.clear();
    }

    public final int m(int i6, int i10) {
        int i11;
        int i12;
        ArrayList<b> arrayList = this.f2872c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i13 = bVar.f2875a;
            if (i13 == 8) {
                int i14 = bVar.f2876b;
                int i15 = bVar.f2878d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i6 >= i12 && i6 <= i11) {
                    if (i12 == i14) {
                        if (i10 == 1) {
                            bVar.f2878d = i15 + 1;
                        } else if (i10 == 2) {
                            bVar.f2878d = i15 - 1;
                        }
                        i6++;
                    } else {
                        if (i10 == 1) {
                            bVar.f2876b = i14 + 1;
                        } else if (i10 == 2) {
                            bVar.f2876b = i14 - 1;
                        }
                        i6--;
                    }
                } else if (i6 < i14) {
                    if (i10 == 1) {
                        bVar.f2876b = i14 + 1;
                        bVar.f2878d = i15 + 1;
                    } else if (i10 == 2) {
                        bVar.f2876b = i14 - 1;
                        bVar.f2878d = i15 - 1;
                    }
                }
            } else {
                int i16 = bVar.f2876b;
                if (i16 <= i6) {
                    if (i13 == 1) {
                        i6 -= bVar.f2878d;
                    } else if (i13 == 2) {
                        i6 += bVar.f2878d;
                    }
                } else if (i10 == 1) {
                    bVar.f2876b = i16 + 1;
                } else if (i10 == 2) {
                    bVar.f2876b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f2875a == 8) {
                int i17 = bVar2.f2878d;
                if (i17 == bVar2.f2876b || i17 < 0) {
                    arrayList.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f2878d <= 0) {
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i6;
    }
}
