package com.ifriend.registration;

import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.registration.presentation.ui.RegistrationActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: StartRegistrationUseCase.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/registration/StartRegistrationUseCase;", "", "()V", TtmlNode.START, "", "context", "Landroid/content/Context;", "registration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StartRegistrationUseCase {
    public final void start(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, RegistrationActivity.class));
    }
}
