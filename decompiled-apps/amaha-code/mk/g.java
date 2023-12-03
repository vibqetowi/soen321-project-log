package mk;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import nk.b;
/* compiled from: BookmarkingActivity.kt */
/* loaded from: classes2.dex */
public final class g implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ BookmarkingActivity f25332u;

    public g(BookmarkingActivity bookmarkingActivity) {
        this.f25332u = bookmarkingActivity;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        nk.b bVar;
        int i12;
        int i13;
        b.a aVar;
        BookmarkingActivity bookmarkingActivity = this.f25332u;
        try {
            RecyclerView.e adapter = ((RecyclerView) bookmarkingActivity.n0(R.id.rvBookmarkingActivities)).getAdapter();
            if (adapter instanceof nk.b) {
                bVar = (nk.b) adapter;
            } else {
                bVar = null;
            }
            if (bVar != null && (aVar = bVar.F) != null) {
                aVar.filter(String.valueOf(charSequence));
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) bookmarkingActivity.n0(R.id.ivBookmarkingSearchClear);
            if (appCompatImageView != null) {
                if (charSequence != null) {
                    i12 = charSequence.length();
                } else {
                    i12 = -1;
                }
                if (i12 > 0) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                appCompatImageView.setVisibility(i13);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(bookmarkingActivity.f10620w, e10);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
