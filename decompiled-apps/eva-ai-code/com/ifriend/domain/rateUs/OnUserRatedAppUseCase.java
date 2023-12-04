package com.ifriend.domain.rateUs;

import com.ifriend.domain.data.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: OnUserRatedAppUseCase.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/rateUs/OnUserRatedAppUseCase;", "", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/data/Preferences;)V", "getPreferences", "()Lcom/ifriend/domain/data/Preferences;", "execute", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnUserRatedAppUseCase {
    private final Preferences preferences;

    public OnUserRatedAppUseCase(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    public final Preferences getPreferences() {
        return this.preferences;
    }

    public final void execute() {
        this.preferences.saveStringWithKey(ShowRateUsUseCase.RATE_US_STEP, "INACTIVE");
    }
}
