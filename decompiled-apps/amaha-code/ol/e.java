package ol;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import is.u;
import java.util.List;
import pl.c0;
/* compiled from: N24ScreenImageAdapter.kt */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final List<c0> f27622x;

    /* renamed from: y  reason: collision with root package name */
    public final int f27623y;

    /* compiled from: N24ScreenImageAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public e(int i6, List list) {
        this.f27622x = list;
        this.f27623y = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        int i6;
        List<c0> list = this.f27622x;
        if (list != null) {
            i6 = list.size();
        } else {
            i6 = 0;
        }
        return i6 * this.f27623y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        boolean z10;
        int i10;
        TextView textView;
        a aVar2 = aVar;
        List<c0> list = this.f27622x;
        if (list != null) {
            int i11 = this.f27623y;
            int i12 = i6 / i11;
            if ((i6 ^ i11) < 0 && i11 * i12 != i6) {
                i12--;
            }
            c0 c0Var = (c0) u.j2(i12, list);
            if (c0Var != null) {
                String str = c0Var.f28554a;
                if (str != null && !gv.n.B0(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                View view = aVar2.f2751a;
                if (!z10) {
                    Glide.g(view.getContext()).p(str).B((ImageView) view.findViewById(R.id.ivRowN24Image));
                }
                String str2 = c0Var.f28555b;
                if (str2 != null) {
                    i10 = str2.length();
                } else {
                    i10 = -1;
                }
                if (i10 > 0 && (textView = (TextView) view.findViewById(R.id.tvN24ScreenImageOverlayText)) != null) {
                    textView.setVisibility(0);
                    textView.setText(str2);
                    String str3 = c0Var.f28556c;
                    if (str3 != null) {
                        textView.setTextColor(Color.parseColor(str3));
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_n24_image, parent, false, "from(parent.context).inf…n24_image, parent, false)"));
    }
}
