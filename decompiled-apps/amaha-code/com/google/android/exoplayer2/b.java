package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.exoplayer2.a0;
/* compiled from: AudioBecomingNoisyManager.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6328a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6329b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6330c;

    /* compiled from: AudioBecomingNoisyManager.java */
    /* loaded from: classes.dex */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final InterfaceC0133b f6331u;

        /* renamed from: v  reason: collision with root package name */
        public final Handler f6332v;

        public a(Handler handler, a0.a aVar) {
            this.f6332v = handler;
            this.f6331u = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f6332v.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f6330c) {
                a0.this.u0(-1, 3, false);
            }
        }
    }

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: com.google.android.exoplayer2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0133b {
    }

    public b(Context context, Handler handler, a0.a aVar) {
        this.f6328a = context.getApplicationContext();
        this.f6329b = new a(handler, aVar);
    }

    public final void a(boolean z10) {
        a aVar = this.f6329b;
        Context context = this.f6328a;
        if (z10 && !this.f6330c) {
            context.registerReceiver(aVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f6330c = true;
        } else if (!z10 && this.f6330c) {
            context.unregisterReceiver(aVar);
            this.f6330c = false;
        }
    }
}
