package vu;

import com.appsflyer.R;
import gv.r;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import nd.z;
import r1.b0;
import ta.v;
import wu.f;
/* compiled from: LockBasedStorageManager.java */
/* loaded from: classes2.dex */
public class c implements vu.l {

    /* renamed from: d  reason: collision with root package name */
    public static final String f36139d = r.h1(c.class.getCanonicalName(), "");

    /* renamed from: e  reason: collision with root package name */
    public static final a f36140e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final vu.k f36141a;

    /* renamed from: b  reason: collision with root package name */
    public final d f36142b;

    /* renamed from: c  reason: collision with root package name */
    public final String f36143c;

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class a extends c {
        public a() {
            super("NO_LOCKS", v.f32901v);
        }

        @Override // vu.c
        public final m k(Object obj, String str) {
            return new m(null, true);
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class b<K, V> extends C0608c<K, V> implements vu.a<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, ConcurrentHashMap concurrentHashMap) {
            super(cVar, concurrentHashMap);
            if (cVar != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i6) {
            String str;
            int i10;
            if (i6 != 3) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 3) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            Object[] objArr = new Object[i10];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
                    }
                } else {
                    objArr[0] = "computation";
                }
            } else {
                objArr[0] = "map";
            }
            if (i6 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i6 != 2) {
                if (i6 != 3) {
                    objArr[2] = "<init>";
                }
            } else {
                objArr[2] = "computeIfAbsent";
            }
            String format = String.format(str, objArr);
            if (i6 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public final V c(K k10, ss.a<? extends V> aVar) {
            V invoke = invoke(new e(k10, aVar));
            if (invoke != null) {
                return invoke;
            }
            a(3);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: vu.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0608c<K, V> extends j<e<K, V>, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0608c(c cVar, ConcurrentHashMap concurrentHashMap) {
            super(cVar, concurrentHashMap, new vu.f());
            if (cVar != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                if (i6 != 2) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "computation";
                }
            } else {
                objArr[0] = "map";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i6 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36144a = new a();

        /* compiled from: LockBasedStorageManager.java */
        /* loaded from: classes2.dex */
        public static class a implements d {
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class e<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f36145a;

        /* renamed from: b  reason: collision with root package name */
        public final ss.a<? extends V> f36146b;

        public e(K k10, ss.a<? extends V> aVar) {
            this.f36145a = k10;
            this.f36146b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass() && this.f36145a.equals(((e) obj).f36145a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f36145a.hashCode();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static abstract class g<T> extends f<T> {

        /* renamed from: x  reason: collision with root package name */
        public volatile z f36150x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c cVar, f.b bVar) {
            super(cVar, bVar);
            if (cVar != null) {
                this.f36150x = null;
                return;
            }
            a(0);
            throw null;
        }

        public static /* synthetic */ void a(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vu.c.f
        public final void b(T t3) {
            this.f36150x = new z(t3);
            try {
                vu.e eVar = (vu.e) this;
                if (t3 != null) {
                    eVar.f36162z.invoke(t3);
                } else {
                    vu.e.a(2);
                    throw null;
                }
            } finally {
                this.f36150x = null;
            }
        }

        @Override // vu.c.f, ss.a
        public T invoke() {
            boolean z10;
            z zVar = this.f36150x;
            if (zVar != null) {
                boolean z11 = true;
                if (((Thread) zVar.f26149c) == Thread.currentThread()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (((Thread) zVar.f26149c) != Thread.currentThread()) {
                        z11 = false;
                    }
                    if (z11) {
                        return (T) zVar.f26148b;
                    }
                    throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
                }
            }
            return (T) super.invoke();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class h<T> extends f<T> implements vu.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(c cVar, ss.a<? extends T> aVar) {
            super(cVar, aVar);
            if (cVar != null) {
                if (aVar != null) {
                    return;
                } else {
                    a(1);
                    throw null;
                }
            }
            a(0);
            throw null;
        }

        public static /* synthetic */ void a(int i6) {
            String str;
            int i10;
            if (i6 != 2) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 2) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            Object[] objArr = new Object[i10];
            if (i6 != 1) {
                if (i6 != 2) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
                }
            } else {
                objArr[0] = "computable";
            }
            if (i6 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i6 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i6 != 2) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // vu.c.f, ss.a
        public final T invoke() {
            T t3 = (T) super.invoke();
            if (t3 != null) {
                return t3;
            }
            a(2);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static abstract class i<T> extends g<T> implements vu.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(c cVar, f.b bVar) {
            super(cVar, bVar);
            if (cVar != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i6) {
            String str;
            int i10;
            if (i6 != 2) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 2) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            Object[] objArr = new Object[i10];
            if (i6 != 1) {
                if (i6 != 2) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
                }
            } else {
                objArr[0] = "computable";
            }
            if (i6 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i6 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i6 != 2) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // vu.c.g, vu.c.f, ss.a
        public final T invoke() {
            T t3 = (T) super.invoke();
            if (t3 != null) {
                return t3;
            }
            a(2);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class j<K, V> implements vu.h<K, V> {

        /* renamed from: u  reason: collision with root package name */
        public final c f36151u;

        /* renamed from: v  reason: collision with root package name */
        public final ConcurrentMap<K, Object> f36152v;

        /* renamed from: w  reason: collision with root package name */
        public final ss.l<? super K, ? extends V> f36153w;

        public j(c cVar, ConcurrentHashMap concurrentHashMap, ss.l lVar) {
            if (cVar != null) {
                this.f36151u = cVar;
                this.f36152v = concurrentHashMap;
                this.f36153w = lVar;
                return;
            }
            a(0);
            throw null;
        }

        public static /* synthetic */ void a(int i6) {
            String str;
            int i10;
            if (i6 != 3 && i6 != 4) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 3 && i6 != 4) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            Object[] objArr = new Object[i10];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3 && i6 != 4) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                    }
                } else {
                    objArr[0] = "compute";
                }
            } else {
                objArr[0] = "map";
            }
            if (i6 != 3) {
                if (i6 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                } else {
                    objArr[1] = "raceCondition";
                }
            } else {
                objArr[1] = "recursionDetected";
            }
            if (i6 != 3 && i6 != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i6 == 3 || i6 == 4) {
                throw new IllegalStateException(format);
            }
        }

        public final AssertionError b(K k10, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k10 + ". Old value is " + obj + " under " + this.f36151u);
            c.l(assertionError);
            return assertionError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ss.l
        public V invoke(K k10) {
            V v10;
            ConcurrentMap<K, Object> concurrentMap = this.f36152v;
            V v11 = (V) concurrentMap.get(k10);
            l lVar = l.COMPUTING;
            WrappedValues.a aVar = WrappedValues.f23477a;
            Object obj = null;
            if (v11 != null && v11 != lVar) {
                WrappedValues.a(v11);
                if (v11 == aVar) {
                    return null;
                }
                return v11;
            }
            c cVar = this.f36151u;
            vu.k kVar = cVar.f36141a;
            vu.k kVar2 = cVar.f36141a;
            kVar.lock();
            try {
                Object obj2 = concurrentMap.get(k10);
                l lVar2 = l.RECURSION_WAS_DETECTED;
                if (obj2 == lVar) {
                    m k11 = cVar.k(k10, "");
                    if (k11 != null) {
                        if (!k11.f36159b) {
                            v10 = (V) k11.f36158a;
                            return v10;
                        }
                        obj2 = lVar2;
                    } else {
                        a(3);
                        throw null;
                    }
                }
                if (obj2 == lVar2) {
                    m k12 = cVar.k(k10, "");
                    if (k12 != null) {
                        if (!k12.f36159b) {
                            v10 = (V) k12.f36158a;
                            return v10;
                        }
                    } else {
                        a(3);
                        throw null;
                    }
                }
                if (obj2 != null) {
                    WrappedValues.a(obj2);
                    if (obj2 != aVar) {
                        obj = obj2;
                    }
                    v10 = (V) obj;
                    return v10;
                }
                concurrentMap.put(k10, lVar);
                V invoke = this.f36153w.invoke(k10);
                if (invoke != 0) {
                    aVar = invoke;
                }
                Object put = concurrentMap.put(k10, aVar);
                if (put == lVar) {
                    return invoke;
                }
                throw b(k10, put);
            } finally {
                kVar2.unlock();
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class k<K, V> extends j<K, V> implements vu.g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(c cVar, ConcurrentHashMap concurrentHashMap, ss.l lVar) {
            super(cVar, concurrentHashMap, lVar);
            if (cVar != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i6) {
            String str;
            int i10;
            if (i6 != 3) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 3) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            Object[] objArr = new Object[i10];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
                    }
                } else {
                    objArr[0] = "compute";
                }
            } else {
                objArr[0] = "map";
            }
            if (i6 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i6 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i6 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // vu.c.j, ss.l
        public final V invoke(K k10) {
            V v10 = (V) super.invoke(k10);
            if (v10 != null) {
                return v10;
            }
            a(3);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public enum l {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f36158a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f36159b;

        public m(T t3, boolean z10) {
            this.f36158a = t3;
            this.f36159b = z10;
        }

        public final String toString() {
            if (this.f36159b) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.f36158a);
        }
    }

    public c() {
        throw null;
    }

    public c(String str, vu.k kVar) {
        d.a aVar = d.f36144a;
        this.f36141a = kVar;
        this.f36142b = aVar;
        this.f36143c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void i(int i6) {
        String str;
        int i10;
        String format;
        if (i6 != 10 && i6 != 13 && i6 != 20 && i6 != 37) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 10 && i6 != 13 && i6 != 20 && i6 != 37) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1 && i6 != 3 && i6 != 5) {
            if (i6 != 6) {
                switch (i6) {
                    case 8:
                        break;
                    case 9:
                    case 11:
                    case 14:
                    case 16:
                    case 19:
                    case 21:
                        objArr[0] = "compute";
                        break;
                    case 10:
                    case 13:
                    case 20:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                        break;
                    case 12:
                    case 17:
                    case 25:
                    case 27:
                        objArr[0] = "onRecursiveCall";
                        break;
                    case 15:
                    case 18:
                    case 22:
                        objArr[0] = "map";
                        break;
                    case 23:
                    case 24:
                    case 26:
                    case 28:
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    case 32:
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        objArr[0] = "computable";
                        break;
                    case 29:
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        objArr[0] = "postCompute";
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        objArr[0] = "source";
                        break;
                    case 36:
                        objArr[0] = "throwable";
                        break;
                    default:
                        objArr[0] = "debugText";
                        break;
                }
            } else {
                objArr[0] = "lock";
            }
            if (i6 == 10 && i6 != 13) {
                if (i6 != 20) {
                    if (i6 != 37) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    } else {
                        objArr[1] = "sanitizeStackTrace";
                    }
                } else {
                    objArr[1] = "createMemoizedFunctionWithNullableValues";
                }
            } else {
                objArr[1] = "createMemoizedFunction";
            }
            switch (i6) {
                case 4:
                case 5:
                case 6:
                    objArr[2] = "<init>";
                    break;
                case 7:
                case 8:
                    objArr[2] = "replaceExceptionHandling";
                    break;
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    objArr[2] = "createMemoizedFunction";
                    break;
                case 10:
                case 13:
                case 20:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    break;
                case 19:
                case 21:
                case 22:
                    objArr[2] = "createMemoizedFunctionWithNullableValues";
                    break;
                case 23:
                case 24:
                case 25:
                    objArr[2] = "createLazyValue";
                    break;
                case 26:
                case 27:
                    objArr[2] = "createRecursionTolerantLazyValue";
                    break;
                case 28:
                case 29:
                    objArr[2] = "createLazyValueWithPostCompute";
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    objArr[2] = "createNullableLazyValue";
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    objArr[2] = "createRecursionTolerantNullableLazyValue";
                    break;
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    objArr[2] = "createNullableLazyValueWithPostCompute";
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    objArr[2] = "compute";
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    objArr[2] = "recursionDetectedDefault";
                    break;
                case 36:
                    objArr[2] = "sanitizeStackTrace";
                    break;
                default:
                    objArr[2] = "createWithExceptionHandling";
                    break;
            }
            format = String.format(str, objArr);
            if (i6 != 10 || i6 == 13 || i6 == 20 || i6 == 37) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "exceptionHandlingStrategy";
        if (i6 == 10) {
        }
        objArr[1] = "createMemoizedFunction";
        switch (i6) {
        }
        format = String.format(str, objArr);
        if (i6 != 10) {
        }
        throw new IllegalStateException(format);
    }

    public static void l(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                if (!stackTrace[i6].getClassName().startsWith(f36139d)) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i6, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    @Override // vu.l
    public final C0608c a() {
        return new C0608c(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // vu.l
    public final j b(ss.l lVar) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    @Override // vu.l
    public final vu.e c(f.b bVar, f.c cVar, f.d dVar) {
        return new vu.e(this, bVar, cVar, dVar);
    }

    @Override // vu.l
    public final b d() {
        return new b(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // vu.l
    public final h e(ss.a aVar) {
        if (aVar != null) {
            return new h(this, aVar);
        }
        i(23);
        throw null;
    }

    @Override // vu.l
    public final f f(ss.a aVar) {
        return new f(this, aVar);
    }

    @Override // vu.l
    public final vu.d g(ss.a aVar) {
        return new vu.d(this, aVar);
    }

    @Override // vu.l
    public final k h(ss.l lVar) {
        return new k(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    public final Object j(dt.i iVar) {
        vu.k kVar = this.f36141a;
        kVar.lock();
        try {
            iVar.invoke();
            kVar.unlock();
            return null;
        } finally {
        }
    }

    public m k(Object obj, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        l(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return b0.b(sb2, this.f36143c, ")");
    }

    public c(String str) {
        this(str, new vu.b(0));
    }

    /* compiled from: LockBasedStorageManager.java */
    /* loaded from: classes2.dex */
    public static class f<T> implements vu.j<T> {

        /* renamed from: u  reason: collision with root package name */
        public final c f36147u;

        /* renamed from: v  reason: collision with root package name */
        public final ss.a<? extends T> f36148v;

        /* renamed from: w  reason: collision with root package name */
        public volatile Object f36149w;

        public f(c cVar, ss.a<? extends T> aVar) {
            if (cVar != null) {
                if (aVar != null) {
                    this.f36149w = l.NOT_COMPUTED;
                    this.f36147u = cVar;
                    this.f36148v = aVar;
                    return;
                }
                a(1);
                throw null;
            }
            a(0);
            throw null;
        }

        public static /* synthetic */ void a(int i6) {
            String str;
            int i10;
            if (i6 != 2 && i6 != 3) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 2 && i6 != 3) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            Object[] objArr = new Object[i10];
            if (i6 != 1) {
                if (i6 != 2 && i6 != 3) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                }
            } else {
                objArr[0] = "computable";
            }
            if (i6 != 2) {
                if (i6 != 3) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
                } else {
                    objArr[1] = "renderDebugInformation";
                }
            } else {
                objArr[1] = "recursionDetected";
            }
            if (i6 != 2 && i6 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i6 == 2 || i6 == 3) {
                throw new IllegalStateException(format);
            }
        }

        public m<T> c(boolean z10) {
            m<T> k10 = this.f36147u.k(null, "in a lazy value");
            if (k10 != null) {
                return k10;
            }
            a(2);
            throw null;
        }

        @Override // ss.a
        public T invoke() {
            T t3 = (T) this.f36149w;
            if (!(t3 instanceof l)) {
                WrappedValues.a(t3);
                return t3;
            }
            this.f36147u.f36141a.lock();
            try {
                T t10 = (T) this.f36149w;
                if (!(t10 instanceof l)) {
                    WrappedValues.a(t10);
                } else {
                    l lVar = l.COMPUTING;
                    l lVar2 = l.RECURSION_WAS_DETECTED;
                    if (t10 == lVar) {
                        this.f36149w = lVar2;
                        m<T> c10 = c(true);
                        if (!c10.f36159b) {
                            t10 = c10.f36158a;
                        }
                    }
                    if (t10 == lVar2) {
                        m<T> c11 = c(false);
                        if (!c11.f36159b) {
                            t10 = c11.f36158a;
                        }
                    }
                    this.f36149w = lVar;
                    t10 = this.f36148v.invoke();
                    b(t10);
                    this.f36149w = t10;
                }
                return t10;
            } finally {
                this.f36147u.f36141a.unlock();
            }
        }

        public void b(T t3) {
        }
    }
}
