package l9;

import android.content.SharedPreferences;
import android.os.Parcel;
import com.google.android.gms.internal.cast.l0;
import com.google.android.gms.internal.cast.m0;
import com.google.android.gms.internal.cast.q0;
import com.google.android.gms.internal.cast.r0;
import da.a;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public abstract class s extends ja.a {
    public s() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0218  */
    @Override // ja.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        g.x xVar;
        g.x xVar2;
        g.x xVar3;
        g.x xVar4;
        g.x xVar5;
        com.google.android.gms.internal.cast.b0 b0Var;
        boolean z10;
        g.x xVar6;
        g.x xVar7;
        g.x xVar8;
        switch (i6) {
            case 1:
                da.b bVar = new da.b(((v) this).f24189b);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.d.c(parcel2, bVar);
                break;
            case 2:
                v vVar = (v) this;
                e eVar = (e) da.b.Y1(a.AbstractBinderC0186a.X1(parcel.readStrongBinder()));
                Class<T> cls = vVar.f24190c;
                if (cls.isInstance(eVar) && (xVar = vVar.f24189b) != null) {
                    c cVar = (c) ((e) cls.cast(eVar));
                    if (((com.google.android.gms.internal.cast.a0) xVar.f16143v).f != null) {
                        com.google.android.gms.internal.cast.a0.f7470g.e("Start a session while there's already an active session. Create a new one.", new Object[0]);
                    }
                    ((com.google.android.gms.internal.cast.a0) xVar.f16143v).d(cVar);
                    com.google.android.gms.internal.cast.a0 a0Var = (com.google.android.gms.internal.cast.a0) xVar.f16143v;
                    ((com.google.android.gms.internal.cast.a0) xVar.f16143v).f7471a.a(a0Var.f7472b.b(a0Var.f).d(), 78);
                }
                parcel2.writeNoException();
                break;
            case 3:
                da.a X1 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                String readString = parcel.readString();
                v vVar2 = (v) this;
                e eVar2 = (e) da.b.Y1(X1);
                Class<T> cls2 = vVar2.f24190c;
                if (cls2.isInstance(eVar2) && (xVar2 = vVar2.f24189b) != null) {
                    com.google.android.gms.internal.cast.a0 a0Var2 = (com.google.android.gms.internal.cast.a0) xVar2.f16143v;
                    p9.b bVar2 = com.google.android.gms.internal.cast.a0.f7470g;
                    a0Var2.e((c) ((e) cls2.cast(eVar2)));
                    com.google.android.gms.internal.cast.a0 a0Var3 = (com.google.android.gms.internal.cast.a0) xVar2.f16143v;
                    com.google.android.gms.internal.cast.b0 b0Var2 = a0Var3.f;
                    b0Var2.f = readString;
                    ((com.google.android.gms.internal.cast.a0) xVar2.f16143v).f7471a.a(a0Var3.f7472b.b(b0Var2).d(), 79);
                    com.google.android.gms.internal.cast.a0.a((com.google.android.gms.internal.cast.a0) xVar2.f16143v);
                    ((com.google.android.gms.internal.cast.a0) xVar2.f16143v).c();
                }
                parcel2.writeNoException();
                break;
            case 4:
                da.a X12 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                v vVar3 = (v) this;
                e eVar3 = (e) da.b.Y1(X12);
                Class<T> cls3 = vVar3.f24190c;
                if (cls3.isInstance(eVar3) && (xVar3 = vVar3.f24189b) != null) {
                    com.google.android.gms.internal.cast.a0.b((com.google.android.gms.internal.cast.a0) xVar3.f16143v, (c) ((e) cls3.cast(eVar3)), readInt);
                }
                parcel2.writeNoException();
                break;
            case 5:
                v vVar4 = (v) this;
                e eVar4 = (e) da.b.Y1(a.AbstractBinderC0186a.X1(parcel.readStrongBinder()));
                Class<T> cls4 = vVar4.f24190c;
                if (cls4.isInstance(eVar4) && vVar4.f24189b != null) {
                    c cVar2 = (c) ((e) cls4.cast(eVar4));
                }
                parcel2.writeNoException();
                break;
            case 6:
                da.a X13 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                v vVar5 = (v) this;
                e eVar5 = (e) da.b.Y1(X13);
                Class<T> cls5 = vVar5.f24190c;
                if (cls5.isInstance(eVar5) && (xVar4 = vVar5.f24189b) != null) {
                    com.google.android.gms.internal.cast.a0.b((com.google.android.gms.internal.cast.a0) xVar4.f16143v, (c) ((e) cls5.cast(eVar5)), readInt2);
                }
                parcel2.writeNoException();
                break;
            case 7:
                da.a X14 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                v vVar6 = (v) this;
                e eVar6 = (e) da.b.Y1(X14);
                Class<T> cls6 = vVar6.f24190c;
                if (cls6.isInstance(eVar6) && (xVar5 = vVar6.f24189b) != null) {
                    c cVar3 = (c) ((e) cls6.cast(eVar6));
                    com.google.android.gms.internal.cast.a0 a0Var4 = (com.google.android.gms.internal.cast.a0) xVar5.f16143v;
                    SharedPreferences sharedPreferences = a0Var4.f7475e;
                    boolean g5 = a0Var4.g(readString2);
                    p9.b bVar3 = com.google.android.gms.internal.cast.a0.f7470g;
                    if (g5) {
                        bVar3.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
                        v9.o.h(a0Var4.f);
                    } else {
                        if (sharedPreferences == null) {
                            p9.b bVar4 = com.google.android.gms.internal.cast.b0.f7482g;
                        } else {
                            b0Var = new com.google.android.gms.internal.cast.b0();
                            if (sharedPreferences.contains("application_id")) {
                                b0Var.f7484a = sharedPreferences.getString("application_id", "");
                                if (sharedPreferences.contains("receiver_metrics_id")) {
                                    b0Var.f7485b = sharedPreferences.getString("receiver_metrics_id", "");
                                    if (sharedPreferences.contains("analytics_session_id")) {
                                        b0Var.f7486c = sharedPreferences.getLong("analytics_session_id", 0L);
                                        if (sharedPreferences.contains("event_sequence_number")) {
                                            b0Var.f7487d = sharedPreferences.getInt("event_sequence_number", 0);
                                            if (!sharedPreferences.contains("receiver_session_id")) {
                                                b0Var.f7488e = sharedPreferences.getInt("device_capabilities", 0);
                                            } else {
                                                b0Var.f = sharedPreferences.getString("receiver_session_id", "");
                                                a0Var4.f = b0Var;
                                                if (!a0Var4.g(readString2)) {
                                                    bVar3.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                                    v9.o.h(a0Var4.f);
                                                    com.google.android.gms.internal.cast.b0.f7483h = a0Var4.f.f7486c + 1;
                                                } else {
                                                    bVar3.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                                    com.google.android.gms.internal.cast.b0 b0Var3 = new com.google.android.gms.internal.cast.b0();
                                                    com.google.android.gms.internal.cast.b0.f7483h++;
                                                    a0Var4.f = b0Var3;
                                                    b0Var3.f7484a = com.google.android.gms.internal.cast.a0.h();
                                                    a0Var4.f.f = readString2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        b0Var = null;
                        a0Var4.f = b0Var;
                        if (!a0Var4.g(readString2)) {
                        }
                    }
                    v9.o.h(((com.google.android.gms.internal.cast.a0) xVar5.f16143v).f);
                    com.google.android.gms.internal.cast.a0 a0Var5 = (com.google.android.gms.internal.cast.a0) xVar5.f16143v;
                    q0 b10 = a0Var5.f7472b.b(a0Var5.f);
                    l0 i11 = m0.i(((r0) b10.f7477v).h());
                    if (i11.f7478w) {
                        i11.b();
                        i11.f7478w = false;
                    }
                    m0.q((m0) i11.f7477v, 10);
                    m0 d10 = i11.d();
                    if (b10.f7478w) {
                        b10.b();
                        b10.f7478w = false;
                    }
                    r0.s((r0) b10.f7477v, d10);
                    l0 i12 = m0.i(((r0) b10.f7477v).h());
                    if (i12.f7478w) {
                        i12.b();
                        i12.f7478w = false;
                    }
                    m0.o((m0) i12.f7477v, true);
                    if (b10.f7478w) {
                        b10.b();
                        b10.f7478w = false;
                    }
                    r0.s((r0) b10.f7477v, i12.d());
                    ((com.google.android.gms.internal.cast.a0) xVar5.f16143v).f7471a.a(b10.d(), 83);
                }
                parcel2.writeNoException();
                break;
            case 8:
                da.a X15 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                int i13 = com.google.android.gms.internal.cast.d.f7498a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v vVar7 = (v) this;
                e eVar7 = (e) da.b.Y1(X15);
                Class<T> cls7 = vVar7.f24190c;
                if (cls7.isInstance(eVar7) && (xVar6 = vVar7.f24189b) != null) {
                    com.google.android.gms.internal.cast.a0 a0Var6 = (com.google.android.gms.internal.cast.a0) xVar6.f16143v;
                    p9.b bVar5 = com.google.android.gms.internal.cast.a0.f7470g;
                    a0Var6.e((c) ((e) cls7.cast(eVar7)));
                    v9.o.h(((com.google.android.gms.internal.cast.a0) xVar6.f16143v).f);
                    com.google.android.gms.internal.cast.a0 a0Var7 = (com.google.android.gms.internal.cast.a0) xVar6.f16143v;
                    q0 b11 = a0Var7.f7472b.b(a0Var7.f);
                    l0 i14 = m0.i(((r0) b11.f7477v).h());
                    if (i14.f7478w) {
                        i14.b();
                        i14.f7478w = false;
                    }
                    m0.o((m0) i14.f7477v, z10);
                    if (b11.f7478w) {
                        b11.b();
                        b11.f7478w = false;
                    }
                    r0.s((r0) b11.f7477v, i14.d());
                    ((com.google.android.gms.internal.cast.a0) xVar6.f16143v).f7471a.a(b11.d(), 84);
                    com.google.android.gms.internal.cast.a0.a((com.google.android.gms.internal.cast.a0) xVar6.f16143v);
                    ((com.google.android.gms.internal.cast.a0) xVar6.f16143v).c();
                }
                parcel2.writeNoException();
                break;
            case 9:
                da.a X16 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                v vVar8 = (v) this;
                e eVar8 = (e) da.b.Y1(X16);
                Class<T> cls8 = vVar8.f24190c;
                if (cls8.isInstance(eVar8) && (xVar7 = vVar8.f24189b) != null) {
                    com.google.android.gms.internal.cast.a0.b((com.google.android.gms.internal.cast.a0) xVar7.f16143v, (c) ((e) cls8.cast(eVar8)), readInt3);
                }
                parcel2.writeNoException();
                break;
            case 10:
                da.a X17 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                v vVar9 = (v) this;
                e eVar9 = (e) da.b.Y1(X17);
                Class<T> cls9 = vVar9.f24190c;
                if (cls9.isInstance(eVar9) && (xVar8 = vVar9.f24189b) != null) {
                    com.google.android.gms.internal.cast.a0 a0Var8 = (com.google.android.gms.internal.cast.a0) xVar8.f16143v;
                    p9.b bVar6 = com.google.android.gms.internal.cast.a0.f7470g;
                    a0Var8.e((c) ((e) cls9.cast(eVar9)));
                    v9.o.h(((com.google.android.gms.internal.cast.a0) xVar8.f16143v).f);
                    com.google.android.gms.internal.cast.a0 a0Var9 = (com.google.android.gms.internal.cast.a0) xVar8.f16143v;
                    ((com.google.android.gms.internal.cast.a0) xVar8.f16143v).f7471a.a(a0Var9.f7472b.a(a0Var9.f, readInt4), 82);
                    com.google.android.gms.internal.cast.a0.a((com.google.android.gms.internal.cast.a0) xVar8.f16143v);
                    com.google.android.gms.internal.cast.a0 a0Var10 = (com.google.android.gms.internal.cast.a0) xVar8.f16143v;
                    a0Var10.f7474d.removeCallbacks(a0Var10.f7473c);
                }
                parcel2.writeNoException();
                break;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                break;
            default:
                return false;
        }
        return true;
    }
}
