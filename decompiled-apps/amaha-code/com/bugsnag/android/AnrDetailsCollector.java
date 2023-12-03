package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.n;
import gv.r;
import hs.g;
import is.w;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import sp.b;
/* compiled from: AnrDetailsCollector.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/bugsnag/android/AnrDetailsCollector;", "", "Landroid/content/Context;", "ctx", "Landroid/app/ActivityManager$ProcessErrorStateInfo;", "collectAnrDetails$bugsnag_plugin_android_anr_release", "(Landroid/content/Context;)Landroid/app/ActivityManager$ProcessErrorStateInfo;", "collectAnrDetails", "Landroid/app/ActivityManager;", "am", "", "pid", "captureProcessErrorState$bugsnag_plugin_android_anr_release", "(Landroid/app/ActivityManager;I)Landroid/app/ActivityManager$ProcessErrorStateInfo;", "captureProcessErrorState", "Lcom/bugsnag/android/Event;", "event", "anrState", "Lhs/k;", "addErrorStateInfo$bugsnag_plugin_android_anr_release", "(Lcom/bugsnag/android/Event;Landroid/app/ActivityManager$ProcessErrorStateInfo;)V", "addErrorStateInfo", "Lcom/bugsnag/android/Client;", SessionManager.KEY_CLIENT, "collectAnrErrorDetails$bugsnag_plugin_android_anr_release", "(Lcom/bugsnag/android/Client;Lcom/bugsnag/android/Event;)V", "collectAnrErrorDetails", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "<init>", "()V", "Companion", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class AnrDetailsCollector {
    public static final Companion Companion = new Companion(null);
    private static final long INFO_POLL_THRESHOLD_MS = 100;
    private static final int MAX_ATTEMPTS = 300;
    private final HandlerThread handlerThread;

    /* compiled from: AnrDetailsCollector.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/AnrDetailsCollector$Companion;", "", "()V", "INFO_POLL_THRESHOLD_MS", "", "MAX_ATTEMPTS", "", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    public AnrDetailsCollector() {
        HandlerThread handlerThread = new HandlerThread("bugsnag-anr-collector");
        this.handlerThread = handlerThread;
        handlerThread.start();
    }

    public final void addErrorStateInfo$bugsnag_plugin_android_anr_release(Event event, ActivityManager.ProcessErrorStateInfo anrState) {
        int O0;
        i.h(event, "event");
        i.h(anrState, "anrState");
        String msg = anrState.shortMsg;
        List<Error> errors = event.getErrors();
        i.c(errors, "event.errors");
        if (!errors.isEmpty()) {
            Error error = event.getErrors().get(0);
            i.c(error, "event.errors[0]");
            Error error2 = error;
            i.c(msg, "msg");
            if (n.H0(msg, "ANR") && (O0 = r.O0(msg, "ANR", 0, false, 2)) >= 0) {
                int i6 = O0 + 3;
                if (i6 >= O0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) msg, 0, O0);
                    sb2.append((CharSequence) "");
                    sb2.append((CharSequence) msg, i6, msg.length());
                    msg = sb2.toString();
                } else {
                    throw new IndexOutOfBoundsException("End index (" + i6 + ") is less than start index (" + O0 + ").");
                }
            }
            error2.setErrorMessage(msg);
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:664)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:522)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[Catch: RuntimeException -> 0x002b, TryCatch #0 {RuntimeException -> 0x002b, blocks: (B:4:0x0003, B:8:0x000c, B:9:0x0010, B:11:0x0016, B:18:0x0028, B:7:0x000a), top: B:22:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.app.ActivityManager.ProcessErrorStateInfo captureProcessErrorState$bugsnag_plugin_android_anr_release(android.app.ActivityManager r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto La
            java.util.List r4 = r4.getProcessesInErrorState()     // Catch: java.lang.RuntimeException -> L2b
            if (r4 == 0) goto La
            goto Lc
        La:
            is.w r4 = is.w.f20676u     // Catch: java.lang.RuntimeException -> L2b
        Lc:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.RuntimeException -> L2b
        L10:
            boolean r1 = r4.hasNext()     // Catch: java.lang.RuntimeException -> L2b
            if (r1 == 0) goto L27
            java.lang.Object r1 = r4.next()     // Catch: java.lang.RuntimeException -> L2b
            r2 = r1
            android.app.ActivityManager$ProcessErrorStateInfo r2 = (android.app.ActivityManager.ProcessErrorStateInfo) r2     // Catch: java.lang.RuntimeException -> L2b
            int r2 = r2.pid     // Catch: java.lang.RuntimeException -> L2b
            if (r2 != r5) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            if (r2 == 0) goto L10
            goto L28
        L27:
            r1 = r0
        L28:
            android.app.ActivityManager$ProcessErrorStateInfo r1 = (android.app.ActivityManager.ProcessErrorStateInfo) r1     // Catch: java.lang.RuntimeException -> L2b
            r0 = r1
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.AnrDetailsCollector.captureProcessErrorState$bugsnag_plugin_android_anr_release(android.app.ActivityManager, int):android.app.ActivityManager$ProcessErrorStateInfo");
    }

    public final ActivityManager.ProcessErrorStateInfo collectAnrDetails$bugsnag_plugin_android_anr_release(Context ctx) {
        Object j10;
        i.h(ctx, "ctx");
        Object obj = null;
        try {
            Object systemService = ctx.getSystemService(Constants.SCREEN_ACTIVITY);
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            j10 = (ActivityManager) systemService;
        } catch (Throwable th2) {
            j10 = b.j(th2);
        }
        if (!(j10 instanceof g.a)) {
            obj = j10;
        }
        return captureProcessErrorState$bugsnag_plugin_android_anr_release((ActivityManager) obj, Process.myPid());
    }

    public final void collectAnrErrorDetails$bugsnag_plugin_android_anr_release(final Client client, final Event event) {
        i.h(client, "client");
        i.h(event, "event");
        final Handler handler = new Handler(this.handlerThread.getLooper());
        final AtomicInteger atomicInteger = new AtomicInteger();
        handler.post(new Runnable() { // from class: com.bugsnag.android.AnrDetailsCollector$collectAnrErrorDetails$1
            @Override // java.lang.Runnable
            public void run() {
                AnrDetailsCollector anrDetailsCollector = AnrDetailsCollector.this;
                Context context = client.appContext;
                i.c(context, "client.appContext");
                ActivityManager.ProcessErrorStateInfo collectAnrDetails$bugsnag_plugin_android_anr_release = anrDetailsCollector.collectAnrDetails$bugsnag_plugin_android_anr_release(context);
                if (collectAnrDetails$bugsnag_plugin_android_anr_release == null) {
                    if (atomicInteger.getAndIncrement() < 300) {
                        handler.postDelayed(this, 100L);
                        return;
                    }
                    return;
                }
                AnrDetailsCollector.this.addErrorStateInfo$bugsnag_plugin_android_anr_release(event, collectAnrDetails$bugsnag_plugin_android_anr_release);
                client.populateAndNotifyAndroidEvent(event, null);
            }
        });
    }
}
