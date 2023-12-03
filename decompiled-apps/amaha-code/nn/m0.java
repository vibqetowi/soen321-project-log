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
/* compiled from: CB6Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/m0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m0 extends rn.b {
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f26545w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26546x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f26547y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public String f26548z = "";
    public final String A = LogHelper.INSTANCE.makeLogTag(m0.class);

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:67:0x009f, B:68:0x00a1, B:70:0x00a9, B:76:0x00b5), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:67:0x009f, B:68:0x00a1, B:70:0x00a9, B:76:0x00b5), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:67:0x009f, B:68:0x00a1, B:70:0x00a9, B:76:0x00b5), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:67:0x009f, B:68:0x00a1, B:70:0x00a9, B:76:0x00b5), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:67:0x009f, B:68:0x00a1, B:70:0x00a9, B:76:0x00b5), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085 A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:67:0x009f, B:68:0x00a1, B:70:0x00a9, B:76:0x00b5), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008f A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:67:0x009f, B:68:0x00a1, B:70:0x00a9, B:76:0x00b5), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009f A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:67:0x009f, B:68:0x00a1, B:70:0x00a9, B:76:0x00b5), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a9 A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:67:0x009f, B:68:0x00a1, B:70:0x00a9, B:76:0x00b5), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b5 A[Catch: Exception -> 0x00da, TRY_LEAVE, TryCatch #0 {Exception -> 0x00da, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:31:0x004a, B:32:0x0053, B:34:0x005b, B:43:0x006b, B:44:0x006d, B:46:0x0075, B:55:0x0085, B:56:0x0087, B:58:0x008f, B:67:0x009f, B:68:0x00a1, B:70:0x00a9, B:76:0x00b5), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        String str;
        String string;
        boolean z11;
        ArrayList<String> stringArrayList;
        boolean z12;
        ArrayList<String> stringArrayList2;
        boolean z13;
        ArrayList<String> stringArrayList3;
        boolean z14;
        String string2;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string3 = arguments.getString("cb6_title", "");
                boolean z15 = false;
                if (string3 != null && string3.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb6Title)).setText(string3);
                    }
                    string = arguments.getString("cb6_desc", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.cb6Subtitle)).setText(string);
                        }
                        stringArrayList = arguments.getStringArrayList("cb6_icon_list");
                        if (stringArrayList != null && !stringArrayList.isEmpty()) {
                            z12 = false;
                            if (!z12) {
                                stringArrayList = null;
                            }
                            if (stringArrayList != null) {
                                this.f26545w = stringArrayList;
                            }
                            stringArrayList2 = arguments.getStringArrayList("cb6_icon_title_list");
                            if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                                z13 = false;
                                if (!z13) {
                                    stringArrayList2 = null;
                                }
                                if (stringArrayList2 != null) {
                                    this.f26546x = stringArrayList2;
                                }
                                stringArrayList3 = arguments.getStringArrayList("cb6_icon_desc_list");
                                if (stringArrayList3 != null && !stringArrayList3.isEmpty()) {
                                    z14 = false;
                                    if (!z14) {
                                        stringArrayList3 = null;
                                    }
                                    if (stringArrayList3 != null) {
                                        this.f26547y = stringArrayList3;
                                    }
                                    string2 = arguments.getString("template_colour", "");
                                    if (!((string2 != null || string2.length() == 0) ? true : true)) {
                                        str = string2;
                                    }
                                    if (str == null) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.cb6Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                        ((RobertoTextView) _$_findCachedViewById(R.id.cb6Subtitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                        this.f26548z = str;
                                        return;
                                    }
                                    return;
                                }
                                z14 = true;
                                if (!z14) {
                                }
                                if (stringArrayList3 != null) {
                                }
                                string2 = arguments.getString("template_colour", "");
                                if (!((string2 != null || string2.length() == 0) ? true : true)) {
                                }
                                if (str == null) {
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            stringArrayList3 = arguments.getStringArrayList("cb6_icon_desc_list");
                            if (stringArrayList3 != null) {
                                z14 = false;
                                if (!z14) {
                                }
                                if (stringArrayList3 != null) {
                                }
                                string2 = arguments.getString("template_colour", "");
                                if (!((string2 != null || string2.length() == 0) ? true : true)) {
                                }
                                if (str == null) {
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (stringArrayList3 != null) {
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
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb6_icon_title_list");
                        if (stringArrayList2 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            stringArrayList3 = arguments.getStringArrayList("cb6_icon_desc_list");
                            if (stringArrayList3 != null) {
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (stringArrayList3 != null) {
                            }
                            string2 = arguments.getString("template_colour", "");
                            if (!((string2 != null || string2.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        stringArrayList3 = arguments.getStringArrayList("cb6_icon_desc_list");
                        if (stringArrayList3 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (stringArrayList3 != null) {
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
                    if (string != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("cb6_icon_list");
                    if (stringArrayList != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb6_icon_title_list");
                        if (stringArrayList2 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        stringArrayList3 = arguments.getStringArrayList("cb6_icon_desc_list");
                        if (stringArrayList3 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (stringArrayList3 != null) {
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
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb6_icon_title_list");
                    if (stringArrayList2 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    stringArrayList3 = arguments.getStringArrayList("cb6_icon_desc_list");
                    if (stringArrayList3 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (stringArrayList3 != null) {
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
                string = arguments.getString("cb6_desc", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("cb6_icon_list");
                    if (stringArrayList != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb6_icon_title_list");
                    if (stringArrayList2 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    stringArrayList3 = arguments.getStringArrayList("cb6_icon_desc_list");
                    if (stringArrayList3 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (stringArrayList3 != null) {
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
                if (string != null) {
                }
                stringArrayList = arguments.getStringArrayList("cb6_icon_list");
                if (stringArrayList != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (stringArrayList != null) {
                }
                stringArrayList2 = arguments.getStringArrayList("cb6_icon_title_list");
                if (stringArrayList2 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (stringArrayList2 != null) {
                }
                stringArrayList3 = arguments.getStringArrayList("cb6_icon_desc_list");
                if (stringArrayList3 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (stringArrayList3 != null) {
                }
                string2 = arguments.getString("template_colour", "");
                if (!((string2 != null || string2.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.B.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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
        return inflater.inflate(R.layout.fragment_cb6, viewGroup, false);
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
            Integer num = (Integer) is.k.c2(new Integer[]{Integer.valueOf(this.f26545w.size()), Integer.valueOf(this.f26546x.size()), Integer.valueOf(this.f26547y.size())});
            if (num != null) {
                i6 = num.intValue();
            } else {
                i6 = 0;
            }
            for (int i10 = 0; i10 < i6; i10++) {
                View inflate = getLayoutInflater().inflate(R.layout.row_cb6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.cb6Container)), false);
                String str = null;
                if (!this.f26545w.isEmpty()) {
                    String str2 = (String) is.u.j2(i10, this.f26545w);
                    if (str2 == null) {
                        String str3 = this.f26545w.get(0);
                        kotlin.jvm.internal.i.f(str3, "illustrationNamesList[0]");
                        str2 = str3;
                    }
                    if (getActivity() == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        androidx.fragment.app.p activity = getActivity();
                        kotlin.jvm.internal.i.d(activity);
                        com.bumptech.glide.f d10 = Glide.c(activity).d(activity);
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.d(activity2);
                        d10.d(new File(activity2.getFilesDir(), str2)).B((AppCompatImageView) inflate.findViewById(R.id.cb6RowImage));
                    }
                }
                String str4 = (String) is.u.j2(i10, this.f26546x);
                if (str4 != null) {
                    ((RobertoTextView) inflate.findViewById(R.id.cb6RowTitle)).setText(str4);
                }
                String str5 = (String) is.u.j2(i10, this.f26547y);
                if (str5 != null) {
                    ((RobertoTextView) inflate.findViewById(R.id.cb6RowSubtitle)).setText(str5);
                }
                String str6 = this.f26548z;
                if (!gv.n.B0(str6)) {
                    str = str6;
                }
                ((RobertoTextView) inflate.findViewById(R.id.cb6RowTitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                ((RobertoTextView) inflate.findViewById(R.id.cb6RowSubtitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                ((LinearLayout) _$_findCachedViewById(R.id.cb6Container)).addView(inflate);
            }
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }
}
