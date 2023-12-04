package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.content.Context;
import android.content.SharedPreferences;
import com.ifriend.data.BuildConfig;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import kotlin.Metadata;
/* compiled from: BotVoiceViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"toVoicePreviewUrl", "", "context", "Landroid/content/Context;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotVoiceViewModelKt {
    public static final String toVoicePreviewUrl(String str, Context context) {
        SharedPreferences sharedPreferences;
        String string;
        if (str == null) {
            return null;
        }
        String str2 = BuildConfig.API_URL;
        if (context != null && (sharedPreferences = context.getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0)) != null && (string = sharedPreferences.getString(OkHttpClientProviderKt.API_URL_KEY, BuildConfig.API_URL)) != null) {
            str2 = string;
        }
        return str2 + "/media/static/voices/ai/" + str + "/example.wav";
    }
}
