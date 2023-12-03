package com.moengage.pushbase.activities;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.p;
import com.appsflyer.R;
import com.moengage.core.exceptions.SdkNotInitializedException;
import com.moengage.pushbase.internal.MoEPushReceiver;
import com.moengage.pushbase.internal.fragments.DatePickerFragment;
import com.moengage.pushbase.internal.fragments.TimePickerFragment;
import di.n;
import fj.e;
import hh.g;
import ij.a;
import ij.b;
import ij.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: PushClickDialogTracker.kt */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J \u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/moengage/pushbase/activities/PushClickDialogTracker;", "Landroidx/fragment/app/p;", "Lij/a;", "Lij/c;", "Lij/b;", "Landroid/os/Bundle;", "savedInstanceState", "Lhs/k;", "onCreate", "", "year", "month", "day", "onDateSelected", "hourOfDay", "minute", "onTimeSelected", "onTimeDialogCancelled", "onDateDialogCancelled", "", "time", "onItemSelected", "onDialogCancelled", "", "tag", "Ljava/lang/String;", "I", "extras", "Landroid/os/Bundle;", "<init>", "()V", "pushbase_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PushClickDialogTracker extends p implements a, c, b {
    private int day;
    private Bundle extras;
    private int month;
    private final String tag = "PushBase_6.6.0_PushClickDialogTracker";
    private int year;

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            hh.a aVar = g.f17610d;
            g.a.b(0, new PushClickDialogTracker$onCreate$1(this), 3);
            Intent intent = getIntent();
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    this.extras = extras;
                    ca.a.Z0(extras);
                    if (e.f15075b == null) {
                        synchronized (e.class) {
                            e eVar = e.f15075b;
                            if (eVar == null) {
                                eVar = new e();
                            }
                            e.f15075b = eVar;
                        }
                    }
                    Bundle bundle2 = this.extras;
                    if (bundle2 != null) {
                        ih.p c10 = e.c(bundle2);
                        if (c10 != null) {
                            gj.g gVar = new gj.g(c10);
                            gVar.b(this);
                            Bundle bundle3 = this.extras;
                            if (bundle3 != null) {
                                bundle3.putBoolean("moe_re_notify", true);
                                Bundle bundle4 = this.extras;
                                if (bundle4 != null) {
                                    bundle4.putString("moe_n_r_s", "moe_source_r_l_s");
                                    Bundle bundle5 = this.extras;
                                    if (bundle5 != null) {
                                        if (!bundle5.containsKey("moe_action")) {
                                            finish();
                                        }
                                        Bundle bundle6 = this.extras;
                                        if (bundle6 != null) {
                                            gVar.a(this, bundle6);
                                            return;
                                        } else {
                                            i.q("extras");
                                            throw null;
                                        }
                                    }
                                    i.q("extras");
                                    throw null;
                                }
                                i.q("extras");
                                throw null;
                            }
                            i.q("extras");
                            throw null;
                        }
                        throw new SdkNotInitializedException("Instance not initialised.");
                    }
                    i.q("extras");
                    throw null;
                }
                throw new IllegalStateException("Intent extras cannot be empty");
            }
            throw new IllegalStateException("Intent cannot be null");
        } catch (Exception e10) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, e10, new PushClickDialogTracker$onCreate$2(this));
            finish();
        }
    }

    @Override // ij.a
    public void onDateDialogCancelled() {
        hh.a aVar = g.f17610d;
        g.a.b(0, new PushClickDialogTracker$onDateDialogCancelled$1(this), 3);
        finish();
    }

    @Override // ij.a
    public void onDateSelected(int i6, int i10, int i11) {
        try {
            hh.a aVar = g.f17610d;
            g.a.b(0, new PushClickDialogTracker$onDateSelected$1(this, i6, i10, i11), 3);
            this.year = i6;
            this.day = i11;
            this.month = i10;
            TimePickerFragment timePickerFragment = new TimePickerFragment();
            timePickerFragment.setTimeSelectedListener(this);
            timePickerFragment.show(getSupportFragmentManager(), "timePicker");
        } catch (Exception e10) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, e10, new PushClickDialogTracker$onDateSelected$2(this));
            finish();
        }
    }

    @Override // ij.b
    public void onDialogCancelled() {
        finish();
    }

    @Override // ij.b
    public void onItemSelected(long j10) {
        try {
            hh.a aVar = g.f17610d;
            g.a.b(0, new PushClickDialogTracker$onItemSelected$1(this, j10), 3);
            if (j10 != -1) {
                Intent intent = new Intent(getApplicationContext(), MoEPushReceiver.class);
                Bundle bundle = this.extras;
                if (bundle != null) {
                    intent.putExtras(n.b(bundle));
                    intent.setAction("MOE_ACTION_SHOW_NOTIFICATION");
                    Context applicationContext = getApplicationContext();
                    i.f(applicationContext, "applicationContext");
                    PendingIntent k10 = di.b.k(applicationContext, R.styleable.AppCompatTheme_windowFixedWidthMinor, intent);
                    Object systemService = getApplication().getSystemService("alarm");
                    if (systemService != null) {
                        ((AlarmManager) systemService).set(0, j10, k10);
                        finish();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
                }
                i.q("extras");
                throw null;
            }
            DatePickerFragment datePickerFragment = new DatePickerFragment();
            Bundle bundle2 = this.extras;
            if (bundle2 != null) {
                datePickerFragment.setArguments(bundle2);
                datePickerFragment.setDateSelectedListener(this);
                datePickerFragment.show(getSupportFragmentManager(), "datePicker");
                return;
            }
            i.q("extras");
            throw null;
        } catch (Exception e10) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, e10, new PushClickDialogTracker$onItemSelected$2(this));
            finish();
        }
    }

    @Override // ij.c
    public void onTimeDialogCancelled() {
        hh.a aVar = g.f17610d;
        g.a.b(0, new PushClickDialogTracker$onTimeDialogCancelled$1(this), 3);
        finish();
    }

    @Override // ij.c
    public void onTimeSelected(int i6, int i10) {
        try {
            hh.a aVar = g.f17610d;
            g.a.b(0, new PushClickDialogTracker$onTimeSelected$1(this, i6, i10), 3);
            Calendar calendar = Calendar.getInstance();
            calendar.set(this.year, this.month, this.day, i6, i10, 0);
            long timeInMillis = calendar.getTimeInMillis();
            g.a.b(0, new PushClickDialogTracker$onTimeSelected$2(this, timeInMillis), 3);
            Intent intent = new Intent(this, MoEPushReceiver.class);
            Bundle bundle = this.extras;
            if (bundle != null) {
                Bundle b10 = n.b(bundle);
                b10.remove("moe_action_id");
                b10.remove("moe_action");
                intent.putExtras(b10);
                intent.setAction("MOE_ACTION_SHOW_NOTIFICATION");
                Context applicationContext = getApplicationContext();
                i.f(applicationContext, "applicationContext");
                PendingIntent k10 = di.b.k(applicationContext, di.b.o(), intent);
                Object systemService = getSystemService("alarm");
                if (systemService != null) {
                    ((AlarmManager) systemService).set(0, timeInMillis, k10);
                    finish();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
            }
            i.q("extras");
            throw null;
        } catch (Exception e10) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, e10, new PushClickDialogTracker$onTimeSelected$4(this));
            finish();
        }
    }
}
