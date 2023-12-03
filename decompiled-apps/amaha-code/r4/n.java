package r4;

import android.os.Build;
import android.util.Log;
import java.io.File;
/* compiled from: HardwareConfigState.java */
/* loaded from: classes.dex */
public final class n {
    public static final File f = new File("/proc/self/fd");

    /* renamed from: g  reason: collision with root package name */
    public static volatile n f30417g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30418a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30419b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30420c;

    /* renamed from: d  reason: collision with root package name */
    public int f30421d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f30422e = true;

    public n() {
        boolean z10 = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String substring = str.substring(0, 7);
            substring.getClass();
            char c10 = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c10 = 6;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Build.VERSION.SDK_INT == 26) {
                        z10 = false;
                        break;
                    }
                    break;
            }
        }
        this.f30418a = z10;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f30419b = 20000;
            this.f30420c = 0;
            return;
        }
        this.f30419b = 700;
        this.f30420c = 128;
    }

    public final boolean a(int i6, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        boolean z13;
        if (!z10 || !this.f30418a || Build.VERSION.SDK_INT < 26 || z11 || i6 < (i11 = this.f30420c) || i10 < i11) {
            return false;
        }
        synchronized (this) {
            int i12 = this.f30421d + 1;
            this.f30421d = i12;
            if (i12 >= 50) {
                this.f30421d = 0;
                int length = f.list().length;
                if (length < this.f30419b) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f30422e = z13;
                if (!z13 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f30419b);
                }
            }
            z12 = this.f30422e;
        }
        if (!z12) {
            return false;
        }
        return true;
    }
}
