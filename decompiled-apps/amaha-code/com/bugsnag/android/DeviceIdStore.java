package com.bugsnag.android;

import android.content.Context;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: DeviceIdStore.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/bugsnag/android/DeviceIdStore;", "", "", "loadDeviceId", "loadInternalDeviceId", "Lcom/bugsnag/android/DeviceIdPersistence;", "persistence", "Lcom/bugsnag/android/DeviceIdPersistence;", "internalPersistence", "Lcom/bugsnag/android/SharedPrefMigrator;", "sharedPrefMigrator", "Lcom/bugsnag/android/SharedPrefMigrator;", "Landroid/content/Context;", "context", "Ljava/io/File;", "deviceIdfile", "Lkotlin/Function0;", "Ljava/util/UUID;", "deviceIdGenerator", "internalDeviceIdfile", "internalDeviceIdGenerator", "Lcom/bugsnag/android/Logger;", "logger", "<init>", "(Landroid/content/Context;Ljava/io/File;Lss/a;Ljava/io/File;Lss/a;Lcom/bugsnag/android/SharedPrefMigrator;Lcom/bugsnag/android/Logger;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DeviceIdStore {
    private final DeviceIdPersistence internalPersistence;
    private final DeviceIdPersistence persistence;
    private final SharedPrefMigrator sharedPrefMigrator;

    /* compiled from: DeviceIdStore.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.DeviceIdStore$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements a<UUID> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // ss.a
        public final UUID invoke() {
            UUID randomUUID = UUID.randomUUID();
            i.c(randomUUID, "UUID.randomUUID()");
            return randomUUID;
        }
    }

    /* compiled from: DeviceIdStore.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.DeviceIdStore$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends k implements a<UUID> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // ss.a
        public final UUID invoke() {
            UUID randomUUID = UUID.randomUUID();
            i.c(randomUUID, "UUID.randomUUID()");
            return randomUUID;
        }
    }

    public DeviceIdStore(Context context, SharedPrefMigrator sharedPrefMigrator, Logger logger) {
        this(context, null, null, null, null, sharedPrefMigrator, logger, 30, null);
    }

    public final String loadDeviceId() {
        String loadDeviceId = this.persistence.loadDeviceId(false);
        if (loadDeviceId != null) {
            return loadDeviceId;
        }
        String loadDeviceId2 = this.sharedPrefMigrator.loadDeviceId(false);
        if (loadDeviceId2 != null) {
            return loadDeviceId2;
        }
        return this.persistence.loadDeviceId(true);
    }

    public final String loadInternalDeviceId() {
        return this.internalPersistence.loadDeviceId(true);
    }

    public DeviceIdStore(Context context, File file, SharedPrefMigrator sharedPrefMigrator, Logger logger) {
        this(context, file, null, null, null, sharedPrefMigrator, logger, 28, null);
    }

    public DeviceIdStore(Context context, File file, a<UUID> aVar, SharedPrefMigrator sharedPrefMigrator, Logger logger) {
        this(context, file, aVar, null, null, sharedPrefMigrator, logger, 24, null);
    }

    public DeviceIdStore(Context context, File file, a<UUID> aVar, File file2, SharedPrefMigrator sharedPrefMigrator, Logger logger) {
        this(context, file, aVar, file2, null, sharedPrefMigrator, logger, 16, null);
    }

    public DeviceIdStore(Context context, File deviceIdfile, a<UUID> deviceIdGenerator, File internalDeviceIdfile, a<UUID> internalDeviceIdGenerator, SharedPrefMigrator sharedPrefMigrator, Logger logger) {
        i.h(context, "context");
        i.h(deviceIdfile, "deviceIdfile");
        i.h(deviceIdGenerator, "deviceIdGenerator");
        i.h(internalDeviceIdfile, "internalDeviceIdfile");
        i.h(internalDeviceIdGenerator, "internalDeviceIdGenerator");
        i.h(sharedPrefMigrator, "sharedPrefMigrator");
        i.h(logger, "logger");
        this.sharedPrefMigrator = sharedPrefMigrator;
        this.persistence = new DeviceIdFilePersistence(deviceIdfile, deviceIdGenerator, logger);
        this.internalPersistence = new DeviceIdFilePersistence(internalDeviceIdfile, internalDeviceIdGenerator, logger);
    }

    public /* synthetic */ DeviceIdStore(Context context, File file, a aVar, File file2, a aVar2, SharedPrefMigrator sharedPrefMigrator, Logger logger, int i6, d dVar) {
        this(context, (i6 & 2) != 0 ? new File(context.getFilesDir(), "device-id") : file, (i6 & 4) != 0 ? AnonymousClass1.INSTANCE : aVar, (i6 & 8) != 0 ? new File(context.getFilesDir(), "internal-device-id") : file2, (i6 & 16) != 0 ? AnonymousClass2.INSTANCE : aVar2, sharedPrefMigrator, logger);
    }
}
