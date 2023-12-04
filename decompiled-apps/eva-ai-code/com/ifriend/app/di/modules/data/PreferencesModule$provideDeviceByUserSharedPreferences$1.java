package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.Preferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: PreferencesModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PreferencesModule$provideDeviceByUserSharedPreferences$1 extends Lambda implements Function0<String> {
    final /* synthetic */ Preferences $userSessionSharedPreferences;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesModule$provideDeviceByUserSharedPreferences$1(Preferences preferences) {
        super(0);
        this.$userSessionSharedPreferences = preferences;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String stringWithKey = this.$userSessionSharedPreferences.getStringWithKey("user_id");
        return "user_" + stringWithKey + "_shared_prefs";
    }
}
