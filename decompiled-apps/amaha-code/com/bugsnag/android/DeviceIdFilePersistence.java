package com.bugsnag.android;

import com.appsflyer.AppsFlyerProperties;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.UUID;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import ss.a;
/* compiled from: DeviceIdFilePersistence.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/bugsnag/android/DeviceIdFilePersistence;", "Lcom/bugsnag/android/DeviceIdPersistence;", "Lcom/bugsnag/android/DeviceId;", "loadDeviceIdInternal", "Ljava/util/UUID;", SessionManager.KEY_UUID, "", "persistNewDeviceUuid", "Ljava/nio/channels/FileChannel;", AppsFlyerProperties.CHANNEL, "persistNewDeviceIdWithLock", "Ljava/nio/channels/FileLock;", "waitForFileLock", "", "requestCreateIfDoesNotExist", "loadDeviceId", "Lcom/bugsnag/android/SynchronizedStreamableStore;", "synchronizedStreamableStore", "Lcom/bugsnag/android/SynchronizedStreamableStore;", "Ljava/io/File;", "file", "Ljava/io/File;", "Lkotlin/Function0;", "deviceIdGenerator", "Lss/a;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "<init>", "(Ljava/io/File;Lss/a;Lcom/bugsnag/android/Logger;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DeviceIdFilePersistence implements DeviceIdPersistence {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_LOCK_WAIT_MS = 25;
    private static final int MAX_FILE_LOCK_ATTEMPTS = 20;
    private final a<UUID> deviceIdGenerator;
    private final File file;
    private final Logger logger;
    private final SynchronizedStreamableStore<DeviceId> synchronizedStreamableStore;

    /* compiled from: DeviceIdFilePersistence.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/DeviceIdFilePersistence$Companion;", "", "()V", "FILE_LOCK_WAIT_MS", "", "MAX_FILE_LOCK_ATTEMPTS", "", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    public DeviceIdFilePersistence(File file, a<UUID> deviceIdGenerator, Logger logger) {
        i.h(file, "file");
        i.h(deviceIdGenerator, "deviceIdGenerator");
        i.h(logger, "logger");
        this.file = file;
        this.deviceIdGenerator = deviceIdGenerator;
        this.logger = logger;
        try {
            file.createNewFile();
        } catch (Throwable th2) {
            this.logger.w("Failed to created device ID file", th2);
        }
        this.synchronizedStreamableStore = new SynchronizedStreamableStore<>(this.file);
    }

    private final DeviceId loadDeviceIdInternal() {
        if (this.file.length() > 0) {
            try {
                return this.synchronizedStreamableStore.load(new DeviceIdFilePersistence$loadDeviceIdInternal$1(DeviceId.Companion));
            } catch (Throwable th2) {
                this.logger.w("Failed to load device ID", th2);
                return null;
            }
        }
        return null;
    }

    private final String persistNewDeviceIdWithLock(FileChannel fileChannel, UUID uuid) {
        String id2;
        FileLock waitForFileLock = waitForFileLock(fileChannel);
        String str = null;
        if (waitForFileLock == null) {
            return null;
        }
        try {
            DeviceId loadDeviceIdInternal = loadDeviceIdInternal();
            if (loadDeviceIdInternal != null) {
                str = loadDeviceIdInternal.getId();
            }
            if (str != null) {
                id2 = loadDeviceIdInternal.getId();
            } else {
                DeviceId deviceId = new DeviceId(uuid.toString());
                this.synchronizedStreamableStore.persist(deviceId);
                id2 = deviceId.getId();
            }
            return id2;
        } finally {
            waitForFileLock.release();
        }
    }

    private final String persistNewDeviceUuid(UUID uuid) {
        try {
            FileChannel channel = new FileOutputStream(this.file).getChannel();
            i.c(channel, "channel");
            String persistNewDeviceIdWithLock = persistNewDeviceIdWithLock(channel, uuid);
            ca.a.z(channel, null);
            return persistNewDeviceIdWithLock;
        } catch (IOException e10) {
            this.logger.w("Failed to persist device ID", e10);
            return null;
        }
    }

    private final FileLock waitForFileLock(FileChannel fileChannel) {
        for (int i6 = 0; i6 < 20; i6++) {
            try {
                return fileChannel.tryLock();
            } catch (OverlappingFileLockException unused) {
                java.lang.Thread.sleep(FILE_LOCK_WAIT_MS);
            }
        }
        return null;
    }

    @Override // com.bugsnag.android.DeviceIdPersistence
    public String loadDeviceId(boolean z10) {
        String str;
        try {
            DeviceId loadDeviceIdInternal = loadDeviceIdInternal();
            if (loadDeviceIdInternal != null) {
                str = loadDeviceIdInternal.getId();
            } else {
                str = null;
            }
            if (str != null) {
                return loadDeviceIdInternal.getId();
            }
            if (!z10) {
                return null;
            }
            return persistNewDeviceUuid(this.deviceIdGenerator.invoke());
        } catch (Throwable th2) {
            this.logger.w("Failed to load device ID", th2);
            return null;
        }
    }
}
