package d2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
/* compiled from: ProcessLock.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f12133e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12134a;

    /* renamed from: b  reason: collision with root package name */
    public final File f12135b;

    /* renamed from: c  reason: collision with root package name */
    public final Lock f12136c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f12137d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f12134a = z10;
        File file2 = new File(file, str.concat(".lck"));
        this.f12135b = file2;
        String absolutePath = file2.getAbsolutePath();
        i.f(absolutePath, "lockFile.absolutePath");
        HashMap hashMap = f12133e;
        synchronized (hashMap) {
            Object obj = hashMap.get(absolutePath);
            if (obj == null) {
                obj = new ReentrantLock();
                hashMap.put(absolutePath, obj);
            }
            lock = (Lock) obj;
        }
        this.f12136c = lock;
    }

    public final void a(boolean z10) {
        this.f12136c.lock();
        if (z10) {
            File file = this.f12135b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f12137d = channel;
            } catch (IOException e10) {
                this.f12137d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f12137d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f12136c.unlock();
    }
}
