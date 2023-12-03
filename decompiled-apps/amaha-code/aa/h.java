package aa;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import v9.o;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static String f445a;

    /* renamed from: b  reason: collision with root package name */
    public static int f446b;

    public static String a() {
        String str;
        if (f445a == null) {
            int i6 = f446b;
            if (i6 == 0) {
                i6 = Process.myPid();
                f446b = i6;
            }
            String str2 = null;
            BufferedReader bufferedReader = null;
            BufferedReader bufferedReader2 = null;
            if (i6 > 0) {
                try {
                    String str3 = "/proc/" + i6 + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(str3));
                        try {
                            String readLine = bufferedReader3.readLine();
                            o.h(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                            str = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader3;
                            e.a(bufferedReader2);
                            throw th;
                        }
                        bufferedReader = bufferedReader3;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    str = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                e.a(bufferedReader);
                str2 = str;
            }
            f445a = str2;
        }
        return f445a;
    }
}
