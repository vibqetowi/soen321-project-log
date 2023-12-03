package vf;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sf.b;
import sf.v;
import sf.w;
/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class n implements w {

    /* renamed from: u  reason: collision with root package name */
    public final uf.e f35022u;

    /* renamed from: v  reason: collision with root package name */
    public final sf.c f35023v;

    /* renamed from: w  reason: collision with root package name */
    public final uf.h f35024w;

    /* renamed from: x  reason: collision with root package name */
    public final e f35025x;

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* loaded from: classes.dex */
    public static final class a<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final uf.l<T> f35026a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, b> f35027b;

        public a(uf.l lVar, LinkedHashMap linkedHashMap) {
            this.f35026a = lVar;
            this.f35027b = linkedHashMap;
        }

        @Override // sf.v
        public final T a(yf.a aVar) {
            if (aVar.y0() == 9) {
                aVar.p0();
                return null;
            }
            T i6 = this.f35026a.i();
            try {
                aVar.e();
                while (aVar.J()) {
                    b bVar = this.f35027b.get(aVar.k0());
                    if (bVar != null && bVar.f35030c) {
                        bVar.a(aVar, i6);
                    }
                    aVar.N0();
                }
                aVar.m();
                return i6;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // sf.v
        public final void b(yf.b bVar, T t3) {
            if (t3 == null) {
                bVar.G();
                return;
            }
            bVar.g();
            try {
                for (b bVar2 : this.f35027b.values()) {
                    if (bVar2.c(t3)) {
                        bVar.o(bVar2.f35028a);
                        bVar2.b(bVar, t3);
                    }
                }
                bVar.m();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f35028a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f35029b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f35030c;

        public b(String str, boolean z10, boolean z11) {
            this.f35028a = str;
            this.f35029b = z10;
            this.f35030c = z11;
        }

        public abstract void a(yf.a aVar, Object obj);

        public abstract void b(yf.b bVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public n(uf.e eVar, b.a aVar, uf.h hVar, e eVar2) {
        this.f35022u = eVar;
        this.f35023v = aVar;
        this.f35024w = hVar;
        this.f35025x = eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.List] */
    @Override // sf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
        a aVar;
        int i6;
        int i10;
        ArrayList arrayList;
        int size;
        int i11;
        b bVar;
        Field[] fieldArr;
        Class<? super T> cls;
        Type type;
        a aVar2;
        Class<? super T> cls2;
        uf.e eVar;
        LinkedHashMap linkedHashMap;
        boolean z10;
        v<T> vVar;
        boolean z11;
        ArrayList arrayList2;
        n nVar = this;
        sf.i iVar2 = iVar;
        Class<? super T> rawType = typeToken.getRawType();
        Class<? super T> cls3 = Object.class;
        if (!cls3.isAssignableFrom(rawType)) {
            return null;
        }
        uf.e eVar2 = nVar.f35022u;
        uf.l<T> a10 = eVar2.a(typeToken);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!rawType.isInterface()) {
            Type type2 = typeToken.getType();
            Class<? super T> cls4 = rawType;
            TypeToken typeToken2 = typeToken;
            while (cls4 != cls3) {
                Field[] declaredFields = cls4.getDeclaredFields();
                int length = declaredFields.length;
                boolean z12 = false;
                int i12 = 0;
                while (i12 < length) {
                    Field field = declaredFields[i12];
                    boolean b10 = nVar.b(field, true);
                    boolean b11 = nVar.b(field, z12);
                    if (!b10 && !b11) {
                        i6 = i12;
                        i10 = length;
                        fieldArr = declaredFields;
                        cls = cls4;
                        type = type2;
                        aVar2 = aVar;
                        cls2 = cls3;
                        eVar = eVar2;
                        linkedHashMap = linkedHashMap2;
                    } else {
                        try {
                            field.setAccessible(true);
                            Type h10 = uf.a.h(typeToken2.getType(), cls4, field.getGenericType(), new HashMap());
                            tf.b bVar2 = (tf.b) field.getAnnotation(tf.b.class);
                            if (bVar2 == null) {
                                i6 = i12;
                                arrayList2 = Collections.singletonList(nVar.f35023v.d(field));
                            } else {
                                String value = bVar2.value();
                                String[] alternate = bVar2.alternate();
                                i6 = i12;
                                if (alternate.length == 0) {
                                    arrayList2 = Collections.singletonList(value);
                                } else {
                                    i10 = length;
                                    ArrayList arrayList3 = new ArrayList(alternate.length + 1);
                                    arrayList3.add(value);
                                    int i13 = 0;
                                    for (int length2 = alternate.length; i13 < length2; length2 = length2) {
                                        arrayList3.add(alternate[i13]);
                                        i13++;
                                    }
                                    arrayList = arrayList3;
                                    size = arrayList.size();
                                    b bVar3 = null;
                                    i11 = 0;
                                    while (i11 < size) {
                                        Class<? super T> cls5 = cls3;
                                        String str = (String) arrayList.get(i11);
                                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                        if (i11 != 0) {
                                            b10 = false;
                                        }
                                        TypeToken<?> typeToken3 = TypeToken.get(h10);
                                        b bVar4 = bVar3;
                                        Class<? super Object> rawType2 = typeToken3.getRawType();
                                        int i14 = i11;
                                        if ((rawType2 instanceof Class) && rawType2.isPrimitive()) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        tf.a aVar3 = (tf.a) field.getAnnotation(tf.a.class);
                                        if (aVar3 != null) {
                                            nVar.f35025x.getClass();
                                            vVar = e.b(eVar2, iVar2, typeToken3, aVar3);
                                        } else {
                                            vVar = null;
                                        }
                                        if (vVar != null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (vVar == null) {
                                            vVar = iVar2.d(typeToken3);
                                        }
                                        Field field2 = field;
                                        int i15 = size;
                                        ArrayList arrayList4 = arrayList;
                                        Field[] fieldArr2 = declaredFields;
                                        boolean z13 = z11;
                                        Class<? super T> cls6 = cls4;
                                        Type type3 = h10;
                                        Type type4 = type2;
                                        uf.e eVar3 = eVar2;
                                        a aVar4 = aVar;
                                        bVar3 = (b) linkedHashMap3.put(str, new m(str, b10, b11, field2, z13, vVar, iVar, typeToken3, z10));
                                        if (bVar4 != null) {
                                            bVar3 = bVar4;
                                        }
                                        i11 = i14 + 1;
                                        nVar = this;
                                        iVar2 = iVar;
                                        cls4 = cls6;
                                        type2 = type4;
                                        linkedHashMap2 = linkedHashMap3;
                                        cls3 = cls5;
                                        field = field2;
                                        h10 = type3;
                                        eVar2 = eVar3;
                                        size = i15;
                                        arrayList = arrayList4;
                                        declaredFields = fieldArr2;
                                        aVar = aVar4;
                                    }
                                    bVar = bVar3;
                                    fieldArr = declaredFields;
                                    cls = cls4;
                                    type = type2;
                                    aVar2 = aVar;
                                    cls2 = cls3;
                                    eVar = eVar2;
                                    linkedHashMap = linkedHashMap2;
                                    if (bVar == null) {
                                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.f35028a);
                                    }
                                }
                            }
                            i10 = length;
                            arrayList = arrayList2;
                            size = arrayList.size();
                            b bVar32 = null;
                            i11 = 0;
                            while (i11 < size) {
                            }
                            bVar = bVar32;
                            fieldArr = declaredFields;
                            cls = cls4;
                            type = type2;
                            aVar2 = aVar;
                            cls2 = cls3;
                            eVar = eVar2;
                            linkedHashMap = linkedHashMap2;
                            if (bVar == null) {
                            }
                        } catch (Exception e10) {
                            throw new JsonIOException("Failed making field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type", e10);
                        }
                    }
                    i12 = i6 + 1;
                    nVar = this;
                    iVar2 = iVar;
                    cls4 = cls;
                    type2 = type;
                    linkedHashMap2 = linkedHashMap;
                    length = i10;
                    cls3 = cls2;
                    eVar2 = eVar;
                    declaredFields = fieldArr;
                    aVar = aVar2;
                    z12 = false;
                }
                Class<? super T> cls7 = cls4;
                typeToken2 = TypeToken.get(uf.a.h(typeToken2.getType(), cls7, cls7.getGenericSuperclass(), new HashMap()));
                cls4 = typeToken2.getRawType();
                nVar = this;
                iVar2 = iVar;
                type2 = type2;
                linkedHashMap2 = linkedHashMap2;
                cls3 = cls3;
                eVar2 = eVar2;
                aVar = aVar;
            }
        }
        return new a(a10, linkedHashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (r0 == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Field field, boolean z10) {
        boolean z11;
        boolean z12;
        List<sf.a> list;
        boolean z13;
        boolean z14;
        Class<?> type = field.getType();
        uf.h hVar = this.f35024w;
        if (!hVar.b(type) && !hVar.c(type, z10)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return false;
        }
        if ((field.getModifiers() & hVar.f34064v) == 0 && ((hVar.f34063u == -1.0d || hVar.e((tf.c) field.getAnnotation(tf.c.class), (tf.d) field.getAnnotation(tf.d.class))) && !field.isSynthetic())) {
            if (!hVar.f34065w) {
                Class<?> type2 = field.getType();
                if (type2.isMemberClass()) {
                    if ((type2.getModifiers() & 8) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        z13 = true;
                    }
                }
                z13 = false;
            }
            if (!uf.h.d(field.getType())) {
                if (z10) {
                    list = hVar.f34066x;
                } else {
                    list = hVar.f34067y;
                }
                if (!list.isEmpty()) {
                    new gd.d(field);
                    for (sf.a aVar : list) {
                        if (aVar.b()) {
                        }
                    }
                }
                z12 = false;
                if (!z12) {
                    return false;
                }
                return true;
            }
        }
        z12 = true;
        if (!z12) {
        }
    }
}
