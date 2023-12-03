package gu;

import gu.f.a;
import gu.g;
import gu.h;
import gu.n;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
/* compiled from: FieldSet.java */
/* loaded from: classes2.dex */
public final class f<FieldDescriptorType extends a<FieldDescriptorType>> {

    /* renamed from: d  reason: collision with root package name */
    public static final f f16852d = new f(0);

    /* renamed from: a  reason: collision with root package name */
    public final r f16853a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16854b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16855c = false;

    /* compiled from: FieldSet.java */
    /* loaded from: classes2.dex */
    public interface a<T extends a<T>> extends Comparable<T> {
        g.a I(n.a aVar, n nVar);

        int e();

        boolean g();

        u m();

        v o();

        boolean q();
    }

    public f() {
        int i6 = s.f16895z;
        this.f16853a = new r(16);
    }

    public static int c(u uVar, Object obj) {
        switch (uVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                return 4;
            case 2:
                return CodedOutputStream.g(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.g(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return CodedOutputStream.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported.", e10);
                }
            case 9:
                return ((n) obj).b();
            case 10:
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    if (iVar.f16875a) {
                        int b10 = iVar.f16876b.b();
                        return CodedOutputStream.f(b10) + b10;
                    }
                    throw null;
                }
                return CodedOutputStream.e((n) obj);
            case 11:
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return cVar.size() + CodedOutputStream.f(cVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return CodedOutputStream.f(bArr.length) + bArr.length;
            case 12:
                return CodedOutputStream.f(((Integer) obj).intValue());
            case 13:
                if (obj instanceof h.a) {
                    return CodedOutputStream.c(((h.a) obj).e());
                }
                return CodedOutputStream.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.f((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.g((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(a<?> aVar, Object obj) {
        u m10 = aVar.m();
        int e10 = aVar.e();
        if (aVar.g()) {
            int i6 = 0;
            if (aVar.q()) {
                for (Object obj2 : (List) obj) {
                    i6 += c(m10, obj2);
                }
                return CodedOutputStream.f(i6) + CodedOutputStream.h(e10) + i6;
            }
            for (Object obj3 : (List) obj) {
                int h10 = CodedOutputStream.h(e10);
                if (m10 == u.f16916y) {
                    h10 *= 2;
                }
                i6 += c(m10, obj3) + h10;
            }
            return i6;
        }
        int h11 = CodedOutputStream.h(e10);
        if (m10 == u.f16916y) {
            h11 *= 2;
        }
        return c(m10, obj) + h11;
    }

    public static boolean f(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        if (aVar.o() == v.D) {
            if (aVar.g()) {
                for (n nVar : (List) entry.getValue()) {
                    if (!nVar.d()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof n) {
                    if (!((n) value).d()) {
                        return false;
                    }
                } else if (value instanceof i) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public static Object i(d dVar, u uVar) {
        boolean z10 = true;
        switch (uVar.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(dVar.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(dVar.i()));
            case 2:
                return Long.valueOf(dVar.l());
            case 3:
                return Long.valueOf(dVar.l());
            case 4:
                return Integer.valueOf(dVar.k());
            case 5:
                return Long.valueOf(dVar.j());
            case 6:
                return Integer.valueOf(dVar.i());
            case 7:
                if (dVar.l() == 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 8:
                int k10 = dVar.k();
                int i6 = dVar.f16841b;
                int i10 = dVar.f16843d;
                if (k10 <= i6 - i10 && k10 > 0) {
                    String str = new String(dVar.f16840a, i10, k10, "UTF-8");
                    dVar.f16843d += k10;
                    return str;
                } else if (k10 == 0) {
                    return "";
                } else {
                    return new String(dVar.h(k10), "UTF-8");
                }
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return dVar.e();
            case 12:
                return Integer.valueOf(dVar.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(dVar.i());
            case 15:
                return Long.valueOf(dVar.j());
            case 16:
                int k11 = dVar.k();
                return Integer.valueOf((-(k11 & 1)) ^ (k11 >>> 1));
            case 17:
                long l2 = dVar.l();
                return Long.valueOf((-(l2 & 1)) ^ (l2 >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
        if ((r3 instanceof gu.h.a) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if ((r3 instanceof gu.i) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(u uVar, Object obj) {
        obj.getClass();
        boolean z10 = true;
        boolean z11 = false;
        switch (uVar.f16918u.ordinal()) {
            case 0:
                z11 = obj instanceof Integer;
                break;
            case 1:
                z11 = obj instanceof Long;
                break;
            case 2:
                z11 = obj instanceof Float;
                break;
            case 3:
                z11 = obj instanceof Double;
                break;
            case 4:
                z11 = obj instanceof Boolean;
                break;
            case 5:
                z11 = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof c)) {
                    break;
                }
                z11 = z10;
                break;
            case 7:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z11 = z10;
                break;
            case 8:
                if (!(obj instanceof n)) {
                    break;
                }
                z11 = z10;
                break;
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static void l(CodedOutputStream codedOutputStream, u uVar, int i6, Object obj) {
        if (uVar == u.f16916y) {
            codedOutputStream.x(i6, 3);
            ((n) obj).f(codedOutputStream);
            codedOutputStream.x(i6, 4);
            return;
        }
        codedOutputStream.x(i6, uVar.f16919v);
        m(codedOutputStream, uVar, obj);
    }

    public static void m(CodedOutputStream codedOutputStream, u uVar, Object obj) {
        switch (uVar.ordinal()) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.u(Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.t(Float.floatToRawIntBits(floatValue));
                return;
            case 2:
                codedOutputStream.w(((Long) obj).longValue());
                return;
            case 3:
                codedOutputStream.w(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.n(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.u(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.t(((Integer) obj).intValue());
                return;
            case 7:
                codedOutputStream.q(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                codedOutputStream.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                codedOutputStream.v(bytes.length);
                codedOutputStream.s(bytes);
                return;
            case 9:
                codedOutputStream.getClass();
                ((n) obj).f(codedOutputStream);
                return;
            case 10:
                codedOutputStream.p((n) obj);
                return;
            case 11:
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.v(cVar.size());
                    codedOutputStream.r(cVar);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.getClass();
                codedOutputStream.v(bArr.length);
                codedOutputStream.s(bArr);
                return;
            case 12:
                codedOutputStream.v(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof h.a) {
                    codedOutputStream.n(((h.a) obj).e());
                    return;
                } else {
                    codedOutputStream.n(((Integer) obj).intValue());
                    return;
                }
            case 14:
                codedOutputStream.t(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.u(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.v((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.w((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a(g.d dVar, Object obj) {
        List list;
        if (dVar.f16865w) {
            k(dVar.f16864v, obj);
            Object e10 = e(dVar);
            if (e10 == null) {
                list = new ArrayList();
                this.f16853a.f(dVar, list);
            } else {
                list = (List) e10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final f<FieldDescriptorType> clone() {
        r rVar;
        f<FieldDescriptorType> fVar = (f<FieldDescriptorType>) new f();
        int i6 = 0;
        while (true) {
            rVar = this.f16853a;
            if (i6 >= rVar.f16897v.size()) {
                break;
            }
            s<K, V>.b bVar = rVar.f16897v.get(i6);
            fVar.j((a) bVar.getKey(), bVar.getValue());
            i6++;
        }
        for (Map.Entry<Object, Object> entry : rVar.c()) {
            fVar.j((a) entry.getKey(), entry.getValue());
        }
        fVar.f16855c = this.f16855c;
        return fVar;
    }

    public final Object e(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f16853a.get(fielddescriptortype);
        if (obj instanceof i) {
            return ((i) obj).a();
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List, java.lang.Object] */
    public final void g() {
        Map map;
        if (this.f16854b) {
            return;
        }
        r rVar = this.f16853a;
        if (!rVar.f16899x) {
            for (int i6 = 0; i6 < rVar.f16897v.size(); i6++) {
                s<K, V>.b bVar = rVar.f16897v.get(i6);
                if (((a) bVar.getKey()).g()) {
                    bVar.setValue(Collections.unmodifiableList((List) bVar.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : rVar.c()) {
                if (((a) entry.getKey()).g()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!rVar.f16899x) {
            if (rVar.f16898w.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(rVar.f16898w);
            }
            rVar.f16898w = map;
            rVar.f16899x = true;
        }
        this.f16854b = true;
    }

    public final void h(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof i) {
            value = ((i) value).a();
        }
        boolean g5 = key.g();
        r rVar = this.f16853a;
        if (g5) {
            Object e10 = e(key);
            if (e10 == null) {
                e10 = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) e10;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            rVar.f(key, e10);
        } else if (key.o() == v.D) {
            Object e11 = e(key);
            if (e11 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                rVar.f(key, value);
                return;
            }
            rVar.f(key, key.I(((n) e11).a(), (n) value).build());
        } else {
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            rVar.f(key, value);
        }
    }

    public final void j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.g()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    k(fielddescriptortype.m(), it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            k(fielddescriptortype.m(), obj);
        }
        if (obj instanceof i) {
            this.f16855c = true;
        }
        this.f16853a.f(fielddescriptortype, obj);
    }

    public f(int i6) {
        int i10 = s.f16895z;
        this.f16853a = new r(0);
        g();
    }
}
