package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzpb;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzij implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzik zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzij(zzik zzikVar) {
        this.zza = zzikVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzgd zzgdVar;
        Uri uri;
        String stringExtra;
        String str;
        try {
            try {
                this.zza.zzt.zzaA().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    zzgdVar = this.zza.zzt;
                } else {
                    zzpb.zzc();
                    Uri uri2 = null;
                    if (this.zza.zzt.zzf().zzs(null, zzeg.zzaF)) {
                        Uri data = intent.getData();
                        if (data != null && data.isHierarchical()) {
                            uri = data;
                            if (uri != null && uri.isHierarchical()) {
                                this.zza.zzt.zzv();
                                stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                                if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                                    str = "auto";
                                    this.zza.zzt.zzaB().zzp(new zzii(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                                    zzgdVar = this.zza.zzt;
                                }
                                str = "gs";
                                this.zza.zzt.zzaB().zzp(new zzii(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                                zzgdVar = this.zza.zzt;
                            }
                            zzgdVar = this.zza.zzt;
                        }
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                uri2 = Uri.parse(string);
                            }
                        }
                    } else {
                        uri2 = intent.getData();
                    }
                    uri = uri2;
                    if (uri != null) {
                        this.zza.zzt.zzv();
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                            str = "auto";
                            this.zza.zzt.zzaB().zzp(new zzii(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                            zzgdVar = this.zza.zzt;
                        }
                        str = "gs";
                        this.zza.zzt.zzaB().zzp(new zzii(this, bundle != null, uri, str, uri.getQueryParameter("referrer")));
                        zzgdVar = this.zza.zzt;
                    }
                    zzgdVar = this.zza.zzt;
                }
            } catch (RuntimeException e) {
                this.zza.zzt.zzaA().zzd().zzb("Throwable caught in onActivityCreated", e);
                zzgdVar = this.zza.zzt;
            }
            zzgdVar.zzs().zzr(activity, bundle);
        } catch (Throwable th) {
            this.zza.zzt.zzs().zzr(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzt.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzt.zzs().zzt(activity);
        zzkp zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaB().zzp(new zzki(zzu, zzu.zzt.zzax().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzkp zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaB().zzp(new zzkh(zzu, zzu.zzt.zzax().elapsedRealtime()));
        this.zza.zzt.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzt.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
