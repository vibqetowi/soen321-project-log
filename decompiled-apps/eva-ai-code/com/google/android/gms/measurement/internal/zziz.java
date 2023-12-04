package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.protocol.App;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zziz extends zzf {
    protected zzir zza;
    private volatile zzir zzb;
    private volatile zzir zzc;
    private final Map zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzir zzg;
    private zzir zzh;
    private boolean zzi;
    private final Object zzj;

    public zziz(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzA(zzir zzirVar, zzir zzirVar2, long j, boolean z, Bundle bundle) {
        long j2;
        long j3;
        zzg();
        boolean z2 = false;
        boolean z3 = (zzirVar2 != null && zzirVar2.zzc == zzirVar.zzc && zzis.zza(zzirVar2.zzb, zzirVar.zzb) && zzis.zza(zzirVar2.zza, zzirVar.zza)) ? false : true;
        if (z && this.zza != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzlp.zzK(zzirVar, bundle2, true);
            if (zzirVar2 != null) {
                String str = zzirVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzirVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzirVar2.zzc);
            }
            if (z2) {
                zzkn zzknVar = this.zzt.zzu().zzb;
                long j4 = j - zzknVar.zzb;
                zzknVar.zzb = j;
                if (j4 > 0) {
                    this.zzt.zzv().zzI(bundle2, j4);
                }
            }
            if (!this.zzt.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzirVar.zze ? "auto" : App.TYPE;
            long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
            if (zzirVar.zze) {
                j2 = currentTimeMillis;
                long j5 = zzirVar.zzf;
                if (j5 != 0) {
                    j3 = j5;
                    this.zzt.zzq().zzH(str3, "_vs", j3, bundle2);
                }
            } else {
                j2 = currentTimeMillis;
            }
            j3 = j2;
            this.zzt.zzq().zzH(str3, "_vs", j3, bundle2);
        }
        if (z2) {
            zzB(this.zza, true, j);
        }
        this.zza = zzirVar;
        if (zzirVar.zze) {
            this.zzh = zzirVar;
        }
        this.zzt.zzt().zzG(zzirVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzB(zzir zzirVar, boolean z, long j) {
        this.zzt.zzd().zzf(this.zzt.zzax().elapsedRealtime());
        if (!this.zzt.zzu().zzb.zzd(zzirVar != null && zzirVar.zzd, z, j) || zzirVar == null) {
            return;
        }
        zzirVar.zzd = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzp(zziz zzizVar, Bundle bundle, zzir zzirVar, zzir zzirVar2, long j) {
        bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zzizVar.zzA(zzirVar, zzirVar2, j, true, zzizVar.zzt.zzv().zzu(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    private final zzir zzy(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzir zzirVar = (zzir) this.zzd.get(activity);
        if (zzirVar == null) {
            zzir zzirVar2 = new zzir(null, zzl(activity.getClass(), "Activity"), this.zzt.zzv().zzq());
            this.zzd.put(activity, zzirVar2);
            zzirVar = zzirVar2;
        }
        return this.zzg != null ? this.zzg : zzirVar;
    }

    private final void zzz(Activity activity, zzir zzirVar, boolean z) {
        zzir zzirVar2;
        zzir zzirVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzirVar.zzb == null) {
            zzirVar2 = new zzir(zzirVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zzirVar.zzc, zzirVar.zze, zzirVar.zzf);
        } else {
            zzirVar2 = zzirVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzirVar2;
        this.zzt.zzaB().zzp(new zziu(this, zzirVar2, zzirVar3, this.zzt.zzax().elapsedRealtime(), z));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final zzir zzi() {
        return this.zzb;
    }

    public final zzir zzj(boolean z) {
        zza();
        zzg();
        if (z) {
            zzir zzirVar = this.zza;
            return zzirVar != null ? zzirVar : this.zzh;
        }
        return this.zza;
    }

    final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.zzt.zzf();
        if (length2 > 100) {
            this.zzt.zzf();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzt.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzir(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (this.zzt.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        if (!this.zzt.zzf().zzu()) {
            this.zzb = null;
            this.zzt.zzaB().zzp(new zziw(this, elapsedRealtime));
            return;
        }
        zzir zzy = zzy(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        this.zzt.zzaB().zzp(new zzix(this, zzy, elapsedRealtime));
    }

    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzt.zzf().zzu()) {
                    this.zzg = null;
                    this.zzt.zzaB().zzp(new zziy(this));
                }
            }
        }
        if (!this.zzt.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzt.zzaB().zzp(new zziv(this));
            return;
        }
        zzz(activity, zzy(activity), false);
        zzd zzd = this.zzt.zzd();
        zzd.zzt.zzaB().zzp(new zzc(zzd, zzd.zzt.zzax().elapsedRealtime()));
    }

    public final void zzv(Activity activity, Bundle bundle) {
        zzir zzirVar;
        if (!this.zzt.zzf().zzu() || bundle == null || (zzirVar = (zzir) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzirVar.zzc);
        bundle2.putString("name", zzirVar.zza);
        bundle2.putString("referrer_name", zzirVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r1 <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r1 <= 100) goto L36;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzw(Activity activity, String str, String str2) {
        if (!this.zzt.zzf().zzu()) {
            this.zzt.zzaA().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzir zzirVar = this.zzb;
        if (zzirVar == null) {
            this.zzt.zzaA().zzl().zza("setCurrentScreen cannot be called while no activity active");
        } else if (this.zzd.get(activity) == null) {
            this.zzt.zzaA().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = zzl(activity.getClass(), "Activity");
            }
            boolean zza = zzis.zza(zzirVar.zzb, str2);
            boolean zza2 = zzis.zza(zzirVar.zza, str);
            if (!zza || !zza2) {
                if (str != null) {
                    if (str.length() > 0) {
                        int length = str.length();
                        this.zzt.zzf();
                    }
                    this.zzt.zzaA().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
                    return;
                }
                if (str2 != null) {
                    if (str2.length() > 0) {
                        int length2 = str2.length();
                        this.zzt.zzf();
                    }
                    this.zzt.zzaA().zzl().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
                    return;
                }
                this.zzt.zzaA().zzj().zzc("Setting current screen to name, class", str == null ? AbstractJsonLexerKt.NULL : str, str2);
                zzir zzirVar2 = new zzir(str, str2, this.zzt.zzv().zzq());
                this.zzd.put(activity, zzirVar2);
                zzz(activity, zzirVar2, true);
                return;
            }
            this.zzt.zzaA().zzl().zza("setCurrentScreen cannot be called with the same class and name");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzx(Bundle bundle, long j) {
        String str;
        synchronized (this.zzj) {
            if (!this.zzi) {
                this.zzt.zzaA().zzl().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
            if (string != null) {
                if (string.length() > 0) {
                    int length = string.length();
                    this.zzt.zzf();
                }
                this.zzt.zzaA().zzl().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
            String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
            if (string2 != null) {
                if (string2.length() > 0) {
                    int length2 = string2.length();
                    this.zzt.zzf();
                }
                this.zzt.zzaA().zzl().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                return;
            }
            if (string2 == null) {
                Activity activity = this.zze;
                str = activity != null ? zzl(activity.getClass(), "Activity") : "Activity";
            } else {
                str = string2;
            }
            zzir zzirVar = this.zzb;
            if (this.zzf && zzirVar != null) {
                this.zzf = false;
                boolean zza = zzis.zza(zzirVar.zzb, str);
                boolean zza2 = zzis.zza(zzirVar.zza, string);
                if (zza && zza2) {
                    this.zzt.zzaA().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            this.zzt.zzaA().zzj().zzc("Logging screen view with name, class", string == null ? AbstractJsonLexerKt.NULL : string, str == null ? AbstractJsonLexerKt.NULL : str);
            zzir zzirVar2 = this.zzb == null ? this.zzc : this.zzb;
            zzir zzirVar3 = new zzir(string, str, this.zzt.zzv().zzq(), true, j);
            this.zzb = zzirVar3;
            this.zzc = zzirVar2;
            this.zzg = zzirVar3;
            this.zzt.zzaB().zzp(new zzit(this, bundle, zzirVar3, zzirVar2, this.zzt.zzax().elapsedRealtime()));
        }
    }
}
