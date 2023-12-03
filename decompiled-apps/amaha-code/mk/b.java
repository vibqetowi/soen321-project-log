package mk;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.i;
import tr.r;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f25326u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ BookmarkingActivity f25327v;

    public /* synthetic */ b(BookmarkingActivity bookmarkingActivity, int i6) {
        this.f25326u = i6;
        this.f25327v = bookmarkingActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text;
        int i6 = this.f25326u;
        Editable editable = null;
        BookmarkingActivity this$0 = this.f25327v;
        switch (i6) {
            case 0:
                int i10 = BookmarkingActivity.I;
                i.g(this$0, "this$0");
                this$0.onBackPressed();
                return;
            case 1:
                int i11 = BookmarkingActivity.I;
                i.g(this$0, "this$0");
                if (!this$0.D) {
                    this$0.q0(true);
                    Bundle bundle = new Bundle();
                    defpackage.d.m(bundle, "course");
                    bundle.putBoolean("subscription_active", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                    bundle.putInt("bookmarked_activity_count", this$0.A);
                    gk.a.b(bundle, "bookmark_repository_search_click");
                    return;
                }
                return;
            case 2:
                int i12 = BookmarkingActivity.I;
                i.g(this$0, "this$0");
                Bundle bundle2 = new Bundle();
                defpackage.d.m(bundle2, "course");
                bundle2.putBoolean("subscription_active", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                bundle2.putInt("bookmarked_activity_count", this$0.A);
                RobertoEditText robertoEditText = (RobertoEditText) this$0.n0(R.id.tvBookmarkingSearchEditText);
                if (robertoEditText != null) {
                    editable = robertoEditText.getText();
                }
                bundle2.putString("search_term", String.valueOf(editable));
                gk.a.b(bundle2, "bookmark_repository_search_cross");
                RobertoEditText robertoEditText2 = (RobertoEditText) this$0.n0(R.id.tvBookmarkingSearchEditText);
                if (robertoEditText2 != null && (text = robertoEditText2.getText()) != null) {
                    text.clear();
                    return;
                }
                return;
            case 3:
                int i13 = BookmarkingActivity.I;
                i.g(this$0, "this$0");
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clBookmarkBottomSheet)).setState(4);
                return;
            case 4:
                int i14 = BookmarkingActivity.I;
                i.g(this$0, "this$0");
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clBookmarkBottomSheet)).setState(4);
                return;
            case 5:
                int i15 = BookmarkingActivity.I;
                i.g(this$0, "this$0");
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clBookmarkBottomSheet)).setState(4);
                Toast.makeText(this$0, this$0.getString(R.string.BookmarkingUnSaveActivityToast), 0).show();
                this$0.r0();
                CourseDayDomainModelV1 courseDayDomainModelV1 = this$0.C;
                if (courseDayDomainModelV1 != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle3.putString("activity_name", courseDayDomainModelV1.getDayModelV1().getContent_label());
                    bundle3.putString("activity_course", this$0.o0().getCourseName());
                    if (courseDayDomainModelV1.getDayModelV1().getLast_accessed_date() != 0) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(courseDayDomainModelV1.getDayModelV1().getLast_accessed_date() * 1000);
                        bundle3.putString("last_accessed_on", new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).format(calendar.getTime()).toString());
                    }
                    bundle3.putStringArrayList("reason", this$0.B);
                    gk.a.b(bundle3, "bookmark_activity_unsave_reason_submit");
                    return;
                }
                return;
            case 6:
                int i16 = BookmarkingActivity.I;
                i.g(this$0, "this$0");
                this$0.G.a(r.s(this$0, false).putExtra("source", "bookmark"));
                Bundle bundle4 = new Bundle();
                defpackage.d.m(bundle4, "course");
                bundle4.putBoolean("subscription_active", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                bundle4.putInt("bookmarked_activity_count", this$0.A);
                bundle4.putString("subscription_expired", "true");
                gk.a.b(bundle4, "bookmark_repository_cta_click");
                return;
            case 7:
                int i17 = BookmarkingActivity.I;
                i.g(this$0, "this$0");
                this$0.G.a(r.s(this$0, false).putExtra("source", "bookmark"));
                Bundle bundle5 = new Bundle();
                defpackage.d.m(bundle5, "course");
                bundle5.putBoolean("subscription_active", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                bundle5.putInt("bookmarked_activity_count", this$0.A);
                bundle5.putString("subscription_expired", null);
                gk.a.b(bundle5, "bookmark_repository_cta_click");
                return;
            case 8:
                int i18 = BookmarkingActivity.I;
                i.g(this$0, "this$0");
                Bundle bundle6 = new Bundle();
                defpackage.d.m(bundle6, "course");
                bundle6.putBoolean("subscription_active", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                bundle6.putInt("bookmarked_activity_count", this$0.A);
                bundle6.putString("subscription_expired", null);
                gk.a.b(bundle6, "bookmark_repository_cta_click");
                this$0.p0();
                return;
            case 9:
                int i19 = BookmarkingActivity.I;
                i.g(this$0, "this$0");
                this$0.G.a(r.s(this$0, false).putExtra("source", "bookmark"));
                Bundle bundle7 = new Bundle();
                defpackage.d.m(bundle7, "course");
                bundle7.putBoolean("subscription_active", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                bundle7.putInt("bookmarked_activity_count", this$0.A);
                bundle7.putString("subscription_expired", "true");
                gk.a.b(bundle7, "bookmark_repository_cta_click");
                return;
            default:
                i.g(this$0, "this$0");
                int i20 = BookmarkingActivity.I;
                this$0.p0();
                return;
        }
    }
}
