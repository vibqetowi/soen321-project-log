package androidx.core.widget;

import android.widget.ListView;
/* compiled from: ListViewCompat.java */
/* loaded from: classes.dex */
public final class i {
    public static boolean a(ListView listView, int i6) {
        return listView.canScrollList(i6);
    }

    public static void b(ListView listView, int i6) {
        listView.scrollListBy(i6);
    }
}
