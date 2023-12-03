package f0;

import android.app.RemoteInput;
import android.os.Build;
/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class d0 {

    /* compiled from: RemoteInput.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(Object obj) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = ((RemoteInput) obj).getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i6) {
            RemoteInput.Builder editChoicesBeforeSending;
            editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i6);
            return editChoicesBeforeSending;
        }
    }

    public static RemoteInput a(d0 d0Var) {
        d0Var.getClass();
        RemoteInput.Builder addExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(addExtras, 0);
        }
        return addExtras.build();
    }
}
