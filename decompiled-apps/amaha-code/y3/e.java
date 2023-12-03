package y3;

import androidx.recyclerview.widget.LinearLayoutManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
/* compiled from: EventsFileManager.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final kotlinx.coroutines.sync.c f38206e = new kotlinx.coroutines.sync.c(false);
    public static final kotlinx.coroutines.sync.c f = new kotlinx.coroutines.sync.c(false);

    /* renamed from: g  reason: collision with root package name */
    public static final Set<String> f38207g;

    /* renamed from: h  reason: collision with root package name */
    public static final ConcurrentHashMap f38208h;

    /* renamed from: a  reason: collision with root package name */
    public final File f38209a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38210b;

    /* renamed from: c  reason: collision with root package name */
    public final b4.a f38211c;

    /* renamed from: d  reason: collision with root package name */
    public final String f38212d;

    /* compiled from: EventsFileManager.kt */
    @ns.e(c = "com.amplitude.core.utilities.EventsFileManager", f = "EventsFileManager.kt", l = {193}, m = "getEventString")
    /* loaded from: classes.dex */
    public static final class a extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public String f38213u;

        /* renamed from: v  reason: collision with root package name */
        public kotlinx.coroutines.sync.c f38214v;

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f38215w;

        /* renamed from: y  reason: collision with root package name */
        public int f38217y;

        public a(ls.d<? super a> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f38215w = obj;
            this.f38217y |= LinearLayoutManager.INVALID_OFFSET;
            return e.this.c(null, this);
        }
    }

    /* compiled from: EventsFileManager.kt */
    @ns.e(c = "com.amplitude.core.utilities.EventsFileManager", f = "EventsFileManager.kt", l = {193}, m = "rollover")
    /* loaded from: classes.dex */
    public static final class b extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public e f38218u;

        /* renamed from: v  reason: collision with root package name */
        public kotlinx.coroutines.sync.c f38219v;

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f38220w;

        /* renamed from: y  reason: collision with root package name */
        public int f38222y;

        public b(ls.d<? super b> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f38220w = obj;
            this.f38222y |= LinearLayoutManager.INVALID_OFFSET;
            return e.this.d(this);
        }
    }

    /* compiled from: EventsFileManager.kt */
    @ns.e(c = "com.amplitude.core.utilities.EventsFileManager", f = "EventsFileManager.kt", l = {193}, m = "storeEvent")
    /* loaded from: classes.dex */
    public static final class c extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public e f38223u;

        /* renamed from: v  reason: collision with root package name */
        public String f38224v;

        /* renamed from: w  reason: collision with root package name */
        public kotlinx.coroutines.sync.c f38225w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f38226x;

        /* renamed from: z  reason: collision with root package name */
        public int f38228z;

        public c(ls.d<? super c> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f38226x = obj;
            this.f38228z |= LinearLayoutManager.INVALID_OFFSET;
            return e.this.e(null, this);
        }
    }

    static {
        Set<String> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        kotlin.jvm.internal.i.f(newSetFromMap, "newSetFromMap(Concurrent…shMap<String, Boolean>())");
        f38207g = newSetFromMap;
        f38208h = new ConcurrentHashMap();
    }

    public e(File file, String apiKey, q3.a aVar) {
        kotlin.jvm.internal.i.g(apiKey, "apiKey");
        this.f38209a = file;
        this.f38210b = apiKey;
        this.f38211c = aVar;
        kc.f.v(file);
        this.f38212d = kotlin.jvm.internal.i.n(apiKey, "amplitude.events.file.index.");
    }

    public static void g(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            hs.k kVar = hs.k.f19476a;
            ca.a.z(fileOutputStream, null);
        } finally {
        }
    }

    public final File a() {
        ConcurrentHashMap concurrentHashMap = f38208h;
        String str = this.f38210b;
        File file = (File) concurrentHashMap.get(str);
        File file2 = this.f38209a;
        if (file == null) {
            File[] listFiles = file2.listFiles(new d(this, 0));
            if (listFiles == null) {
                listFiles = new File[0];
            }
            file = (File) is.k.V1(0, listFiles);
        }
        long a10 = this.f38211c.a(this.f38212d);
        if (file == null) {
            file = new File(file2, str + '-' + a10 + ".tmp");
        }
        concurrentHashMap.put(str, file);
        Object obj = concurrentHashMap.get(str);
        kotlin.jvm.internal.i.d(obj);
        return (File) obj;
    }

    public final void b(File file) {
        if (file.exists() && file.length() != 0) {
            byte[] bytes = "]".getBytes(gv.a.f16927b);
            kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
            g(file, bytes);
            file.renameTo(new File(this.f38209a, rs.a.G1(file)));
            b4.a aVar = this.f38211c;
            String str = this.f38212d;
            aVar.b(aVar.a(str) + 1, str);
            f38208h.remove(this.f38210b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #2 {all -> 0x008e, blocks: (B:18:0x0048, B:20:0x0050, B:23:0x0059, B:25:0x0071, B:29:0x0080, B:26:0x0074, B:28:0x007c), top: B:40:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[Catch: all -> 0x008e, TRY_ENTER, TryCatch #2 {all -> 0x008e, blocks: (B:18:0x0048, B:20:0x0050, B:23:0x0059, B:25:0x0071, B:29:0x0080, B:26:0x0074, B:28:0x007c), top: B:40:0x0048 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ls.d<? super String> dVar) {
        a aVar;
        int i6;
        kotlinx.coroutines.sync.c cVar;
        Set<String> set;
        BufferedReader bufferedReader;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f38217y;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f38217y = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = aVar.f38215w;
                    ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                    i6 = aVar.f38217y;
                    if (i6 == 0) {
                        if (i6 == 1) {
                            kotlinx.coroutines.sync.c cVar2 = aVar.f38214v;
                            String str2 = aVar.f38213u;
                            sp.b.d0(obj);
                            cVar = cVar2;
                            str = str2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sp.b.d0(obj);
                        aVar.f38213u = str;
                        cVar = f;
                        aVar.f38214v = cVar;
                        aVar.f38217y = 1;
                        if (cVar.b(aVar) == aVar2) {
                            return aVar2;
                        }
                    }
                    set = f38207g;
                    if (!set.contains(str)) {
                        set.remove(str);
                        return "";
                    }
                    set.add(str);
                    File file = new File(str);
                    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), gv.a.f16927b);
                    if (inputStreamReader instanceof BufferedReader) {
                        bufferedReader = (BufferedReader) inputStreamReader;
                    } else {
                        bufferedReader = new BufferedReader(inputStreamReader, 8192);
                    }
                    String c12 = ca.a.c1(bufferedReader);
                    ca.a.z(bufferedReader, null);
                    return c12;
                }
            }
            set = f38207g;
            if (!set.contains(str)) {
            }
        } finally {
            cVar.a(null);
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f38215w;
        ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
        i6 = aVar.f38217y;
        if (i6 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ls.d<? super hs.k> dVar) {
        b bVar;
        int i6;
        e eVar;
        kotlinx.coroutines.sync.c cVar;
        File a10;
        try {
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i10 = bVar.f38222y;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f38222y = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = bVar.f38220w;
                    ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                    i6 = bVar.f38222y;
                    if (i6 == 0) {
                        if (i6 == 1) {
                            cVar = bVar.f38219v;
                            eVar = bVar.f38218u;
                            sp.b.d0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sp.b.d0(obj);
                        bVar.f38218u = this;
                        kotlinx.coroutines.sync.c cVar2 = f38206e;
                        bVar.f38219v = cVar2;
                        bVar.f38222y = 1;
                        if (cVar2.b(bVar) == aVar) {
                            return aVar;
                        }
                        eVar = this;
                        cVar = cVar2;
                    }
                    a10 = eVar.a();
                    if (a10.exists() && a10.length() > 0) {
                        eVar.b(a10);
                    }
                    hs.k kVar = hs.k.f19476a;
                    cVar.a(null);
                    return hs.k.f19476a;
                }
            }
            a10 = eVar.a();
            if (a10.exists()) {
                eVar.b(a10);
            }
            hs.k kVar2 = hs.k.f19476a;
            cVar.a(null);
            return hs.k.f19476a;
        } catch (Throwable th2) {
            cVar.a(null);
            throw th2;
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f38220w;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = bVar.f38222y;
        if (i6 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:19:0x004d, B:21:0x0057, B:22:0x005a, B:24:0x0065, B:26:0x0072, B:27:0x0076, B:30:0x0084, B:34:0x00a3, B:36:0x00ab, B:39:0x00bd, B:40:0x00c4, B:31:0x0093, B:33:0x009d), top: B:44:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:19:0x004d, B:21:0x0057, B:22:0x005a, B:24:0x0065, B:26:0x0072, B:27:0x0076, B:30:0x0084, B:34:0x00a3, B:36:0x00ab, B:39:0x00bd, B:40:0x00c4, B:31:0x0093, B:33:0x009d), top: B:44:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: all -> 0x00c5, TRY_ENTER, TryCatch #0 {all -> 0x00c5, blocks: (B:19:0x004d, B:21:0x0057, B:22:0x005a, B:24:0x0065, B:26:0x0072, B:27:0x0076, B:30:0x0084, B:34:0x00a3, B:36:0x00ab, B:39:0x00bd, B:40:0x00c4, B:31:0x0093, B:33:0x009d), top: B:44:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:19:0x004d, B:21:0x0057, B:22:0x005a, B:24:0x0065, B:26:0x0072, B:27:0x0076, B:30:0x0084, B:34:0x00a3, B:36:0x00ab, B:39:0x00bd, B:40:0x00c4, B:31:0x0093, B:33:0x009d), top: B:44:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #0 {all -> 0x00c5, blocks: (B:19:0x004d, B:21:0x0057, B:22:0x005a, B:24:0x0065, B:26:0x0072, B:27:0x0076, B:30:0x0084, B:34:0x00a3, B:36:0x00ab, B:39:0x00bd, B:40:0x00c4, B:31:0x0093, B:33:0x009d), top: B:44:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: all -> 0x00c5, TRY_ENTER, TryCatch #0 {all -> 0x00c5, blocks: (B:19:0x004d, B:21:0x0057, B:22:0x005a, B:24:0x0065, B:26:0x0072, B:27:0x0076, B:30:0x0084, B:34:0x00a3, B:36:0x00ab, B:39:0x00bd, B:40:0x00c4, B:31:0x0093, B:33:0x009d), top: B:44:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ls.d<? super hs.k> dVar) {
        c cVar;
        int i6;
        kotlinx.coroutines.sync.c cVar2;
        e eVar;
        File a10;
        String n10;
        try {
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i10 = cVar.f38228z;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    cVar.f38228z = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = cVar.f38226x;
                    ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                    i6 = cVar.f38228z;
                    if (i6 == 0) {
                        if (i6 == 1) {
                            kotlinx.coroutines.sync.c cVar3 = cVar.f38225w;
                            String str2 = cVar.f38224v;
                            eVar = cVar.f38223u;
                            sp.b.d0(obj);
                            cVar2 = cVar3;
                            str = str2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sp.b.d0(obj);
                        cVar.f38223u = this;
                        cVar.f38224v = str;
                        cVar2 = f38206e;
                        cVar.f38225w = cVar2;
                        cVar.f38228z = 1;
                        if (cVar2.b(cVar) == aVar) {
                            return aVar;
                        }
                        eVar = this;
                    }
                    a10 = eVar.a();
                    if (!a10.exists()) {
                        a10.createNewFile();
                    }
                    while (a10.length() > 975000) {
                        eVar.b(a10);
                        a10 = eVar.a();
                        if (!a10.exists()) {
                            a10.createNewFile();
                        }
                    }
                    String str3 = "";
                    if (a10.length() != 0) {
                        byte[] bytes = "[".getBytes(gv.a.f16927b);
                        kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
                        g(a10, bytes);
                    } else if (a10.length() > 1) {
                        str3 = kotlin.jvm.internal.i.n(",", "");
                    }
                    n10 = kotlin.jvm.internal.i.n(str, str3);
                    Charset charset = gv.a.f16927b;
                    if (n10 == null) {
                        byte[] bytes2 = n10.getBytes(charset);
                        kotlin.jvm.internal.i.f(bytes2, "(this as java.lang.String).getBytes(charset)");
                        g(a10, bytes2);
                        hs.k kVar = hs.k.f19476a;
                        cVar2.a(null);
                        return hs.k.f19476a;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            a10 = eVar.a();
            if (!a10.exists()) {
            }
            while (a10.length() > 975000) {
            }
            String str32 = "";
            if (a10.length() != 0) {
            }
            n10 = kotlin.jvm.internal.i.n(str, str32);
            Charset charset2 = gv.a.f16927b;
            if (n10 == null) {
            }
        } catch (Throwable th2) {
            cVar2.a(null);
            throw th2;
        }
        cVar = new c(dVar);
        Object obj2 = cVar.f38226x;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = cVar.f38228z;
        if (i6 == 0) {
        }
    }

    public final void f(File file, String str) {
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bytes = str.getBytes(gv.a.f16927b);
            kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            hs.k kVar = hs.k.f19476a;
            ca.a.z(fileOutputStream, null);
            file.renameTo(new File(this.f38209a, rs.a.G1(file)));
        } finally {
        }
    }
}
