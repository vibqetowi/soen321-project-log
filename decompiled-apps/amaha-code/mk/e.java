package mk;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: BookmarkingActivity.kt */
/* loaded from: classes2.dex */
public final class e extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ BookmarkingActivity f25330u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BookmarkingActivity bookmarkingActivity) {
        super(1);
        this.f25330u = bookmarkingActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        BookmarkingActivity bookmarkingActivity = this.f25330u;
        if (booleanValue) {
            ((RobertoButton) bookmarkingActivity.n0(R.id.rbNullCta)).setVisibility(8);
            ((ConstraintLayout) bookmarkingActivity.n0(R.id.clEmptyActivityListView)).setVisibility(0);
            ((AppCompatImageView) bookmarkingActivity.n0(R.id.ivEmptyState)).setImageResource(R.drawable.ic_bookmark_null);
            ((RobertoTextView) bookmarkingActivity.n0(R.id.tvNullTitle)).setText(bookmarkingActivity.getString(R.string.BookmarkingSearchNullText));
        } else {
            ((RobertoButton) bookmarkingActivity.n0(R.id.rbNullCta)).setVisibility(0);
            ((ConstraintLayout) bookmarkingActivity.n0(R.id.clEmptyActivityListView)).setVisibility(8);
            ((AppCompatImageView) bookmarkingActivity.n0(R.id.ivEmptyState)).setImageResource(R.drawable.ic_empty_bookmarked_activities);
            ((RobertoTextView) bookmarkingActivity.n0(R.id.tvNullTitle)).setText(bookmarkingActivity.getString(R.string.BookmarkingEmptyActivityText));
            ((RobertoButton) bookmarkingActivity.n0(R.id.rbNullCta)).setOnClickListener(DebouncedOnClickListener.wrap(new b(bookmarkingActivity, 10)));
        }
        return hs.k.f19476a;
    }
}
