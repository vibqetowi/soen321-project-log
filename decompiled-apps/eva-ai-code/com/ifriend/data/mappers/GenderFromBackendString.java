package com.ifriend.data.mappers;

import com.ifriend.chat.presentation.ui.onboarding.analytics.OnboardingAnalyticsImpl;
import com.ifriend.domain.models.profile.Gender;
import kotlin.Metadata;
/* compiled from: GenderMappers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/mappers/GenderFromBackendString;", "", "()V", "map", "Lcom/ifriend/domain/models/profile/Gender;", "from", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenderFromBackendString {
    public final Gender map(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 101262) {
                if (hashCode != 107864) {
                    if (hashCode == 106069776 && str.equals("other")) {
                        return Gender.NON_BINARY;
                    }
                } else if (str.equals(OnboardingAnalyticsImpl.GENDER_MALE)) {
                    return Gender.MALE;
                }
            } else if (str.equals(OnboardingAnalyticsImpl.GENDER_FEMALE)) {
                return Gender.FEMALE;
            }
        }
        return null;
    }
}
