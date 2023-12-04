package com.google.android.gms.internal.p001authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* renamed from: com.google.android.gms.internal.auth-api.zby  reason: invalid package */
/* loaded from: classes2.dex */
public interface zby extends IInterface {
    void zbb(Status status, BeginSignInResult beginSignInResult) throws RemoteException;
}
