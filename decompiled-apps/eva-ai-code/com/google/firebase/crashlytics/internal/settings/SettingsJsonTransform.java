package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes7.dex */
interface SettingsJsonTransform {
    Settings buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException;
}
