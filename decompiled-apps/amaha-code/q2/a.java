package q2;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.c;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.q;
import java.util.Set;
import v.h;
import v2.s;
/* compiled from: SystemJobInfoConverter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f29113b = q.f("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f29114a;

    public a(Context context) {
        this.f29114a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        if (r1 < 26) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r1 >= 24) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JobInfo a(s sVar, int i6) {
        int i10;
        boolean z10;
        int i11;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", sVar.f34734a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", sVar.f34751t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", sVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i6, this.f29114a);
        c cVar = sVar.f34742j;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(cVar.f3226b);
        boolean z11 = cVar.f3227c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z11).setExtras(persistableBundle);
        int i12 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        int i13 = cVar.f3225a;
        if (i12 >= 30 && i13 == 6) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int d10 = h.d(i13);
            if (d10 != 0) {
                if (d10 != 1) {
                    if (d10 != 2) {
                        i10 = 3;
                        if (d10 != 3) {
                            i10 = 4;
                            if (d10 == 4) {
                            }
                            q.d().a(f29113b, "API version too low. Cannot convert network type value ".concat(c.E(i13)));
                        }
                    } else {
                        i10 = 2;
                    }
                }
                i10 = 1;
            } else {
                i10 = 0;
            }
            extras.setRequiredNetworkType(i10);
        }
        if (!z11) {
            if (sVar.f34744l == 2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            extras.setBackoffCriteria(sVar.f34745m, i11);
        }
        long max = Math.max(sVar.a() - System.currentTimeMillis(), 0L);
        if (i12 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!sVar.f34749q) {
            extras.setImportantWhileForeground(true);
        }
        if (i12 >= 24) {
            Set<c.a> set = cVar.f3231h;
            if (!set.isEmpty()) {
                for (c.a aVar : set) {
                    extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar.f3232a, aVar.f3233b ? 1 : 0));
                }
                extras.setTriggerContentUpdateDelay(cVar.f);
                extras.setTriggerContentMaxDelay(cVar.f3230g);
            }
        }
        extras.setPersisted(false);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f3228d);
            extras.setRequiresStorageNotLow(cVar.f3229e);
        }
        if (sVar.f34743k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (max > 0) {
            z12 = true;
        }
        if (i14 >= 31 && sVar.f34749q && !z10 && !z12) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
