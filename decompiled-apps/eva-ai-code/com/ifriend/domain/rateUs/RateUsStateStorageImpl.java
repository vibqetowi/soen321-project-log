package com.ifriend.domain.rateUs;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: RateUsStateStorageImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/rateUs/RateUsStateStorageImpl;", "Lcom/ifriend/domain/rateUs/RateUsStateStorage;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/data/Preferences;)V", "changeStep", "", "step", "Lcom/ifriend/domain/rateUs/ShowRateUsUseCase$Step;", "getCurrentStep", "getLastOnline", "", "getRateUsRepeats", "", "increaseRateUsRepeats", "setLastOnline", ShowRateUsUseCase.LAST_ONLINE, ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RateUsStateStorageImpl implements RateUsStateStorage {
    private final Preferences preferences;

    public RateUsStateStorageImpl(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.ifriend.domain.rateUs.RateUsStateStorage
    public ShowRateUsUseCase.Step getCurrentStep() {
        String stringWithKey = this.preferences.getStringWithKey(ShowRateUsUseCase.RATE_US_STEP);
        if (stringWithKey == null) {
            stringWithKey = "INITIAL";
        }
        return ShowRateUsUseCase.Step.valueOf(stringWithKey);
    }

    @Override // com.ifriend.domain.rateUs.RateUsStateStorage
    public void changeStep(ShowRateUsUseCase.Step step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.preferences.saveStringWithKey(ShowRateUsUseCase.RATE_US_STEP, step.name());
    }

    @Override // com.ifriend.domain.rateUs.RateUsStateStorage
    public long getLastOnline() {
        return this.preferences.getLongWithKey(ShowRateUsUseCase.LAST_ONLINE);
    }

    @Override // com.ifriend.domain.rateUs.RateUsStateStorage
    public void setLastOnline(long j) {
        this.preferences.saveLongWithKey(ShowRateUsUseCase.LAST_ONLINE, Long.valueOf(j));
    }

    @Override // com.ifriend.domain.rateUs.RateUsStateStorage
    public void increaseRateUsRepeats() {
        Preferences preferences = this.preferences;
        preferences.saveIntWithKey(ShowRateUsUseCase.RATE_US_REPEATS, Integer.valueOf(preferences.getIntWithKey(ShowRateUsUseCase.RATE_US_REPEATS) + 1));
    }

    @Override // com.ifriend.domain.rateUs.RateUsStateStorage
    public int getRateUsRepeats() {
        return this.preferences.getIntWithKey(ShowRateUsUseCase.RATE_US_REPEATS);
    }
}
