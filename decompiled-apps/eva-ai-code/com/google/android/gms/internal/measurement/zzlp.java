package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzlp extends zzjl implements RandomAccess, zzlq {
    @Deprecated
    public static final zzlq zza;
    private static final zzlp zzb;
    private final List zzc;

    static {
        zzlp zzlpVar = new zzlp(false);
        zzb = zzlpVar;
        zza = zzlpVar;
    }

    public zzlp() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzka) {
            return ((zzka) obj).zzm(zzlj.zzb);
        }
        return zzlj.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbW();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzbW();
        if (collection instanceof zzlq) {
            collection = ((zzlq) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbW();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbW();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbW();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzlp(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final zzlq zze() {
        return zzc() ? new zznp(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzka) {
            zzka zzkaVar = (zzka) obj;
            String zzm = zzkaVar.zzm(zzlj.zzb);
            if (zzkaVar.zzi()) {
                this.zzc.set(i, zzm);
            }
            return zzm;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzlj.zzd(bArr);
        if (zznz.zzd(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final void zzi(zzka zzkaVar) {
        zzbW();
        this.zzc.add(zzkaVar);
        this.modCount++;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlp(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.zzc = arrayList;
    }

    private zzlp(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzlp(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
