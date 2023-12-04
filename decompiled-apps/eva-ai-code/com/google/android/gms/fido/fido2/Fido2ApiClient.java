package com.google.android.gms.fido.fido2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public class Fido2ApiClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private static final Api.ClientKey zza;
    private static final Api zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("Fido.FIDO2_API", new com.google.android.gms.internal.fido.zzo(), clientKey);
    }

    @Deprecated
    public Fido2ApiClient(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) zzb, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    @Deprecated
    public Task<Fido2PendingIntent> getRegisterIntent(final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return doRead(TaskApiCall.builder().setMethodKey(5409).run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Fido2ApiClient fido2ApiClient = Fido2ApiClient.this;
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = publicKeyCredentialCreationOptions;
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zzc(new zzh(fido2ApiClient, (TaskCompletionSource) obj2), publicKeyCredentialCreationOptions2);
            }
        }).build());
    }

    public Task<PendingIntent> getRegisterPendingIntent(final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzc
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Fido2ApiClient fido2ApiClient = Fido2ApiClient.this;
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = publicKeyCredentialCreationOptions;
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zzc(new zzf(fido2ApiClient, (TaskCompletionSource) obj2), publicKeyCredentialCreationOptions2);
            }
        }).setMethodKey(5407).build());
    }

    @Deprecated
    public Task<Fido2PendingIntent> getSignIntent(final PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        return doRead(TaskApiCall.builder().setMethodKey(5410).run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zza
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Fido2ApiClient fido2ApiClient = Fido2ApiClient.this;
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = publicKeyCredentialRequestOptions;
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zzd(new zzi(fido2ApiClient, (TaskCompletionSource) obj2), publicKeyCredentialRequestOptions2);
            }
        }).build());
    }

    public Task<PendingIntent> getSignPendingIntent(final PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zze
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Fido2ApiClient fido2ApiClient = Fido2ApiClient.this;
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = publicKeyCredentialRequestOptions;
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zzd(new zzg(fido2ApiClient, (TaskCompletionSource) obj2), publicKeyCredentialRequestOptions2);
            }
        }).setMethodKey(5408).build());
    }

    public Task<Boolean> isUserVerifyingPlatformAuthenticatorAvailable() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzb
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zze(new zzj(Fido2ApiClient.this, (TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.fido.zza.zzh).setMethodKey(5411).build());
    }

    @Deprecated
    public Fido2ApiClient(Context context) {
        super(context, zzb, Api.ApiOptions.NO_OPTIONS, new ApiExceptionMapper());
    }
}
