package com.theinnerhour.b2b.utils;

import com.appsflyer.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import kotlin.Metadata;
/* compiled from: ExperimentUtils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/utils/ExperimentUtils;", "", "()V", "getOnboardingVariant", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ExperimentUtils {
    public final String getOnboardingVariant() {
        if (ApplicationPersistence.getInstance().getBooleanValue(Constants.USE_VARIANT_A, false)) {
            return "a";
        }
        return Constants.ONBOARDING_VARIANT;
    }
}
