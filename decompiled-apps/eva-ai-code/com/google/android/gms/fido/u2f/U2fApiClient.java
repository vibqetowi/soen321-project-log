package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.internal.fido.zzae;
import com.google.android.gms.internal.fido.zzaf;
import com.google.android.gms.internal.fido.zzag;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
@Deprecated
/* loaded from: classes2.dex */
public class U2fApiClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private static final Api.ClientKey zza;
    private static final Api zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("Fido.U2F_API", new zzaf(), clientKey);
    }

    public U2fApiClient(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) zzb, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    public Task<U2fPendingIntent> getRegisterIntent(final RegisterRequestParams registerRequestParams) {
        return doRead(TaskApiCall.builder().setMethodKey(5424).run(new RemoteCall() { // from class: com.google.android.gms.fido.u2f.zzb
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                U2fApiClient u2fApiClient = U2fApiClient.this;
                RegisterRequestParams registerRequestParams2 = registerRequestParams;
                ((zzae) ((zzag) obj).getService()).zzc(new zzc(u2fApiClient, (TaskCompletionSource) obj2), registerRequestParams2);
            }
        }).build());
    }

    public Task<U2fPendingIntent> getSignIntent(final SignRequestParams signRequestParams) {
        return doRead(TaskApiCall.builder().setMethodKey(5425).run(new RemoteCall() { // from class: com.google.android.gms.fido.u2f.zza
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                U2fApiClient u2fApiClient = U2fApiClient.this;
                SignRequestParams signRequestParams2 = signRequestParams;
                ((zzae) ((zzag) obj).getService()).zzd(new zzd(u2fApiClient, (TaskCompletionSource) obj2), signRequestParams2);
            }
        }).build());
    }

    public U2fApiClient(Context context) {
        super(context, zzb, Api.ApiOptions.NO_OPTIONS, new ApiExceptionMapper());
    }
}
