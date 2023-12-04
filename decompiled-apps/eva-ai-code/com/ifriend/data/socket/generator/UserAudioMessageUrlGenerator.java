package com.ifriend.data.socket.generator;

import android.content.Context;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.data.BuildConfig;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: UserAudioMessageUrlGenerator.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ifriend/data/socket/generator/UserAudioMessageUrlGenerator;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "generate", "", "sender", "recipient", "reference", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserAudioMessageUrlGenerator {
    private final Context context;

    public UserAudioMessageUrlGenerator(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final String generate(String sender, String recipient, String reference) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(reference, "reference");
        String string = this.context.getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0).getString(OkHttpClientProviderKt.API_URL_KEY, BuildConfig.API_URL);
        return string + "/dialogs/usermedia/" + recipient + RemoteSettings.FORWARD_SLASH_STRING + sender + RemoteSettings.FORWARD_SLASH_STRING + ((String) StringsKt.split$default((CharSequence) reference, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null).get(1));
    }
}
