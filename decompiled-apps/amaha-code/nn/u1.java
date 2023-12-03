package nn;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: TB1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/u1;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u1 extends rn.b {

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f26625x = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f26624w = LogHelper.INSTANCE.makeLogTag(u1.class);

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
        r2 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string = arguments.getString("tb1_text");
                String str = null;
                boolean z10 = true;
                if (string != null) {
                    if (gv.n.B0(string)) {
                        string = null;
                    }
                    if (string != null) {
                        List a12 = gv.r.a1(string, new String[]{"\\n"}, 0, 6);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tb1Text)).setText("");
                        int i6 = 0;
                        for (Object obj : a12) {
                            int i10 = i6 + 1;
                            if (i6 >= 0) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.tb1Text)).setText(((Object) ((RobertoTextView) _$_findCachedViewById(R.id.tb1Text)).getText()) + ((String) obj));
                                if (i6 < a12.size() - 1) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append((Object) ((RobertoTextView) _$_findCachedViewById(R.id.tb1Text)).getText());
                                    sb2.append('\n');
                                    ((RobertoTextView) _$_findCachedViewById(R.id.tb1Text)).setText(sb2.toString());
                                }
                                i6 = i10;
                            } else {
                                ca.a.t1();
                                throw null;
                            }
                        }
                    }
                }
                String string2 = arguments.getString("template_colour", "");
                if (string2 != null && string2.length() != 0) {
                    z10 = false;
                }
                if (str != null) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tb1Text)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26624w, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.f26625x.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26625x;
        Integer valueOf = Integer.valueOf((int) R.id.tb1Text);
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(R.id.tb1Text)) != null) {
                linkedHashMap.put(valueOf, findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_tb1, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            I();
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26624w, e10);
        }
    }
}
