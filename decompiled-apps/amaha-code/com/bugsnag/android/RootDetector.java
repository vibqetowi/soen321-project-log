package com.bugsnag.android;

import ca.a;
import fv.e;
import fv.k;
import fv.t;
import gv.r;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import rs.b;
/* compiled from: RootDetector.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB3\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\rH\u0002J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u0017J\u0006\u0010\u0018\u001a\u00020\rJ\b\u0010\u0019\u001a\u00020\rH\u0002J\t\u0010\u001a\u001a\u00020\rH\u0082 J\f\u0010\u001b\u001a\u00020\r*\u00020\u001cH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/RootDetector;", "", "deviceBuildInfo", "Lcom/bugsnag/android/DeviceBuildInfo;", "rootBinaryLocations", "", "", "buildProps", "Ljava/io/File;", "logger", "Lcom/bugsnag/android/Logger;", "(Lcom/bugsnag/android/DeviceBuildInfo;Ljava/util/List;Ljava/io/File;Lcom/bugsnag/android/Logger;)V", "libraryLoaded", "", "checkBuildProps", "checkBuildProps$bugsnag_android_core_release", "checkBuildTags", "checkBuildTags$bugsnag_android_core_release", "checkRootBinaries", "checkRootBinaries$bugsnag_android_core_release", "checkSuExists", "processBuilder", "Ljava/lang/ProcessBuilder;", "checkSuExists$bugsnag_android_core_release", "isRooted", "nativeCheckRoot", "performNativeRootChecks", "isNotBlank", "Ljava/io/Reader;", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class RootDetector {
    private final File buildProps;
    private final DeviceBuildInfo deviceBuildInfo;
    private volatile boolean libraryLoaded;
    private final Logger logger;
    private final List<String> rootBinaryLocations;
    public static final Companion Companion = new Companion(null);
    private static final File BUILD_PROP_FILE = new File("/system/build.prop");
    private static final List<String> ROOT_INDICATORS = a.P0("/system/xbin/su", "/system/bin/su", "/system/app/Superuser.apk", "/system/app/SuperSU.apk", "/system/app/Superuser", "/system/app/SuperSU", "/system/xbin/daemonsu", "/su/bin");

    /* compiled from: RootDetector.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/RootDetector$Companion;", "", "()V", "BUILD_PROP_FILE", "Ljava/io/File;", "ROOT_INDICATORS", "", "", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    public RootDetector(DeviceBuildInfo deviceBuildInfo, Logger logger) {
        this(deviceBuildInfo, null, null, logger, 6, null);
    }

    private final boolean checkSuExists() {
        return checkSuExists$bugsnag_android_core_release(new ProcessBuilder(new String[0]));
    }

    private final boolean isNotBlank(Reader reader) {
        int read;
        do {
            read = reader.read();
            if (read == -1) {
                return false;
            }
        } while (a.N0((char) read));
        return true;
    }

    private final boolean nativeCheckRoot() {
        if (this.libraryLoaded) {
            return performNativeRootChecks();
        }
        return false;
    }

    private final native boolean performNativeRootChecks();

    public final boolean checkBuildProps$bugsnag_android_core_release() {
        BufferedReader bufferedReader;
        boolean z10;
        boolean z11;
        try {
            File file = this.buildProps;
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), gv.a.f16927b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            e B0 = t.B0(t.G0(k.v0(new b(bufferedReader)), RootDetector$checkBuildProps$1$1$1.INSTANCE), RootDetector$checkBuildProps$1$1$2.INSTANCE);
            Iterator it = B0.f15961a.iterator();
            while (true) {
                z10 = true;
                if (it.hasNext()) {
                    if (B0.f15963c.invoke(it.next()).booleanValue() == B0.f15962b) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                z10 = false;
            }
            a.z(bufferedReader, null);
            return z10;
        } catch (Throwable th2) {
            sp.b.j(th2);
            return false;
        }
    }

    public final boolean checkBuildTags$bugsnag_android_core_release() {
        String tags = this.deviceBuildInfo.getTags();
        if (tags != null && r.J0(tags, "test-keys")) {
            return true;
        }
        return false;
    }

    public final boolean checkRootBinaries$bugsnag_android_core_release() {
        try {
            for (String str : this.rootBinaryLocations) {
                if (new File(str).exists()) {
                    return true;
                }
            }
            hs.k kVar = hs.k.f19476a;
            return false;
        } catch (Throwable th2) {
            sp.b.j(th2);
            return false;
        }
    }

    public final boolean checkSuExists$bugsnag_android_core_release(ProcessBuilder processBuilder) {
        Throwable th2;
        Process process;
        BufferedReader bufferedReader;
        i.h(processBuilder, "processBuilder");
        processBuilder.command(a.P0("which", "su"));
        Process process2 = null;
        try {
            process = processBuilder.start();
        } catch (IOException unused) {
        } catch (Throwable th3) {
            th2 = th3;
            process = null;
        }
        try {
            i.c(process, "process");
            InputStream inputStream = process.getInputStream();
            i.c(inputStream, "process.inputStream");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, gv.a.f16927b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            try {
                boolean isNotBlank = isNotBlank(bufferedReader);
                a.z(bufferedReader, null);
                process.destroy();
                return isNotBlank;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    a.z(bufferedReader, th4);
                    throw th5;
                }
            }
        } catch (IOException unused2) {
            process2 = process;
            if (process2 != null) {
                process2.destroy();
            }
            return false;
        } catch (Throwable th6) {
            th2 = th6;
            if (process != null) {
                process.destroy();
            }
            throw th2;
        }
    }

    public final boolean isRooted() {
        try {
            if (!checkBuildTags$bugsnag_android_core_release() && !checkSuExists() && !checkBuildProps$bugsnag_android_core_release() && !checkRootBinaries$bugsnag_android_core_release()) {
                if (!nativeCheckRoot()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            this.logger.w("Root detection failed", th2);
            return false;
        }
    }

    public RootDetector(DeviceBuildInfo deviceBuildInfo, List<String> list, Logger logger) {
        this(deviceBuildInfo, list, null, logger, 4, null);
    }

    public RootDetector(Logger logger) {
        this(null, null, null, logger, 7, null);
    }

    public RootDetector(DeviceBuildInfo deviceBuildInfo, List<String> rootBinaryLocations, File buildProps, Logger logger) {
        i.h(deviceBuildInfo, "deviceBuildInfo");
        i.h(rootBinaryLocations, "rootBinaryLocations");
        i.h(buildProps, "buildProps");
        i.h(logger, "logger");
        this.deviceBuildInfo = deviceBuildInfo;
        this.rootBinaryLocations = rootBinaryLocations;
        this.buildProps = buildProps;
        this.logger = logger;
        try {
            System.loadLibrary("bugsnag-root-detection");
            this.libraryLoaded = true;
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public /* synthetic */ RootDetector(DeviceBuildInfo deviceBuildInfo, List list, File file, Logger logger, int i6, d dVar) {
        this((i6 & 1) != 0 ? DeviceBuildInfo.Companion.defaultInfo() : deviceBuildInfo, (i6 & 2) != 0 ? ROOT_INDICATORS : list, (i6 & 4) != 0 ? BUILD_PROP_FILE : file, logger);
    }
}
