package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.SignInClientImpl;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zad {
    public static final Api.ClientKey<SignInClientImpl> zaa;
    public static final Api.ClientKey<SignInClientImpl> zab;
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> zac;
    static final Api.AbstractClientBuilder<SignInClientImpl, zac> zad;
    public static final Scope zae;
    public static final Scope zaf;
    public static final Api<SignInOptions> zag;
    public static final Api<zac> zah;

    static {
        Api.ClientKey<SignInClientImpl> clientKey = new Api.ClientKey<>();
        zaa = clientKey;
        Api.ClientKey<SignInClientImpl> clientKey2 = new Api.ClientKey<>();
        zab = clientKey2;
        zaa zaaVar = new zaa();
        zac = zaaVar;
        zab zabVar = new zab();
        zad = zabVar;
        zae = new Scope(Scopes.PROFILE);
        zaf = new Scope("email");
        zag = new Api<>("SignIn.API", zaaVar, clientKey);
        zah = new Api<>("SignIn.INTERNAL_API", zabVar, clientKey2);
    }
}
