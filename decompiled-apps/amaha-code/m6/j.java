package m6;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
/* compiled from: ViewTapTarget.java */
/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: i  reason: collision with root package name */
    public final View f24917i;

    public j(AppCompatImageView appCompatImageView, String str, String str2) {
        super(str, str2);
        if (appCompatImageView != null) {
            this.f24917i = appCompatImageView;
            return;
        }
        throw new IllegalArgumentException("Given null view to target");
    }
}
