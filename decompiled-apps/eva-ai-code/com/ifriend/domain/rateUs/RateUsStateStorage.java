package com.ifriend.domain.rateUs;

import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: RateUsStateStorage.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH&¨\u0006\u000e"}, d2 = {"Lcom/ifriend/domain/rateUs/RateUsStateStorage;", "", "changeStep", "", "step", "Lcom/ifriend/domain/rateUs/ShowRateUsUseCase$Step;", "getCurrentStep", "getLastOnline", "", "getRateUsRepeats", "", "increaseRateUsRepeats", "setLastOnline", ShowRateUsUseCase.LAST_ONLINE, ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RateUsStateStorage {
    void changeStep(ShowRateUsUseCase.Step step);

    ShowRateUsUseCase.Step getCurrentStep();

    long getLastOnline();

    int getRateUsRepeats();

    void increaseRateUsRepeats();

    void setLastOnline(long j);
}
