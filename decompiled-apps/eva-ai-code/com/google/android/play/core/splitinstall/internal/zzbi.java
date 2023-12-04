package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzbi extends zzbj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbi(Object obj, Field field, Class cls) {
        super(obj, field, Array.newInstance(cls, 0).getClass());
    }

    private final Class zzf() {
        return zzd().getType().getComponentType();
    }

    public final void zza(Collection collection) {
        Object[] objArr = (Object[]) zzc();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(zzf(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[length] = obj;
            length++;
        }
        zze(objArr2);
    }

    public final void zzb(Collection collection) {
        Object[] objArr = (Object[]) zzc();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(zzf(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        zze(objArr2);
    }
}
