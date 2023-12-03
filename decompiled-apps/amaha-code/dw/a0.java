package dw;

import dw.c;
import dw.f;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import lv.e;
import lv.t;
/* compiled from: Retrofit.java */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: b  reason: collision with root package name */
    public final e.a f13534b;

    /* renamed from: c  reason: collision with root package name */
    public final lv.t f13535c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f.a> f13536d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f13537e;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f13533a = new ConcurrentHashMap();
    public final boolean f = false;

    /* compiled from: Retrofit.java */
    /* loaded from: classes2.dex */
    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final w f13538a = w.f13644c;

        /* renamed from: b  reason: collision with root package name */
        public final Object[] f13539b = new Object[0];

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Class f13540c;

        public a(Class cls) {
            this.f13540c = cls;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z10;
            boolean isDefault;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f13539b;
            }
            w wVar = this.f13538a;
            if (wVar.f13645a) {
                isDefault = method.isDefault();
                if (isDefault) {
                    z10 = true;
                    if (!z10) {
                        return wVar.b(this.f13540c, obj, method, objArr);
                    }
                    return a0.this.c(method).a(objArr);
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
    }

    /* compiled from: Retrofit.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final w f13542a;

        /* renamed from: b  reason: collision with root package name */
        public e.a f13543b;

        /* renamed from: c  reason: collision with root package name */
        public lv.t f13544c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f13545d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f13546e;

        public b() {
            w wVar = w.f13644c;
            this.f13545d = new ArrayList();
            this.f13546e = new ArrayList();
            this.f13542a = wVar;
        }

        public final void a() {
            t.a aVar = new t.a();
            aVar.d(null, "https://us-central1-gcpinnerhour.cloudfunctions.net/");
            lv.t a10 = aVar.a();
            List<String> list = a10.f;
            if ("".equals(list.get(list.size() - 1))) {
                this.f13544c = a10;
                return;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + a10);
        }

        public final a0 b() {
            List singletonList;
            List emptyList;
            if (this.f13544c != null) {
                e.a aVar = this.f13543b;
                if (aVar == null) {
                    aVar = new lv.x();
                }
                w wVar = this.f13542a;
                Executor a10 = wVar.a();
                ArrayList arrayList = new ArrayList(this.f13546e);
                h hVar = new h(a10);
                boolean z10 = wVar.f13645a;
                if (z10) {
                    singletonList = Arrays.asList(e.f13548a, hVar);
                } else {
                    singletonList = Collections.singletonList(hVar);
                }
                arrayList.addAll(singletonList);
                ArrayList arrayList2 = this.f13545d;
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z10 ? 1 : 0));
                arrayList3.add(new dw.a());
                arrayList3.addAll(arrayList2);
                if (z10) {
                    emptyList = Collections.singletonList(s.f13601a);
                } else {
                    emptyList = Collections.emptyList();
                }
                arrayList3.addAll(emptyList);
                return new a0(aVar, this.f13544c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList));
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    public a0(e.a aVar, lv.t tVar, List list, List list2) {
        this.f13534b = aVar;
        this.f13535c = tVar;
        this.f13536d = list;
        this.f13537e = list2;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<c.a> list = this.f13537e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i6 = indexOf; i6 < size; i6++) {
            c<?, ?> a10 = list.get(i6).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> T b(Class<T> cls) {
        Method[] declaredMethods;
        boolean z10;
        boolean isDefault;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f) {
                w wVar = w.f13644c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (wVar.f13645a) {
                        isDefault = method.isDefault();
                        if (isDefault) {
                            z10 = true;
                            if (!z10 && !Modifier.isStatic(method.getModifiers())) {
                                c(method);
                            }
                        }
                    }
                    z10 = false;
                    if (!z10) {
                        c(method);
                    }
                }
            }
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final b0<?> c(Method method) {
        b0<?> b0Var;
        b0<?> b0Var2 = (b0) this.f13533a.get(method);
        if (b0Var2 != null) {
            return b0Var2;
        }
        synchronized (this.f13533a) {
            b0Var = (b0) this.f13533a.get(method);
            if (b0Var == null) {
                b0Var = b0.b(this, method);
                this.f13533a.put(method, b0Var);
            }
        }
        return b0Var;
    }

    public final <T> f<T, lv.c0> d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<f.a> list = this.f13536d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i6 = indexOf; i6 < size; i6++) {
            f<T, lv.c0> a10 = list.get(i6).a(type);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> f<lv.e0, T> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<f.a> list = this.f13536d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i6 = indexOf; i6 < size; i6++) {
            f<lv.e0, T> fVar = (f<lv.e0, T>) list.get(i6).b(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<f.a> list = this.f13536d;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            list.get(i6).getClass();
        }
    }
}
