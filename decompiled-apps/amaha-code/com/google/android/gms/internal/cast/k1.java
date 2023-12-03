package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.cast.framework.zzar;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final p9.b f7569a = new p9.b("CastDynamiteModule");

    public static e4 a(Context context) {
        try {
            IBinder b10 = DynamiteModule.c(context, DynamiteModule.f7449b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof e4) {
                return (e4) queryLocalInterface;
            }
            return new i3(b10);
        } catch (DynamiteModule.LoadingException e10) {
            throw new zzar(e10);
        }
    }
}
