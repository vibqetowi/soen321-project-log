package f4;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class a implements Closeable {
    public BufferedWriter C;
    public int E;

    /* renamed from: u  reason: collision with root package name */
    public final File f14782u;

    /* renamed from: v  reason: collision with root package name */
    public final File f14783v;

    /* renamed from: w  reason: collision with root package name */
    public final File f14784w;

    /* renamed from: x  reason: collision with root package name */
    public final File f14785x;

    /* renamed from: z  reason: collision with root package name */
    public final long f14787z;
    public long B = 0;
    public final LinkedHashMap<String, d> D = new LinkedHashMap<>(0, 0.75f, true);
    public long F = 0;
    public final ThreadPoolExecutor G = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final CallableC0229a H = new CallableC0229a();

    /* renamed from: y  reason: collision with root package name */
    public final int f14786y = 1;
    public final int A = 1;

    /* compiled from: DiskLruCache.java */
    /* renamed from: f4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0229a implements Callable<Void> {
        public CallableC0229a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.C != null) {
                    aVar.c0();
                    if (a.this.o()) {
                        a.this.O();
                        a.this.E = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f14789a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f14790b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f14791c;

        public c(d dVar) {
            boolean[] zArr;
            this.f14789a = dVar;
            if (dVar.f14797e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.A];
            }
            this.f14790b = zArr;
        }

        public final void a() {
            a.a(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                d dVar = this.f14789a;
                if (dVar.f == this) {
                    if (!dVar.f14797e) {
                        this.f14790b[0] = true;
                    }
                    file = dVar.f14796d[0];
                    if (!a.this.f14782u.exists()) {
                        a.this.f14782u.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f14793a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f14794b;

        /* renamed from: c  reason: collision with root package name */
        public final File[] f14795c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f14796d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f14797e;
        public c f;

        public d(String str) {
            this.f14793a = str;
            int i6 = a.this.A;
            this.f14794b = new long[i6];
            this.f14795c = new File[i6];
            this.f14796d = new File[i6];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < a.this.A; i10++) {
                sb2.append(i10);
                File[] fileArr = this.f14795c;
                String sb3 = sb2.toString();
                File file = a.this.f14782u;
                fileArr[i10] = new File(file, sb3);
                sb2.append(".tmp");
                this.f14796d[i10] = new File(file, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final String a() {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f14794b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f14799a;

        public e(File[] fileArr) {
            this.f14799a = fileArr;
        }
    }

    public a(File file, long j10) {
        this.f14782u = file;
        this.f14783v = new File(file, "journal");
        this.f14784w = new File(file, "journal.tmp");
        this.f14785x = new File(file, "journal.bkp");
        this.f14787z = j10;
    }

    public static void R(File file, File file2, boolean z10) {
        if (z10) {
            g(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    public static void a(a aVar, c cVar, boolean z10) {
        synchronized (aVar) {
            d dVar = cVar.f14789a;
            if (dVar.f == cVar) {
                if (z10 && !dVar.f14797e) {
                    for (int i6 = 0; i6 < aVar.A; i6++) {
                        if (cVar.f14790b[i6]) {
                            if (!dVar.f14796d[i6].exists()) {
                                cVar.a();
                                return;
                            }
                        } else {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i6);
                        }
                    }
                }
                for (int i10 = 0; i10 < aVar.A; i10++) {
                    File file = dVar.f14796d[i10];
                    if (z10) {
                        if (file.exists()) {
                            File file2 = dVar.f14795c[i10];
                            file.renameTo(file2);
                            long j10 = dVar.f14794b[i10];
                            long length = file2.length();
                            dVar.f14794b[i10] = length;
                            aVar.B = (aVar.B - j10) + length;
                        }
                    } else {
                        g(file);
                    }
                }
                aVar.E++;
                dVar.f = null;
                if (dVar.f14797e | z10) {
                    dVar.f14797e = true;
                    aVar.C.append((CharSequence) "CLEAN");
                    aVar.C.append(' ');
                    aVar.C.append((CharSequence) dVar.f14793a);
                    aVar.C.append((CharSequence) dVar.a());
                    aVar.C.append('\n');
                    if (z10) {
                        aVar.F++;
                        dVar.getClass();
                    }
                } else {
                    aVar.D.remove(dVar.f14793a);
                    aVar.C.append((CharSequence) "REMOVE");
                    aVar.C.append(' ');
                    aVar.C.append((CharSequence) dVar.f14793a);
                    aVar.C.append('\n');
                }
                j(aVar.C);
                if (aVar.B > aVar.f14787z || aVar.o()) {
                    aVar.G.submit(aVar.H);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void e(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void g(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void j(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a s(File file, long j10) {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    R(file2, file3, false);
                }
            }
            a aVar = new a(file, j10);
            if (aVar.f14783v.exists()) {
                try {
                    aVar.I();
                    aVar.G();
                    return aVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.close();
                    f4.c.a(aVar.f14782u);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j10);
            aVar2.O();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void G() {
        g(this.f14784w);
        Iterator<d> it = this.D.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f;
            int i6 = this.A;
            int i10 = 0;
            if (cVar == null) {
                while (i10 < i6) {
                    this.B += next.f14794b[i10];
                    i10++;
                }
            } else {
                next.f = null;
                while (i10 < i6) {
                    g(next.f14795c[i10]);
                    g(next.f14796d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void I() {
        File file = this.f14783v;
        f4.b bVar = new f4.b(new FileInputStream(file), f4.c.f14806a);
        try {
            String a10 = bVar.a();
            String a11 = bVar.a();
            String a12 = bVar.a();
            String a13 = bVar.a();
            String a14 = bVar.a();
            if ("libcore.io.DiskLruCache".equals(a10) && "1".equals(a11) && Integer.toString(this.f14786y).equals(a12) && Integer.toString(this.A).equals(a13) && "".equals(a14)) {
                boolean z10 = false;
                int i6 = 0;
                while (true) {
                    try {
                        J(bVar.a());
                        i6++;
                    } catch (EOFException unused) {
                        this.E = i6 - this.D.size();
                        if (bVar.f14804y == -1) {
                            z10 = true;
                        }
                        if (z10) {
                            O();
                        } else {
                            this.C = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), f4.c.f14806a));
                        }
                        try {
                            bVar.close();
                            return;
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + a10 + ", " + a11 + ", " + a13 + ", " + a14 + "]");
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void J(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i6 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i6);
            LinkedHashMap<String, d> linkedHashMap = this.D;
            if (indexOf2 == -1) {
                substring = str.substring(i6);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i6, indexOf2);
            }
            d dVar = linkedHashMap.get(substring);
            if (dVar == null) {
                dVar = new d(substring);
                linkedHashMap.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f14797e = true;
                dVar.f = null;
                if (split.length == a.this.A) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        try {
                            dVar.f14794b[i10] = Long.parseLong(split[i10]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void O() {
        BufferedWriter bufferedWriter = this.C;
        if (bufferedWriter != null) {
            e(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14784w), f4.c.f14806a));
        bufferedWriter2.write("libcore.io.DiskLruCache");
        bufferedWriter2.write("\n");
        bufferedWriter2.write("1");
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f14786y));
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.A));
        bufferedWriter2.write("\n");
        bufferedWriter2.write("\n");
        for (d dVar : this.D.values()) {
            if (dVar.f != null) {
                bufferedWriter2.write("DIRTY " + dVar.f14793a + '\n');
            } else {
                bufferedWriter2.write("CLEAN " + dVar.f14793a + dVar.a() + '\n');
            }
        }
        e(bufferedWriter2);
        if (this.f14783v.exists()) {
            R(this.f14783v, this.f14785x, true);
        }
        R(this.f14784w, this.f14783v, false);
        this.f14785x.delete();
        this.C = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14783v, true), f4.c.f14806a));
    }

    public final void c0() {
        while (this.B > this.f14787z) {
            String key = this.D.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.C != null) {
                    d dVar = this.D.get(key);
                    if (dVar != null && dVar.f == null) {
                        for (int i6 = 0; i6 < this.A; i6++) {
                            File file = dVar.f14795c[i6];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j10 = this.B;
                            long[] jArr = dVar.f14794b;
                            this.B = j10 - jArr[i6];
                            jArr[i6] = 0;
                        }
                        this.E++;
                        this.C.append((CharSequence) "REMOVE");
                        this.C.append(' ');
                        this.C.append((CharSequence) key);
                        this.C.append('\n');
                        this.D.remove(key);
                        if (o()) {
                            this.G.submit(this.H);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.C == null) {
            return;
        }
        Iterator it = new ArrayList(this.D.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f;
            if (cVar != null) {
                cVar.a();
            }
        }
        c0();
        e(this.C);
        this.C = null;
    }

    public final c h(String str) {
        synchronized (this) {
            if (this.C != null) {
                d dVar = this.D.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.D.put(str, dVar);
                } else if (dVar.f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f = cVar;
                this.C.append((CharSequence) "DIRTY");
                this.C.append(' ');
                this.C.append((CharSequence) str);
                this.C.append('\n');
                j(this.C);
                return cVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized e m(String str) {
        if (this.C != null) {
            d dVar = this.D.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f14797e) {
                return null;
            }
            for (File file : dVar.f14795c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.E++;
            this.C.append((CharSequence) "READ");
            this.C.append(' ');
            this.C.append((CharSequence) str);
            this.C.append('\n');
            if (o()) {
                this.G.submit(this.H);
            }
            return new e(dVar.f14795c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean o() {
        int i6 = this.E;
        if (i6 >= 2000 && i6 >= this.D.size()) {
            return true;
        }
        return false;
    }
}
