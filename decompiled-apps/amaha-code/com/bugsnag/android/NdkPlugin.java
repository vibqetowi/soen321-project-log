package com.bugsnag.android;

import ca.a;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.ndk.NativeBridge;
import com.theinnerhour.b2b.utils.SessionManager;
import hs.k;
import is.x;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: NdkPlugin.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002H\u0082 J\t\u0010\u0004\u001a\u00020\u0002H\u0082 J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0013J\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0013J\u001a\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0005J\u001a\u0010\u001e\u001a\u00020\u00022\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u0013R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010%R(\u0010'\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/bugsnag/android/NdkPlugin;", "Lcom/bugsnag/android/Plugin;", "Lhs/k;", "enableCrashReporting", "disableCrashReporting", "", "getBinaryArch", "Lcom/bugsnag/android/Client;", SessionManager.KEY_CLIENT, "Lcom/bugsnag/android/ndk/NativeBridge;", "initNativeBridge", "performOneTimeSetup", "load", "unload", "", "enabled", "setInternalMetricsEnabled", "", "getSignalUnwindStackFunction", "", "", "getCurrentCallbackSetCounts", "getCurrentNativeApiCallUsage", "counts", "initCallbackCounts", "callback", "notifyAddCallback", "notifyRemoveCallback", "", "data", "setStaticData", "Lcom/bugsnag/android/LibraryLoader;", "libraryLoader", "Lcom/bugsnag/android/LibraryLoader;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/bugsnag/android/Client;", "<set-?>", "nativeBridge", "Lcom/bugsnag/android/ndk/NativeBridge;", "getNativeBridge", "()Lcom/bugsnag/android/ndk/NativeBridge;", "<init>", "()V", "Companion", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class NdkPlugin implements Plugin {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report NDK errors. See https://docs.bugsnag.com/platforms/android/ndk-link-errors";
    private Client client;
    private NativeBridge nativeBridge;
    private final LibraryLoader libraryLoader = new LibraryLoader();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);

    /* compiled from: NdkPlugin.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/NdkPlugin$Companion;", "", "()V", "LOAD_ERR_MSG", "", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    private final native void disableCrashReporting();

    private final native void enableCrashReporting();

    private final native String getBinaryArch();

    private final NativeBridge initNativeBridge(Client client) {
        BackgroundTaskService backgroundTaskService = client.bgTaskService;
        i.c(backgroundTaskService, "client.bgTaskService");
        NativeBridge nativeBridge = new NativeBridge(backgroundTaskService);
        client.addObserver(nativeBridge);
        client.setupNdkPlugin();
        return nativeBridge;
    }

    private final void performOneTimeSetup(Client client) {
        this.libraryLoader.loadLibrary("bugsnag-ndk", client, NdkPlugin$performOneTimeSetup$1.INSTANCE);
        if (this.libraryLoader.isLoaded()) {
            client.setBinaryArch(getBinaryArch());
            this.nativeBridge = initNativeBridge(client);
            return;
        }
        client.logger.e(LOAD_ERR_MSG);
    }

    public final Map<String, Integer> getCurrentCallbackSetCounts() {
        Map<String, Integer> currentCallbackSetCounts;
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null || (currentCallbackSetCounts = nativeBridge.getCurrentCallbackSetCounts()) == null) {
            return x.f20677u;
        }
        return currentCallbackSetCounts;
    }

    public final Map<String, Boolean> getCurrentNativeApiCallUsage() {
        Map<String, Boolean> currentNativeApiCallUsage;
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null || (currentNativeApiCallUsage = nativeBridge.getCurrentNativeApiCallUsage()) == null) {
            return x.f20677u;
        }
        return currentNativeApiCallUsage;
    }

    public final NativeBridge getNativeBridge() {
        return this.nativeBridge;
    }

    public final long getSignalUnwindStackFunction() {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            return nativeBridge.getSignalUnwindStackFunction();
        }
        return 0L;
    }

    public final void initCallbackCounts(Map<String, Integer> counts) {
        i.h(counts, "counts");
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.initCallbackCounts(counts);
        }
    }

    @Override // com.bugsnag.android.Plugin
    public void load(Client client) {
        i.h(client, "client");
        this.client = client;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(client);
        }
        if (this.libraryLoader.isLoaded()) {
            enableCrashReporting();
            client.logger.i("Initialised NDK Plugin");
        }
    }

    public final void notifyAddCallback(String callback) {
        i.h(callback, "callback");
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.notifyAddCallback(callback);
        }
    }

    public final void notifyRemoveCallback(String callback) {
        i.h(callback, "callback");
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.notifyRemoveCallback(callback);
        }
    }

    public final void setInternalMetricsEnabled(boolean z10) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.setInternalMetricsEnabled(z10);
        }
    }

    public final void setStaticData(Map<String, ? extends Object> data) {
        i.h(data, "data");
        StringWriter stringWriter = new StringWriter();
        try {
            JsonStream jsonStream = new JsonStream(stringWriter);
            jsonStream.value(data);
            k kVar = k.f19476a;
            a.z(jsonStream, null);
            a.z(stringWriter, null);
            String stringWriter2 = stringWriter.toString();
            i.c(stringWriter2, "StringWriter().apply { u…ue(data) } } }.toString()");
            NativeBridge nativeBridge = this.nativeBridge;
            if (nativeBridge != null) {
                nativeBridge.setStaticJsonData(stringWriter2);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.z(stringWriter, th2);
                throw th3;
            }
        }
    }

    @Override // com.bugsnag.android.Plugin
    public void unload() {
        Client client;
        if (this.libraryLoader.isLoaded()) {
            disableCrashReporting();
            NativeBridge nativeBridge = this.nativeBridge;
            if (nativeBridge != null && (client = this.client) != null) {
                client.removeObserver(nativeBridge);
            }
        }
    }
}
