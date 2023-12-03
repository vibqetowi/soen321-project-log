package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import da.b;
import k9.m;
import l9.a;
import l9.c;
import l9.e;
import l9.f;
import l9.p;
import l9.r;
import m9.g;
import m9.k;
import m9.l;
import v9.o;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
@Keep
/* loaded from: classes.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    @RecentlyNonNull
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    @RecentlyNonNull
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    @RecentlyNonNull
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    @RecentlyNonNull
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    @RecentlyNonNull
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    @RecentlyNonNull
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    @RecentlyNonNull
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    @RecentlyNonNull
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";

    private static g zza(c cVar) {
        if (cVar != null) {
            o.d("Must be called from the main thread.");
            boolean z10 = false;
            p pVar = cVar.f24175a;
            if (pVar != null) {
                try {
                    z10 = pVar.f();
                } catch (RemoteException e10) {
                    e.f24174b.a("Unable to call %s on %s.", e10, "isConnected", p.class.getSimpleName());
                }
            }
            if (z10) {
                o.d("Must be called from the main thread.");
                return cVar.f24168i;
            }
            return null;
        }
        return null;
    }

    private static final void zzb(c cVar, long j10) {
        g zza;
        if (j10 != 0 && (zza = zza(cVar)) != null && !zza.f() && !zza.i()) {
            m mVar = new m(zza.b() + j10, 0, null);
            o.d("Must be called from the main thread.");
            if (!zza.n()) {
                g.m();
            } else {
                g.o(new l(zza, mVar));
            }
        }
    }

    private static final void zzc(c cVar) {
        g zza = zza(cVar);
        if (zza == null) {
            return;
        }
        zza.j();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r0.equals(com.google.android.gms.cast.framework.media.MediaIntentReceiver.ACTION_SKIP_PREV) != false) goto L15;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent) {
        e eVar;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        a a10 = a.a(context);
        a10.getClass();
        o.d("Must be called from the main thread.");
        f fVar = a10.f24150c;
        fVar.getClass();
        o.d("Must be called from the main thread.");
        char c10 = 2;
        try {
            eVar = (e) b.Y1(fVar.f24177a.d());
        } catch (RemoteException e10) {
            f.f24176c.a("Unable to call %s on %s.", e10, "getWrappedCurrentSession", r.class.getSimpleName());
            eVar = null;
        }
        if (eVar == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1699820260:
                if (action.equals(ACTION_REWIND)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -945151566:
                if (action.equals(ACTION_SKIP_NEXT)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -945080078:
                break;
            case -668151673:
                if (action.equals(ACTION_STOP_CASTING)) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -124479363:
                if (action.equals(ACTION_DISCONNECT)) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 235550565:
                if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1362116196:
                if (action.equals(ACTION_FORWARD)) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1997055314:
                if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                onReceiveActionTogglePlayback(eVar);
                return;
            case 1:
                onReceiveActionSkipNext(eVar);
                return;
            case 2:
                onReceiveActionSkipPrev(eVar);
                return;
            case 3:
                onReceiveActionForward(eVar, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                return;
            case 4:
                onReceiveActionRewind(eVar, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                return;
            case 5:
                fVar.a(true);
                return;
            case 6:
                fVar.a(false);
                return;
            case 7:
                onReceiveActionMediaButton(eVar, intent);
                return;
            default:
                onReceiveOtherAction(context, action, intent);
                return;
        }
    }

    public void onReceiveActionForward(@RecentlyNonNull e eVar, long j10) {
        if (eVar instanceof c) {
            zzb((c) eVar, j10);
        }
    }

    public void onReceiveActionMediaButton(@RecentlyNonNull e eVar, @RecentlyNonNull Intent intent) {
        if (!(eVar instanceof c) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return;
        }
        Bundle extras = intent.getExtras();
        o.h(extras);
        KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            zzc((c) eVar);
        }
    }

    public void onReceiveActionRewind(@RecentlyNonNull e eVar, long j10) {
        if (eVar instanceof c) {
            zzb((c) eVar, -j10);
        }
    }

    public void onReceiveActionSkipNext(@RecentlyNonNull e eVar) {
        g zza;
        if ((eVar instanceof c) && (zza = zza((c) eVar)) != null && !zza.i()) {
            o.d("Must be called from the main thread.");
            if (!zza.n()) {
                g.m();
            } else {
                g.o(new k(zza, 1));
            }
        }
    }

    public void onReceiveActionSkipPrev(@RecentlyNonNull e eVar) {
        g zza;
        if ((eVar instanceof c) && (zza = zza((c) eVar)) != null && !zza.i()) {
            o.d("Must be called from the main thread.");
            if (!zza.n()) {
                g.m();
            } else {
                g.o(new k(zza, 0));
            }
        }
    }

    public void onReceiveActionTogglePlayback(@RecentlyNonNull e eVar) {
        if (eVar instanceof c) {
            zzc((c) eVar);
        }
    }

    public void onReceiveOtherAction(Context context, @RecentlyNonNull String str, @RecentlyNonNull Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(@RecentlyNonNull String str, @RecentlyNonNull Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
