package nn;

import android.content.res.ColorStateList;
import android.graphics.Color;
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
/* compiled from: CB18Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/e0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e0 extends rn.b {

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f26474z = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26471w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26472x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final String f26473y = LogHelper.INSTANCE.makeLogTag(e0.class);

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0038, B:22:0x003e, B:23:0x004a, B:24:0x0053, B:26:0x005b, B:35:0x006b, B:36:0x006d, B:38:0x0075, B:47:0x0085, B:48:0x0087, B:50:0x0091, B:56:0x009d), top: B:61:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0038, B:22:0x003e, B:23:0x004a, B:24:0x0053, B:26:0x005b, B:35:0x006b, B:36:0x006d, B:38:0x0075, B:47:0x0085, B:48:0x0087, B:50:0x0091, B:56:0x009d), top: B:61:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0038, B:22:0x003e, B:23:0x004a, B:24:0x0053, B:26:0x005b, B:35:0x006b, B:36:0x006d, B:38:0x0075, B:47:0x0085, B:48:0x0087, B:50:0x0091, B:56:0x009d), top: B:61:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0038, B:22:0x003e, B:23:0x004a, B:24:0x0053, B:26:0x005b, B:35:0x006b, B:36:0x006d, B:38:0x0075, B:47:0x0085, B:48:0x0087, B:50:0x0091, B:56:0x009d), top: B:61:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0038, B:22:0x003e, B:23:0x004a, B:24:0x0053, B:26:0x005b, B:35:0x006b, B:36:0x006d, B:38:0x0075, B:47:0x0085, B:48:0x0087, B:50:0x0091, B:56:0x009d), top: B:61:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0038, B:22:0x003e, B:23:0x004a, B:24:0x0053, B:26:0x005b, B:35:0x006b, B:36:0x006d, B:38:0x0075, B:47:0x0085, B:48:0x0087, B:50:0x0091, B:56:0x009d), top: B:61:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d A[Catch: Exception -> 0x00c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c0, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:17:0x0024, B:18:0x002d, B:20:0x0038, B:22:0x003e, B:23:0x004a, B:24:0x0053, B:26:0x005b, B:35:0x006b, B:36:0x006d, B:38:0x0075, B:47:0x0085, B:48:0x0087, B:50:0x0091, B:56:0x009d), top: B:61:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        String str;
        String string;
        ArrayList<String> stringArrayList;
        boolean z11;
        ArrayList<String> stringArrayList2;
        boolean z12;
        String string2;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string3 = arguments.getString("cb18_title");
                boolean z13 = false;
                if (string3 != null && string3.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb18Title)).setText(string3);
                    }
                    string = arguments.getString("cb18_desc");
                    if (string != null) {
                        if (gv.n.B0(string)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.cb18Subtitle)).setVisibility(8);
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.cb18Subtitle)).setText(string);
                        }
                    }
                    stringArrayList = arguments.getStringArrayList("cb18_icon_list");
                    if (stringArrayList != null && !stringArrayList.isEmpty()) {
                        z11 = false;
                        if (!z11) {
                            stringArrayList = null;
                        }
                        if (stringArrayList != null) {
                            this.f26471w = stringArrayList;
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb18_point_list");
                        if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                            z12 = false;
                            if (!z12) {
                                stringArrayList2 = null;
                            }
                            if (stringArrayList2 != null) {
                                this.f26472x = stringArrayList2;
                            }
                            string2 = arguments.getString("template_colour", "");
                            if (!((string2 != null || string2.length() == 0) ? true : true)) {
                                str = string2;
                            }
                            if (str == null) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.cb18Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                ((RobertoTextView) _$_findCachedViewById(R.id.cb18Subtitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                return;
                            }
                            return;
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        string2 = arguments.getString("template_colour", "");
                        if (!((string2 != null || string2.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb18_point_list");
                    if (stringArrayList2 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        string2 = arguments.getString("template_colour", "");
                        if (!((string2 != null || string2.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    string2 = arguments.getString("template_colour", "");
                    if (!((string2 != null || string2.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z10 = true;
                str = null;
                if (!z10) {
                }
                if (string3 != null) {
                }
                string = arguments.getString("cb18_desc");
                if (string != null) {
                }
                stringArrayList = arguments.getStringArrayList("cb18_icon_list");
                if (stringArrayList != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb18_point_list");
                    if (stringArrayList2 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    string2 = arguments.getString("template_colour", "");
                    if (!((string2 != null || string2.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (stringArrayList != null) {
                }
                stringArrayList2 = arguments.getStringArrayList("cb18_point_list");
                if (stringArrayList2 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (stringArrayList2 != null) {
                }
                string2 = arguments.getString("template_colour", "");
                if (!((string2 != null || string2.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26473y, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.f26474z.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26474z;
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
            Integer num = (Integer) is.k.c2(new Integer[]{Integer.valueOf(this.f26471w.size()), Integer.valueOf(this.f26472x.size())});
            if (num != null) {
                i6 = num.intValue();
            } else {
                i6 = 0;
            }
            for (int i10 = 0; i10 < i6; i10++) {
                View inflate = getLayoutInflater().inflate(R.layout.row_cb18, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.cb18Container)), false);
                if (!this.f26471w.isEmpty()) {
                    String str = (String) is.u.j2(i10, this.f26471w);
                    if (str == null) {
                        String str2 = this.f26471w.get(0);
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
                String str3 = (String) is.u.j2(i10, this.f26472x);
                if (str3 != null) {
                    ((RobertoTextView) inflate.findViewById(R.id.rowCb18Text)).setText(str3);
                }
                ((LinearLayout) _$_findCachedViewById(R.id.cb18Container)).addView(inflate);
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26473y, e10);
        }
    }
}
