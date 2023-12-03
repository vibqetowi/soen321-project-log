package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import r1.l;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public abstract class b5 extends ja.a implements n5 {
    public b5() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 2);
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        p5 p5Var = null;
        Bundle bundle = null;
        switch (i6) {
            case 1:
                Bundle bundle2 = (Bundle) d.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof p5) {
                        p5Var = (p5) queryLocalInterface;
                    } else {
                        p5Var = new o5(readStrongBinder);
                    }
                }
                r1.k b10 = r1.k.b(bundle2);
                HashMap hashMap = ((c) this).f7490c;
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, new HashSet());
                }
                ((Set) hashMap.get(b10)).add(new a(p5Var));
                parcel2.writeNoException();
                break;
            case 2:
                final int readInt = parcel.readInt();
                final c cVar = (c) this;
                final r1.k b11 = r1.k.b((Bundle) d.a(parcel, Bundle.CREATOR));
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    cVar.Y1(b11, readInt);
                } else {
                    new f(Looper.getMainLooper()).post(new Runnable(cVar, b11, readInt) { // from class: com.google.android.gms.internal.cast.b

                        /* renamed from: u  reason: collision with root package name */
                        public final c f7479u;

                        /* renamed from: v  reason: collision with root package name */
                        public final r1.k f7480v;

                        /* renamed from: w  reason: collision with root package name */
                        public final int f7481w;

                        {
                            this.f7479u = cVar;
                            this.f7480v = b11;
                            this.f7481w = readInt;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            c cVar2 = this.f7479u;
                            r1.k kVar = this.f7480v;
                            int i11 = this.f7481w;
                            synchronized (cVar2.f7490c) {
                                cVar2.Y1(kVar, i11);
                            }
                        }
                    });
                }
                parcel2.writeNoException();
                break;
            case 3:
                c cVar2 = (c) this;
                r1.k b12 = r1.k.b((Bundle) d.a(parcel, Bundle.CREATOR));
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    cVar2.Z1(b12);
                } else {
                    new f(Looper.getMainLooper()).post(new androidx.work.n(cVar2, 11, b12));
                }
                parcel2.writeNoException();
                break;
            case 4:
                int readInt2 = parcel.readInt();
                r1.k b13 = r1.k.b((Bundle) d.a(parcel, Bundle.CREATOR));
                ((c) this).f7489b.getClass();
                boolean f = r1.l.f(b13, readInt2);
                parcel2.writeNoException();
                parcel2.writeInt(f ? 1 : 0);
                break;
            case 5:
                String readString = parcel.readString();
                ((c) this).f7489b.getClass();
                r1.l.b();
                Iterator<l.g> it = r1.l.f30291d.f30302e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        l.g next = it.next();
                        if (next.f30343c.equals(readString)) {
                            r1.l.h(next);
                        }
                    }
                }
                parcel2.writeNoException();
                break;
            case 6:
                ((c) this).f7489b.getClass();
                r1.l.b();
                r1.l.h(r1.l.f30291d.f());
                parcel2.writeNoException();
                break;
            case 7:
                ((c) this).f7489b.getClass();
                String str = r1.l.e().f30343c;
                r1.l.b();
                boolean equals = str.equals(r1.l.f30291d.f().f30343c);
                parcel2.writeNoException();
                int i11 = d.f7498a;
                parcel2.writeInt(equals ? 1 : 0);
                break;
            case 8:
                String readString2 = parcel.readString();
                ((c) this).f7489b.getClass();
                r1.l.b();
                Iterator<l.g> it2 = r1.l.f30291d.f30302e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        l.g next2 = it2.next();
                        if (next2.f30343c.equals(readString2)) {
                            bundle = next2.r;
                        }
                    }
                }
                parcel2.writeNoException();
                int i12 = d.f7498a;
                if (bundle == null) {
                    parcel2.writeInt(0);
                    break;
                } else {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    break;
                }
            case 9:
                ((c) this).f7489b.getClass();
                String str2 = r1.l.e().f30343c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                break;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                break;
            case 11:
                c cVar3 = (c) this;
                HashMap hashMap2 = cVar3.f7490c;
                for (Set<l.a> set : hashMap2.values()) {
                    for (l.a aVar : set) {
                        cVar3.f7489b.g(aVar);
                    }
                }
                hashMap2.clear();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
