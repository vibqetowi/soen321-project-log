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
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public class Fido2PrivilegedApiClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private static final Api.ClientKey zza;
    private static final Api zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("Fido.FIDO2_PRIVILEGED_API", new com.google.android.gms.internal.fido.zzj(), clientKey);
    }

    @Deprecated
    public Fido2PrivilegedApiClient(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) zzb, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    public Task<List<FidoCredentialDetails>> getCredentialList(final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzk
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Fido2PrivilegedApiClient fido2PrivilegedApiClient = Fido2PrivilegedApiClient.this;
                String str2 = str;
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zzc(new zzv(fido2PrivilegedApiClient, (TaskCompletionSource) obj2), str2);
            }
        }).setMethodKey(5430).build());
    }

    @Deprecated
    public Task<Fido2PendingIntent> getRegisterIntent(final BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        return doRead(TaskApiCall.builder().setMethodKey(5414).run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzo
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Fido2PrivilegedApiClient fido2PrivilegedApiClient = Fido2PrivilegedApiClient.this;
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions2 = browserPublicKeyCredentialCreationOptions;
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zzd(new zzs(fido2PrivilegedApiClient, (TaskCompletionSource) obj2), browserPublicKeyCredentialCreationOptions2);
            }
        }).build());
    }

    public Task<PendingIntent> getRegisterPendingIntent(final BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Fido2PrivilegedApiClient fido2PrivilegedApiClient = Fido2PrivilegedApiClient.this;
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions2 = browserPublicKeyCredentialCreationOptions;
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zzd(new zzq(fido2PrivilegedApiClient, (TaskCompletionSource) obj2), browserPublicKeyCredentialCreationOptions2);
            }
        }).setMethodKey(5412).build());
    }

    @Deprecated
    public Task<Fido2PendingIntent> getSignIntent(final BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        return doRead(TaskApiCall.builder().setMethodKey(5415).run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzn
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Fido2PrivilegedApiClient fido2PrivilegedApiClient = Fido2PrivilegedApiClient.this;
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = browserPublicKeyCredentialRequestOptions;
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zze(new zzt(fido2PrivilegedApiClient, (TaskCompletionSource) obj2), browserPublicKeyCredentialRequestOptions2);
            }
        }).build());
    }

    public Task<PendingIntent> getSignPendingIntent(final BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzm
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Fido2PrivilegedApiClient fido2PrivilegedApiClient = Fido2PrivilegedApiClient.this;
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = browserPublicKeyCredentialRequestOptions;
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zze(new zzr(fido2PrivilegedApiClient, (TaskCompletionSource) obj2), browserPublicKeyCredentialRequestOptions2);
            }
        }).setMethodKey(5413).build());
    }

    public Task<Boolean> isUserVerifyingPlatformAuthenticatorAvailable() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzp
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zzf(new zzu(Fido2PrivilegedApiClient.this, (TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.fido.zza.zzh).setMethodKey(5416).build());
    }

    @Deprecated
    public Fido2PrivilegedApiClient(Context context) {
        super(context, zzb, Api.ApiOptions.NO_OPTIONS, new ApiExceptionMapper());
    }
}
