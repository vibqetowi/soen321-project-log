package com.google.android.gms.fido.sourcedevice;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public interface SourceDirectTransferClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    public static final String KEY_SOURCE_DIRECT_TRANSFER_RESULT = "source_direct_transfer_result";

    SourceDirectTransferResult getSourceDirectTransferResultFromIntent(Intent intent) throws ApiException;

    Task<PendingIntent> startDirectTransfer(SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2);
}
