package com.ifriend.domain;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: CoreAppRule.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/CoreAppRule;", "", "()V", "AUDIO_RECORDING_MAX_DURATION", "", "getAUDIO_RECORDING_MAX_DURATION", "()I", "NAME_LENGTH_LIMIT", "getNAME_LENGTH_LIMIT", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoreAppRule {
    public static final CoreAppRule INSTANCE = new CoreAppRule();
    private static final int NAME_LENGTH_LIMIT = 12;
    private static final int AUDIO_RECORDING_MAX_DURATION = 59000;

    private CoreAppRule() {
    }

    public final int getNAME_LENGTH_LIMIT() {
        return NAME_LENGTH_LIMIT;
    }

    public final int getAUDIO_RECORDING_MAX_DURATION() {
        return AUDIO_RECORDING_MAX_DURATION;
    }
}
