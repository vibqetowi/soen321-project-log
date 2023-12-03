package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import e4.a;
import e4.o;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: DiskBasedCache.java */
/* loaded from: classes.dex */
public final class d implements e4.a {

    /* renamed from: c  reason: collision with root package name */
    public final c f5881c;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f5879a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public long f5880b = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f5882d = 5242880;

    /* compiled from: DiskBasedCache.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    public d(m mVar) {
        this.f5881c = mVar;
    }

    public static String c(String str) {
        int length = str.length() / 2;
        StringBuilder c10 = v.h.c(String.valueOf(str.substring(0, length).hashCode()));
        c10.append(String.valueOf(str.substring(length).hashCode()));
        return c10.toString();
    }

    public static int h(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static int i(InputStream inputStream) {
        return (h(inputStream) << 24) | (h(inputStream) << 0) | 0 | (h(inputStream) << 8) | (h(inputStream) << 16);
    }

    public static long j(InputStream inputStream) {
        return ((h(inputStream) & 255) << 0) | 0 | ((h(inputStream) & 255) << 8) | ((h(inputStream) & 255) << 16) | ((h(inputStream) & 255) << 24) | ((h(inputStream) & 255) << 32) | ((h(inputStream) & 255) << 40) | ((h(inputStream) & 255) << 48) | ((255 & h(inputStream)) << 56);
    }

    public static String k(b bVar) {
        return new String(m(bVar, j(bVar)), "UTF-8");
    }

    public static byte[] m(b bVar, long j10) {
        long j11 = bVar.f5890u - bVar.f5891v;
        if (j10 >= 0 && j10 <= j11) {
            int i6 = (int) j10;
            if (i6 == j10) {
                byte[] bArr = new byte[i6];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + j11);
    }

    public static void n(BufferedOutputStream bufferedOutputStream, int i6) {
        bufferedOutputStream.write((i6 >> 0) & 255);
        bufferedOutputStream.write((i6 >> 8) & 255);
        bufferedOutputStream.write((i6 >> 16) & 255);
        bufferedOutputStream.write((i6 >> 24) & 255);
    }

    public static void o(BufferedOutputStream bufferedOutputStream, long j10) {
        bufferedOutputStream.write((byte) (j10 >>> 0));
        bufferedOutputStream.write((byte) (j10 >>> 8));
        bufferedOutputStream.write((byte) (j10 >>> 16));
        bufferedOutputStream.write((byte) (j10 >>> 24));
        bufferedOutputStream.write((byte) (j10 >>> 32));
        bufferedOutputStream.write((byte) (j10 >>> 40));
        bufferedOutputStream.write((byte) (j10 >>> 48));
        bufferedOutputStream.write((byte) (j10 >>> 56));
    }

    public static void p(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        o(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public final synchronized a.C0214a a(String str) {
        a aVar = (a) this.f5879a.get(str);
        if (aVar == null) {
            return null;
        }
        File b10 = b(str);
        try {
            b bVar = new b(new BufferedInputStream(new FileInputStream(b10)), b10.length());
            try {
                a a10 = a.a(bVar);
                if (!TextUtils.equals(str, a10.f5884b)) {
                    o.b("%s: key=%s, found=%s", b10.getAbsolutePath(), str, a10.f5884b);
                    a aVar2 = (a) this.f5879a.remove(str);
                    if (aVar2 != null) {
                        this.f5880b -= aVar2.f5883a;
                    }
                    return null;
                }
                return aVar.b(m(bVar, bVar.f5890u - bVar.f5891v));
            } finally {
                bVar.close();
            }
        } catch (IOException e10) {
            o.b("%s: %s", b10.getAbsolutePath(), e10.toString());
            l(str);
            return null;
        }
    }

    public final File b(String str) {
        return new File(((m) this.f5881c).a(), c(str));
    }

    public final synchronized void d() {
        long length;
        b bVar;
        File a10 = ((m) this.f5881c).a();
        if (!a10.exists()) {
            if (!a10.mkdirs()) {
                o.c("Unable to create cache dir %s", a10.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = a10.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                bVar = new b(new BufferedInputStream(new FileInputStream(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                a a11 = a.a(bVar);
                a11.f5883a = length;
                g(a11.f5884b, a11);
                bVar.close();
            } catch (Throwable th2) {
                bVar.close();
                throw th2;
                break;
            }
        }
    }

    public final void e() {
        long j10 = this.f5880b;
        int i6 = this.f5882d;
        if (j10 < i6) {
            return;
        }
        if (o.f13792a) {
            o.d("Pruning old cache entries.", new Object[0]);
        }
        long j11 = this.f5880b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f5879a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a aVar = (a) ((Map.Entry) it.next()).getValue();
            if (b(aVar.f5884b).delete()) {
                this.f5880b -= aVar.f5883a;
            } else {
                String str = aVar.f5884b;
                o.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
            }
            it.remove();
            i10++;
            if (((float) this.f5880b) < i6 * 0.9f) {
                break;
            }
        }
        if (o.f13792a) {
            o.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.f5880b - j11), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public final synchronized void f(String str, a.C0214a c0214a) {
        BufferedOutputStream bufferedOutputStream;
        a aVar;
        long j10 = this.f5880b;
        byte[] bArr = c0214a.f13738a;
        long length = j10 + bArr.length;
        int i6 = this.f5882d;
        if (length > i6 && bArr.length > i6 * 0.9f) {
            return;
        }
        File b10 = b(str);
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(b10));
            aVar = new a(str, c0214a);
        } catch (IOException unused) {
            if (!b10.delete()) {
                o.b("Could not clean up file %s", b10.getAbsolutePath());
            }
            if (!((m) this.f5881c).a().exists()) {
                o.b("Re-initializing cache after external clearing.", new Object[0]);
                this.f5879a.clear();
                this.f5880b = 0L;
                d();
            }
        }
        if (aVar.c(bufferedOutputStream)) {
            bufferedOutputStream.write(c0214a.f13738a);
            bufferedOutputStream.close();
            aVar.f5883a = b10.length();
            g(str, aVar);
            e();
            return;
        }
        bufferedOutputStream.close();
        o.b("Failed to write header for %s", b10.getAbsolutePath());
        throw new IOException();
    }

    public final void g(String str, a aVar) {
        LinkedHashMap linkedHashMap = this.f5879a;
        if (!linkedHashMap.containsKey(str)) {
            this.f5880b += aVar.f5883a;
        } else {
            this.f5880b = (aVar.f5883a - ((a) linkedHashMap.get(str)).f5883a) + this.f5880b;
        }
        linkedHashMap.put(str, aVar);
    }

    public final synchronized void l(String str) {
        boolean delete = b(str).delete();
        a aVar = (a) this.f5879a.remove(str);
        if (aVar != null) {
            this.f5880b -= aVar.f5883a;
        }
        if (!delete) {
            o.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
        }
    }

    /* compiled from: DiskBasedCache.java */
    /* loaded from: classes.dex */
    public static class b extends FilterInputStream {

        /* renamed from: u  reason: collision with root package name */
        public final long f5890u;

        /* renamed from: v  reason: collision with root package name */
        public long f5891v;

        public b(BufferedInputStream bufferedInputStream, long j10) {
            super(bufferedInputStream);
            this.f5890u = j10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() {
            int read = super.read();
            if (read != -1) {
                this.f5891v++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i6, int i10) {
            int read = super.read(bArr, i6, i10);
            if (read != -1) {
                this.f5891v += read;
            }
            return read;
        }
    }

    /* compiled from: DiskBasedCache.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f5883a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5884b;

        /* renamed from: c  reason: collision with root package name */
        public final String f5885c;

        /* renamed from: d  reason: collision with root package name */
        public final long f5886d;

        /* renamed from: e  reason: collision with root package name */
        public final long f5887e;
        public final long f;

        /* renamed from: g  reason: collision with root package name */
        public final long f5888g;

        /* renamed from: h  reason: collision with root package name */
        public final List<e4.f> f5889h;

        public a(String str, String str2, long j10, long j11, long j12, long j13, List<e4.f> list) {
            this.f5884b = str;
            this.f5885c = "".equals(str2) ? null : str2;
            this.f5886d = j10;
            this.f5887e = j11;
            this.f = j12;
            this.f5888g = j13;
            this.f5889h = list;
        }

        public static a a(b bVar) {
            List arrayList;
            if (d.i(bVar) == 538247942) {
                String k10 = d.k(bVar);
                String k11 = d.k(bVar);
                long j10 = d.j(bVar);
                long j11 = d.j(bVar);
                long j12 = d.j(bVar);
                long j13 = d.j(bVar);
                int i6 = d.i(bVar);
                if (i6 >= 0) {
                    if (i6 == 0) {
                        arrayList = Collections.emptyList();
                    } else {
                        arrayList = new ArrayList();
                    }
                    List list = arrayList;
                    for (int i10 = 0; i10 < i6; i10++) {
                        list.add(new e4.f(d.k(bVar).intern(), d.k(bVar).intern()));
                    }
                    return new a(k10, k11, j10, j11, j12, j13, list);
                }
                throw new IOException(defpackage.c.p("readHeaderList size=", i6));
            }
            throw new IOException();
        }

        public final a.C0214a b(byte[] bArr) {
            a.C0214a c0214a = new a.C0214a();
            c0214a.f13738a = bArr;
            c0214a.f13739b = this.f5885c;
            c0214a.f13740c = this.f5886d;
            c0214a.f13741d = this.f5887e;
            c0214a.f13742e = this.f;
            c0214a.f = this.f5888g;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List<e4.f> list = this.f5889h;
            for (e4.f fVar : list) {
                treeMap.put(fVar.f13761a, fVar.f13762b);
            }
            c0214a.f13743g = treeMap;
            c0214a.f13744h = Collections.unmodifiableList(list);
            return c0214a;
        }

        public final boolean c(BufferedOutputStream bufferedOutputStream) {
            try {
                d.n(bufferedOutputStream, 538247942);
                d.p(bufferedOutputStream, this.f5884b);
                String str = this.f5885c;
                if (str == null) {
                    str = "";
                }
                d.p(bufferedOutputStream, str);
                d.o(bufferedOutputStream, this.f5886d);
                d.o(bufferedOutputStream, this.f5887e);
                d.o(bufferedOutputStream, this.f);
                d.o(bufferedOutputStream, this.f5888g);
                List<e4.f> list = this.f5889h;
                if (list != null) {
                    d.n(bufferedOutputStream, list.size());
                    for (e4.f fVar : list) {
                        d.p(bufferedOutputStream, fVar.f13761a);
                        d.p(bufferedOutputStream, fVar.f13762b);
                    }
                } else {
                    d.n(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException e10) {
                o.b("%s", e10.toString());
                return false;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<e4.f>] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(String str, a.C0214a c0214a) {
            this(str, r2, r3, r5, r7, r9, r0);
            String str2 = c0214a.f13739b;
            long j10 = c0214a.f13740c;
            long j11 = c0214a.f13741d;
            long j12 = c0214a.f13742e;
            long j13 = c0214a.f;
            ?? r02 = c0214a.f13744h;
            if (r02 == 0) {
                Map<String, String> map = c0214a.f13743g;
                r02 = new ArrayList(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    r02.add(new e4.f(entry.getKey(), entry.getValue()));
                }
            }
        }
    }
}
