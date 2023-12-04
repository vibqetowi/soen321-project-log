package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public abstract class zzba extends zzaw implements Set {
    @CheckForNull
    private transient zzaz zza;

    static int zzf(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzba zzi(Object obj, Object obj2) {
        return zzk(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzba) && zzj() && ((zzba) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.fido.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzbf iterator();

    public final zzaz zzg() {
        zzaz zzazVar = this.zza;
        if (zzazVar == null) {
            zzaz zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzazVar;
    }

    zzaz zzh() {
        return zzaz.zzg(toArray());
    }

    boolean zzj() {
        return false;
    }

    private static zzba zzk(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int zzf = zzf(i);
                Object[] objArr2 = new Object[zzf];
                int i2 = zzf - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj == null) {
                        throw new NullPointerException("at index " + i5);
                    }
                    int hashCode = obj.hashCode();
                    int zza = zzav.zza(hashCode);
                    while (true) {
                        int i6 = zza & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 != null) {
                            if (!obj2.equals(obj)) {
                                zza++;
                            }
                        } else {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzbe(obj3);
                }
                if (zzf(i4) >= zzf / 2) {
                    if (i4 <= 0) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new zzbd(objArr, i3, objArr2, i2, i4);
                }
                return zzk(i4, objArr);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzbe(obj4);
        }
        return zzbd.zza;
    }
}
