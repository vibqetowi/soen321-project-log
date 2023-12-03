package t2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.q;
/* compiled from: BatteryChargingTracker.kt */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f32389g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, y2.b bVar, int i6) {
        super(context, bVar);
        this.f32389g = i6;
        if (i6 != 1) {
            if (i6 != 2) {
                return;
            } else {
                super(context, bVar);
                return;
            }
        }
        super(context, bVar);
    }

    @Override // t2.g
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f32389g) {
            case 0:
                return h();
            case 1:
                return h();
            default:
                return h();
        }
    }

    @Override // t2.e
    public final IntentFilter f() {
        switch (this.f32389g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                if (Build.VERSION.SDK_INT >= 23) {
                    intentFilter.addAction("android.os.action.CHARGING");
                    intentFilter.addAction("android.os.action.DISCHARGING");
                } else {
                    intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                    intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                }
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    @Override // t2.e
    public final void g(Intent intent) {
        switch (this.f32389g) {
            case 0:
                kotlin.jvm.internal.i.g(intent, "intent");
                String action = intent.getAction();
                if (action != null) {
                    q.d().a(b.f32390a, "Received ".concat(action));
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                c(Boolean.FALSE);
                                return;
                            }
                            return;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                c(Boolean.FALSE);
                                return;
                            }
                            return;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                c(Boolean.TRUE);
                                return;
                            }
                            return;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                c(Boolean.TRUE);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 1:
                kotlin.jvm.internal.i.g(intent, "intent");
                if (intent.getAction() != null) {
                    q d10 = q.d();
                    String str = c.f32391a;
                    d10.a(str, "Received " + intent.getAction());
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int hashCode = action2.hashCode();
                        if (hashCode != -1980154005) {
                            if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                c(Boolean.FALSE);
                                return;
                            }
                            return;
                        } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                            c(Boolean.TRUE);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.i.g(intent, "intent");
                if (intent.getAction() != null) {
                    q d11 = q.d();
                    String str2 = m.f32404a;
                    d11.a(str2, "Received " + intent.getAction());
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        int hashCode2 = action3.hashCode();
                        if (hashCode2 != -1181163412) {
                            if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                c(Boolean.TRUE);
                                return;
                            }
                            return;
                        } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            c(Boolean.FALSE);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean h() {
        int intExtra;
        int i6 = this.f32389g;
        boolean z10 = true;
        Context context = this.f32395b;
        switch (i6) {
            case 0:
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    q.d().b(b.f32390a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) == 0 : (intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    q.d().b(c.f32391a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = registerReceiver2.getIntExtra("status", -1);
                float intExtra3 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                Intent registerReceiver3 = context.registerReceiver(null, f());
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1181163412) {
                            if (hashCode == -730838620) {
                                break;
                            }
                        } else {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        }
                    }
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
