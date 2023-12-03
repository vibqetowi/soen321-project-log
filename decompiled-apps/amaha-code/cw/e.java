package cw;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import cw.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.zip.ZipFile;
import pl.droidsonroids.relinker.MissingLibraryException;
/* compiled from: ReLinkerInstance.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f12122a;

    /* renamed from: b  reason: collision with root package name */
    public final c f12123b;

    /* renamed from: c  reason: collision with root package name */
    public final b f12124c;

    public e() {
        f fVar = new f();
        a aVar = new a();
        this.f12122a = new HashSet();
        this.f12123b = fVar;
        this.f12124c = aVar;
    }

    public static void d(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public final File a(Context context, String str, String str2) {
        boolean z10;
        String a10 = ((f) this.f12123b).a(str);
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return new File(context.getDir("lib", 0), a10);
        }
        return new File(context.getDir("lib", 0), defpackage.d.f(a10, ".", str2));
    }

    public final void b(Context context) {
        boolean z10;
        if (context != null) {
            if ("pl_droidsonroids_gif".length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                d("Beginning load of %s...", "pl_droidsonroids_gif");
                c(context, "pl_droidsonroids_gif", null);
                return;
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
        if (r13 != null) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context, String str, String str2) {
        a.C0182a c0182a;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        Closeable closeable;
        ?? r12;
        boolean z10;
        c cVar = this.f12123b;
        HashSet hashSet = this.f12122a;
        boolean z11 = false;
        if (hashSet.contains(str)) {
            d("%s already loaded previously!", str);
            return;
        }
        try {
            ((f) cVar).getClass();
            System.loadLibrary(str);
            hashSet.add(str);
            d("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e10) {
            d("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            d("%s (%s) was not loaded normally, re-linking...", str, str2);
            File a10 = a(context, str, str2);
            if (!a10.exists()) {
                File dir = context.getDir("lib", 0);
                File a11 = a(context, str, str2);
                f fVar = (f) cVar;
                File[] listFiles = dir.listFiles(new d(fVar.a(str)));
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (!file.getAbsolutePath().equals(a11.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                fVar.getClass();
                String[] strArr2 = Build.SUPPORTED_ABIS;
                if (strArr2.length <= 0) {
                    String str3 = Build.CPU_ABI2;
                    if (str3 != null && str3.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    strArr2 = !z10 ? new String[]{Build.CPU_ABI, str3} : new String[]{Build.CPU_ABI};
                }
                String a12 = fVar.a(str);
                ((a) this.f12124c).getClass();
                try {
                    a.C0182a b10 = a.b(context, strArr2, a12, this);
                    try {
                        if (b10 != null) {
                            int i6 = 0;
                            while (true) {
                                int i10 = i6 + 1;
                                zipFile = b10.f12119a;
                                if (i6 < 5) {
                                    Object[] objArr = new Object[1];
                                    objArr[z11 ? 1 : 0] = a12;
                                    d("Found %s! Extracting...", objArr);
                                    try {
                                        if (a10.exists() || a10.createNewFile()) {
                                            try {
                                                inputStream = zipFile.getInputStream(b10.f12120b);
                                            } catch (FileNotFoundException | IOException unused) {
                                                inputStream = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = null;
                                            }
                                            try {
                                                r12 = new FileOutputStream(a10);
                                            } catch (FileNotFoundException | IOException unused2) {
                                                r12 = 0;
                                                a.a(inputStream);
                                                a.a(r12);
                                                i6 = i10;
                                                z11 = false;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                closeable = null;
                                                a.a(inputStream);
                                                a.a(closeable);
                                                throw th;
                                            }
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j10 = 0;
                                                ?? r72 = z11;
                                                while (true) {
                                                    int read = inputStream.read(bArr);
                                                    if (read == -1) {
                                                        break;
                                                    }
                                                    r12.write(bArr, r72, read);
                                                    j10 += read;
                                                    r72 = 0;
                                                }
                                                r12.flush();
                                                r12.getFD().sync();
                                                if (j10 == a10.length()) {
                                                    a.a(inputStream);
                                                    a.a(r12);
                                                    a10.setReadable(true, r72);
                                                    a10.setExecutable(true, r72);
                                                    a10.setWritable(true);
                                                    break;
                                                }
                                            } catch (FileNotFoundException | IOException unused3) {
                                            } catch (Throwable th4) {
                                                th = th4;
                                                closeable = r12;
                                                a.a(inputStream);
                                                a.a(closeable);
                                                throw th;
                                            }
                                            a.a(inputStream);
                                            a.a(r12);
                                        }
                                    } catch (IOException unused4) {
                                    }
                                    i6 = i10;
                                    z11 = false;
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused5) {
                            }
                        } else {
                            try {
                                strArr = a.c(context, a12);
                            } catch (Exception e11) {
                                strArr = new String[]{e11.toString()};
                            }
                            throw new MissingLibraryException(a12, strArr2, strArr);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c0182a = b10;
                        if (c0182a != null) {
                            try {
                                ZipFile zipFile2 = c0182a.f12119a;
                                if (zipFile2 != null) {
                                    zipFile2.close();
                                }
                            } catch (IOException unused6) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c0182a = null;
                }
            }
            String absolutePath = a10.getAbsolutePath();
            ((f) cVar).getClass();
            System.load(absolutePath);
            hashSet.add(str);
            d("%s (%s) was re-linked!", str, str2);
        }
    }
}
