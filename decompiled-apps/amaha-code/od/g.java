package od;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import od.f;
/* compiled from: QueueFileLogStore.java */
/* loaded from: classes.dex */
public final class g implements od.a {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f27369d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final File f27370a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27371b = 65536;

    /* renamed from: c  reason: collision with root package name */
    public f f27372c;

    /* compiled from: QueueFileLogStore.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f27373a;

        /* renamed from: b  reason: collision with root package name */
        public final int f27374b;

        public a(byte[] bArr, int i6) {
            this.f27373a = bArr;
            this.f27374b = i6;
        }
    }

    public g(File file) {
        this.f27370a = file;
    }

    @Override // od.a
    public final void a() {
        nd.f.a(this.f27372c, "There was a problem closing the Crashlytics log file.");
        this.f27372c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // od.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b() {
        a aVar;
        byte[] bArr;
        if (this.f27370a.exists()) {
            d();
            f fVar = this.f27372c;
            if (fVar != null) {
                int[] iArr = {0};
                byte[] bArr2 = new byte[fVar.I()];
                try {
                    f fVar2 = this.f27372c;
                    synchronized (fVar2) {
                        int i6 = fVar2.f27360x.f27364a;
                        for (int i10 = 0; i10 < fVar2.f27359w; i10++) {
                            f.a j10 = fVar2.j(i6);
                            f.b bVar = new f.b(j10);
                            int i11 = j10.f27365b;
                            bVar.read(bArr2, iArr[0], i11);
                            iArr[0] = iArr[0] + i11;
                            bVar.close();
                            i6 = fVar2.J(j10.f27364a + 4 + j10.f27365b);
                        }
                    }
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e10);
                }
                aVar = new a(bArr2, iArr[0]);
                if (aVar != null) {
                    bArr = null;
                } else {
                    int i12 = aVar.f27374b;
                    bArr = new byte[i12];
                    System.arraycopy(aVar.f27373a, 0, bArr, 0, i12);
                }
                if (bArr != null) {
                    return null;
                }
                return new String(bArr, f27369d);
            }
        }
        aVar = null;
        if (aVar != null) {
        }
        if (bArr != null) {
        }
    }

    @Override // od.a
    public final void c(long j10, String str) {
        int i6;
        d();
        int i10 = this.f27371b;
        if (this.f27372c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                if (str.length() > i10 / 4) {
                    str = "..." + str.substring(str.length() - i6);
                }
                this.f27372c.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f27369d));
                while (!this.f27372c.h() && this.f27372c.I() > i10) {
                    this.f27372c.o();
                }
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e10);
            }
        }
    }

    public final void d() {
        File file = this.f27370a;
        if (this.f27372c == null) {
            try {
                this.f27372c = new f(file);
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e10);
            }
        }
    }
}
