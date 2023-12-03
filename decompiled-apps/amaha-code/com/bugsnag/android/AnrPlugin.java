package com.bugsnag.android;

import android.os.Handler;
import android.os.Looper;
import com.theinnerhour.b2b.utils.SessionManager;
import is.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TypeCastException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: AnrPlugin.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 J\t\u0010\u0006\u001a\u00020\u0004H\u0082 J\t\u0010\u0007\u001a\u00020\u0004H\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/bugsnag/android/AnrPlugin;", "Lcom/bugsnag/android/Plugin;", "", "unwindFunction", "Lhs/k;", "setUnwindFunction", "enableAnrReporting", "disableAnrReporting", "", "clz", "Ljava/lang/Class;", "loadClass", "initNativePlugin", "Lcom/bugsnag/android/Client;", SessionManager.KEY_CLIENT, "performOneTimeSetup", "", "Lcom/bugsnag/android/NativeStackframe;", "nativeTrace", "notifyAnrDetected", "load", "unload", "Lcom/bugsnag/android/LibraryLoader;", "libraryLoader", "Lcom/bugsnag/android/LibraryLoader;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/bugsnag/android/Client;", "Lcom/bugsnag/android/AnrDetailsCollector;", "collector", "Lcom/bugsnag/android/AnrDetailsCollector;", "<init>", "()V", "Companion", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class AnrPlugin implements Plugin {
    private static final String ANR_ERROR_CLASS = "ANR";
    private static final String ANR_ERROR_MSG = "Application did not respond to UI input";
    public static final Companion Companion = new Companion(null);
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report ANRs. See https://docs.bugsnag.com/platforms/android/anr-link-errors";
    private Client client;
    private final LibraryLoader libraryLoader = new LibraryLoader();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);
    private final AnrDetailsCollector collector = new AnrDetailsCollector();

    /* compiled from: AnrPlugin.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/AnrPlugin$Companion;", "", "()V", "ANR_ERROR_CLASS", "", "ANR_ERROR_MSG", "LOAD_ERR_MSG", "doesJavaTraceLeadToNativeTrace", "", "javaTrace", "", "Ljava/lang/StackTraceElement;", "doesJavaTraceLeadToNativeTrace$bugsnag_plugin_android_anr_release", "([Ljava/lang/StackTraceElement;)Z", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final boolean doesJavaTraceLeadToNativeTrace$bugsnag_plugin_android_anr_release(StackTraceElement[] javaTrace) {
            boolean z10;
            i.h(javaTrace, "javaTrace");
            if (javaTrace.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            return ((StackTraceElement) k.S1(javaTrace)).isNativeMethod();
        }
    }

    private final native void disableAnrReporting();

    private final native void enableAnrReporting();

    /* JADX INFO: Access modifiers changed from: private */
    public final void initNativePlugin() {
        enableAnrReporting();
        Client client = this.client;
        if (client != null) {
            client.logger.i("Initialised ANR Plugin");
        } else {
            i.q(SessionManager.KEY_CLIENT);
            throw null;
        }
    }

    private final Class<?> loadClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void notifyAnrDetected(List<NativeStackframe> list) {
        Object obj;
        List<Stackframe> stacktrace;
        try {
            Client client = this.client;
            if (client != null) {
                if (client.immutableConfig.shouldDiscardError(ANR_ERROR_CLASS)) {
                    return;
                }
                Looper mainLooper = Looper.getMainLooper();
                i.c(mainLooper, "Looper.getMainLooper()");
                java.lang.Thread thread = mainLooper.getThread();
                i.c(thread, "Looper.getMainLooper().thread");
                StackTraceElement[] stackTrace = thread.getStackTrace();
                Companion companion = Companion;
                i.c(stackTrace, "stackTrace");
                boolean doesJavaTraceLeadToNativeTrace$bugsnag_plugin_android_anr_release = companion.doesJavaTraceLeadToNativeTrace$bugsnag_plugin_android_anr_release(stackTrace);
                RuntimeException runtimeException = new RuntimeException();
                runtimeException.setStackTrace(stackTrace);
                Client client2 = this.client;
                if (client2 != null) {
                    Event createEvent = NativeInterface.createEvent(runtimeException, client2, SeverityReason.newInstance("anrError"));
                    i.c(createEvent, "NativeInterface.createEv…REASON_ANR)\n            )");
                    Error err = createEvent.getErrors().get(0);
                    i.c(err, "err");
                    err.setErrorClass(ANR_ERROR_CLASS);
                    err.setErrorMessage(ANR_ERROR_MSG);
                    if (doesJavaTraceLeadToNativeTrace$bugsnag_plugin_android_anr_release) {
                        ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
                        for (NativeStackframe nativeStackframe : list) {
                            arrayList.add(new Stackframe(nativeStackframe));
                        }
                        err.getStacktrace().addAll(0, arrayList);
                        List<Thread> threads = createEvent.getThreads();
                        i.c(threads, "event.threads");
                        Iterator<T> it = threads.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((Thread) obj).getErrorReportingThread()) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        Thread thread2 = (Thread) obj;
                        if (thread2 != null && (stacktrace = thread2.getStacktrace()) != null) {
                            stacktrace.addAll(0, arrayList);
                        }
                    }
                    AnrDetailsCollector anrDetailsCollector = this.collector;
                    Client client3 = this.client;
                    if (client3 != null) {
                        anrDetailsCollector.collectAnrErrorDetails$bugsnag_plugin_android_anr_release(client3, createEvent);
                        return;
                    } else {
                        i.q(SessionManager.KEY_CLIENT);
                        throw null;
                    }
                }
                i.q(SessionManager.KEY_CLIENT);
                throw null;
            }
            i.q(SessionManager.KEY_CLIENT);
            throw null;
        } catch (Exception e10) {
            Client client4 = this.client;
            if (client4 != null) {
                client4.logger.e("Internal error reporting ANR", e10);
            } else {
                i.q(SessionManager.KEY_CLIENT);
                throw null;
            }
        }
    }

    private final void performOneTimeSetup(Client client) {
        Plugin plugin;
        this.libraryLoader.loadLibrary("bugsnag-plugin-android-anr", client, AnrPlugin$performOneTimeSetup$1.INSTANCE);
        Class<?> loadClass = loadClass("com.bugsnag.android.NdkPlugin");
        if (loadClass != null && (plugin = client.getPlugin(loadClass)) != null) {
            Object invoke = plugin.getClass().getMethod("getSignalUnwindStackFunction", new Class[0]).invoke(plugin, new Object[0]);
            if (invoke != null) {
                setUnwindFunction(((Long) invoke).longValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
        }
    }

    private final native void setUnwindFunction(long j10);

    @Override // com.bugsnag.android.Plugin
    public void load(Client client) {
        i.h(client, "client");
        this.client = client;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(client);
        }
        if (this.libraryLoader.isLoaded()) {
            Looper mainLooper = Looper.getMainLooper();
            if (i.b(Looper.myLooper(), mainLooper)) {
                initNativePlugin();
                return;
            } else {
                new Handler(mainLooper).postAtFrontOfQueue(new Runnable() { // from class: com.bugsnag.android.AnrPlugin$load$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrPlugin.this.initNativePlugin();
                    }
                });
                return;
            }
        }
        client.logger.e(LOAD_ERR_MSG);
    }

    @Override // com.bugsnag.android.Plugin
    public void unload() {
        if (this.libraryLoader.isLoaded()) {
            disableAnrReporting();
        }
    }
}
