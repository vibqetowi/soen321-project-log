package bl;

import android.content.Context;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4343a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4344b;

    public /* synthetic */ c(int i6, Object obj) {
        this.f4343a = i6;
        this.f4344b = obj;
    }

    @Override // androidx.lifecycle.x
    public final void a(Object obj) {
        ViewTreeObserver viewTreeObserver;
        boolean z10;
        int i6 = this.f4343a;
        Object obj2 = this.f4344b;
        switch (i6) {
            case 0:
                i this$0 = (i) obj2;
                ArrayList<LearningHubModel> arrayList = (ArrayList) obj;
                int i10 = i.f4356f0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (arrayList.size() > 0) {
                    this$0.f4361v = arrayList;
                    this$0.O();
                    return;
                }
                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.innerResourcesCard)).setVisibility(8);
                return;
            case 1:
                p this$02 = (p) obj2;
                ArrayList<LearningHubModel> arrayList2 = (ArrayList) obj;
                int i11 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (arrayList2.size() > 0) {
                    this$02.f4391v = arrayList2;
                    this$02.O();
                    Iterator<LearningHubModel> it = this$02.f4391v.iterator();
                    boolean z11 = false;
                    while (it.hasNext()) {
                        LearningHubModel next = it.next();
                        Iterator<PostsRead> it2 = FirebasePersistence.getInstance().getUser().getPostsRead().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (kotlin.jvm.internal.i.b(it2.next().getPostId(), next.getId())) {
                                    z10 = true;
                                }
                            } else {
                                z10 = false;
                            }
                        }
                        if (next.getDay() == ((int) this$02.a0().getCourseOpenDay())) {
                            if (!z10) {
                                this$02.E++;
                            }
                            z11 = true;
                        }
                    }
                    if (z11) {
                        this$02.G += 25;
                        ((ConstraintLayout) this$02._$_findCachedViewById(R.id.innerResourcesCard)).setVisibility(0);
                        ((RobertoTextView) this$02._$_findCachedViewById(R.id.cardTitleInnerResources)).setVisibility(0);
                        if (this$02.E == 0) {
                            this$02.D += 25;
                            if (!this$02.R) {
                                ((AppCompatImageView) this$02._$_findCachedViewById(R.id.arrowNext3)).setImageResource(R.drawable.ic_round_check);
                                Context requireContext = this$02.requireContext();
                                Object obj3 = g0.a.f16164a;
                                ((ConstraintLayout) this$02._$_findCachedViewById(R.id.innerResourcesCard)).setBackground(a.c.b(requireContext, R.drawable.grey_background_rounded_corners));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ((ConstraintLayout) this$02._$_findCachedViewById(R.id.innerResourcesCard)).setVisibility(8);
                    ((RobertoTextView) this$02._$_findCachedViewById(R.id.cardTitleInnerResources)).setVisibility(8);
                    return;
                }
                ((ConstraintLayout) this$02._$_findCachedViewById(R.id.innerResourcesCard)).setVisibility(8);
                return;
            case 2:
                ql.i this$03 = (ql.i) obj2;
                MediaMetadataCompat it3 = (MediaMetadataCompat) obj;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                PlaybackStateCompat playbackStateCompat = this$03.f29729z;
                kotlin.jvm.internal.i.f(it3, "it");
                this$03.g(playbackStateCompat, it3);
                return;
            case 3:
                MiniMonetizationActivity this$04 = (MiniMonetizationActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i12 = MiniMonetizationActivity.f11396b0;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                if (bool != null && bool.booleanValue()) {
                    Utils utils = Utils.INSTANCE;
                    String string = this$04.getString(R.string.monetization_data_fetch_error);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.monetization_data_fetch_error)");
                    utils.showCustomToast(this$04, string);
                    this$04.finish();
                    return;
                }
                return;
            default:
                AllTopicalCoursesActivity this$05 = (AllTopicalCoursesActivity) obj2;
                ArrayList it4 = (ArrayList) obj;
                int i13 = AllTopicalCoursesActivity.E;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.f(it4, "it");
                this$05.f11666z = it4;
                up.b bVar = this$05.f11664x;
                if (bVar != null) {
                    bVar.f34439y = it4;
                    bVar.i();
                    ((ShimmerFrameLayout) this$05.u0(R.id.loadingShimmer)).c();
                    ((ShimmerFrameLayout) this$05.u0(R.id.loadingShimmer)).setVisibility(8);
                    return;
                } else if (!it4.isEmpty()) {
                    ((ShimmerFrameLayout) this$05.u0(R.id.loadingShimmer)).c();
                    ((ShimmerFrameLayout) this$05.u0(R.id.loadingShimmer)).setVisibility(8);
                    ArrayList arrayList3 = this$05.f11666z;
                    if (arrayList3 != null) {
                        this$05.f11664x = new up.b(this$05, arrayList3);
                        ((RecyclerView) this$05.u0(R.id.mcRecycler)).setLayoutManager(new GridLayoutManager(this$05, 2));
                        ((RecyclerView) this$05.u0(R.id.mcRecycler)).setHasFixedSize(true);
                        ((RecyclerView) this$05.u0(R.id.mcRecycler)).setItemAnimator(new androidx.recyclerview.widget.c());
                        ((RecyclerView) this$05.u0(R.id.mcRecycler)).setNestedScrollingEnabled(false);
                        RecyclerView recyclerView = (RecyclerView) this$05.u0(R.id.mcRecycler);
                        up.b bVar2 = this$05.f11664x;
                        if (bVar2 != null) {
                            recyclerView.setAdapter(bVar2);
                            RecyclerView recyclerView2 = (RecyclerView) this$05.u0(R.id.mcRecycler);
                            if (recyclerView2 != null && (viewTreeObserver = recyclerView2.getViewTreeObserver()) != null) {
                                viewTreeObserver.addOnGlobalLayoutListener(new tp.b(this$05));
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.i.q("adapter");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("miniCourseFreshList");
                    throw null;
                } else {
                    return;
                }
        }
    }
}
