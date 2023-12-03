package r6;

import java.util.ArrayList;
import java.util.List;
import r6.j;
/* compiled from: DataSet.java */
/* loaded from: classes.dex */
public abstract class i<T extends j> extends f<T> {

    /* renamed from: o  reason: collision with root package name */
    public final List<T> f30513o;

    /* renamed from: p  reason: collision with root package name */
    public float f30514p;

    /* renamed from: q  reason: collision with root package name */
    public float f30515q;
    public float r;

    /* renamed from: s  reason: collision with root package name */
    public float f30516s;

    /* compiled from: DataSet.java */
    /* loaded from: classes.dex */
    public enum a {
        UP,
        DOWN,
        CLOSEST
    }

    public i(ArrayList arrayList) {
        this.f30513o = null;
        this.f30514p = -3.4028235E38f;
        this.f30515q = Float.MAX_VALUE;
        this.r = -3.4028235E38f;
        this.f30516s = Float.MAX_VALUE;
        this.f30513o = arrayList;
        if (arrayList == null) {
            this.f30513o = new ArrayList();
        }
        List<T> list = this.f30513o;
        if (list != null && !list.isEmpty()) {
            this.f30514p = -3.4028235E38f;
            this.f30515q = Float.MAX_VALUE;
            this.r = -3.4028235E38f;
            this.f30516s = Float.MAX_VALUE;
            for (T t3 : list) {
                l0(t3);
            }
        }
    }

    @Override // v6.d
    public final void P(float f, float f2) {
        List<T> list = this.f30513o;
        if (list != null && !list.isEmpty()) {
            this.f30514p = -3.4028235E38f;
            this.f30515q = Float.MAX_VALUE;
            int o02 = o0(f2, Float.NaN, a.UP);
            for (int o03 = o0(f, Float.NaN, a.DOWN); o03 <= o02; o03++) {
                n0(list.get(o03));
            }
        }
    }

    @Override // v6.d
    public final ArrayList Q(float f) {
        ArrayList arrayList = new ArrayList();
        List<T> list = this.f30513o;
        int size = list.size() - 1;
        int i6 = 0;
        while (true) {
            if (i6 > size) {
                break;
            }
            int i10 = (size + i6) / 2;
            T t3 = list.get(i10);
            if (f == t3.b()) {
                while (i10 > 0) {
                    int i11 = i10 - 1;
                    if (list.get(i11).b() != f) {
                        break;
                    }
                    i10 = i11;
                }
                int size2 = list.size();
                while (i10 < size2) {
                    T t10 = list.get(i10);
                    if (t10.b() != f) {
                        break;
                    }
                    arrayList.add(t10);
                    i10++;
                }
            } else if (f > t3.b()) {
                i6 = i10 + 1;
            } else {
                size = i10 - 1;
            }
        }
        return arrayList;
    }

    @Override // v6.d
    public final float T() {
        return this.r;
    }

    @Override // v6.d
    public final int b0(j jVar) {
        return this.f30513o.indexOf(jVar);
    }

    @Override // v6.d
    public final int c0() {
        return this.f30513o.size();
    }

    @Override // v6.d
    public final float f() {
        return this.f30516s;
    }

    @Override // v6.d
    public final float g() {
        return this.f30514p;
    }

    @Override // v6.d
    public final T h0(float f, float f2) {
        return (T) k(f, f2);
    }

    @Override // v6.d
    public final j k(float f, float f2) {
        int o02 = o0(f, f2, a.CLOSEST);
        if (o02 > -1) {
            return this.f30513o.get(o02);
        }
        return null;
    }

    public void l0(T t3) {
        if (t3 == null) {
            return;
        }
        m0(t3);
        n0(t3);
    }

    public final void m0(T t3) {
        if (t3.b() < this.f30516s) {
            this.f30516s = t3.b();
        }
        if (t3.b() > this.r) {
            this.r = t3.b();
        }
    }

    public final void n0(T t3) {
        if (t3.a() < this.f30515q) {
            this.f30515q = t3.a();
        }
        if (t3.a() > this.f30514p) {
            this.f30514p = t3.a();
        }
    }

    public final int o0(float f, float f2, a aVar) {
        T t3;
        List<T> list = this.f30513o;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i6 = 0;
        while (i6 < size) {
            int i10 = (i6 + size) / 2;
            float b10 = list.get(i10).b() - f;
            int i11 = i10 + 1;
            float abs = Math.abs(b10);
            float abs2 = Math.abs(list.get(i11).b() - f);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d10 = b10;
                    if (d10 < 0.0d) {
                        if (d10 < 0.0d) {
                        }
                    }
                }
                size = i10;
            }
            i6 = i11;
        }
        if (size != -1) {
            float b11 = list.get(size).b();
            if (aVar == a.UP) {
                if (b11 < f && size < list.size() - 1) {
                    size++;
                }
            } else if (aVar == a.DOWN && b11 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0) {
                    int i12 = size - 1;
                    if (list.get(i12).b() != b11) {
                        break;
                    }
                    size = i12;
                }
                float a10 = list.get(size).a();
                int i13 = size;
                loop2: while (true) {
                    int i14 = i13;
                    do {
                        i14++;
                        if (i14 >= list.size()) {
                            break loop2;
                        }
                        t3 = list.get(i14);
                        if (t3.b() != b11) {
                            break loop2;
                        }
                    } while (Math.abs(t3.a() - f2) >= Math.abs(a10 - f2));
                    a10 = f2;
                    i13 = i14;
                }
                return i13;
            }
            return size;
        }
        return size;
    }

    @Override // v6.d
    public final float r() {
        return this.f30515q;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder("DataSet, label: ");
        String str = this.f30492c;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(", entries: ");
        List<T> list = this.f30513o;
        sb2.append(list.size());
        sb2.append("\n");
        stringBuffer2.append(sb2.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i6 = 0; i6 < list.size(); i6++) {
            stringBuffer.append(list.get(i6).toString() + " ");
        }
        return stringBuffer.toString();
    }

    @Override // v6.d
    public final T x(int i6) {
        return this.f30513o.get(i6);
    }
}
