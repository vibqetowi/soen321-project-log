package nn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CB19Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/f0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f0 extends rn.b {

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f26483z = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26480w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26481x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final String f26482y = LogHelper.INSTANCE.makeLogTag(f0.class);

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:3:0x0003, B:7:0x0011, B:11:0x0020, B:13:0x0026, B:15:0x0030, B:25:0x0041, B:26:0x0043, B:28:0x004b, B:34:0x0057, B:10:0x001d, B:6:0x000e), top: B:39:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057 A[Catch: Exception -> 0x005a, TRY_LEAVE, TryCatch #0 {Exception -> 0x005a, blocks: (B:3:0x0003, B:7:0x0011, B:11:0x0020, B:13:0x0026, B:15:0x0030, B:25:0x0041, B:26:0x0043, B:28:0x004b, B:34:0x0057, B:10:0x001d, B:6:0x000e), top: B:39:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        ArrayList<String> arrayList;
        ArrayList<String> stringArrayList;
        try {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.cb18Title);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(8);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.cb18Subtitle);
            if (robertoTextView2 != null) {
                robertoTextView2.setVisibility(8);
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                ArrayList<String> stringArrayList2 = arguments.getStringArrayList("cb19_icon_list");
                boolean z11 = false;
                if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                    z10 = false;
                    arrayList = null;
                    if (!z10) {
                        stringArrayList2 = null;
                    }
                    if (stringArrayList2 != null) {
                        this.f26480w = stringArrayList2;
                    }
                    stringArrayList = arguments.getStringArrayList("cb19_point_list");
                    if (!((stringArrayList != null || stringArrayList.isEmpty()) ? true : true)) {
                        arrayList = stringArrayList;
                    }
                    if (arrayList == null) {
                        this.f26481x = arrayList;
                        return;
                    }
                    return;
                }
                z10 = true;
                arrayList = null;
                if (!z10) {
                }
                if (stringArrayList2 != null) {
                }
                stringArrayList = arguments.getStringArrayList("cb19_point_list");
                if (!((stringArrayList != null || stringArrayList.isEmpty()) ? true : true)) {
                }
                if (arrayList == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26482y, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.f26483z.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26483z;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_cb18, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            I();
            Integer num = (Integer) is.k.c2(new Integer[]{Integer.valueOf(this.f26480w.size()), Integer.valueOf(this.f26481x.size())});
            if (num != null) {
                i6 = num.intValue();
            } else {
                i6 = 0;
            }
            for (int i10 = 0; i10 < i6; i10++) {
                View inflate = getLayoutInflater().inflate(R.layout.row_cb18, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.cb18Container)), false);
                if (!this.f26480w.isEmpty()) {
                    String str = (String) is.u.j2(i10, this.f26480w);
                    if (str == null) {
                        String str2 = this.f26480w.get(0);
                        kotlin.jvm.internal.i.f(str2, "assetNameList[0]");
                        str = str2;
                    }
                    if (getActivity() == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        str = null;
                    }
                    if (str != null) {
                        androidx.fragment.app.p activity = getActivity();
                        kotlin.jvm.internal.i.d(activity);
                        com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.d(activity2);
                        d10.d(new File(activity2.getFilesDir(), str)).B((AppCompatImageView) inflate.findViewById(R.id.rowCb18Image));
                    }
                }
                String str3 = (String) is.u.j2(i10, this.f26481x);
                if (str3 != null) {
                    ((RobertoTextView) inflate.findViewById(R.id.rowCb18Text)).setText(str3);
                }
                ((LinearLayout) _$_findCachedViewById(R.id.cb18Container)).addView(inflate);
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26482y, e10);
        }
    }
}
