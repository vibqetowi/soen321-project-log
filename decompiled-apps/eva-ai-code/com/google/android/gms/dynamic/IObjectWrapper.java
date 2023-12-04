package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public interface IObjectWrapper extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IObjectWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static IObjectWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof IObjectWrapper ? (IObjectWrapper) queryLocalInterface : new zzb(iBinder);
        }
    }
}
