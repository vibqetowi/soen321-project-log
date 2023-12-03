package sl;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import hs.k;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ss.l;
import tl.r;
/* compiled from: ExpertTestimonialAdapter.kt */
/* loaded from: classes2.dex */
public final class g extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<xl.a> f31668x;

    /* renamed from: y  reason: collision with root package name */
    public final l<xl.a, k> f31669y;

    /* renamed from: z  reason: collision with root package name */
    public final String f31670z;

    /* compiled from: ExpertTestimonialAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public g(Context context, ArrayList testimonialList, r rVar) {
        i.g(testimonialList, "testimonialList");
        this.f31668x = testimonialList;
        this.f31669y = rVar;
        this.f31670z = LogHelper.INSTANCE.makeLogTag("ExpertTestimonialAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f31668x.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[Catch: Exception -> 0x00e7, TryCatch #0 {Exception -> 0x00e7, blocks: (B:3:0x0004, B:5:0x0013, B:11:0x001f, B:13:0x006c, B:15:0x0074, B:17:0x0088, B:19:0x0094, B:23:0x009d, B:29:0x00a9, B:31:0x00c7, B:32:0x00cb, B:34:0x00d8, B:33:0x00cf), top: B:39:0x0004 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        Spanned spanned;
        String str;
        boolean z10;
        a aVar2 = aVar;
        ArrayList<xl.a> arrayList = this.f31668x;
        try {
            View view = aVar2.f2751a;
            String d10 = arrayList.get(i6).d();
            String str2 = null;
            if (d10 != null) {
                if (n.B0(d10)) {
                    d10 = null;
                }
            }
            d10 = "Anonymous";
            ((RobertoTextView) view.findViewById(R.id.tvTestimonialExpertName)).setText(d10);
            ((RobertoTextView) view.findViewById(R.id.tvTestimonialExpertDetail)).setText(arrayList.get(i6).b());
            ((RobertoTextView) view.findViewById(R.id.tvTestimonialExpertQuote)).setText(arrayList.get(i6).c());
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvTestimonialExpertDescription);
            String a10 = arrayList.get(i6).a();
            if (a10 != null) {
                spanned = r0.b.a(a10, 63);
            } else {
                spanned = null;
            }
            robertoTextView.setText(spanned);
            if (arrayList.get(i6).e() != null) {
                xl.c e10 = arrayList.get(i6).e();
                if (e10 != null) {
                    str = e10.a();
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    z10 = false;
                    if (!z10) {
                        ((ConstraintLayout) view.findViewById(R.id.clTestimonialFeedback)).setVisibility(0);
                        RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvTestimonialFeedbackFor);
                        xl.c e11 = arrayList.get(i6).e();
                        if (e11 != null) {
                            str2 = e11.a();
                        }
                        robertoTextView2.setText(str2);
                        ((ConstraintLayout) view.findViewById(R.id.clTestimonialFeedback)).setOnClickListener(new ak.d(i6, 8, this));
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            ((ConstraintLayout) view.findViewById(R.id.clTestimonialFeedback)).setVisibility(8);
            ((ConstraintLayout) view.findViewById(R.id.clTestimonialFeedback)).setOnClickListener(new ak.d(i6, 8, this));
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(this.f31670z, e12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.layout_expert_testimonial_item, parent, false, "from(parent.context).inf…nial_item, parent, false)"));
    }
}
