package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.w;
import java.util.Iterator;
/* compiled from: StreamVolumeManager.java */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6346a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6347b;

    /* renamed from: c  reason: collision with root package name */
    public final a f6348c;

    /* renamed from: d  reason: collision with root package name */
    public final AudioManager f6349d;

    /* renamed from: e  reason: collision with root package name */
    public b f6350e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f6351g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6352h;

    /* compiled from: StreamVolumeManager.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: StreamVolumeManager.java */
    /* loaded from: classes.dex */
    public final class b extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f6353b = 0;

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            c0 c0Var = c0.this;
            c0Var.f6347b.post(new androidx.activity.b(18, c0Var));
        }
    }

    public c0(Context context, Handler handler, a0.a aVar) {
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        this.f6346a = applicationContext;
        this.f6347b = handler;
        this.f6348c = aVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        sc.b.E(audioManager);
        this.f6349d = audioManager;
        this.f = 3;
        this.f6351g = a(audioManager, 3);
        int i6 = this.f;
        if (c9.w.f5205a >= 23) {
            z10 = audioManager.isStreamMute(i6);
        } else if (a(audioManager, i6) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6352h = z10;
        b bVar = new b();
        try {
            applicationContext.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f6350e = bVar;
        } catch (RuntimeException e10) {
            ca.a.B1("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static int a(AudioManager audioManager, int i6) {
        try {
            return audioManager.getStreamVolume(i6);
        } catch (RuntimeException e10) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Could not retrieve stream volume for stream type ");
            sb2.append(i6);
            ca.a.B1("StreamVolumeManager", sb2.toString(), e10);
            return audioManager.getStreamMaxVolume(i6);
        }
    }

    public final void b(int i6) {
        if (this.f == i6) {
            return;
        }
        this.f = i6;
        c();
        a0 a0Var = a0.this;
        i k02 = a0.k0(a0Var.f6174k);
        if (!k02.equals(a0Var.F)) {
            a0Var.F = k02;
            Iterator<w.d> it = a0Var.f6170g.iterator();
            while (it.hasNext()) {
                it.next().T();
            }
        }
    }

    public final void c() {
        boolean z10;
        int i6 = this.f;
        AudioManager audioManager = this.f6349d;
        int a10 = a(audioManager, i6);
        int i10 = this.f;
        if (c9.w.f5205a >= 23) {
            z10 = audioManager.isStreamMute(i10);
        } else if (a(audioManager, i10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6351g != a10 || this.f6352h != z10) {
            this.f6351g = a10;
            this.f6352h = z10;
            Iterator<w.d> it = a0.this.f6170g.iterator();
            while (it.hasNext()) {
                it.next().N();
            }
        }
    }
}
