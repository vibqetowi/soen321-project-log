package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzku extends zzjl implements RandomAccess, zzli, zzmp {
    private static final zzku zza = new zzku(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    zzku() {
        this(new float[10], 0, true);
    }

    private final String zzf(int i) {
        int i2 = this.zzc;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zzbW();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        float[] fArr = this.zzb;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzb, i, fArr2, i + 1, this.zzc - i);
            this.zzb = fArr2;
        }
        this.zzb[i] = floatValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbW();
        byte[] bArr = zzlj.zzd;
        collection.getClass();
        if (!(collection instanceof zzku)) {
            return super.addAll(collection);
        }
        zzku zzkuVar = (zzku) collection;
        int i = zzkuVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.zzb;
            if (i3 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzkuVar.zzb, 0, this.zzb, this.zzc, zzkuVar.zzc);
            this.zzc = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzku) {
            zzku zzkuVar = (zzku) obj;
            if (this.zzc != zzkuVar.zzc) {
                return false;
            }
            float[] fArr = zzkuVar.zzb;
            for (int i = 0; i < this.zzc; i++) {
                if (Float.floatToIntBits(this.zzb[i]) != Float.floatToIntBits(fArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Float.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzb[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.zzb[i2] == floatValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zzbW();
        zzg(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbW();
        if (i2 >= i) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i2, fArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzbW();
        zzg(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i) {
        if (i < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzku(Arrays.copyOf(this.zzb, i), this.zzc, true);
    }

    public final void zze(float f) {
        zzbW();
        int i = this.zzc;
        float[] fArr = this.zzb;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        fArr3[i2] = f;
    }

    private zzku(float[] fArr, int i, boolean z) {
        super(z);
        this.zzb = fArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}
