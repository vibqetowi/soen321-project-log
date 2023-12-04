package com.ifriend.data.networking.requests;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SetBotEthnicityRequest.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/networking/requests/SetBotEthnicityRequest;", "", "ethnicity", "", "(Ljava/lang/String;)V", "getEthnicity", "()Ljava/lang/String;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetBotEthnicityRequest {
    private final String ethnicity;

    public SetBotEthnicityRequest(String ethnicity) {
        Intrinsics.checkNotNullParameter(ethnicity, "ethnicity");
        this.ethnicity = ethnicity;
    }

    public final String getEthnicity() {
        return this.ethnicity;
    }
}
