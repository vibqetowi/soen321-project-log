package ek;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: HorizontalPickerAdapter.kt */
/* loaded from: classes2.dex */
public final class l extends RecyclerView.e<b> {

    /* renamed from: y  reason: collision with root package name */
    public a f14198y;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f14197x = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final w5.i0 f14199z = new w5.i0(12, this);

    /* compiled from: HorizontalPickerAdapter.kt */
    /* loaded from: classes2.dex */
    public interface a {
        void a(View view);
    }

    /* compiled from: HorizontalPickerAdapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f14200u;

        public b(View view) {
            super(view);
            this.f14200u = (RobertoTextView) view.findViewById(R.id.horizontalItemText);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14197x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(b bVar, int i6) {
        RobertoTextView robertoTextView = bVar.f14200u;
        if (robertoTextView != null) {
            robertoTextView.setText(this.f14197x.get(i6));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_picker_item, (ViewGroup) parent, false);
        kotlin.jvm.internal.i.f(inflate, "from(parent.context).inf…cker_item, parent, false)");
        inflate.setOnClickListener(this.f14199z);
        return new b(inflate);
    }
}
