package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
@Deprecated
/* loaded from: classes2.dex */
public abstract class RequestParams extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract Set<Uri> getAllAppIds();

    public abstract Uri getAppId();

    public abstract ChannelIdValue getChannelIdValue();

    public abstract String getDisplayHint();

    public abstract List<RegisteredKey> getRegisteredKeys();

    public abstract Integer getRequestId();

    public abstract Double getTimeoutSeconds();
}
