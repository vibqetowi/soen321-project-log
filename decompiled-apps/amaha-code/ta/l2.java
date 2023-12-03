package ta;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public abstract class l2 extends com.google.android.gms.internal.measurement.y implements m2 {
    public l2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean v(int i6, Parcel parcel, Parcel parcel2, int i10) {
        boolean z10;
        ArrayList arrayList;
        boolean z11 = false;
        switch (i6) {
            case 1:
                com.google.android.gms.internal.measurement.z.b(parcel);
                ((d4) this).s0((s) com.google.android.gms.internal.measurement.z.a(parcel, s.CREATOR), (m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                com.google.android.gms.internal.measurement.z.b(parcel);
                ((d4) this).q1((g6) com.google.android.gms.internal.measurement.z.a(parcel, g6.CREATOR), (m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                com.google.android.gms.internal.measurement.z.b(parcel);
                ((d4) this).k0((m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                s sVar = (s) com.google.android.gms.internal.measurement.z.a(parcel, s.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.z.b(parcel);
                d4 d4Var = (d4) this;
                v9.o.h(sVar);
                v9.o.e(readString);
                d4Var.S1(readString, true);
                d4Var.c1(new k9.d0(d4Var, sVar, readString, 7));
                parcel2.writeNoException();
                break;
            case 6:
                com.google.android.gms.internal.measurement.z.b(parcel);
                ((d4) this).y0((m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                m6 m6Var = (m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR);
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                com.google.android.gms.internal.measurement.z.b(parcel);
                d4 d4Var2 = (d4) this;
                d4Var2.R1(m6Var);
                String str = m6Var.f32748u;
                v9.o.h(str);
                d6 d6Var = d4Var2.f32521a;
                try {
                    List<i6> list = (List) d6Var.a().n(new b4(d4Var2, 0, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (i6 i6Var : list) {
                        if (z10 || !k6.S(i6Var.f32633c)) {
                            arrayList.add(new g6(i6Var));
                        }
                    }
                } catch (InterruptedException | ExecutionException e10) {
                    w2 b10 = d6Var.b();
                    b10.f32925z.d("Failed to get user properties. appId", w2.q(str), e10);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                break;
            case 9:
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.z.b(parcel);
                byte[] N0 = ((d4) this).N0((s) com.google.android.gms.internal.measurement.z.a(parcel, s.CREATOR), readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(N0);
                break;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.measurement.z.b(parcel);
                ((d4) this).O0(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                break;
            case 11:
                com.google.android.gms.internal.measurement.z.b(parcel);
                String Y0 = ((d4) this).Y0((m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(Y0);
                break;
            case 12:
                com.google.android.gms.internal.measurement.z.b(parcel);
                ((d4) this).e1((c) com.google.android.gms.internal.measurement.z.a(parcel, c.CREATOR), (m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                c cVar = (c) com.google.android.gms.internal.measurement.z.a(parcel, c.CREATOR);
                com.google.android.gms.internal.measurement.z.b(parcel);
                d4 d4Var3 = (d4) this;
                v9.o.h(cVar);
                v9.o.h(cVar.f32493w);
                v9.o.e(cVar.f32491u);
                d4Var3.S1(cVar.f32491u, true);
                d4Var3.c1(new androidx.work.n(d4Var3, new c(cVar), 14));
                parcel2.writeNoException();
                break;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f8723a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                com.google.android.gms.internal.measurement.z.b(parcel);
                List G = ((d4) this).G(readString6, readString7, z11, (m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(G);
                break;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.z.f8723a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                com.google.android.gms.internal.measurement.z.b(parcel);
                List Q = ((d4) this).Q(readString8, readString9, readString10, z11);
                parcel2.writeNoException();
                parcel2.writeTypedList(Q);
                break;
            case 16:
                com.google.android.gms.internal.measurement.z.b(parcel);
                List v02 = ((d4) this).v0(parcel.readString(), parcel.readString(), (m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(v02);
                break;
            case 17:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                com.google.android.gms.internal.measurement.z.b(parcel);
                List i02 = ((d4) this).i0(readString11, readString12, readString13);
                parcel2.writeNoException();
                parcel2.writeTypedList(i02);
                break;
            case 18:
                com.google.android.gms.internal.measurement.z.b(parcel);
                ((d4) this).E1((m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                break;
            case 19:
                com.google.android.gms.internal.measurement.z.b(parcel);
                ((d4) this).G0((Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR), (m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                break;
            case 20:
                com.google.android.gms.internal.measurement.z.b(parcel);
                ((d4) this).K((m6) com.google.android.gms.internal.measurement.z.a(parcel, m6.CREATOR));
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
