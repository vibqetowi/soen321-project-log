package ek;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.k1;
import g0.a;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: RearrangeRecyclerAdapter.kt */
/* loaded from: classes2.dex */
public final class k1 extends RecyclerView.e<a> implements kr.a {

    /* renamed from: x  reason: collision with root package name */
    public final kr.c f14193x;

    /* renamed from: y  reason: collision with root package name */
    public final Activity f14194y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f14195z;

    /* compiled from: RearrangeRecyclerAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 implements kr.b {
        public a(View view) {
            super(view);
        }

        @Override // kr.b
        public final void a() {
            View view = this.f2751a;
            view.setBackgroundColor(0);
            k1 k1Var = k1.this;
            Activity activity = k1Var.f14194y;
            kotlin.jvm.internal.i.d(activity);
            Object obj = g0.a.f16164a;
            ((AppCompatImageView) view.findViewById(R.id.handle_rearrange)).setImageDrawable(a.c.b(activity, R.drawable.ic_drag_handle_orange_24dp));
            Activity activity2 = k1Var.f14194y;
            kotlin.jvm.internal.i.d(activity2);
            ((RobertoTextView) view.findViewById(R.id.text_rearrange)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
            ((TextView) view.findViewById(R.id.tvDivider)).setVisibility(0);
        }

        @Override // kr.b
        public final void b() {
            k1 k1Var = k1.this;
            Activity activity = k1Var.f14194y;
            kotlin.jvm.internal.i.d(activity);
            int b10 = g0.a.b(activity, R.color.selected_row);
            View view = this.f2751a;
            view.setBackgroundColor(b10);
            Activity activity2 = k1Var.f14194y;
            kotlin.jvm.internal.i.d(activity2);
            ((RobertoTextView) view.findViewById(R.id.text_rearrange)).setTextColor(g0.a.b(activity2, R.color.white));
            Activity activity3 = k1Var.f14194y;
            kotlin.jvm.internal.i.d(activity3);
            ((AppCompatImageView) view.findViewById(R.id.handle_rearrange)).setImageDrawable(a.c.b(activity3, R.drawable.ic_drag_handle_white_24dp));
            ((TextView) view.findViewById(R.id.tvDivider)).setVisibility(4);
        }
    }

    public k1(kr.c cVar, androidx.fragment.app.p pVar, ArrayList recyclerList) {
        kotlin.jvm.internal.i.g(recyclerList, "recyclerList");
        this.f14193x = cVar;
        this.f14194y = pVar;
        this.f14195z = recyclerList;
    }

    @Override // kr.a
    public final void d(int i6) {
        this.f14195z.remove(i6);
        l(i6);
    }

    @Override // kr.a
    public final void e(int i6, int i10) {
        Collections.swap(this.f14195z, i6, i10);
        this.f2769u.c(i6, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14195z.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        final a aVar2 = aVar;
        View view = aVar2.f2751a;
        ((RobertoTextView) view.findViewById(R.id.text_rearrange)).setText(this.f14195z.get(i6));
        ((AppCompatImageView) view.findViewById(R.id.handle_rearrange)).setOnTouchListener(new View.OnTouchListener() { // from class: ek.j1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                k1 this$0 = k1.this;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                k1.a holder = aVar2;
                kotlin.jvm.internal.i.g(holder, "$holder");
                if (motionEvent.getActionMasked() == 0) {
                    this$0.f14193x.a(holder);
                    return false;
                }
                return false;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        Activity activity = this.f14194y;
        kotlin.jvm.internal.i.d(activity);
        View inflate = activity.getLayoutInflater().inflate(R.layout.row_rearrange_recycler, (ViewGroup) parent, false);
        kotlin.jvm.internal.i.f(inflate, "activity!!.layoutInflate…_recycler, parent, false)");
        return new a(inflate);
    }
}
