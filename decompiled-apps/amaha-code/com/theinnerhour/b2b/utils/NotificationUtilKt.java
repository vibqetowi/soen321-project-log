package com.theinnerhour.b2b.utils;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import kotlin.Metadata;
/* compiled from: NotificationUtil.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"replaceName", "", "txt", "user", "Lcom/theinnerhour/b2b/model/User;", "app_productionRelease"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class NotificationUtilKt {
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return gv.n.F0(r7, " %name%", ",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return gv.n.F0(r7, " %name%", ",");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String replaceName(String txt, User user) {
        kotlin.jvm.internal.i.g(txt, "txt");
        boolean z10 = true;
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
        if (user != null) {
            String firstName = user.getFirstName();
            if (firstName != null && firstName.length() != 0) {
                z10 = false;
            }
            return gv.n.F0(txt, "%name%", user.getFirstName() + ',');
        }
        User user2 = FirebasePersistence.getInstance().getUser();
        if (user2 != null) {
            String firstName2 = user2.getFirstName();
            if (firstName2 != null && firstName2.length() != 0) {
                z10 = false;
            }
            return gv.n.F0(txt, "%name%", user2.getFirstName() + ',');
        }
        return txt;
    }

    public static /* synthetic */ String replaceName$default(String str, User user, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            user = null;
        }
        return replaceName(str, user);
    }
}
