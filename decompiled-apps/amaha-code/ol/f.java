package ol;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import is.u;
import java.util.List;
/* compiled from: N24ScreenPromptScrollerAdapter.kt */
/* loaded from: classes2.dex */
public final class f extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final List<String> f27624x;

    /* compiled from: N24ScreenPromptScrollerAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public f(List<String> promptList) {
        kotlin.jvm.internal.i.g(promptList, "promptList");
        this.f27624x = promptList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f27624x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        TextView textView = (TextView) aVar.f2751a.findViewById(R.id.tvRowN24PromptText);
        if (textView != null) {
            String str = (String) u.j2(i6, this.f27624x);
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_n24_prompt_text, parent, false, "from(parent.context).inf…ompt_text, parent, false)"));
    }
}
