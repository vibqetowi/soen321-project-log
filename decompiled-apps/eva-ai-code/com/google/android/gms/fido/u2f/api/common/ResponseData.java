package com.google.android.gms.fido.u2f.api.common;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
@Deprecated
/* loaded from: classes2.dex */
public abstract class ResponseData extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract JSONObject toJsonObject();
}
