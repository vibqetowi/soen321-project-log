package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: TopicsSubscriber.java */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: i  reason: collision with root package name */
    public static final long f9721i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f9722j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9723a;

    /* renamed from: b  reason: collision with root package name */
    public final u f9724b;

    /* renamed from: c  reason: collision with root package name */
    public final r f9725c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseMessaging f9726d;
    public final ScheduledExecutorService f;

    /* renamed from: h  reason: collision with root package name */
    public final f0 f9729h;

    /* renamed from: e  reason: collision with root package name */
    public final t.b f9727e = new t.b();

    /* renamed from: g  reason: collision with root package name */
    public boolean f9728g = false;

    public h0(FirebaseMessaging firebaseMessaging, u uVar, f0 f0Var, r rVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f9726d = firebaseMessaging;
        this.f9724b = uVar;
        this.f9729h = f0Var;
        this.f9725c = rVar;
        this.f9723a = context;
        this.f = scheduledExecutorService;
    }

    public static <T> void a(ya.h<T> hVar) {
        try {
            ya.k.b(hVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e11);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean d() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    public final void b(String str) {
        String a10 = this.f9726d.a();
        r rVar = this.f9725c;
        rVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(rVar.a(rVar.c(a10, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a10 = this.f9726d.a();
        r rVar = this.f9725c;
        rVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(rVar.a(rVar.c(a10, "/topics/" + str, bundle)));
    }

    public final void e(e0 e0Var) {
        synchronized (this.f9727e) {
            String str = e0Var.f9704c;
            if (!this.f9727e.containsKey(str)) {
                return;
            }
            ArrayDeque arrayDeque = (ArrayDeque) this.f9727e.getOrDefault(str, null);
            ya.i iVar = (ya.i) arrayDeque.poll();
            if (iVar != null) {
                iVar.b(null);
            }
            if (arrayDeque.isEmpty()) {
                this.f9727e.remove(str);
            }
        }
    }

    public final synchronized void f(boolean z10) {
        this.f9728g = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (d() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[Catch: IOException -> 0x00a3, TryCatch #1 {IOException -> 0x00a3, blocks: (B:12:0x0023, B:27:0x004f, B:29:0x0055, B:30:0x006b, B:32:0x0074, B:33:0x0087, B:35:0x0090, B:17:0x0032, B:20:0x003c), top: B:57:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8 A[LOOP:0: B:2:0x0000->B:51:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        String str;
        int hashCode;
        char c10;
        while (true) {
            synchronized (this) {
                e0 a10 = this.f9729h.a();
                boolean z10 = true;
                if (a10 == null) {
                    break;
                }
                try {
                    str = a10.f9703b;
                    hashCode = str.hashCode();
                } catch (IOException e10) {
                    if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                        if (e10.getMessage() == null) {
                            Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                        } else {
                            throw e10;
                        }
                    } else {
                        Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
                    }
                    z10 = false;
                }
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c10 = 1;
                        String str2 = a10.f9702a;
                        if (c10 == 0) {
                            if (c10 != 1) {
                                if (d()) {
                                    Log.d("FirebaseMessaging", "Unknown topic operation" + a10 + ".");
                                }
                            } else {
                                c(str2);
                                if (d()) {
                                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                                }
                            }
                        } else {
                            b(str2);
                            if (d()) {
                                Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                            }
                        }
                        if (z10) {
                            return false;
                        }
                        this.f9729h.c(a10);
                        e(a10);
                    }
                    c10 = 65535;
                    String str22 = a10.f9702a;
                    if (c10 == 0) {
                    }
                    if (z10) {
                    }
                } else {
                    if (str.equals("S")) {
                        c10 = 0;
                        String str222 = a10.f9702a;
                        if (c10 == 0) {
                        }
                        if (z10) {
                        }
                    }
                    c10 = 65535;
                    String str2222 = a10.f9702a;
                    if (c10 == 0) {
                    }
                    if (z10) {
                    }
                }
            }
        }
    }

    public final void h(long j10) {
        this.f.schedule(new i0(this, this.f9723a, this.f9724b, Math.min(Math.max(30L, 2 * j10), f9721i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f9728g = true;
        }
    }
}
