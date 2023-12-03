package sd;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: FileStore.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final File f31459a;

    /* renamed from: b  reason: collision with root package name */
    public final File f31460b;

    /* renamed from: c  reason: collision with root package name */
    public final File f31461c;

    /* renamed from: d  reason: collision with root package name */
    public final File f31462d;

    /* renamed from: e  reason: collision with root package name */
    public final File f31463e;
    public final File f;

    public b(Context context) {
        boolean z10;
        String str;
        String processName;
        File filesDir = context.getFilesDir();
        this.f31459a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder(".com.google.firebase.crashlytics.files.v2");
            sb2.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb2.append(processName.replaceAll("[^a-zA-Z0-9.]", "_"));
            str = sb2.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.f31460b = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f31461c = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f31462d = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f31463e = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f = file5;
    }

    public static void a(File file) {
        if (file.exists() && d(file)) {
            String str = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static synchronized void c(File file) {
        synchronized (b.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        }
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> e(T[] tArr) {
        if (tArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(tArr);
    }

    public final File b(String str, String str2) {
        File file = new File(this.f31461c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
