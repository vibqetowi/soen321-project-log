package com.bugsnag.android;

import com.bugsnag.android.internal.ImmutableConfig;
import gv.a;
import gv.n;
import gv.r;
import hs.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.i;
/* compiled from: LastRunInfoStore.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/LastRunInfoStore;", "", "Lcom/bugsnag/android/LastRunInfo;", "lastRunInfo", "Lhs/k;", "persistImpl", "loadImpl", "", "key", "", "asIntValue", "", "asBooleanValue", "persist", "load", "Ljava/io/File;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Lcom/bugsnag/android/internal/ImmutableConfig;", "config", "<init>", "(Lcom/bugsnag/android/internal/ImmutableConfig;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class LastRunInfoStore {
    private final File file;
    private final ReentrantReadWriteLock lock;
    private final Logger logger;

    public LastRunInfoStore(ImmutableConfig config) {
        i.h(config, "config");
        this.file = new File(config.getPersistenceDirectory().getValue(), "last-run-info");
        this.logger = config.getLogger();
        this.lock = new ReentrantReadWriteLock();
    }

    private final boolean asBooleanValue(String str, String str2) {
        return Boolean.parseBoolean(r.c1(str, str2 + '=', str));
    }

    private final int asIntValue(String str, String str2) {
        return Integer.parseInt(r.c1(str, str2 + '=', str));
    }

    private final LastRunInfo loadImpl() {
        if (!this.file.exists()) {
            return null;
        }
        File file = this.file;
        Charset charset = a.f16927b;
        i.g(file, "<this>");
        i.g(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String c12 = ca.a.c1(inputStreamReader);
            ca.a.z(inputStreamReader, null);
            List a12 = r.a1(c12, new String[]{"\n"}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : a12) {
                if (true ^ n.B0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != 3) {
                Logger logger = this.logger;
                logger.w("Unexpected number of lines when loading LastRunInfo. Skipping load. " + arrayList);
                return null;
            }
            try {
                LastRunInfo lastRunInfo = new LastRunInfo(asIntValue((String) arrayList.get(0), "consecutiveLaunchCrashes"), asBooleanValue((String) arrayList.get(1), "crashed"), asBooleanValue((String) arrayList.get(2), "crashedDuringLaunch"));
                Logger logger2 = this.logger;
                logger2.d("Loaded: " + lastRunInfo);
                return lastRunInfo;
            } catch (NumberFormatException e10) {
                this.logger.w("Failed to read consecutiveLaunchCrashes from saved lastRunInfo", e10);
                return null;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ca.a.z(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    private final void persistImpl(LastRunInfo lastRunInfo) {
        KeyValueWriter keyValueWriter = new KeyValueWriter();
        keyValueWriter.add("consecutiveLaunchCrashes", Integer.valueOf(lastRunInfo.getConsecutiveLaunchCrashes()));
        keyValueWriter.add("crashed", Boolean.valueOf(lastRunInfo.getCrashed()));
        keyValueWriter.add("crashedDuringLaunch", Boolean.valueOf(lastRunInfo.getCrashedDuringLaunch()));
        String keyValueWriter2 = keyValueWriter.toString();
        ca.a.D1(this.file, keyValueWriter2);
        this.logger.d("Persisted: ".concat(keyValueWriter2));
    }

    public final File getFile() {
        return this.file;
    }

    public final LastRunInfo load() {
        LastRunInfo lastRunInfo;
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        i.c(readLock, "lock.readLock()");
        readLock.lock();
        try {
            lastRunInfo = loadImpl();
        } catch (Throwable th2) {
            try {
                this.logger.w("Unexpectedly failed to load LastRunInfo.", th2);
                lastRunInfo = null;
            } finally {
                readLock.unlock();
            }
        }
        return lastRunInfo;
    }

    public final void persist(LastRunInfo lastRunInfo) {
        i.h(lastRunInfo, "lastRunInfo");
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        i.c(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            persistImpl(lastRunInfo);
            k kVar = k.f19476a;
            writeLock.unlock();
        }
    }
}
