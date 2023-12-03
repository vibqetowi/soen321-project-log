package nj;

import android.content.Context;
import android.os.Bundle;
import ih.p;
/* compiled from: RichNotificationHandler.kt */
/* loaded from: classes.dex */
public interface a {
    jj.c buildTemplate(Context context, jj.b bVar, p pVar);

    boolean isTemplateSupported(Context context, pj.b bVar, p pVar);

    void onLogout(Context context, p pVar);

    void onNotificationDismissed(Context context, Bundle bundle, p pVar);
}
