package tl;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.Iterator;
import t0.j0;
/* compiled from: TherapistExpertInfoFragment.kt */
/* loaded from: classes2.dex */
public final class p extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f33259a;

    public p(q qVar) {
        this.f33259a = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
        ca.a.t1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
        throw null;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i6, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        String str;
        int i10;
        q qVar = this.f33259a;
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        if (i6 == 0) {
            try {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                } else {
                    linearLayoutManager = null;
                }
                if (linearLayoutManager != null) {
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    String str2 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    if (qVar.B) {
                        str = "therapy";
                    } else {
                        str = "psychiatry";
                    }
                    bundle.putString("flow", str);
                    bundle.putString("item_viewed", qVar.f33265z.get(findFirstVisibleItemPosition).c());
                    bundle.putInt(Constants.DAYMODEL_POSITION, findFirstVisibleItemPosition + 1);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "therapy_psychiatry_testimonials_scroll");
                    LinearLayout linearLayout = (LinearLayout) qVar._$_findCachedViewById(R.id.layoutDots);
                    if (linearLayout != null) {
                        Iterator<View> it = f6.b.B0(linearLayout).iterator();
                        int i11 = 0;
                        while (true) {
                            j0 j0Var = (j0) it;
                            if (j0Var.hasNext()) {
                                Object next = j0Var.next();
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    break;
                                }
                                View view = (View) next;
                                androidx.fragment.app.p requireActivity = qVar.requireActivity();
                                if (i11 == findFirstVisibleItemPosition) {
                                    i10 = R.color.amahaDarkGray;
                                } else {
                                    i10 = R.color.proDashboardFooter;
                                }
                                view.setBackgroundTintList(g0.a.c(i10, requireActivity));
                                i11 = i12;
                            } else {
                                return;
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(qVar.f33260u, e10);
            }
        }
    }
}
